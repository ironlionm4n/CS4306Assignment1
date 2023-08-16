package Utilities;

public class SearchFunctions {

    /**
     *
     * @param input - the input array of integers
     * @param target - the target number to find the index of
     * @return - the index of the target in the input
     */

    public static int BinarySearchIntArray(int[] input, int target)
    {
        int startingIndex = 0;
        int endingIndex = input.length - 1;
        while(startingIndex <= endingIndex)
        {
            int midPoint  = (startingIndex + endingIndex) / 2;
            if(input[midPoint] < target)
            {
                startingIndex = (midPoint + 1);
            } else if(input[midPoint] > target)
            {
                endingIndex = (midPoint - 1);
            } else {
                return midPoint;
            }
        }

        return -1;
    }
}
