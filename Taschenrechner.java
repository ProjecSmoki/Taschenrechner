import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        
        System.out.println("Taschenrechner Startet");
        Scanner scan = new Scanner(System.in);
        boolean weiter = true;

        while(weiter) {
            System.out.println("Addieren (1) , Subtrarieren (2) , Multiplikation (3) ,Dividieren (4) ,Programm beenden (5)");

            int value = scan.nextInt();

            if(value != 5) {
                System.out.println("Tippe die erste Zahl ein; ");
                double zahl1 = scan.nextDouble();
                System.out.println("Tippe die zweite Zahl ein: ");
                double zahl2 = scan.nextDouble();
            
            if (value ==1) 
                plus(zahl1, zahl2);
            
            if (value ==2)     
                minus(zahl1, zahl2);
            
            if (value ==3)   
                mal(zahl1, zahl2);
            
            if (value ==4)   
                durch(zahl1, zahl2);
            }
            else {
                scan.close();
                weiter = false;
                System.out.println("Programm Beendet"); 
                break;
            } 
    }
    }
//______________________________Methode_________________________________

    public static void plus(double zahl1, double zahl2) { // Methode "+"
    double summe = zahl1 + zahl2;
    System.out.println("Aufgabe:" + zahl1 + " + " + zahl2 + " = " + summe); }

    public static void minus(double zahl1, double zahl2) { // Methode "-" 
    double summe = zahl1 - zahl2;
    System.out.println("Aufgabe:" +zahl1 + " - " + zahl2 + " = " + summe); }

    public static void mal(double zahl1, double zahl2) { // Methode "*"
    double summe = zahl1 * zahl2;
    System.out.println("Aufgabe:" +zahl1 + " * " + zahl2 + " = " + summe); }

    public static void durch(double zahl1, double zahl2) { // Methode "/"
    double summe = zahl1 / zahl2;
    System.out.println("Aufgabe:" +zahl1 + " / " + zahl2 + " = " + summe); }
    }
