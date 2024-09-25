class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next position of the non-val element
        
        // Traverse through all elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at the k-th position
                nums[k] = nums[i];
                // Increment the k position
                k++;
            }
        }
        
        // k is now the number of elements that are not equal to val
        return k;
    }
    }