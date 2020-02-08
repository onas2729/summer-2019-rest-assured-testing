package com.bookit.step_definitions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate_or_Not {
    public static boolean checkDuplicateUsingSet(String[] input) {
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if (inputSet.size() < inputList.size()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkDuplicateUsingSet(new String[]{"a", "b", "abcd", "aaaaa"}));

  //          String[] input = new String[]{"a", "b", "c", "d" ,"a"};
//            List inputList = Arrays.asList(input);
//            Set inputSet = new HashSet(inputList);
//            if (inputSet.size() < inputList.size()) {
//                System.out.println("there is duplicate");
//            } else {
//                System.out.println("there is not duplicate");
//            }




    }
}


