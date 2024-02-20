
import java.util.regex.*;
public class prax {
    public static boolean isValidPhone(String phone){
        String regex = "\\d{2} \\d{10}";
        return Pattern.matches(regex, phone);
    }

    public static void main(String[] args) {
        String phoneNumber = "91 9876543210"; // Example phone number
        if (isValidPhone(phoneNumber)) {
            System.out.println("Valid phone number!");
        } else {
            System.out.println("Invalid phone number!");
        }
    }
}
