class Solution {
    public int[][] merge(int[][] intervals) {
      if(intervals.length == 0){
            return new int[][]{};
        }
         Arrays.sort(intervals , new Comparator<int[]>(){
             @Override
             public int compare(int a1[] , int a2[]){
                 if(a1[0] > a2[0]) return 1;
                 if(a1[0] == a2[0]) return 0;
                 return -1;
             }
         });
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(end >= intervals[i][0]){
                end = Math.max(end , intervals[i][1]);
            }
            else{
                res.add(new int[]{start , end});
                start = intervals[i][0];
                end = intervals[i][1]; 
                }
        }
        res.add(new int[]{start , end});
        return res.toArray(new int[][]{});  
    }
}
