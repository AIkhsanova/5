package com.company;

public class Битва {
    public void start(){
        Лучник archer=new Лучник("Леголас");
        Маг mag=new Маг("Элас");
        System.out.println("Сражаются"+" "+mag.getRace()+" "+mag.getThisClass()+" "+mag.getName()+" и "
                +archer.getRace()+" "+archer.getThisClass()+" "+archer.getName());
        archer.shoot();
        mag.FireShield();
        mag.Expelliarmus();
        archer.run();
        archer.climb();
        mag.Meteor();
        archer.run();
        System.out.println("The end!");
    }
}
