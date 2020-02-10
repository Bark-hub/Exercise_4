package com.company;

import java.util.*;
// Mubarik Abdi 2/9/2020

public class Main {
    public static Scanner inpute = new Scanner(System.in);

    public static String city = "";
    public static double avgTemp;
    public static int repeat = 0;

    // I declared/initiated some lists and varaibles up here as public static for ease of use

    public static Map<String, Double> cityNTemp = new HashMap<>();
    public static ArrayList<String> cityNames = new ArrayList<>();

    public static void ask() {
        //while loop to repeat the asking process
        while (!city.equals("END")) {
            Scanner inpute = new Scanner(System.in);
            System.out.println("What is the city? Type END to stop.");
            city = inpute.nextLine();

            if (city.equals("END")){
                break;
            }
            // if statement to be able to break while loop

            System.out.println("And what Temperature for the next 5 days? Plug in each temperature.");
            System.out.println("Monday");    double temp1 = inpute.nextDouble();
            System.out.println("Tuesday");   double temp2 = inpute.nextDouble();
            System.out.println("Wednesday"); double temp3 = inpute.nextDouble();
            System.out.println("Thursday");  double temp4 = inpute.nextDouble();
            System.out.println("Friday");    double temp5 = inpute.nextDouble();

            avgTemp = (temp1 + temp2 + temp3 + temp4 + temp5) / 5;

            repeat = repeat+1;
            cityNames.add(city);
            cityNTemp.put(city, avgTemp);
        }

    }


    public static void say() {
        for (int i = 0; i < repeat; i++){
            System.out.println("City: "+cityNames.get(i)+"--- Average Temperature: "+cityNTemp.get(cityNames.get(i)));
        }
    }

    public static void main(String[] args) {

        ask();
        say();

    }
}