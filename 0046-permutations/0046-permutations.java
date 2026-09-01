class Solution {
    public void BackTrack(int[] nums,List<Integer> a,List<List<Integer>> answer){
        //ye hamara function hai 
        if(a.size()==nums.length){
            answer.add(new ArrayList<>(a));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                continue;
            }
        
        a.add(nums[i]);
        BackTrack(nums,a,answer);
        a.remove(a.size()-1);}
        }
    public List<List<Integer>> permute(int[] nums) {
        //isme we need to find all the permutations in which a number can exist
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        BackTrack(nums, a,answer);
        return answer;
    }
}