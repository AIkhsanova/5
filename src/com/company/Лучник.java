package com.company;

public class Лучник extends elf implements стреляющий{

    Лучник(String name){
        super(name, "лучник");
    }

    @Override
    public void run() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"быстро убегает");

    }

    @Override
    public void shoot() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"стреляет из лука");
    }

    @Override
    public void climb() {
        System.out.println(this.getThisClass()+' '+this.getName()+' '+"карабкается на дерево");
    }
}
