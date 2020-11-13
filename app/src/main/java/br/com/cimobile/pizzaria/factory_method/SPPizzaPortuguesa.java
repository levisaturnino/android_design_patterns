package br.com.cimobile.pizzaria.factory_method;

import br.com.cimobile.pizzaria.Pizza;

public class SPPizzaPortuguesa implements Pizza {
    @Override
    public String name() {
        return "SPPizzaPortuguesa";
    }
}
