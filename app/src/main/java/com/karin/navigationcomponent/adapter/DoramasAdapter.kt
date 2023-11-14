package com.karin.navigationcomponent.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karin.navigationcomponent.DoramasModel
import com.karin.navigationcomponent.R


class DoramasAdapter(private val doramasModelList: List<DoramasModel>) : RecyclerView.Adapter<DoramasViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoramasViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return DoramasViewHolder(layoutInflater.inflate(R.layout.item_dorama, parent, false))
    }

    override fun getItemCount(): Int {
        return doramasModelList.size
    }

    override fun onBindViewHolder(holder: DoramasViewHolder, position: Int) {
        val item= doramasModelList[position]
        holder.itemDoramasList(item)


    }


}