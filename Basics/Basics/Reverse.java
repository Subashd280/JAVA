package Basics.Basics;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Reverse {
    public static void main(String args[]){
        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}


