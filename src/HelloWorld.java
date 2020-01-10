
public class HelloWorld {

    public static void main(String args[]) {
        int numero = 1;
        double numero_decimales = 2.2;
        char caracter = 'c';

        String lazo = "DORIME";
        String temp = lazo;

        int numeral = numerosumar(2, 3);
        int numeral2 = numerosumar(4,6);

        System.out.println(numeral);
        System.out.println(numeral2);

        System.out.println(recurTUMADRE(5));
        String Sans = "HEEEHEHEHEHEHEHEHEHHEHE";
        /*
        int contador = 0;
        while(contador < 5){
            System.out.println(Sans);
            contador++;
            System.out.println(contador);
        }


        for(int cont = 0; cont < 6; cont++){
            for (int cont2 = 0; cont2 < 2; cont2++){
                System.out.println("Esta es la ejecucion interior numero " + cont2);
            }
            System.out.println("Esta es la ejecucion exterior numero " + cont);
        }





        boolean boleano = true;

        if(numero >= 1){
            if(boleano == false) {
                boleano = true;
            } else if (lazo != "DORIME") {
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            }
            System.out.println(boleano);
        } else {
            System.out.println("AMENO AMENO");
        }
        */


    }

    public static int numerosumar(int i, int u){
        return i+u;
    }

    public static int recurTUMADRE(int i){
        int temp = i;
        if (i == 0){return 0;}
        i--;
        return temp + recurTUMADRE(i);
        //(primera llamada)5+(segunda llamada)4+(tercera)3+2+(ultima)1=15
    }
}

