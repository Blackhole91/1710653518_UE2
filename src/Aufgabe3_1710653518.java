import javax.swing.*;

public class Aufgabe3_1710653518 {
    public static void main (String[]args){

        // Zeichenkette in double umwandeln
        double alter;
        String eingabe;

        eingabe = JOptionPane.showInputDialog("geben Sie ihr Alter ein");
        alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null,"Sie sind "+alter+" Jahre alt");

        // String in integer umwnadeln
        int geburtsjahr;
        String eingabe2;

        eingabe2 = JOptionPane.showInputDialog("geben Sie ihr Geburtsjahr ein");
        geburtsjahr =Integer.parseInt(eingabe2);
        JOptionPane.showMessageDialog(null,"Sie sind "+geburtsjahr+" geboren");

        //String in boolean umwandeln
        boolean wahrheitsgehalt;
        String eingabe3;

        eingabe3 = JOptionPane.showInputDialog("true oder false");
        wahrheitsgehalt = Boolean.parseBoolean(eingabe3);
        JOptionPane.showMessageDialog(null,"der Warheitsgehalt ist "+wahrheitsgehalt);

        //String in long umwndeln
        long lZahl;
        String eingabe4;

        eingabe4 = JOptionPane.showInputDialog("geben Sie eine lange Zahl ein");
        lZahl = Long.parseLong(eingabe4);
        JOptionPane.showMessageDialog(null,"Die lange Zahl lautet "+lZahl);

        //String in byte umwandeln
        byte ganzKleineZahl;
        String eingabe5;

        eingabe5 = JOptionPane.showInputDialog("geben sie eine ganz kurze Zahl ein");
        ganzKleineZahl = Byte.parseByte(eingabe5);
        JOptionPane.showMessageDialog(null,"kurze Zahl lautet "+ganzKleineZahl);

        //String in short umwandeln
        short kleineZahl;
        String eingabe6;

        eingabe6 = JOptionPane.showInputDialog("geben sie eine kleine Zahl ein");
        kleineZahl = Short.parseShort(eingabe6);
        JOptionPane.showMessageDialog(null,"kleine Zahl ist "+kleineZahl);

        //String to float umwandeln
        float gleitkommazahl;
        String eingabe7;

        eingabe7 = JOptionPane.showInputDialog("geben sie eine Zahl ein");
        gleitkommazahl = Float.parseFloat(eingabe7);
        JOptionPane.showMessageDialog(null,"die zahl lautet "+gleitkommazahl);

        //String to char umwandeln
        char buchstabe;
        String eingabe8;

        eingabe8 = JOptionPane.showInputDialog("geben sie ein Zeichen ein");
        buchstabe = eingabe8.charAt(0);
        JOptionPane.showMessageDialog(null,"das Zeichen lautet "+String.valueOf(buchstabe));

        // bei falscher Eingabe wird eine Exeption im main thread geworfen
    }
}
