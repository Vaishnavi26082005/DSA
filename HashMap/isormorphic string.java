class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
     HashMap<Character,Character>map= new HashMap<>();
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        char p=t.charAt(i);
        if(!map.containsKey(c)){
            if(map.containsValue(p))return false;
        map.put(c,p);}
        else{
            if(map.get(c)!=p)return false;
        }
        

     }
     return true;
    }
}
