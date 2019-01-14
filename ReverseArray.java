import java.util.Arrays;

class ReverseArray {

    private int[] numbers;
    
    /**
     * Reverse an array of integers
     * So [1, 2, 3] becomes [3, 2, 1]
     * @param arr
     */
    public void reverseArray(int[] arr) {
        numbers = arr;
        reverse();
        //Print sorted array
        System.out.println(Arrays.toString(numbers));
    }

    public void reverse() {

        //Set pointers
        int left = 0;
        int right = numbers.length - 1;

        //As long as left is less than right
        //keep swapping the integers at each index
        while(left < right) {
            //Swap values
            swap(left, right);
            //Move left pointer up
            left++;
            //Move right pointer down
            right--;
        }

    }

    /**
     * Swap two values in array given the indexs
     * @param left The left pointers index
     * @param right The right pointers index
     */
    public void swap(int left, int right) {

        //Temporarily store the left pointers value
        int temp = numbers[left];

        //Overwrite the left pointers value
        numbers[left] = numbers[right];

        //Set the last pointers value to the left pointers
        numbers[right] = temp;
    }

}