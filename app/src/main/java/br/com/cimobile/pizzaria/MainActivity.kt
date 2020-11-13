package br.com.cimobile.pizzaria

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.cimobile.pizzaria.factory_simples.PizzariaFactory
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

    fun criarPizza(tipo: String) {
        pizza = PizzariaFactory.criarPizza(tipo)
    }

    override fun onClick(view: View?) {

        when ( view?.id ) {
            R.id.btn_pizza_calabresa ->
                criarPizza("calabresa")
            R.id.btn_pizza_portuguesa ->
                criarPizza("portuguesa")
            R.id.btn_pizza_quatro_queijo ->
                criarPizza("queijo")
            R.id.btn_pizza_camarao ->
                criarPizza("camarao")
        }

        tv_pizza.text = pizza?.name()
    }
}