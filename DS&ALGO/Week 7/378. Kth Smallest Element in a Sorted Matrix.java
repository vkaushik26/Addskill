class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int[] array : matrix) 
            list.addAll(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
        
        Collections.sort(list);
        
        return list.get(k-1);
    }
}
