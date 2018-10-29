package com.example.admin.week1test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        String stringTest1 = "Hello There! Apple!";
        HashMap<Character, Integer> map1 = new HashMap<>();
        map1 = g(stringTest1);
        System.out.println(map1);
        String stringTest2 = "Errors in strategy cannot be correct through tactical maneuvers";
        System.out.println(oppositeLetters(stringTest2));
    }

    public static String oppositeLetters(String before) {
        String after = "";
        char atI;
        for (int i = 0; i < before.length(); i++) {
            atI = before.charAt(i);

            if ((int) atI >= 65 && ((int) atI <= 90)) {
                after += ((char) (90 - (int) atI - 65));
            } else if ((int) atI >= 97 && ((int) atI <= 122)) {

                after += ((char) (122 - ((int) atI - 97)));
            } else {
                after += atI;
            }
        }
        return after;
    }

    public static HashMap<Character, Integer> g(String string) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        String holder = "";
        holder = string.toLowerCase();
        for (int i = 0; i < holder.length(); i++) {
            if (((int) holder.charAt(i)) >= 97 && ((int) holder.charAt(i)) <= 122) {
                map1.put(holder.charAt(i), 0);

            }

        }
        for (int j = 0; j < holder.length(); j++) {
            if (((int) holder.charAt(j)) >= 97 && ((int) holder.charAt(j)) <= 122) {
                map1.put(holder.charAt(j),map1.get(holder.charAt(j)).intValue() + 1);
            }

        }
        return map1;
    }
}
