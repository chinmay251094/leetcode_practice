package Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //user-defined array from which the user wants indexes of the target value they provide
        int[] arrayToFindIndexFrom = {0, 1, 1, 2, 3, 4, 5, 1, 3, 6, 1, 8};
        //calling the function using class_name.method_name
        ArrayListDemo.getAllIndexes(arrayToFindIndexFrom, 1);
    }

    public static int[] getAllIndexes(int[] arr, int target) {
        //creating an empty list to store indexes of the target value from the array
        List<Integer> listToStoreIndex = new ArrayList<>();

        //loop to iterate over the array provided by the user through parameter(pass by value)
        for (int index = 0; index < arr.length; index++) {
            //condition to check if the current element value on the index is equal to the target provided by the user
            if(arr[index] == target) {
                //if index of the array contains the target value store the same in the list
                listToStoreIndex.add(index);
            }
        }
        //creating a new array to store all the list elements and return it to the funtion
        int[] arrayToBeReturnedWithIndexes = new int[listToStoreIndex.size()];

        //loop to iterate through each and every element in the list and store the same in the new array
        for (int index = 0; index < listToStoreIndex.size(); index++) {
            //store items of list in to the array
            arrayToBeReturnedWithIndexes[index] = listToStoreIndex.get(index);
        }
        //return the array after storing all the list elements
        return arrayToBeReturnedWithIndexes;
    }
}
