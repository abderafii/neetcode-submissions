class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mappy = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(mappy.containsKey(complement)) return new int[]{mappy.get(complement), i};
            else mappy.put(nums[i],i);
        }
        return new int[2];
    }
}
