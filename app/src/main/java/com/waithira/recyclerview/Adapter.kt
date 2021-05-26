package com.waithira.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.waithira.recyclerview.databinding.PersonItemBinding

class Adapter: RecyclerView.Adapter<Adapter.PersonViewHolder>() {
    inner class PersonViewHolder(person: PersonItemBinding): RecyclerView.ViewHolder(person.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(PersonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

    }

    override fun getItemCount(): Int  = 10
}