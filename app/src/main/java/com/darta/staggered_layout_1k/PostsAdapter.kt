package com.darta.staggered_layout_1k

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.darta.staggered_layout_1k.PostsAdapter.PostViewHolder
import com.makeramen.roundedimageview.RoundedImageView

class PostsAdapter(private val postItems: List<PostItem>) :
    RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.post_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.setPostImageView(postItems[position])
    }

    override fun getItemCount(): Int {
        return postItems.size
    }

    inner class PostViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var postImageView: RoundedImageView
        fun setPostImageView(postItem: PostItem) {
            postImageView.setImageResource(postItem.image)
        }

        init {
            postImageView = itemView.findViewById(R.id.imagePost)
        }
    }

}