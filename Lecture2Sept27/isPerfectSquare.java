package Lecture2Sept27;

public class isPerfectSquare {
    public static void main(String[] args) {
        int n=64;
        System.out.println(isPerfect(n));
    }
    public static boolean isPerfect(int num){
        if(num<1) return false;
        long lo=0;
        long hi=num;
        while (lo<=hi){
            long mid=(lo+(hi-lo)/2);
            long mul=mid*mid;
            if(mul==num) return true;
            else if(mul>num) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
