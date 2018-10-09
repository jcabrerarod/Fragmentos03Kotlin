package es.jcabrera.fragmentos03kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Fragmentos03Kotlin : AppCompatActivity() {

    private var bol = false
    private val fragmentUNO = Fragmento1()
    private val fragmentDOS = Fragmento2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmentos03_kotlin)

        val FT1 = supportFragmentManager.beginTransaction()
        FT1.add(R.id.contenedor, fragmentUNO)
        FT1.commit()
    }

    fun pulsado(v: View?) {

        val FT2 = supportFragmentManager.beginTransaction()
        if (bol) {
            FT2.replace(R.id.contenedor, fragmentUNO)
        } else {
            FT2.replace(R.id.contenedor, fragmentDOS)
        }
        FT2.addToBackStack(null)
        FT2.commit()

        bol = if (bol) false else true
    }
}
