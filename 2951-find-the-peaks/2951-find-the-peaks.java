class Solution {
    public List<Integer> findPeaks(int[] nums) {
        List<Integer> a=new ArrayList<>();
    //   if(nums[0]>nums[1]){
    //     a.add(0);
    //   } 
    //   if(nums[nums.length-1]>nums[nums.length-2]){
    //     a.add(nums.length-1);
    //   } 
      for(int i=1;i<nums.length-1;i++){
        if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
            a.add(i);
        }
      }
      return a; 
    }
}