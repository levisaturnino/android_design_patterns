package br.com.cimobile.pizzaria.factory_simples;

import br.com.cimobile.pizzaria.Pizza;

public class PizzaCalabresa implements Pizza {

    @Override
    public String name() {
        return "Pizza de Calabresa";
    }
}