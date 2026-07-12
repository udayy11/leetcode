class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int rank = 1;
        for(int num : copy){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }
        for(int i = 0; i<arr.length; i++){
            copy[i] = map.get(arr[i]);
        }
        return copy;
    }
}