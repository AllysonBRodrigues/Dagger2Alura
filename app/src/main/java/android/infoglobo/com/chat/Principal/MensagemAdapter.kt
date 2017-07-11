package android.infoglobo.com.chat.Principal

import android.content.Context
import android.infoglobo.com.chat.Model.Mensagem
import android.support.v7.widget.AppCompatTextView
import android.view.View
import android.view.ViewGroup
import android.infoglobo.com.chat.R
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

/**
 * Created by AllysonRodrigues on 11/07/17.
 */

class MensagemAdapter(val list: MutableList<Mensagem>, val context: Context) : RecyclerView.Adapter<MensagemAdapter.ListRowHolder>(){



    override fun onBindViewHolder(holder: ListRowHolder?, position: Int) {
       val mensagem: Mensagem = list.get(position)
       holder!!.mensagem.text = mensagem.texto
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListRowHolder {
        val inflate: LayoutInflater = LayoutInflater.from(context)
        val view:View = inflate.inflate(R.layout.mensagem, parent, false)
        return  ListRowHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ListRowHolder(row: View) : RecyclerView.ViewHolder(row){
        val mensagem: AppCompatTextView

        init {
            this.mensagem = row?.findViewById(R.id.id_mensagem)!!
        }


    }

}
