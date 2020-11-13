package br.com.cimobile.pizzaria.factory_simples;

import br.com.cimobile.pizzaria.factory_method.SPPizzaCalabresa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaPortuguesa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaQuatroQueijos;

public class PizzaFactorySaoPaulo extends PizzaFactory{

    @Override
    public void criarPizza(String tipo) {
        if (tipo == "queijo") {
            pizza = new SPPizzaQuatroQueijos();
        } else if (tipo == "portuguesa") {
            pizza = new SPPizzaPortuguesa();
        } else if (tipo == "calabresa") {
            pizza = new SPPizzaCalabresa();
        }
    }
}
