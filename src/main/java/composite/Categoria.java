package main.java.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemMercado {

    private List<ItemMercado> itens;

    public Categoria(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemMercado>();
    }

    public void addItem(ItemMercado item) {
        this.itens.add(item);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (ItemMercado item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }

    public float getPrecoTotal() {
        float total = 0.0f;
        for (ItemMercado item : itens) {
            total += item.getPrecoTotal();
        }
        return total;
    }
}

