package Loop;
import java.util.Scanner;
public class While2 {

    public static boolean hasEight(int numarVerificat) {
        int rest = numarVerificat % 10;
        return rest == 8;
    } 

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduceti numarul pentru verificare: ");
        int numar = keyboard.nextInt();
       While2.hasEight(numar);
        System.out.println("Afirmatia este: " + While2.hasEight(numar));
    
        keyboard.close();
    }
}