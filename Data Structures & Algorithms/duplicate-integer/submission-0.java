class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet uniqueNumbers = new HashSet<>();
        for(int num:nums){
            if(!uniqueNumbers.contains(num)){
                uniqueNumbers.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}