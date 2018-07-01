package br.edu.unoesc.smo.carrinho.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.edu.unoesc.smo.carinho.CarrinhoDeCompras;
import br.edu.unoesc.smo.carinho.ItemCarrinho;
import br.edu.unoesc.smo.produto.Produto;
import br.edu.unoesc.smo.produto.TipoProduto;

/**
* Tarefa final - Carinho de Compras
* Classe de Testes = Verificar desconto dos itens, conforme tipo do produto 
* @author Adriana Alves
*/

public class DescontoItemTest {

	
	   @Test
	    public void descontoTipoProduto() {
	   
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
	        
		   
	        assertEquals(Double.valueOf(10.5), prod1.getValor());
	        assertEquals(Double.valueOf(8.0), prod2.getValor());
	        assertEquals(Double.valueOf(10.45), prod3.getValor());
	        assertEquals(Double.valueOf(90.0), prod4.getValor());
	    }
	    
}
