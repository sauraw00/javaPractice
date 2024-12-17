import java.util.Scanner;

class recursion2{
   
    public static int factorial(int n){
        if (n==1 ||n==0){
            return 1;
        }
        int fmn1 = factorial(n-1);
        int fn = n  *fmn1;
        return fn;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }
}