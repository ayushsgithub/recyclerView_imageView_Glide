package com.example.recyclerviewpractise2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val contacts: MutableList<Person>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val view : View = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount() = contacts.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvPerson = itemView.findViewById<TextView>(R.id.tvPeron)
        val tvAge = itemView.findViewById<TextView>(R.id.tvAge)

        fun bind(contact: Person) {
            tvPerson.text = contact.name
            tvAge.text = "Age: ${contact.age}"
        }

    }
}
