class Stringss {
    public static void main(String[] args) {
        
        String name1 = "tony";
        String name2 = "tony";
        // compare

        //1 s1>s2  : +ve value
        //2 s1=s2  : 0
        //3 s1<s2  : -ve
if(name1.compareTo(name2) ==0) {
    System.out.println("Strings are equal");
}else{
    System.out.println("Strings are not equal");
}
    }
}