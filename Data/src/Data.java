public class Data {
    private int dia;
    private int mes;
    private int ano;

    private int diasMes;

    public int quantidadeDias(int mes){

        switch(mes){
            case 1,3,5,7,8,10,12 -> diasMes = 31;
            case 2-> {
                if(this.isBissexto()){
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
            }
            default -> diasMes = 30;
        }

        return diasMes;

    }

    public Data(int dia, int mes, int ano) {

        int diasMes = quantidadeDias(mes);

        if(ano <= 9999 && ano >= 1){
            this.ano = ano;
        }

        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }

        if(dia <= diasMes){
            this.dia = dia;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public String getMesExtenso(){

        String mesExtenso;

        switch(this.mes){
            case 1 -> mesExtenso ="Janeiro";
            case 2-> mesExtenso ="Fevereiro";
            case 3 -> mesExtenso ="Março";
            case 4 -> mesExtenso ="Abril";
            case 5 -> mesExtenso ="Maio";
            case 6 -> mesExtenso ="Junho";
            case 7 -> mesExtenso ="Julho";
            case 8 -> mesExtenso ="Agosto";
            case 9 -> mesExtenso ="Setembro";
            case 10 -> mesExtenso ="Outubro";
            case 11 -> mesExtenso ="Novembro";
            case 12 -> mesExtenso ="Dezembro";
            default -> mesExtenso = "Definido incorretamente";
        }

        return mesExtenso;

    }

    public boolean isBissexto(){
        return (this.ano % 4 == 0 && this.ano % 100 == 0) || this.ano % 400 == 0;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

//    public int compara(Data d){
//        if(this.dia == d.dia && this.mes == d.mes && this.ano == d.ano ){
//            return 0;
//        }else if(this.ano >= d.ano ){
//            if(this.mes >= d.mes){
//                if(this.dia >= d.dia){
//                    return 1;
//                }return -1;
//            }else{
//                return -1;
//            }
//        }return -1 ;
//    }

    public int compara(Data data) {
        // Obtém a data corrente

        // Compara as datas
        if(this.dia == data.dia && this.mes == data.mes && this.ano == data.ano ){
            return 0;
        }else if(this.ano > data.ano ){
            return 1;
        }else if(this.ano >= data.ano && this.mes >data.mes){
            return 1;
        }else if(this.ano >= data.ano ){

            if(this.mes >= data.mes){
                if(this.dia >= data.dia){
                    return 1;
                }return -1;
            }else{
                return -1;
            }
        }else{
            return -1 ;
        }

    }



    public Data clonar(){
        return new Data(this.dia,this.mes,this.ano);
    }

    public void imprimeData() {
        System.out.printf("%02d/%02d/%04d",this.dia,this.mes,this.ano);
    }
}
