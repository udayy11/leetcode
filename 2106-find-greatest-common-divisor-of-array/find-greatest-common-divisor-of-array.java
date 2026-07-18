class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min = 1000;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return gcd(min,max);
    }
}