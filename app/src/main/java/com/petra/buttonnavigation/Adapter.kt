package com.petra.buttonnavigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class Adapter(val arrayList: ArrayList<data>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image: ImageView = ItemView.findViewById(R.id.Rimage)
        val name: TextView = ItemView.findViewById(R.id.Rtext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.name.text = arrayList[position].name
        holder.image.setImageResource(arrayList[position].image)
        holder.itemView.setOnClickListener(){
            (it.context as AppCompatActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.main,HomeFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size

    }
}