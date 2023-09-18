public class Equipamento {

    // Atributos
    private boolean ligado;

    public Equipamento(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    // Irei sobrescrever esse modo em EquipamentoSonoro, para que ele "zere" os atributos do objeto (i.g. som)
    public void desligar(){
        this.ligado = false;
    }

    @Override
    public String toString() {

        String estado = (this.ligado == true ? "ligado" : "desligado");

        return "O equipamento está " + estado;
    }

    public boolean isLigado() {
        return ligado;
    }
}
