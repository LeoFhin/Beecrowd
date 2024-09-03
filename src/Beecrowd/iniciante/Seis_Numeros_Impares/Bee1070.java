package Beecrowd.iniciante.Seis_Numeros_Impares;
import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1070 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int valoX = sc.nextInt();
        int cont = 0;

        while (cont < 6){
            if (valoX % 2 == 1){
                System.out.println(valoX);
                cont++;
            }
            valoX++;
        }
    }

}
