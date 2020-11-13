package br.com.cimobile.pizzaria.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.cimobile.pizzaria.Pizza
import br.com.cimobile.pizzaria.R
import br.com.cimobile.pizzaria.factory_method.PizzaFactoryRioDeJaneiro
import kotlinx.android.synthetic.main.activity_pizza.*


class PizzaRJActivity : AppCompatActivity(),  View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        init()
    }

    private fun init() {
        btn_pizza_calabresa.setOnClickListener(this)
        btn_pizza_portuguesa.setOnClickListener(this)
        btn_pizza_quatro_queijo.setOnClickListener(this)
        btn_pizza_camarao.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var pizza: Pizza? = null

        var pizzariaRioJaneiro =
            PizzaFactoryRioDeJaneiro()

        when ( view?.id ) {
            R.id.btn_pizza_calabresa ->
            {
                pizzariaRioJaneiro.criarPizza("calabresa")
                pizza = pizzariaRioJaneiro.delivery()
            }

            R.id.btn_pizza_portuguesa ->
            {
                pizzariaRioJaneiro.criarPizza("portuguesa")
                pizza = pizzariaRioJaneiro.delivery()
            }

            R.id.btn_pizza_quatro_queijo ->
            {
                pizzariaRioJaneiro.criarPizza("queijo")
                pizza = pizzariaRioJaneiro.delivery()
            }

            R.id.btn_pizza_camarao ->
            {
                pizzariaRioJaneiro.criarPizza("camarao")
                pizza = pizzariaRioJaneiro.delivery()
            }
        }

        tv_pizza.text = pizza?.name()
    }
}