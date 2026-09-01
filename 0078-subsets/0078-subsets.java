class Solution {
    public void Solve(int[] nums,int i,List<List<Integer>> answer,List<Integer> temp){
        //this is the function which will contain the recursive call 
        if(i==nums.length){
            answer.add(new ArrayList<>(temp));
            return;
        }
        //ab aata hai pura scene
        //inclusion
        temp.add(nums[i]); 
        Solve(nums,i+1,answer,temp);

        //now remove the addded element in the temp
        temp.remove(temp.size()-1);

        //ab exclude
        Solve(nums,i+1,answer,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
       //this will be solved by hte include and te exclude concept 
        List<List<Integer>> answer =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        //ab we have defined the two required array lists 
        int i=0;
        Solve(nums,i,answer,temp);
        return answer;
    }
}