package aula19;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random gerador = new Random();

//        double tempDia001 = 31.3;
//        double tempDia002 = 33.8;
//        double tempDia003 = 32.7;
//        double tempDia004 = 35.3;

        double[] temps = new double[365];
        temps[0] = 31.3;
        temps[1] = 30.1;
        temps[2] = 33.7;
        temps[3] = 34.6;
        temps[4] = 32.3;
        temps[5] = 31.7;


//        for (int i = 0; i < temps.length; i++) {
//            System.out.println("Temperatura dia: " + (i+1) + " " + temps[i]);
//        }

        for (double temp: temps) {
            temp = gerador.nextDouble(30.0, 40.0);
            System.out.println(temp);
        }
    }
}
