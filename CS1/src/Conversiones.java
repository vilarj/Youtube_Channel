import java.util.Scanner;

/**
 * Sometimes measurements are given in terms of yards, feet, and inches.
 * You are to write a Java program to convert these three numbers into a total
 * number of inches. When running, it will prompt the user to enter the number
 * of yards, number of feet, and number of inches from the keyboard.
 * Assume all numbers are whole (integers). Your program must calculate
 * the total number of inches by converting each of the three inputs into
 * inches and summing them all together. Finally, print out the total length
 * in inches. Recall that 1 yard = 3 feet, and 1 foot = 12 inches.
 */

public class Conversiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yarda, pie, pulgada;
        String quiereConvertir, convertir;

        System.out.print("Digite el sistema de medida que quiere convertir: (yardas, pies, pulgadas)");
        quiereConvertir = input.next();

        quiereConvertir.toLowerCase();
        
        if (quiereConvertir.equals("yardas")) {

        }

        else if (quiereConvertir.equals("pies")) {

        }

        else {

        }
        System.out.print("Digite la cantidad que quiere convertir: ");

        System.out.print("Digite a que sistema de medida lo quiere convertir: (yardas, pies, pulgadas)");
        convertir = input.next();

        convertir.toLowerCase();

        if (quiereConvertir.equals("yardas") && convertir.equals("pies")) {

        }

        else if (quiereConvertir.equals("yardas") && convertir.equals("pulgadas")) {

        }

        else if (quiereConvertir.equals("pies") && convertir.equals("yardas")) {

        }

        else if (quiereConvertir.equals("pies") && convertir.equals("pulgadas")) {

        }

        else if (quiereConvertir.equals("pulgadas") && convertir.equals("yardas")) {

        }

        else if (quiereConvertir.equals("pulgadas") && convertir.equals("pies")) {

        }

        input.close();
    }
}
