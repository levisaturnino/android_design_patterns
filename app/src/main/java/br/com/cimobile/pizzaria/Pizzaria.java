package br.com.cimobile.pizzaria;

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
