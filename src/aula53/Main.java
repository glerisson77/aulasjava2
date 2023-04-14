package aula53;

public class Main {
    public static void main(String[] args) {
//        usandoConstantes();
//        usandoEnum();

//        DiaSemana dia = DiaSemana.SEGUNDA;

//        System.out.println(dia.toString() + " - " + dia.getValor());
        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }

    private static void usandoConstantes(){
        int segunda = DiaSemanaConstantes.SEGUNDA_FEIRA;
        int terca = DiaSemanaConstantes.TERCA_FEIRA;
        int quarta = DiaSemanaConstantes.QUARTA_FEIRA;
        int quinta = DiaSemanaConstantes.QUINTA_FEIRA;
        int sexta = DiaSemanaConstantes.SEXTA_FEIRA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("teste");
//        imprimeDiaSemana(segunda);
//        imprimeDiaSemana(terca);
//        imprimeDiaSemana(quarta);
//        imprimeDiaSemana(quinta);
//        imprimeDiaSemana(sexta);
//        imprimeDiaSemana(sabado);
//        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum(){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
}