package com.robothijau.notes.Interface

import com.robothijau.notes.Adapter.MyAdapter

interface ItemClickListener {
    fun onItemClick(student: MyAdapter.Student)
}