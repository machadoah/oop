package versao2_usando_classe_ferramenta;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    List<Ferramenta> pecas = new ArrayList<>();

    public int obterValorFatura(){

        int valorFatura = 0;

        for (Ferramenta f : pecas) {

            if(f.getPrecoItem() <= 0){
                f.setPrecoItem(0);
            }

            valorFatura = valorFatura +(f.getPrecoItem() * f.getQuantidade());
        }

        return (valorFatura > 0 ? valorFatura : 0);
    }




}
