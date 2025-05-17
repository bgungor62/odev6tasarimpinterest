package com.example.odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.databinding.CardTasarimBinding
import java.util.ArrayList

class Adapter(var mContext: Context,var gorsellerlistesi:ArrayList<Gorseller>):RecyclerView.Adapter<Adapter.CardTasarimHolder>() {
    inner class CardTasarimHolder(var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        var binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimHolder(binding)    }

    override fun getItemCount(): Int {
        return  gorsellerlistesi.size //kaç veri varas o kadar kutu oluşturuyor onBindViewHolder ı da tetikler

    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        val gorsel=gorsellerlistesi.get(position)

        val t=holder.tasarim
        t.imageView.setImageResource(
            mContext.resources.getIdentifier(gorsel.resim,"drawable",mContext.packageName)
        )
    }

}