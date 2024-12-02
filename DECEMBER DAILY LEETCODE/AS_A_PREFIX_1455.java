class Solution {
    public int isPrefixOfWord(String sentence, String str) {
        String input[]=sentence.split(" ");
        for(int i=0;i<input.length;i++){
            String k=input[i];
            if(k.length()>=str.length()&&k.substring(0,str.length()).equals(str))return i+1;
        }
        return -1;
    }
}
//tc-O(N)
