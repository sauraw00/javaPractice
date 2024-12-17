class recursion{
    public static void moveAllX(String str, int idx , int count, String newString){
        if( idx==str.length()){
            newString += 'x';
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);

        }else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }

    }
    
    public static void main(String[] args) {
        String str = "abxcxxd";
        moveAllX(str, 0, 0, "");
    
        
    }
}