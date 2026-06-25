class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int len = operations.length;
        int X = 0;
        for(int i=0;i<len;i++){
            if(operations[i].equals("++X")){
                X++;
            }
            else if(operations[i].equals("X++")){
                X++;
            }
            else if(operations[i].equals("X--")){
                X--;
            }
            if(operations[i].equals("--X")){
                X--;
            } 
        }
        return X;
    }
}