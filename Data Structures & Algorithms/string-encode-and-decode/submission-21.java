class Solution {

    public String encode(List<String> strs) {
        String sentence = "";
        if(strs.isEmpty()){
            sentence = null;
        }
        for(int i=0; i<strs.size(); i++){
            sentence += strs.get(i).length() + "*" + strs.get(i);  
        }
        System.out.println(sentence);
        return sentence;
    }

    public List<String> decode(String str) {
        List<String> lst= new ArrayList<>();
        if(str == null) return lst;
        for(int i=0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int charNumber = Character.getNumericValue(str.charAt(i));
                int j = i;
                int counter = 2;
                while(str.charAt(j+1) != '*'){
                    j++;
                    counter++;
                    charNumber = charNumber * 10 + Character.getNumericValue(str.charAt(j));
                }
                String word = str.substring(i+counter,i+charNumber+counter);
                lst.add(word);
                i += charNumber +1;
            }
        }
        return lst;
    }
}
