package br.com.cimobile.pizzaria.factory_method;

import br.com.cimobile.pizzaria.factory_method.SPPizzaCalabresa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaCamarao;
import br.com.cimobile.pizzaria.factory_method.SPPizzaPortuguesa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaQuatroQueijos;
import br.com.cimobile.pizzaria.factory_simples.PizzaFactory;

public class PizzaFactorySaoPaulo extends PizzaFactory {

    @Override
    public void criarPizza(String tipo) {
        if (tipo == "queijo") {
            pizza = new SPPizzaQuatroQueijos();
        } else if (tipo == "portuguesa") {
            pizza = new SPPizzaPortuguesa();
        } else if (tipo == "calabresa") {
            pizza = new SPPizzaCalabresa();
        }else if (tipo == "camarao") {
            pizza = new SPPizzaCamarao();
        }
    }
}
