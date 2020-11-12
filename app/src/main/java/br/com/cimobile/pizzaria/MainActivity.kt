package br.com.cimobile.pizzaria

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var pizza: Pizza? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_pizza_calabresa.setOnClickListener {
            criarPizza("calabresa")
            tv_pizza.text = pizza?.name()
        }

        btn_pizza_portuguesa.setOnClickListener {
            criarPizza("portuguesa")
            tv_pizza.text = pizza?.name()
        }

        btn_pizza_quatro_queijo.setOnClickListener {
            criarPizza("queijo")
            tv_pizza.text = pizza?.name()
        }

        btn_pizza_camarao.setOnClickListener {
            criarPizza("camarao")
            tv_pizza.text = pizza?.name()
        }
    }

    fun criarPizza(tipo: String) {
        if (tipo == "queijo") {
            pizza = PizzaQuatroQueijos()
        } else if (tipo == "portuguesa") {
            pizza = PizzaPortuguesa()
        } else if (tipo == "calabresa") {
            pizza = PizzaCalabresa()
        } else if (tipo == "camarao") {
            pizza = PizzaCamarao()
        }
    }
}