class Solution {

    public String encode(List<String> strs) {
        String sentence = null;
        for(int i=0; i<strs.size(); i++){
            if(i==0){
                sentence = strs.get(i);
            } else sentence = sentence  + "__" +  strs.get(i);
        }
        return sentence;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        if(str == null) return strs;
        String[] strsArray = str.split("__");
        for(int i=0; i<strsArray.length; i++){
            strs.add(strsArray[i]);
        }
        return strs;
    }
}
