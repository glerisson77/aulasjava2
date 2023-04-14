package aula18;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Entre com um número");
//        int num = scanner.nextInt();
//
//        System.out.println("Entre com um limite");
//        int max = scanner.nextInt();
//
//        for (int i = num; i < max; i++) {
//            System.out.println(i);
//            if (i % 7 == 0){
//                System.out.println("O valor de i é: " + i);
//                break;
//            }
//        }

        for (int i = 0; i < 100; i++) {
            if (!(i % 10 == 0)){
                continue;
            }
            System.out.println(i);

        }
    }
}
