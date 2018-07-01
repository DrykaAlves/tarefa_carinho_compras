package br.edu.unoesc.smo.carinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.unoesc.smo.ordenacao.OrdenaCresc;
import br.edu.unoesc.smo.ordenacao.OrdenaDesc;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class CarrinhoDeCompras {

	    private List<ItemCarrinho> itensCarrinho;

	    public void adicionarItem(ItemCarrinho item) {
	        if (itensCarrinho == null) {
	            itensCarrinho = new ArrayList<>();
	        }
	        itensCarrinho.add(item);
	    }

	    public void removerItem(ItemCarrinho item) {
	        if (itensCarrinho != null) {
	            itensCarrinho.remove(item);
	        }
	    }

	    public Double valorTotal() {
	    	
	        Double vlrTotalCarrinho = 0.0;
	        vlrTotalCarrinho = itensCarrinho.stream().map((itemCarrinho) -> itemCarrinho.getValor()).reduce(vlrTotalCarrinho, (accumulator, _item) -> accumulator + _item);
	        
	        return vlrTotalCarrinho;
	    }
	    
	    public void ordenaMaiorPreco() {
	        Collections.sort(itensCarrinho, new OrdenaDesc());
	        
	        itensCarrinho.forEach((itemCarrinho) -> {
	        	
	            System.out.println(itemCarrinho.toString());
	        });
	    }	    

	    public void ordenaMenorPreco() {
	        Collections.sort(itensCarrinho, new OrdenaCresc());
	        
	        itensCarrinho.forEach((itemCarrinho) -> {
	        	
	            System.out.println(itemCarrinho.toString());
	        });
	    }
	    
	    public void listaProdutosCarrinho() {
	        itensCarrinho.forEach((itemCarrinho) -> {
	        	
	            System.out.println(itemCarrinho.toString());
	        });
	    }
	    
}
