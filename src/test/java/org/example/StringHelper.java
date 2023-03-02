package org.example;
import java.lang.*;

import java.io.*;

import java.util.*;
public class StringHelper {
    public String reverse (String str) {

    String input =  "This is a phrase to reverse";
    StringBuilder reversedStr = new StringBuilder(str);

        reversedStr.append(input);
        reversedStr.reverse();

     System.out.println( "Reversed String: "+ reversedStr);
    }

}
 /*
 /ReverseString using StringBuilder.

public static void main(String[] arg) {

// declaring variable

         String input = "Independent";

         // creating StringBuilder object

        StringBuilder stringBuildervarible = new StringBuilder();

        // append a string into StringBuilder stringBuildervarible

        //append is inbuilt method to append the data

        stringBuildervarible.append(input);

        // reverse is inbuilt method in StringBuilder to use reverse the string

        stringBuildervarible.reverse();

        // print reversed String

        System.out.println( "Reversed String  : " +stringBuildervarible);

}
 // Java program to reverse a string using While loop

import java.lang.*;

import java.io.*;

import java.util.*;

public class strReverse {

    public static void main(String[] args)

    {

    String stringInput = "My String Output";

    //Get the String length

    int iStrLength=stringInput.length();

    //Using While loop

while(iStrLength >0)

{

System.out.print(stringInput.charAt(iStrLength -1));

iStrLength--;

}

    }

}
 //ReverseString using CharcterArray.

public static void main(String[] arg) {

// declaring variable

String stringinput = "Independent";

        // convert String to character array

        // by using toCharArray

        char[] resultarray = stringinput.toCharArray();

        //iteration

        for (int i = resultarray.length - 1; i >= 0; i--)

         // print reversed String

            System.out.print(resultarray[i]);

}
  */