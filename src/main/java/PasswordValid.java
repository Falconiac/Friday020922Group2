import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordValid {

    public static void main(String[] args) {
        System.out.println("Wähle dein Passwort:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(validFunction(input));

    }

    public static boolean passwordLength(String password){
        if(password.length()<8){
            return false;
        }
        return true;
    }
    public static boolean numberIncludet(String password){
        char[] arr = password.toCharArray();

        for (int i =0; i<arr.length; i++){
            if(Character.isDigit(arr[i]) ){
             return true;
            }
        }
        return false;
    }
    public static boolean upperIn(String password){
        char[] arr = password.toCharArray();
        for (int i = 0; i<arr.length;i++ ){
            if(Character.isUpperCase(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static boolean lowerIn(String password){
        char[] arr = password.toCharArray();
        for (int i = 0; i<arr.length;i++ ){
            if(Character.isLowerCase(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static boolean badWord(String password){

        String[] badWords = {"Passwort1", "Passwort2", "Passwort3", "Passwort4", "Passwort5", "Abc123456"};
        boolean contains = Arrays.stream(badWords).anyMatch(password::equals);
        if(contains){
            return false;
        }return true;
    }
    public static String validFunction(String input){

       if(passwordLength(input) == false){
            return "Dein Passwort ist NICHT lang genug !!!";
        }else if (numberIncludet(input) == false){
            return "Dein Passwort beinhaltet KEINE Zahl !!!";
        } else if (lowerIn(input)==false) {
           return"Dein Passwort beinhaltet KEINEN Kleinbuchstaben !!!";
       } else if (upperIn(input) == false){
            return"Dein Passwort beinhaltet KEINEN Grossbuchstaben !!!";
        } else if (badWord(input) == false){
            return "Dein Passwort steht auf der Liste der unsicheren Passwörter !!!";
        }
        return "Dein Passwort: " + input + " wurde angenommen !!! ";
    }

}




