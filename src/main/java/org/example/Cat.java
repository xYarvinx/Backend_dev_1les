package org.example;

public class Cat {
    private Integer age_;

    public int getAge() {
        return this.age_;
    }

    private String name_self_;

    public String getName() {
        return this.name_self_;
    }

    private String name_owner_;

    public Cat(Integer age,String name_self,String name_owner) {
        this.age_ = age;
        this.name_self_ = name_self;
        this.name_owner_ = name_owner;
    }


    void meow() {
        if (this.age_ < 1) {
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
