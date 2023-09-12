import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FaturaTest {

    Fatura fatura;

    @BeforeEach
    void criarFatura(){
        fatura = new Fatura("01","Chave de fenda",6,99);
    }


    @Test
    void obterValorFatura() {
        assertEquals((99*6),fatura.obterValorFatura());
    }

    @Test
    void getNumeroPeca() {
        assertEquals("01", fatura.getNumeroPeca());
    }

    @Test
    void setNumeroPeca() {
        fatura.setNumeroPeca("02");
        assertEquals("02",fatura.getNumeroPeca());
    }

    @Test
    void getDescricaoPeca() {
        assertEquals("Chave de fenda",fatura.getDescricaoPeca());
    }

    @Test
    void setDescricaoPeca() {
        fatura.setDescricaoPeca("Chave Philips");
        assertEquals("Chave Philips",fatura.getDescricaoPeca());
    }

    @Test
    void getQuantidade() {
        assertEquals(6, fatura.getQuantidade());
    }

    @Test
    void setQuantidade() {
        fatura.setQuantidade(9);
        assertEquals(9,fatura.getQuantidade());
    }

    @Test
    void getPrecoItem() {
        assertEquals(99,fatura.getPrecoItem());
    }

    @Test
    void setPrecoItem() {
        fatura.setPrecoItem(79);
        assertEquals(79,fatura.getPrecoItem());
    }
}