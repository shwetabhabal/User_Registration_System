import java.util.Scanner;
import java.util.regex.*;
public class userRegistration {
    public static boolean validName(String name){
        String regex = "[A-Z][a-zA-z]{2,}";
        return Pattern.matches(regex,name);
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
    }
}
