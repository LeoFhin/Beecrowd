package Beecrowd.iniciante.Teste_de_Seleção1;
import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1035 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();


        if ((valorB > valorC) && (valorD > valorA)
                && ((valorC + valorD) > (valorA + valorB))
                && (valorC > 0) && (valorD > 0)
                && (valorA % 2 == 0)) {
            System.out.printf("Valores aceitos");
        } else {
            System.out.printf("Valores nao aceitos");
        }
    }
}