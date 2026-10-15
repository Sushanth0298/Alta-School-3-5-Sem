# Java Generics — organized from the handwritten notes

## Package and class hierarchy

```text
JavaGenericsHandwrittenNotes/
└── src/
    └── genericsdemo/
        ├── Main.java
        ├── IntegerPrinter.java
        ├── GenericPrinter.java
        ├── Animal.java
        ├── Cat.java
        ├── Dog.java
        ├── AnimalPrinter.java
        ├── GenericMethods.java
        └── CollectionExamples.java
```

Class relationships:

```text
Animal (abstract, implements Serializable)
├── Cat
└── Dog

IntegerPrinter                 // original non-generic example
GenericPrinter<T>              // generic class with an unrestricted type parameter
AnimalPrinter<T extends Animal & Serializable>
                               // bounded generic class
GenericMethods                  // generic methods and wildcard method
CollectionExamples             // HashSet and HashMap demonstrations
Main                           // runs the examples
```

## Compile and run

From the `JavaGenericsHandwrittenNotes` directory:

```bash
javac -d out src/genericsdemo/*.java
java -cp out genericsdemo.Main
```

## Important corrections to the handwritten code

1. Java keywords are lowercase: `public`, `class`, `void`, and `static`.
2. The entry point is `public static void main(String[] args)`.
3. The field and parameter types in `GenericPrinter<T>` use the type parameter `T`.
4. A generic type argument must be a reference type. Use `Integer`, not primitive `int`, in `GenericPrinter<Integer>`.
5. `List<Cat>` cannot accept a `Dog`; that is a compile-time error, not a `ClassCastException`.
6. A `List<Object>` can hold both `Cat` and `Dog`, but retrieving an item as `Cat` requires checking/casting if the variable is typed as `Object`.
7. `List<?>` means a list of some unknown element type. It can be read as `Object`, but arbitrary values cannot safely be added (except `null`).
8. For `T extends Animal & Serializable`, the class bound (`Animal`) must come before interface bounds (`Serializable`).

## Theory summary

### 1. Why generics?

Generics allow classes, interfaces, and methods to work with different reference types while preserving compile-time type checking. They reduce the need for casts and catch many type mistakes before the program runs.

### 2. Generic class

`GenericPrinter<T>` declares a type parameter named `T`. For example, `GenericPrinter<String>` fixes `T` as `String`, while `GenericPrinter<Integer>` fixes it as `Integer`.

### 3. Bounded type parameter

`T extends Animal & Serializable` restricts `T` to types that are both `Animal` subtypes and `Serializable`. If a class bound exists, it must appear first, followed by interface bounds.

### 4. Generic methods

In `public static <T> void shout(T value)`, `<T>` declares a method-level type parameter. It appears before the return type. The compiler can infer the type from the argument.

### 5. Collections and type safety

`List<Cat>` accepts `Cat` objects (and subclasses of `Cat`), not unrelated types such as `Dog`. `List<Object>` can store different object types, but it does not promise that every element is a `Cat`.

### 6. Wildcards

- `List<?>`: a list of an unknown element type.
- `List<? extends Animal>`: a producer of `Animal` values; values can be read as `Animal`, but arbitrary animals cannot safely be added.
- `List<? super Cat>`: a consumer of `Cat` values; `Cat` objects can be added, while values read from the list are safely treated as `Object`.

The last two forms illustrate PECS: **Producer Extends, Consumer Super**.

### 7. HashSet and HashMap

`HashSet<String>` stores unique strings. `HashMap<String, Integer>` associates string keys with integer values. Type arguments help the compiler enforce the intended element, key, and value types.

## Expected behaviour

The program prints values from each example, including the generic printers, generic methods, animal hierarchy, wildcard lists, and collection examples. `HashSet` iteration order and `HashMap` iteration order are not guaranteed, so their displayed order can vary.

The deliberately invalid statements are commented out so the project compiles. Uncommenting `cats.add(new Dog("Bruno"))` should cause a compile-time type error.
