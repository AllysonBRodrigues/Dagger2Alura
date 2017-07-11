package android.infoglobo.com.chat.Principal

import android.infoglobo.com.chat.Model.Mensagem
import android.infoglobo.com.chat.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import android.widget.GridLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(id: View?) {
        when (id) {
            bt_enviar -> {
                Toast.makeText(this, "Mensagem", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista: MutableList<Mensagem> = mutableListOf<Mensagem>()

        listaDeMensagens.layoutManager =  GridLayoutManager(this,1)
        listaDeMensagens.adapter = MensagemAdapter(lista, this)

        bt_enviar.setOnClickListener(this)

    }
}
