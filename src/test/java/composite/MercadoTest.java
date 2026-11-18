package test.java.composite;

import main.java.composite.Categoria;
import main.java.composite.Mercado;
import main.java.composite.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoTest {

    private Mercado montarMercado() {
        Categoria padaria = new Categoria("Padaria");

        Categoria hortifruti = new Categoria("Hortifruti");
        Produto banana = new Produto("Banana", 5.0f);
        Produto maca = new Produto("Maçã", 3.5f);
        hortifruti.addItem(banana);
        hortifruti.addItem(maca);

        Categoria bebidas = new Categoria("Bebidas");
        Produto agua = new Produto("Água", 2.0f);
        Produto suco = new Produto("Suco", 7.5f);
        bebidas.addItem(agua);
        bebidas.addItem(suco);

        Categoria catalogo = new Categoria("Mercado Central");
        catalogo.addItem(padaria);
        catalogo.addItem(hortifruti);
        catalogo.addItem(bebidas);

        Mercado mercado = new Mercado();
        mercado.setCatalogo(catalogo);
        return mercado;
    }

    @Test
    void deveRetornarCatalogoMercado() {
        Mercado mercado = montarMercado();

        assertEquals("Categoria: Mercado Central\n" +
                "Categoria: Padaria\n" +
                "Categoria: Hortifruti\n" +
                "Produto: Banana - preço: 5.0\n" +
                "Produto: Maçã - preço: 3.5\n" +
                "Categoria: Bebidas\n" +
                "Produto: Água - preço: 2.0\n" +
                "Produto: Suco - preço: 7.5\n", mercado.getCatalogo());
    }

    @Test
    void deveRetornarExcecaoMercadoSemCatalogo() {
        try {
            Mercado mercado = new Mercado();
            mercado.getCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Mercado sem catálogo", e.getMessage());
        }
    }

    @Test
    void deveRetornarPrecoTotalCatalogoMercado() {
        Mercado mercado = montarMercado();

        assertEquals(18.0f, mercado.getPrecoTotalCatalogo(), 0.01f);
    }

    @Test
    void deveRetornarExcecaoPrecoTotalMercadoSemCatalogo() {
        try {
            Mercado mercado = new Mercado();
            mercado.getPrecoTotalCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Mercado sem catálogo", e.getMessage());
        }
    }
}

