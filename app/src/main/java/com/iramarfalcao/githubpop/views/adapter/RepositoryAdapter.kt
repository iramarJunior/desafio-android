package com.iramarfalcao.githubpop.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iramarfalcao.githubpop.R
import com.iramarfalcao.githubpop.models.Repository

class RepositoryAdapter(private val list: ArrayList<Repository>, val context: Context) :
    RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    class RepositoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById(R.id.title_textView) as TextView
        val description = view.findViewById(R.id.description_textView) as TextView
        val avatar = view.findViewById(R.id.avatar_imageView) as ImageView
        val username = view.findViewById(R.id.username_textView) as TextView
        val name = view.findViewById(R.id.name_textView) as TextView
        val forks = view.findViewById(R.id.fork_textView) as TextView
        val likes = view.findViewById(R.id.likes_textView) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder =
        RepositoryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_repository, parent, false)
        )

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.description.text = list[position].description
//        holder.avatar.text = list[position].avatar
        holder.username.text = list[position].username
        holder.name.text = list[position].name
        holder.forks.text = list[position].forks.toString()
        holder.likes.text = list[position].likes.toString()
    }

    override fun getItemCount(): Int = list.size

}