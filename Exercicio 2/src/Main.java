public class Main {

    public static void main(String[] args) {

        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(true, true, 0);

        equipamentoSonoro.aumentarVolume();
        // Som deve estar em 1 ✅
        System.out.println(equipamentoSonoro);

        for (int i = 1; i < 20; i++) {
            equipamentoSonoro.aumentarVolume();
        }
        // O som não pode ter passado de 10 ✅
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.desligar();
        // O equipamento deve estar desligado ✅
        // e os atributos devem estar false e volume 0
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.ligar();

        equipamentoSonoro.diminuirVolume();
        // Como o objeto inicia com volume 5, desta forma ele deve estar com 4 de volume. ✅
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.stereo();
        // Auto falante stereo ✅
        System.out.println(equipamentoSonoro);

        equipamentoSonoro.mono();
        // Auto falante mono ✅
        System.out.println(equipamentoSonoro);

        for (int i = 1; i < 20; i++) {
            equipamentoSonoro.diminuirVolume();
        }
        // O volume não deve estar menor que 0 ✅
        System.out.println(equipamentoSonoro);

    }
}
