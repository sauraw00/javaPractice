class baba {
    public static int printfectorial(int n){
        if(n==0 || n==1){
            return 1;
           
        }
        int f_nm1 = (n-1);
        int f_n =n *f_nm1;
         return(f_n);
     
    }
    public static void main(String[] args) {
 int n = 5;
 
int f = printfectorial(n);
System.out.println(f);
    }
}