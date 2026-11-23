# Parking Garage System – Final Project (Java, Low-Level Design)

## 1. What are we building?
A console-based **multi-floor parking garage**. A vehicle arrives, the system finds a compatible free spot, issues a **ticket**, and when the vehicle leaves the driver gives the ticket ID, pays an **hourly fee (rounded up)**, and the spot is freed.

### Requirements
1. Three vehicle types: Motorcycle, Car, Large.
2. On entry, the system automatically assigns a free *compatible* spot.
3. A ticket is issued at entry.
4. On exit: validate the ticket, calculate the fee (hourly, rounded up), free the spot.
5. Pricing is hourly (extended: a rate per vehicle type).
6. Entry is rejected if no compatible spot exists.

### What students learn
Object-oriented design: identifying classes from requirements, **encapsulation**, **single responsibility**, enums, collections (`List`, `Map`, `Set`), packages, exceptions, and extending a design (single floor -> multi floor, single rate -> rate per vehicle type) without rewriting everything.

## 2. Package hierarchy
```
ParkingLotProject/
└── src/
    └── com/parkinglot/
        ├── Main.java                 <- entry point (demo)
        ├── model/                    <- plain data classes (what things ARE)
        │   ├── VehicleType.java
        │   ├── SpotType.java
        │   ├── ParkingSpot.java
        │   └── Ticket.java
        └── service/                  <- classes that DO the work (behaviour/rules)
            ├── ParkingFloor.java
            └── ParkingLot.java
```
**Why two packages?** `model` holds data with almost no logic; `service` holds the business rules. Separating them is a small-scale version of layered architecture.

## 3. Class by class

### VehicleType (enum) and SpotType (enum)
- **Responsibility:** a fixed, type-safe list of values (`MOTORCYCLE`, `CAR`, `LARGE`).
- **Why enums, not Strings?** `"Car"` vs `"car"` vs `"CAR"` bugs disappear; the compiler checks values.
- **Why two enums with the same values?** A *vehicle* is what arrives; a *spot* is what exists. They are different concepts that can diverge later (e.g. a motorcycle allowed in a car spot). The mapping between them lives in `ParkingLot.mapVehicleTypeToSpotType`.

### ParkingSpot
- **Responsibility:** represents one physical slot: its `id` (e.g. `F1-C1`) and its `spotType`.
- **Immutable** (`final` fields, no setters): a spot never changes its id or type.
- **Does not know** whether it is occupied. Occupancy is tracked by the floor (see below), keeping the spot simple.

### Ticket
- **Responsibility:** a receipt-like record created at entry: `id`, `floorNumber`, `spotId`, `vehicleType`, `entryTime`.
- **Immutable** so nobody can tamper with entry time (and so the fee).
- `floorNumber` is added in the multi-floor version so the system knows which floor to free on exit.

### ParkingFloor  (multi-floor extension)
- **Responsibility:** owns the spots of one floor and tracks which are occupied (`Set<String> occupiedSpotIds`).
- `findAvailableSpot(spotType)` – first free spot of that type, or `null`.
- `getAvailableSpotCount(spotType)` – how many are free.
- `occupy(spotId)` / `release(spotId)` – mark a spot taken/free.
- **Why a new class?** Floor-level logic stays in one place; `ParkingLot` no longer scans a giant list of all spots.

### ParkingLot  (the coordinator / "facade")
- **Responsibility:** the public API of the system, `enter()` and `exit()`.
- **Fields:** `floors`, `activeTickets` (`Map<ticketId, Ticket>` for O(1) lookup), `hourlyRates` (`Map<VehicleType, Long>`).
- `enter(vehicleType)`: map vehicle -> spot type, ask each floor in order for a free spot, occupy it, create a ticket with a random `UUID`, store it, return it. If no floor has a spot -> exception.
- `exit(ticketId)`: validate (null/empty/unknown/already used), compute fee, release the spot, remove the ticket (so it cannot be reused), return the fee.
- `computeFee(...)`: integer division gives full hours; any remainder adds one more hour -> **rounding up**. 61 minutes = 2 hours. Multiply by the vehicle type's rate.
- **Money is a `long` in cents** (never `double`) to avoid floating-point errors.

### Main
Builds 2 floors, sets the rates, and runs a demo: entry, rejection when full, exit with fee, reuse of a used ticket, and reuse of a freed spot.

## 4. Flow of the program
**Entry:** `Main -> ParkingLot.enter(CAR)` -> map to `SpotType.CAR` -> `floor.findAvailableSpot` -> `floor.occupy` -> new `Ticket` -> stored in `activeTickets` -> returned.

**Exit:** `ParkingLot.exit(ticketId)` -> validate -> `computeFee` -> `floor.release` -> remove ticket -> return fee.

## 5. Design concepts to highlight
| Concept | Where |
|---|---|
| Encapsulation | private final fields + getters |
| Immutability | `Ticket`, `ParkingSpot` |
| Single Responsibility | Floor manages spots; Lot manages tickets/fees |
| Composition ("has-a") | `ParkingLot` has floors, floors have spots |
| Collections choice | `Map` for fast ticket lookup, `Set` for occupied ids |
| Fail fast | exceptions for invalid input |
| Extensibility | single lot -> floors -> per-type rates with small changes |

## 6. How the design evolved (extension question)
1. **Single lot:** `ParkingLot` held all spots and `occupiedSpotIds`.
2. **Multi-floor:** introduce `ParkingFloor`; `ParkingLot` holds `List<ParkingFloor>`; `Ticket` stores `floorNumber`.
3. **Different pricing:** replace the single `hourlyRateCents` with `Map<VehicleType, Long>`; `computeFee` receives the `vehicleType`.
(For the original "same rate for all", put the same value for every type in the map.)

## 7. Compile and run
From the `ParkingLotProject` folder:
```
mkdir out
javac -d out $(find src -name "*.java")       # Windows: dir /s /b src\*.java > files.txt, then javac -d out @files.txt
java -cp out com.parkinglot.Main
```
In IntelliJ/Eclipse: create a project, copy the `com` folder into `src`, run `Main`.

## 8. Expected output (ticket IDs and spots as shown)
```
=== 1. Cars enter ===
Ticket xxxxxxxx... | CAR | floor 1 | spot F1-C1
Ticket xxxxxxxx... | CAR | floor 2 | spot F2-C1
Ticket xxxxxxxx... | CAR | floor 2 | spot F2-C2
Free CAR spots: 0
=== 2. Fourth car is rejected ===
Rejected: No available spots for vehicle type CAR
=== 3. Large vehicle enters ===
Ticket xxxxxxxx... | LARGE | floor 1 | spot F1-L1
=== 4. Car exits and pays ===
Fee for car: 2000 cents
Free CAR spots: 1
=== 5. Truck exits and pays ===
Fee for truck: 4000 cents
=== 6. Using the same ticket again ===
Rejected: Ticket not found or already used
=== 7. Empty ticket ID ===
Rejected: Invalid ticket ID
=== 8. Freed car spot is reused ===
Ticket xxxxxxxx... | CAR | floor 1 | spot F1-C1
```

## 9. Student exercises
1. Add a `Vehicle` class (plate number) and store it in the ticket.
2. Allow a motorcycle to use a free CAR spot when motorcycle spots are full.
3. Replace `RuntimeException` with custom exceptions (`NoSpotAvailableException`, `InvalidTicketException`).
4. Add a method that prints availability per floor.
5. Make it thread-safe with `synchronized` (links to the Unit 4 multithreading topic).
6. Replace `System.currentTimeMillis()` with an injectable clock so fees can be unit-tested.
