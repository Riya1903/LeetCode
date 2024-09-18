class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         int n = triangle.size();
        
        // Start from the second last row and go upwards
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                // Update the current element with the minimum path sum of the two adjacent numbers from the row below
                int minSumBelow = Math.min(triangle.get(row + 1).get(col), triangle.get(row + 1).get(col + 1));
                triangle.get(row).set(col, triangle.get(row).get(col) + minSumBelow);
            }
        }
        
        // The top element now contains the minimum path sum
        return triangle.get(0).get(0);
    }
}