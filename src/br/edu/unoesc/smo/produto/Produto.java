package br.edu.unoesc.smo.produto;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class Produto {
	
    private String nome;
    private Double valorItem;
    private TipoProduto tipoProduto;
    
    public Produto(String nome, Double valorItem, TipoProduto tipoProduto) {
        this.nome = nome;
        this.valorItem = valorItem;
        this.tipoProduto = tipoProduto;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValorItem() {
		return valorItem;
	}
	public void setValorItem(Double valorItem) {
		this.valorItem = valorItem;
	}
	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
    
}
