/*
 * Name : Shubham Vyas
 * Enroll : 200469159
 * Description : Blueprint of main class contains getter and setters and constructors
 * */
package com.example.labs_2_geo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Modal Class
public class Cricket {
    private int runs;       //Private instance variable
    private String name;    //Private instance variable
    private String gender; //Private instance variable
    private String category; //Private instance Variable
    private boolean boundaries;

    //Parameterized Constructor
    public Cricket(int runs, String name, String gender, String category, boolean boundaries) { //Parameters Constructor
        setName(name);  //Calling setter method
        setGender(gender);  //Calling Setter method
        setRuns(runs);  //Calling setter method
        setCategory(category);//Calling setter method
        setBoundaries(boundaries);
    }

    public boolean isBoundaries() {
        return boundaries;
    }

    public void setBoundaries(boolean boundaries) {
        this.boundaries = boundaries;
    }

    //Getter Method
    public String getCategory(){

        return category;
    }

    //Setter Method
    public void setCategory(String category) {
        List<String> validCategory= getAllCategory();
        if(validCategory.contains(category)){
            this.category=category;
        }
        else{
            throw new IllegalArgumentException("Runs cannot be Zero");

        }
    }

    //getter method
    public int getRuns() {
        return runs;
    }

    //setter method
    public void setRuns(int runs) {

        if(runs==0){
            throw new IllegalArgumentException("Runs cannot be Zero");
        }
        else {
            this.runs = runs;
        }
    }

    //getter method
    public String getName() {
        return name;
    }

    //Setter method
    public void setName(String name) {
        if(name.length()<=2){
            throw new IllegalArgumentException("Name should be greater than 2 letters");
        }
        else {
            this.name = name;
        }
    }

    //getter method
    public String getGender() {
        return gender;
    }

    //Setter method
    public void setGender(String gender) {
            this.gender = gender;

    }


    //This method returns all category
    public static List<String> getAllCategory(){
            List<String> category=Arrays.asList("Batsman","Bowler","All Rounder");
            Collections.sort(category);
            return category;

    }

    //Method ToString to return data
    @Override
    public String toString() {
        return "Cricket{" +
                "Runs=" + runs +
                ", Name='" + name + '\'' +
                ", Boundaries=" + boundaries +
                ", Gender="+ gender+
                ", Category="+category+
                '}';
    }
}