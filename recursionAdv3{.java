class recursionAdv3{
   public static int printtiles(int n, int m){

      if(n==m){
         return 2;
      }
      if(n<m){
         return 1;
      
      }
      //vertically
      int verplaxement = printtiles(n-m, m);

      //horizontally
      int horiplacement = printtiles(n-1, m);

      return verplaxement + horiplacement;


   }
   public static void main(String[] args) {
      int n=4 ,  m=2;
      System.out.println(printtiles(n, m));

   }
}