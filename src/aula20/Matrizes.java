package aula20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Random random = new Random();

        int randInt = random.nextInt(0 ,10);

//        int[][] notasAlunos = new int[4][10];
//
//        notasAlunos[0][0] = 10;
//        notasAlunos[0][1] = 7;
//        notasAlunos[0][2] = 8;
//        notasAlunos[0][3] = 6;
//
//        notasAlunos[1][0] = 10;
//        notasAlunos[1][1] = 7;
//        notasAlunos[1][2] = 8;
//        notasAlunos[1][3] = 6;


//        pt3

//        int [][][] matriztridimensional = new int[3][3][3];
//
//        for (int i=0; i < matriztridimensional.length; i++) {
//            for (int j = 0; j < matriztridimensional[i].length; j++) {
//                for (int k = 0; k < matriztridimensional[i][j].length; k++) {
//                    matriztridimensional[i][j][k] = i+j+k;
//                }
//            }
//        }
//
//
//        int soma = 0;
//        int somaP = 0;
//        int somaImp = 0;
//        for (int i=0; i < matriztridimensional.length; i++){
//            for (int j = 0; j < matriztridimensional[i].length; j++) {
//
//                for (int k = 0; k < matriztridimensional[i][j].length; k++) {
//                    soma += matriztridimensional[i][j][k];
//
//                    if (matriztridimensional[i][j][k] % 2 ==0){
//                        somaP += matriztridimensional[i][j][k];
//                    }else {
//                        somaImp += matriztridimensional[i][j][k];
//                    }
//                }
//            }
//        }
//        System.out.println("ST " + soma + " Imp " + somaImp + " Par " + somaP);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de entrevistados: ");
        int numEntrevistados = scanner.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {

            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = scanner.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {

                System.out.println("Digite o nome do filho " + (j+1));
                nomesFilhos[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i +1) + "tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
