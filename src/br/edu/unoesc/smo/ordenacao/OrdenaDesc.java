package br.edu.unoesc.smo.ordenacao;

import java.util.Comparator;
import br.edu.unoesc.smo.carinho.ItemCarrinho;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class OrdenaDesc implements Comparator<ItemCarrinho> {

    @Override
    public int compare(ItemCarrinho item1, ItemCarrinho item2) {
        if (item1.getValor() < item2.getValor()) {
            return +1;
        } else if (item1.getValor() > item2.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}
