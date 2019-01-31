package tudelft.numfinder;

import java.util.Arrays;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        // Let's sort the array first in ascending order
        Arrays.sort(nums);
        // Finding the smallest and largest elements
        if (nums[0] < nums[nums.length-1]) {
            smallest = nums[0];
            largest = nums[nums.length - 1];
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
