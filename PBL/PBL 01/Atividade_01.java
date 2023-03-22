import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Crie um programa com uma função que retorne uma lista preenchida com valores inteiros quaisquer.
//        A função deve receber como parâmetro o tamanho da lista. O tamanho deve ser informado pelo usuário via input.
//        A partir dos números da lista, imprima:
//
//        Números múltiplos de 3
//        Números pares
//        Números ímpares
public class Atividade_01 {
    public static void gerarLista(int num) {
        ArrayList <Integer> lista = new ArrayList<>();
        Random gerador = new Random();
        for (int i = 0; i <= num; i ++) {
            int valor = gerador.nextInt(100);
            lista.add(valor);
        }
        for (int numero : lista) {
            if (numero % 3 == 0) {
                System.out.println(numero + " O número é multipo de 3");
            }
            else if (numero % 2 == 0) {
                System.out.println(numero + " O número é par");
            }
            else {
                System.out.println(numero + " O número é impar");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro que corresponda ao tamanho da lista");
        int num = scanner.nextInt();
        gerarLista(num);
        }

}
