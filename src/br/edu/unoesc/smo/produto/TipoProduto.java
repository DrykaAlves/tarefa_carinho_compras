package br.edu.unoesc.smo.produto;

import br.edu.unoesc.smo.calculos.CincoPorcento;
import br.edu.unoesc.smo.calculos.RegraCalculo;
import br.edu.unoesc.smo.calculos.VinteCincoPorcento;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public enum TipoProduto {
	BEBIDA(new CincoPorcento()),
	VESTUARIO(new VinteCincoPorcento()),
	BRINQUEDO,
	ALIMENTO;
	
	TipoProduto() {
	}
	
	TipoProduto(RegraCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}
	
	private RegraCalculo regraCalculo;
	
	public Double calcular(Produto produto) {
		if (regraCalculo == null) {
			return 0.0;
		} else {
			return regraCalculo.calcularDesconto(produto);
		}
	}
}
