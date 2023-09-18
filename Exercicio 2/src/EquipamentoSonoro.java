public class EquipamentoSonoro extends Equipamento{

    /**
     *  O projeto possui os critérios propostos e ainda mais:
     *
     *  - Nenhuma ação é realizada quando o equipamento está desligado
     *  - Ao desligar o equipamento os atributos do objeto serão zerados/tornados falsos
     */

    private boolean stereo;
    private int volume;

    public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
        super(ligado);
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void ligar() {
        super.ligar();
        this.volume = 5;
    }

    // Sobrescrevendo o método desligar, para que os atributos sejam desligados e zerados!
    @Override
    public void desligar() {
        super.desligar();
        this.volume = 0;
        this.stereo = false;
    }

    public void mono(){
        if(this.isLigado()){
            this.stereo = false;
        }
    }

    public void stereo(){
        if(this.isLigado()){
            this.stereo = true;
        }
    }

    public void aumentarVolume(){

        if(this.isLigado()){
            if(this.volume < 10) {
                this.volume++;
            }
        }
    }

    public void diminuirVolume(){

        if(this.isLigado()){
            if(this.volume > 0) {
                this.volume--;
            }
        }
    }

    @Override
    public String toString() {

        String autoFalante = (stereo == false ? "mono" : "stereo");

        return super.toString() + """
                
                O volume está em %d e o auto falante é %s
                """.formatted(this.volume, autoFalante);
    }
}
