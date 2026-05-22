class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> numbersMap = new HashMap<>();
        for(int numb:nums){
            numbersMap.put(numb, numbersMap.getOrDefault(numb,0)+1);
        }
        int[] answer = numbersMap.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();

        return answer;
    }
}
