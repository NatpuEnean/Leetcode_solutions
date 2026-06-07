class Solution {
    public int scoreOfString(String s) {
        char[] arr=s.toCharArray();
        int score=0;
        for(int i=0;i<s.length();i++){
            int x=(int)arr[i];
            if(i<(s.length()-1)){
                int y=(int)arr[i+1];
                score=score+Math.abs(x - y);
            }
            else{
                break;
            }
        }
        return score;
    }
}