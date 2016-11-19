package prep.it.singwai.class3;

import java.util.Arrays;

public class ArrayScore {

    ///////
    //Create array of score and find 3M
    //Ex1 = 1,2,3,4,5
    //Ex2 = -9,9,-9,9,-9
    ///////

    public static void main(String args[]) {
        int[] input1 = {1, 2, 3, 4, 5};
        double input1Mean = findMean(input1);
        double input1Median = findMedian(input1);
        int input1Mode = findMode(input1);

        System.out.println("Average is " + input1Mean);
        System.out.println("Median is " + input1Median);
        System.out.println("Mode is " + input1Mode);
        System.out.println("");

        int[] input2 = {2, 6, 4, 6, 8, 11, 11};
        double input2Mean = findMean(input2);
        double input2Median = findMedian(input2);
        int input2Mode = findMode(input2);
        System.out.println("Average is " + input2Mean);
        System.out.println("Median is " + input2Median);
        System.out.println("Mode is " + input2Mode);
    }

    //Mean is average
    public static double findMean(int[] score) {
        double total = 0;
        for (int i = 0; i < score.length; i++) {
            total = total + score[i];
        }
        return total / score.length;
    }

    //Median is the middle number
    //Ex: 1,2,3,4,5
    //ans = 3

    //Ex: 1,2,3,4,5,6
    //ans = (3 + 4) / 2

    //Ex:1,4,2,3,5
    //ans = 3
    public static double findMedian(int[] score) {
        Arrays.sort(score);
        if (score.length % 2 == 0) {
            //edge case
            return (score[score.length / 2] + score[score.length / 2 - 1]) / 2.0;
//            return findMean(new int[]{score[score.length / 2], score[score.length / 2 - 1]});
        } else {
            return score[score.length / 2];
        }
    }

    //Print the largest value if there are multiple answers.
    //The value that occurred the most.
    //Ex: 1,1,1,1,2,3
    //ans = 1

    //Ex:4,4,5,5
    //ans = 5 (see direction)
    public static int findMode(int[] score) {
        Arrays.sort(score);
        int finalOccurrence = -1;
        int finalResult = -1;

        int curOccurrence = 1;
        int curResult = score[0];

        for (int i = 1; i < score.length; i++) {
            if (curResult == score[i]) {
                //update cur
                curOccurrence++;
            } else {
                //do compare between cur and final
                if (!(finalOccurrence > curOccurrence)) {
                    finalOccurrence = curOccurrence;
                    finalResult = curResult;
                }
                //update cur
                curOccurrence = 1;
                curResult = score[i];
            }
        }
        if (!(finalOccurrence > curOccurrence)) {
            finalOccurrence = curOccurrence;
            finalResult = curResult;
        }
        return finalResult;
//        OR return finalOccurrence > curOccurrence ? finalResult : curResult;

    }

}
