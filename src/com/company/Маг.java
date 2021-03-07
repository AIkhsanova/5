package com.company;

public class Маг extends elf implements колдующий {

    Маг(String name){
        super(name, "маг");
    }

    @Override
    public void run() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"использует заклинание Городской портал и переносится в ближайший свободный город");
    }

    @Override
    public void Expelliarmus() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"применяет заклинание Expelliarmus и разоруживает противника");
    }

    @Override
    public void Meteor() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"Вызывает меторитный дождь");
    }

    @Override
    public void FireShield() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"укрывается огненным щитом");
    }
}
