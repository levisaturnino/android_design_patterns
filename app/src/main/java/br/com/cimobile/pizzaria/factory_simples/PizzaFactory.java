package br.com.cimobile.pizzaria.factory_simples;

import br.com.cimobile.pizzaria.Pizza;

public abstract class PizzaFactory {

    protected Pizza pizza;

    public abstract void criarPizza( String tipo );

    public Pizza delivery(){
        return pizza;
    }
}
