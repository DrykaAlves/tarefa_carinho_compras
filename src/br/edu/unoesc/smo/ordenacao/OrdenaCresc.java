package br.edu.unoesc.smo.ordenacao;

import br.edu.unoesc.smo.carinho.ItemCarrinho;
import java.util.Comparator;

/**
* Tarefa final - Carinho de Compras
* @author Adriana Alves
*/

public class OrdenaCresc implements Comparator<ItemCarrinho> {

    @Override
    public int compare(ItemCarrinho item1, ItemCarrinho item2) {
        if (item1.getValor() < item2.getValor()) {
            return -1;
        } else if (item1.getValor() > item2.getValor()) {
            return +1;
        } else {
            return 0;
        }
    }
}
