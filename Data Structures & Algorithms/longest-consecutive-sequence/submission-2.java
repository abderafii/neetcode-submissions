class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> presentEles = new HashSet<>();
        for(int num : nums){
            presentEles.add(num);
        }

        for(int element : presentEles){
            int current = 0;
            if(!presentEles.contains(element -1)){
                current = 1;
                while(presentEles.contains(element + current)){
                    current++;
            }}
            longest = Math.max(current, longest);
        }

        return longest;
    }
}