package com.company;

public class StringCompare {

    public static void main(String[] args) {
	// write your code here
        String name1 = "Mark";
        String name2 = "Mark";
        String name3 = "Mary";
               //compare "Mark" & "Mark"
        if (name1.equals(name2)) {
            System.out.println(name1 + " and " + name2 + " are the same ");
        }
        else {
            System.out.println(name1 + "and" + name2 + " are not the same");
        }
        //compare  "Mark" & Mary"
        if(name1.equals(name3)){
            System.out.println(name1 + " and " + name3 + " are the same");
        }
        else {
            System.out.println(name1 + " and " + name3 + " are not the same");
        }
        }




}