import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vyber operaciu (+, -, *, /): ");
        String operacia = scanner.next();

        System.out.print("Zadaj prve cislo: ");
        double a = scanner.nextDouble();
        
        System.out.print("Zadaj druhe cislo: ");
        double b = scanner.nextDouble();

        if (operacia.equals("+")) System.out.println("Vysledok: " + (int)(a + b));
        else if (operacia.equals("-")) System.out.println("Vysledok: " + (int)(a - b));
        else if (operacia.equals("*")) System.out.println("Vysledok: " + (int)(a * b));
        else if (operacia.equals("/")) {
            if (b != 0) System.out.println("Vysledok: " + (float)(a / b));
            else System.out.println("Nulou sa neda delit!");
        } else System.out.println("Neplatna operacia!");

        scanner.close();
    }
}