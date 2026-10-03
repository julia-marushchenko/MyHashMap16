/**
 *  Java program to crete, update, and delete data from HashMap.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of HashMap.
        Map<Integer, String> myMap = new HashMap<>();

        // Adding keys and values to myMap.
        myMap.put(2, "Monday");
        myMap.put(4, "Thursday");
        myMap.put(1, "Saturday");

        // Print.
        System.out.println(myMap); // Output: {1=Saturday, 2=Monday, 4=Thursday}

        // Update myMap.
        myMap.put(5, "Sunday");
        myMap.replace(4, "Friday");

        // Print.
        System.out.println(myMap); // Output: {1=Saturday, 2=Monday, 4=Friday, 5=Sunday}

    }
}