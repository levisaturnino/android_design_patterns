package br.com.cimobile.pizzaria.factory_method;

import br.com.cimobile.pizzaria.Pizza;

public class RJPizzaCamarao implements Pizza {
    @Override
    public String name() {
        return "RJPizzaCamarao";
    }
}
