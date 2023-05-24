import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a, b, c, R1, R2, delta;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        a = s.nextDouble();
        System.out.print("");
        b = s.nextDouble();
        System.out.print("");
        c = s.nextDouble();
        delta = ((b * b ) - (4 * a * c));
        if(delta <= 0 || a <= 0 || b <= 0 || c <= 0 ) {
            System.out.println("Impossivel calcular");
        }
        else{
            R1 = (-b +Math.sqrt(delta)) / (2 * a);
            R2 = (-b -Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + String.format("%.5f" ,R1));
            System.out.println("R2 = " + String.format("%.5f" ,R2));
            }
        s.close();
        }
    }
