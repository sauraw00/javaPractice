import java.util.*;

class Strings{
    public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();

    // System.out.println("your name is :"+name);

//    concatenation
String firstName = "tony";
String lastName = "stark";
String fullName = firstName + " " + lastName;
System.out.println(fullName.length());

// charAt
for(int i =0; i<fullName.length();i++) {
    System.out.println(fullName.charAt(i));
}
    }
}