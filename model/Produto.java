package model;


public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int qtd;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(final String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(final double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(final int qtd) {
        this.qtd = qtd;
    }
    @Override
    public String toString() {
        return "Produto:info {" + "id=" + id + ", nome=" + nome + ", preco R$=" + preco + '}';
    }
    
}
