package br.com.cimobile.pizzaria.factory_method;

import br.com.cimobile.pizzaria.factory_method.RJPizzaCalabresa;
import br.com.cimobile.pizzaria.factory_method.RJPizzaCamarao;
import br.com.cimobile.pizzaria.factory_method.RJPizzaPortuguesa;
import br.com.cimobile.pizzaria.factory_method.RJPizzaQuatroQueijos;
import br.com.cimobile.pizzaria.factory_method.SPPizzaCalabresa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaPortuguesa;
import br.com.cimobile.pizzaria.factory_method.SPPizzaQuatroQueijos;
import br.com.cimobile.pizzaria.factory_simples.PizzaFactory;

public class PizzaFactoryRioDeJaneiro extends PizzaFactory {

    @Override
    public void criarPizza(String tipo) {
        if (tipo == "queijo") {
            pizza = new RJPizzaQuatroQueijos();
        } else if (tipo == "portuguesa") {
            pizza = new RJPizzaPortuguesa();
        } else if (tipo == "calabresa") {
            pizza = new RJPizzaCalabresa();
        }else if (tipo == "camarao") {
            pizza = new RJPizzaCamarao();
        }
    }
}
