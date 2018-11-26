import javax.swing.*;

public class Aufgabe5_1710653518 {


    public static void main(String[]args){

        forSchleife(2);
        forSchleife(3);

        whileSchleife(2);
        whileSchleife(3);

        nutzerSchleife();

        }


    //forSchleife mit Übergabeparameter
    public static void forSchleife(int a) {

        for (int i = 1; i < a+1; i++) {
            System.out.println("der for-Schleifenzähler ist " + (i));
        }
        System.out.println("");
    }

    //WhileSchleife mit Übergabeparameter
    public static void whileSchleife(int a) {

        int geradeZahl = 0;
        int count = 1;
        boolean erreicht = false;

        while (!erreicht) {
            count++;
            System.out.println("while-Schleifenzähler mit gerader Ausgabe "+(geradeZahl+=2));
            if (count > a) {

                erreicht = true;
            }
        }
        System.out.println("");
    }

    //Nutzerschleife mit for
    public static void nutzerSchleife(){

        int ersteEingabe = Integer.parseInt(JOptionPane.showInputDialog("wie oft soll die äußere Schleife laufen?"));
        int zeiteEingabe = Integer.parseInt(JOptionPane.showInputDialog("wie oft soll die innere Schleife laufen?"));

        for (int i=1; i<ersteEingabe+1; i++){

            System.out.println("");
            System.out.println("Äußere Schleife Durchlauf: "+i);

            if (zeiteEingabe==4||zeiteEingabe==5){
                for (int k=1; k<21; k++){
                    System.out.println("Das ist der "+k+". Durchlauf der inneren Schleife!");
                }
            }
            else {
                for (int j = 1; j < zeiteEingabe + 1; j++) {
                    System.out.println("Das ist der " + j + ". Durchlauf der inneren Schleife!");
                }
            }


        }
    }


}
