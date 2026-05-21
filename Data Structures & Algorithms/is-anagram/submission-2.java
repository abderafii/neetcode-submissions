class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstWord = new  HashMap<>();
        HashMap<Character, Integer> secondWord = new  HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            firstWord.put(c, firstWord.getOrDefault(c,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            secondWord.put(c, secondWord.getOrDefault(c,0)+1);
        }
        if(firstWord.equals(secondWord)) return true;
        else return false;
    }
}
