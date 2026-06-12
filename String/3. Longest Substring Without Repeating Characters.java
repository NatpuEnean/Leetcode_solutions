class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        if (ch == null || ch.length == 0) {
    return 0;
}
        int ans=1;
        ArrayList<Character> temp= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int j=i+1;
            int t=1;
            temp.add(ch[i]);
            while(j<s.length()){
                if(!temp.contains(ch[j])){
                     temp.add(ch[j]);
                    j++;t+=1;
                   
                }
                else{
                    break;
                }
            }temp.clear();
            if(t>ans){
                ans=t;
            }
        }
        return ans;
    }
}