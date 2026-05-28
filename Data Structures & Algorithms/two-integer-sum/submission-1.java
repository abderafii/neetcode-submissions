class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mappy = new HashMap<>();
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(mappy.containsKey(complement)){
                if(i>mappy.get(complement)){
                    answer[0] =  mappy.get(complement);
                    answer[1] = i;
                } else {
                    answer[0] =  mappy.get(complement);
                    answer[1] = i;
                }
            }
            else {
                mappy.put(nums[i],i);
            }
        }
        return answer;
    }
}
