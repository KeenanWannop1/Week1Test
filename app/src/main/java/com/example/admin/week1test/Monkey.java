package com.example.admin.week1test;

public class Monkey extends Animal {

    Monkey(){

    }
    @Override
    public void eatFood(String foodname){
        energy = energy + 2;
    }
    @Override
    public void makeSound(){
        energy = energy - 4;
    }
    public void play(){
        String sound = "Oooo Oooo Oooo";
        energy = energy - 8;
    }

}
