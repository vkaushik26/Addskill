class Solution {
   public boolean isValidSudoku(char[][] board) {
    HashSet<String> set = new HashSet();
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               char val= board[i][j];
               if(val != '.'){
                   if(!set.add(val + "row" + i) || !set.add(val + "col" + j) ||
                 !set.add(val + "box" + i/3 + "-" + j/3) )return false;
               }
           }
       }
       return true;
  }
}
