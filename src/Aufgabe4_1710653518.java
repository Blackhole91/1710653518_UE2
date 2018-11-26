public class Aufgabe4_1710653518 {

    public static void main (String[]args){

        System.out.println("For-Schleife");

        for (int i=1; i<11; i++){
            System.out.println("der Schleifenzähler ist: "+(i));
        }


        System.out.println("");//Zeilenumbruch


        System.out.println("While-Schleife");

        boolean zehnErreicht = false;
        int zähler = 1;

        while (!zehnErreicht){
            System.out.println("der Schleifenzähler ist "+(zähler++));
            if (zähler == 11){
                zehnErreicht = true;
            }
        }
        System.out.println("");//Zeilenumbruch


        System.out.println("Do-While-Schleife");
        int counter = 1;

        do {
            System.out.println("der Schleifenzähler ist "+(counter++));
        }while (counter<11);


    }

}
