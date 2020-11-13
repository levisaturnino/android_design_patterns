package br.com.cimobile.pizzaria.factory_simples;


import br.com.cimobile.pizzaria.Pizza;
import br.com.cimobile.pizzaria.PizzaCalabresa;
import br.com.cimobile.pizzaria.PizzaCamarao;
import br.com.cimobile.pizzaria.PizzaPortuguesa;
import br.com.cimobile.pizzaria.PizzaQuatroQueijos;

public class PizzariaFactory {

    private PizzariaFactory(){}

    public static Pizza criarPizza(String tipo){
        Pizza pizza = null;

        if( tipo.equals("queijo") ){
            pizza = new PizzaQuatroQueijos();
        }
        else if( tipo.equals("portuguesa") ){
            pizza = new PizzaPortuguesa();
        }
        else if( tipo.equals("calabresa") ){
            pizza = new PizzaCalabresa();
        }
        else if( tipo.equals("camarao") ){
            pizza = new PizzaCamarao();
        }
        return pizza;
    }
}
