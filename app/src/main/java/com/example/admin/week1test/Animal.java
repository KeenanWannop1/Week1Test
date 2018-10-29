package com.example.admin.week1test;


import java.util.Random;

abstract class Animal {
    public static int energy;
    Animal(){
        energy = 20;
    }
    public static void main(String[] args) {

    }
    public void makeSound(){
        energy = energy - 3;
    }
    public void eatFood(String foodName){
        energy = energy + 5;
    }
    public void sleep(){
        energy = energy + 10;
    }

}
