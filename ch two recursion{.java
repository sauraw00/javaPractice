class recursion {

    public static void towerOfHanoi(int n , String src , String helper , String destin){
if(n == 1){
    System.out.println("transfer disk  " +  n + "from " +  src  + " to " + destin);
    return;
}
        towerOfHanoi( n-1, src, destin, helper);
        System.out.println("transfer disk  " +  n + "from " +  src  + " to " + destin);
        towerOfHanoi(n-1, helper, src, destin);
    }
    public static void main(String[] args) {
        int n =3;
        towerOfHanoi(n,"s" , "H" , "D");
    }
}