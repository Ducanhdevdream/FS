/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nguyen Duc Anh
 */
public class ArrayReverse {

    public static void main(String[] args) {
        Integer[] myIntArray = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
        System.out.println("Original Array:: " + Arrays.toString(myIntArray));
        System.out.println();

        List<Integer> myReverseIntArray = Arrays.asList(myIntArray);

        Collections.reverse(myReverseIntArray);

        Integer[] reversed = myReverseIntArray.toArray(myIntArray);

        System.out.println("Array Reverse: " + Arrays.toString(reversed));

    }
}
