class Solution {
    public int missingInteger(int[] nums) {

        boolean[] present = new boolean[1300];

        for (int num : nums) {
            present[num] = true;
        }

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }

            sum += nums[i];
        }

        while (present[sum]) {
            sum++;
        }

        return sum;
    }
}