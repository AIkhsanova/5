package com.company;

public abstract class elf {
    private String name;
    private String Class;
    private static String race="эльф";

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getThisClass() {
        return Class;
    }


    elf(String name, String Class) {
        this.name = name;
        this.Class = Class;
    }

    public abstract void run();

    public void die() {
        System.out.println("Умирает");
    }
}
