package com.robothijau.notes.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.robothijau.notes.Adapter.MyAdapter
import com.robothijau.notes.R

class HomeActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private val itemList = listOf(
        MyAdapter.Student("John Doe", "123456789"),
        MyAdapter.Student("Jane Smith", "987654321"),
        MyAdapter.Student("Bob Johnson", "456789123")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        recyclerView = findViewById(R.id.recycerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MyAdapter(itemList)
        recyclerView.adapter = adapter
    }
}