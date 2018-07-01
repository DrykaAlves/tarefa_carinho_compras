package br.edu.unoesc.smo.calculos;

import br.edu.unoesc.smo.produto.Produto;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class VinteCincoPorcento implements RegraCalculo {

    @Override
    public Double calcularDesconto(Produto produto) {
        return produto.getValorItem() * 0.25;
    }
}
