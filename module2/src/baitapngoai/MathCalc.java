package baitapngoai;

public class MathCalc implements Calculable {

    @Override
    public int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    @Override
    public boolean prime(int x) {
        if (x < 2) {
            System.out.println(x +" khong phai SNT");
        } else {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int reverse(int x) {
        int res=0;
        while(x != 0) {
            int digit = x % 10;
            res = res * 10 + digit;
            x /= 10;
        }
        return x;
    }

    @Override
    public int digits(int x) {
        int count=0;
        int res=0;
        while(x != 0) {
            int digit = x % 10;
            res = res * 10 + digit;
            x /= 10;
            count++;
        }
        return count;
    }
}
