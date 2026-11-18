package main.java.composite;

public class Mercado {

    private ItemMercado catalogo;

    public void setCatalogo(ItemMercado catalogo) {
        this.catalogo = catalogo;
    }

    public String getCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Mercado sem catálogo");
        }
        return this.catalogo.getConteudo();
    }

    public float getPrecoTotalCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Mercado sem catálogo");
        }
        return this.catalogo.getPrecoTotal();
    }
}
