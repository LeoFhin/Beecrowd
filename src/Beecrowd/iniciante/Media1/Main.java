package Beecrowd.iniciante.Media1;
/** Desafio 1005 **/

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double pesoA = 3.5;
        double pesoB = 7.5;

        double somaPeso = pesoA + pesoB;

        System.out.println("Dígite a primera nota: ");
        double notaA = sc.nextDouble();

        System.out.println("Dígite a segunda nota: ");
        double notaB = sc.nextDouble();

        double media = ((notaA * pesoA) + (notaB * pesoB)) / somaPeso;

        System.out.format("MEDIA = %.5f", media);

    }

}
