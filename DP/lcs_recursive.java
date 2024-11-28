class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        return lcs(s1,s2,0,0);
    }
    public int lcs(String s1,String s2,int i,int j){
      if(i==s1.length()||j==s2.length()){
         return 0;

      }
      int ans=0;
      if(s1.charAt(i)==s2.charAt(j)){
        ans=1+lcs(s1,s2,i+1,j+1);
      }else {
      int li=lcs(s1,s2,i+1,j);
      int ji=lcs(s1,s2,i,j+1);
      ans=Math.max(li,ji);}
      return ans;
    }
}
