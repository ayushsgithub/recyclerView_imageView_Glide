package com.example.recyclerviewpractise2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator


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

//        rvList.layoutManager = LinearLayoutManager(this)
        rvList.itemAnimator = SlideInUpAnimator()
        rvList.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvList.adapter = MyAdapter(this, contacts)



    }

    private fun createContacts(): MutableList<Person> {
        val contacts : MutableList<Person> = mutableListOf<Person>()

        for (i: Int in 1..100){
            contacts.add(Person("Image $i", i))
        }

        return contacts
    }
}
