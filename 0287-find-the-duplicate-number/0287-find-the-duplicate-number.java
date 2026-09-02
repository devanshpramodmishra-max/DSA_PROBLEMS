class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> a = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (a.contains(nums[i])) {
                return nums[i];
            }

            a.add(nums[i]);
        }

        return -1;
    }
}
//int this we need to check each element one by one and then we can easily adda and run as we are in aset 