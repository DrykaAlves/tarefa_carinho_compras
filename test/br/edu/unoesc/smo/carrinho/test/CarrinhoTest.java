package br.edu.unoesc.smo.carrinho.test;

import br.edu.unoesc.smo.carinho.CarrinhoDeCompras;
import br.edu.unoesc.smo.carinho.ItemCarrinho;
import br.edu.unoesc.smo.produto.Produto;
import br.edu.unoesc.smo.produto.TipoProduto;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
* Tarefa final - Carinho de Compras
* Classe de Testes = Valor unitario do produto
* @author Adriana Alves
*/

public class CarrinhoTest {

	// Incluir produto e verificar se retorna o valor unitario cadastrado no produto
    @Test
    public void valorDeCadaProdutos() {
    	
        Produto produto1 = new Produto("Arroz", 3.5, TipoProduto.ALIMENTO);
        Produto produto2 = new Produto("Bola", 8.0, TipoProduto.BRINQUEDO);
        Produto produto3 = new Produto("Refrigerante", 5.5, TipoProduto.BEBIDA);
        Produto produto4 = new Produto("Vestido", 60.0, TipoProduto.VESTUARIO);
        
        assertEquals(Double.valueOf(3.5), produto1.getValorItem());
        assertEquals(Double.valueOf(8.0), produto2.getValorItem());
        assertEquals(Double.valueOf(5.5), produto3.getValorItem());
        assertEquals(Double.valueOf(60.0), produto4.getValorItem());
    }
    
	// Incluir/Excluir produto do carrinho de compras
    @Test
    public void excluirProdutoCarrinho() {
    	
        Produto produto1 = new Produto("Arroz", 3.5, TipoProduto.ALIMENTO);
        Produto produto2 = new Produto("Bola", 8.0, TipoProduto.BRINQUEDO);
        Produto produto3 = new Produto("Refrigerante", 5.5, TipoProduto.BEBIDA);
        Produto produto4 = new Produto("Vestido", 60.0, TipoProduto.VESTUARIO);
        Produto produto5 = new Produto("Calça", 60.0, TipoProduto.VESTUARIO);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        ItemCarrinho prod1 = new ItemCarrinho(produto1, 3);
        carrinho.adicionarItem(prod1);
        
        ItemCarrinho prod2 = new ItemCarrinho(produto2, 1);
        carrinho.adicionarItem(prod2);
        
        ItemCarrinho prod3 = new ItemCarrinho(produto3, 2);
        carrinho.adicionarItem(prod3);
     
        ItemCarrinho prod4 = new ItemCarrinho(produto4, 2);
        carrinho.adicionarItem(prod4);
        
        carrinho.removerItem(prod3);
        
        ItemCarrinho prod5 = new ItemCarrinho(produto5, 3);
        carrinho.adicionarItem(prod5);
        
        System.out.println("**************** ORDENACAO NA ORDEM DE COMPRA****************");
        carrinho.listaProdutosCarrinho();
    }
	
}
