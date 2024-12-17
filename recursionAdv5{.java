class recursionAdv5{
    public static int callGeust(int n){

        if(n<=1){
            return 1;
        }
        //single invite
        int way1= callGeust(n-1);
        //invite in pair
        int way2 = (n-1)*callGeust(n-2);

        //total ways

        return way1 + way2;


    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callGeust(n));
    }
}