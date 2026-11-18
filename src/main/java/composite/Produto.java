package main.java.composite;

public class Produto extends ItemMercado {

    private float preco;

    public Produto(String descricao, float preco) {
        super(descricao);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getConteudo() {
        return "Produto: " + this.getDescricao() + " - preço: " + this.preco + "\n";
    }

    public float getPrecoTotal() {
        return this.preco;
    }

}
