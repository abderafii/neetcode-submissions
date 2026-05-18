class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1;
        Set<Integer> presentEles = new HashSet<>();
        for(int num : nums){
            presentEles.add(num);
        }

        for(int element : presentEles){
            int current = 1;
            while(presentEles.contains(element + current)){
                current++;
            }
            longest = Math.max(current, longest);
        }

        return longest;
    }
}