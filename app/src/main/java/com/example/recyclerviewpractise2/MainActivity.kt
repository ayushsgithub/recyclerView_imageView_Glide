package com.example.recyclerviewpractise2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val contacts = createContacts()

        val rvList = findViewById<RecyclerView>(R.id.rvList)

        rvList.layoutManager = LinearLayoutManager(this)
        rvList.adapter = MyAdapter(this, contacts)



    }

    private fun createContacts(): MutableList<Person> {
        val contacts : MutableList<Person> = mutableListOf<Person>()

        for (i: Int in 1..100){
            contacts.add(Person("Person $i", i))
        }

        return contacts
    }
}
