package br.com.cimobile.pizzaria

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.cimobile.pizzaria.factory_method.*
import br.com.cimobile.pizzaria.ui.PizzaRJActivity
import br.com.cimobile.pizzaria.ui.PizzaSPActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btn_rio_janeiro.setOnClickListener(this)
        btn_sao_paulo.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when ( view?.id ) {
            R.id.btn_rio_janeiro ->
                startActivity(Intent(this,PizzaRJActivity::class.java))
            R.id. btn_sao_paulo ->
                startActivity(Intent(this,PizzaSPActivity::class.java))
        }
    }
}