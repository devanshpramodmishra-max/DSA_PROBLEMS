class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();

        int i = nums.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += nums[i];
                i--;
            }

            ans.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}