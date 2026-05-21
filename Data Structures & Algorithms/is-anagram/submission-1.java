class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstWord = new  HashMap<>();
        HashMap<Character, Integer> secondWord = new  HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(firstWord.get(c) != null){
                firstWord.put(c,firstWord.get(c)+1);
            } else {
                firstWord.put(c,1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(secondWord.get(c) != null){
                secondWord.put(c,secondWord.get(c)+1);
            } else {
                secondWord.put(c,1);
            }
        }
        if(firstWord.equals(secondWord)) return true;
        else return false;
    }
}
