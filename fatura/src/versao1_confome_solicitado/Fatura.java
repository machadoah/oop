package versao1_confome_solicitado;

public class Fatura {
    private String numeroPeca;
    private String descricaoPeca;
    private Integer quantidade;
    private Integer precoItem;

    public Fatura(String numeroPeca, String descricaoPeca, int quantidade, int precoItem) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public int obterValorFatura(){

        if(precoItem <= 0){
            precoItem = 0;
        }

        int fatura = this.precoItem * this.quantidade;

        return (fatura > 0 ? fatura : 0);
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(int precoItem) {
        this.precoItem = precoItem;
    }
}
