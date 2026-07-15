class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        if(n == 1){
            return 1;
        }
        int odd = 1;
        int even = 2;
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i<n; i++){
            sumOdd += odd;
            sumEven += even;
            odd += 2;
            even += 2;
        }
        return gcd(sumOdd, sumEven);
    }
}