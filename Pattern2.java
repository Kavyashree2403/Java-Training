package Java_Assessment;
import java.util.*; 
public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter height: ");
        int h = s.nextInt();

        System.out.print("Enter width: ");
        int w = s.nextInt();

        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}