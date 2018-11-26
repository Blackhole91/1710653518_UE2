import javax.swing.*;

public class Aufgabe2_1710653518 {

    public static void main (String[]args){

        int versuche = 0;
        boolean gleich = false;
        int benutzerEingabe1 = Integer.parseInt(JOptionPane.showInputDialog("geben Sie eine beliebige Zahl ein"));
        int benutzerEingabe2 = Integer.parseInt(JOptionPane.showInputDialog("geben Sie eine weitere Zhal ein"));

        if (benutzerEingabe1==benutzerEingabe2){
            System.out.println("Gratulation! Die Zahlen sind gleich");

        }

            while (!gleich){
                if (benutzerEingabe1>benutzerEingabe2){
                    benutzerEingabe2++;
                    versuche++;
                }
                else if (benutzerEingabe1<benutzerEingabe2){
                    benutzerEingabe1++;
                    versuche++;
                }
                else if(benutzerEingabe1==benutzerEingabe2) {
                    gleich = true;
                    System.out.println("es wurden"+" "+versuche+" Versuche gebraucht");
                    System.out.println("gleich sind die Zahlen bei"+" "+benutzerEingabe1);
                }
            }

    }
}
