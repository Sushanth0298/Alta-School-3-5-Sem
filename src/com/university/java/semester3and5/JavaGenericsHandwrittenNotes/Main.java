package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Non-generic IntegerPrinter");
        IntegerPrinter integerPrinter = new IntegerPrinter(25);
        integerPrinter.print();

        System.out.println("\n2. Generic class Printer<T>");
        GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(25);
        GenericPrinter<String> stringPrinter = new GenericPrinter<>("Generics in Java");
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>(12.5);
        integerGenericPrinter.print();
        stringPrinter.print();
        doublePrinter.print();

        System.out.println("\n3. Generic type bound: T extends Animal & Serializable");
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat("Milo"));
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog("Bruno"));
        catPrinter.print();
        dogPrinter.print();

        System.out.println("\n4. Generic methods");
        GenericMethods.shout("Hello");
        GenericMethods.shout(57);
        GenericMethods.shout(new Cat("Luna"));
        GenericMethods.shoutTwo("Score", 95);
        GenericMethods.introduce(new Dog("Max"));

        System.out.println("\n5. ArrayList and type safety");
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Milo"));
        cats.add(new Cat("Luna"));
        // cats.add(new Dog("Bruno")); // Compile-time error: Dog is not a Cat.
        System.out.println("Cats: " + cats);

        List<Object> objects = new ArrayList<>();
        objects.add(new Cat("Milo"));
        objects.add(new Dog("Bruno"));
        Object firstObject = objects.get(0);
        if (firstObject instanceof Cat) {
            Cat firstCat = (Cat) firstObject;
            System.out.println("First cat: " + firstCat.getName());
        }

        System.out.println("\n6. Wildcard List<?>");
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<String> names = Arrays.asList("Asha", "Ravi");
        GenericMethods.printList(numbers);
        GenericMethods.printList(names);
        // A List<?> can be read as Object, but arbitrary values cannot be added.
        // numbers.add("wrong"); // Compile-time error for List<Integer>.

        System.out.println("\n7. HashSet and HashMap");
        CollectionExamples.run();
    }
}
