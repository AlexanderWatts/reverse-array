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

         //Set pointers
         int left = 0;
         int right = numbers.length - 1;

         recursiveReverse(left, right);
        
        //Print sorted array
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * @param l The left index
     * @param r The right index
     */
    private void reverse(int l, int r) {

        //As long as left is less than right
        //keep swapping the integers at each index
        while(l < r) {
            //Swap values
            swap(l, r);
            //Move left pointer up
            l++;
            //Move right pointer down
            r--;
        }

    }

    /**
     * Recursive reverse
     * @param l The left index
     * @param r The right index
     */
    private void recursiveReverse(int l, int r) {
        if(l < r) {
            swap(l, r);
            recursiveReverse(l + 1, r - 1);
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