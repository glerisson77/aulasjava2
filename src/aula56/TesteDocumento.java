package aula56;

public class TesteDocumento {

    public static void main(String[] args) {

//        for (TipoDocumento documento : TipoDocumento.values()){
//            System.out.println(documento + " - " + documento.geraNumeroTeste());
//        }

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(TipoDocumento.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf.toString());
    }

}
