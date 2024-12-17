class recursionAdv{
    public static int countpaths(int i , int j ,int n, int m ){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //downwards
        int downpath = countpaths(i+1 , j , n ,m);
         
        //rightmove
        int rightmove = countpaths(i, j+1 , n , m);

        return downpath + rightmove;
    }


    public static void main(String[] args) {
        int n=3, m=3;
       int toatalpaths = countpaths(0, 0, n, m);
        System.out.println(toatalpaths);

    }
}