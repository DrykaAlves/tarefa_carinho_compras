package br.edu.unoesc.smo.carrinho.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.edu.unoesc.smo.carinho.CarrinhoDeCompras;
import br.edu.unoesc.smo.carinho.ItemCarrinho;
import br.edu.unoesc.smo.produto.Produto;
import br.edu.unoesc.smo.produto.TipoProduto;

/**
* Tarefa final - Carinho de Compras
* Classe de Testes = Valor total do carrinho 
* @author Adriana Alves
*/

public class TotalCarinhoTest {

    @Test
    public void valorTotalCarrinho() {

        Produto produto1 = new Produto("Arroz", 3.5, TipoProduto.ALIMENTO);
        Produto produto2 = new Produto("Bola", 8.0, TipoProduto.BRINQUEDO);
        Produto produto3 = new Produto("Refrigerante", 5.5, TipoProduto.BEBIDA);
        Produto produto4 = new Produto("Vestido", 60.0, TipoProduto.VESTUARIO);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        ItemCarrinho prod1 = new ItemCarrinho(produto1, 3);
        carrinho.adicionarItem(prod1);
        
        ItemCarrinho prod2 = new ItemCarrinho(produto2, 1);
        carrinho.adicionarItem(prod2);
        
        ItemCarrinho prod3 = new ItemCarrinho(produto3, 2);
        carrinho.adicionarItem(prod3);
     
        ItemCarrinho prod4 = new ItemCarrinho(produto4, 2);
        carrinho.adicionarItem(prod4);

        assertEquals(Double.valueOf(118.95), carrinho.valorTotal());
    }
}
