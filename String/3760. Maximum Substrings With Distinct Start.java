class Solution {
    public int maxDistinct(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Character> ar = new ArrayList<>();
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(ar.contains(arr[i])){
                
            }
            else{
                ar.add(arr[i]);
                result++;
            }
        }
        return result;
    }
}