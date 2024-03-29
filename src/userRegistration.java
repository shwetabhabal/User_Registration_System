import java.util.Scanner;
import java.util.regex.*;
public class userRegistration {
    public static boolean validName(String name){
        String regex = "[A-Z][a-zA-z]{2,}";
        return Pattern.matches(regex,name);
    }
    public static boolean isvalidemail(String email){
        String regex = "[a-zA-z0-1_.]+@[a-z]+[.][a-z]{2,3}";
        return Pattern.matches(regex, email);
    }
    public static boolean isvalidphone(String phone){
        String regex = "[9][1][0-9]{10}";
        return Pattern.matches(regex, phone);
    }
    public static boolean isvalidpassword(String password){
        String regex = "[A-Z]+[0-9]+[!@#$%^&*()_+={};':|,.<>\\/?][a-zA-z0-9].{4,}";

        return Pattern.matches(regex, password);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = sc.next();
        if(validName(firstname)){
            System.out.println("valid first name");
        }
        else{
            System.out.println("invalid first name");
        }
        System.out.println("Enter last name: ");
        String lastname = sc.next();
        if(validName(lastname)){
            System.out.println("valid last name");
        }
        else{
            System.out.println("invalid last name");
        }
        System.out.println("Enter email: ");
        String email = sc.next();
        if(isvalidemail(email)){
            System.out.println("valid email");
        }
        else {
            System.out.println("invalid email");
        }

        System.out.println("Enter phone no.");
        String phone= sc.next();
        if(isvalidphone(phone)){
            System.out.println("valid phone");
        }
        else{
            System.out.println("invalid phone");
        }
        System.out.println("Enter password: ");
        String password = sc.next();
        if(isvalidpassword(password)){
            System.out.println("valid password");
        }
        else{
            System.out.println("invalid password");
        }
    }
}