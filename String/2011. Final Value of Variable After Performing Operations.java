class Solution {
    public int finalValueAfterOperations(String[] operations) {
     int fnl =0;
     for(String i : operations){
        if(i.equals("++X") || i.equals("X++")){
            fnl+=1;
        }
        if(i.equals("--X") || i.equals("X--")){
            fnl-=1;
        }
        
     }  return fnl; 
    }
}