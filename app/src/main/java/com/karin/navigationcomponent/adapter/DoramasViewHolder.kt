package com.karin.navigationcomponent.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.karin.navigationcomponent.DoramasModel
import com.karin.navigationcomponent.databinding.ItemDoramaBinding


class DoramasViewHolder(view: View): RecyclerView.ViewHolder(view){

    val binding = ItemDoramaBinding.bind(view)

//    val portada= view.findViewById<ImageView>(R.id.ivPortada)
//    val titulo= view.findViewById<TextView>(R.id.tvTitulo)
//    val año=view.findViewById<TextView>(R.id.tvAño)

    fun itemDoramasList( doramaModel: DoramasModel){
        Glide.with(binding.ivPortada.context).load(doramaModel.portada).into(binding.ivPortada)
        binding.tvTitulo.text= doramaModel.titulo
        binding.tvAO.text=doramaModel.año

        itemView.setOnClickListener {
            Toast.makeText(binding.ivPortada.context, binding.tvTitulo.text, Toast.LENGTH_SHORT).show()
        }

    }

}