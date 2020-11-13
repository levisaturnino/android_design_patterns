package br.com.cimobile.pizzaria.factory_simples;

import br.com.cimobile.pizzaria.Pizza;
import br.com.cimobile.pizzaria.factory_simples.PizzaCalabresa;
import br.com.cimobile.pizzaria.factory_simples.PizzaCamarao;
import br.com.cimobile.pizzaria.factory_simples.PizzaPortuguesa;
import br.com.cimobile.pizzaria.factory_simples.PizzaQuatroQueijos;

public class Pizzaria {

    private Pizza pizza;

    public void criarPizza(String tipo){

        if(tipo.equals("queijo")){
            pizza = new PizzaQuatroQueijos();
        }
        else if(tipo.equals("portuguesa")){
            pizza = new PizzaPortuguesa();
        }
        else if( tipo.equals("calabresa")){
            pizza = new PizzaCalabresa();
        }
        else if( tipo.equals("camarao")){
            pizza = new PizzaCamarao();
        }
    }
}
