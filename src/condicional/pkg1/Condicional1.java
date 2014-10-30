package condicional.pkg1;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {
        numeros condicional = new numeros();

        Scanner dato = new Scanner(System.in);
        System.out.println("Escribe tus numeros");
        condicional.setvalor(dato.nextFloat(), dato.nextFloat());
        condicional.getvalor1();
        condicional.getvalor2();

        condicional.condicion();

    }

}
