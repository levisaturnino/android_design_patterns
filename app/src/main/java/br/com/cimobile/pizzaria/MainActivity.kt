package br.com.cimobile.pizzaria

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.cimobile.pizzaria.factory_method.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var pizza: Pizza? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btn_pizza_calabresa.setOnClickListener(this)
        btn_pizza_portuguesa.setOnClickListener(this)
        btn_pizza_quatro_queijo.setOnClickListener(this)
        btn_pizza_camarao.setOnClickListener(this)
    }

    fun criarPizza(cidade: String, tipo: String) {
        if (cidade == "sao-paulo") {
            if (tipo == "queijo") {
                pizza = SPPizzaQuatroQueijos()
            } else if (tipo == "portuguesa") {
                pizza = SPPizzaPortuguesa()
            } else if (tipo == "calabresa") {
                pizza = SPPizzaCalabresa()
            }
        } else if (cidade == "rio-de-janeiro") {
            if (tipo == "queijo") {
                pizza = RJPizzaQuatroQueijos()
            } else if (tipo == "portuguesa") {
                pizza = RJPizzaPortuguesa()
            } else if (tipo == "calabresa") {
                pizza = RJPizzaCalabresa()
            }
        }
    }

    fun delivery(): Pizza? {
        return pizza
    }

    override fun onClick(view: View?) {

        when ( view?.id ) {
            R.id.btn_pizza_calabresa ->
                criarPizza("sao-paulo","calabresa")
            R.id.btn_pizza_portuguesa ->
                criarPizza("sao-paulo","portuguesa")
            R.id.btn_pizza_quatro_queijo ->
                criarPizza("rio-de-janeiro","queijo")
            R.id.btn_pizza_camarao ->
                criarPizza("rio-de-janeiro","camarao")
        }

        tv_pizza.text = delivery()?.name()
    }
}