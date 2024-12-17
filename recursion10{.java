class recursion10{
    public static void subsequnces(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        //to be
        subsequnces(str, idx+1, newString+currChar);
        //not to be
        subsequnces(str, idx+1, newString);

    }


    public static void main(String[] args) {
        String str = "abc";
        subsequnces(str, 0, "");
        
    }
}