class Solution {
    public int findNumbers(int[] nums) {
        int counts = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int digits = 0;

            while (sum > 0) {
                sum /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                counts++;
            }
        }

        return counts;
    }
}