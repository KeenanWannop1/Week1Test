package com.example.admin.week1test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tiger extends Animal {
    //Override default sleep from Animal to be 5 energy instead of normal 10
    @Override
    public void sleep(){
    energy = energy + 5;
    }

    @Override
    public void eatFood(String foodName) {
        //Create a food available list, then pick randomly from list, if grain, re-pick until not grain.
        String[] foodAvail = new String[4];
        Random random = new Random();
        foodAvail[0] = "grain";
        foodAvail[1] = "meat";
        foodAvail[2] = "bugs";
        foodAvail[3] = "fish";
        String foodPicked = "grain";
        while(foodPicked == "grain"){
            foodPicked = foodAvail[random.nextInt(3)];
        }
        //Eat food once not grain
        super.eatFood(foodPicked);
    }
}
