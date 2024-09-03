package Beecrowd.iniciante.Numeros_Impares;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1067 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();

        for (int i = 1; i <= valorX; i++){
            if (i % 2 != 0 &&i > 1 && i < 1000) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }

}
