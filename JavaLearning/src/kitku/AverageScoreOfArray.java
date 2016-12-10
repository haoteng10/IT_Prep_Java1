package kitku;

import java.util.Arrays;

/**
 * Created by haote on 2016/11/19.
 */
public class AverageScoreOfArray {
    ///////
    //Create array of score and find 3M
    //Ex1 = 1,2,3,4,5
    //Ex2 = -9,9,-9,9,-9
    ///////

    public static void main(String args[]) {
        int[] input1 = {1, 2, 3, 4, 5};
        System.out.println(findMean(input1));
        System.out.println(findMedian(input1));
        System.out.println(findMode(input1));

        int[] input2 = {2, 4, 6, 8, 10};
        System.out.println(findMean(input2));
        System.out.println(findMedian(input2));
        System.out.println(findMode(input2));
    }

    //Mean is average
    public static double findMean(int[] score) {
        double result = 0;
        for (int i = 0; i < score.length; i++){
            result = result + score[i];
        }
        return result / score.length;
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
        if (score.length % 2 == 0){
            //edge case
//            return (score[score.length/2] + score[score.length/2 - 1]) / 2.0;
            return findMean(new int[]{score[score.length/2] + score[score.length/2 - 1]});
        }else{
            return score[score.length/2];
        }
    }

    //Print the smallest value if there are multiple answers.
    //The value that occurred the most.
    //Ex: 1,1,1,1,2,3
    //ans = 1

    //Ex:4,4,5,5
    //ans = 4 (see direction)
    public static int findMode(int[] score) {
        Arrays.sort(score);

        int finalOccurrence = -1;
        int finalResult = -1;

        int curOccurrence = -1;
        int curResult = score[0];

        for(int i = 0; i < score.length; i++){
            if (curResult == score[i]){
                curOccurrence++;
            }else{
                // do compare between current and final

                if (!(finalOccurrence > curOccurrence)){
                    finalOccurrence = curOccurrence;
                    finalResult = curResult;
                }

                //update cur

                curOccurrence = 1;
                curResult = score[i];
            }
        }
        return finalOccurrence > curOccurrence ? finalResult:curResult;
    }

}
