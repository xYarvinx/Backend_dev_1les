package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat cat_1 = new Cat(10, "Boris", "Nikolay");
        cat_1.drinkMilk();
        cat_1.meow();
        cat_1.jump();

        System.out.println(cat_1.getAge());
        System.out.println(cat_1.getName());
    }
}

