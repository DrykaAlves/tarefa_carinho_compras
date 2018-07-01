package br.edu.unoesc.smo.carinho;

import br.edu.unoesc.smo.produto.Produto;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class ItemCarrinho {

    private Produto produto;
    private final Double valor;
    private Integer quantidade;
    
    public ItemCarrinho(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.valor = (quantidade * (produto.getValorItem() - produto.getTipoProduto().calcular(produto)));
        this.quantidade = quantidade;
    }
 
    public Double getValor() {
        return valor;
    }
    
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Item: " + produto.getNome() + "		PreçoUn. R$: " + produto.getValorItem() + "		Quantidade: " + this.getQuantidade() + "		Total R$: " + this.getValor();
    }
}
