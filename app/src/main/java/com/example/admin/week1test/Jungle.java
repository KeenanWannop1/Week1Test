package com.example.admin.week1test;
import java.util.*;
public class Jungle {
    public List animalList = new ArrayList();
    public List foodList = new ArrayList();
    Jungle(){
        foodList.add("grain");
        foodList.add("meat");
        foodList.add("bugs");
        foodList.add("fish");
    }

    public void soundOff(){
        //have all animals makeSound and report energy levels


        for(int x = 0; x < animalList.size(); x++){
        if(animalList.get(x) == "Monkey"){
            Monkey monkey = new Monkey();
            monkey.makeSound();
            System.out.println(monkey.energy);
        }
        if(animalList.get(x) == "Tiger"){
            Tiger tiger = new Tiger();
            tiger.makeSound();
            System.out.println(tiger.energy);
        }
        if(animalList.get(x) == "Snake"){
            Snake snake = new Snake();
            snake.makeSound();
            System.out.println(snake.energy);
        }
        }
    }
}
