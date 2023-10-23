import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Data data = new Data(01,2,2000);

        // imprimindo por extenso
        System.out.println(data.getMesExtenso());

        // imprimindo data
        data.imprimeData();

        // clonando data
        Data c = data.clonar();
        System.out.println();

        // imprimindo clone
        c.imprimeData();

        // compara data 01
        System.out.println();
        System.out.println(data.compara(c));

        // compara data 02
        Data data1 = new Data(02,01,2000);
        System.out.println(data.compara(data1));

        // compara data 03
        Data data2 = new Data(31,04,2000);
        System.out.println(data.compara(data2));



    }

}
