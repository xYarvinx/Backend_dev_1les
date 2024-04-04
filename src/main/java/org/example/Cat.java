package org.example;

public class Cat {
    private Integer age;

    public int getAge() {
        return this.age;
    }

    private String selfName;

    public String getName() {
        return this.selfName;
    }

    private String ownerName;

    public Cat(Integer age,String selfName,String ownerName) {
        this.age = age;
        this.selfName = selfName;
        this.ownerName = ownerName;
    }


    void meow() {
        if (this.age < 1) {
            System.out.println("MEEEEEEEEEEOW");
        }
        else {
            System.out.println("MEOW!!!");
        }
    }

    void jump() {
        System.out.println("Jumped!!");
    }

    void drinkMilk() {
        System.out.println("Drinked Milk!!!");
    }

}
