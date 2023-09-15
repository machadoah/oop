package versao2_usando_classe_ferramenta;

public class Ferramenta {
    private String numeroPeca;
    private String descricaoPeca;
    private Integer quantidade;
    private Integer precoItem;

    public Ferramenta(String numeroPeca, String descricaoPeca, Integer quantidade, Integer precoItem) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Integer precoItem) {
        this.precoItem = precoItem;
    }

    @Override
    public String toString() {
        return "Produto: " + this.descricaoPeca + " - Valor gasto: " + (this.getQuantidade() * this.getPrecoItem());
    }
}
