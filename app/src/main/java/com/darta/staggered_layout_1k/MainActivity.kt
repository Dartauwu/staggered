package com.darta.staggered_layout_1k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val postRecyclerView = findViewById<RecyclerView>(R.id.postsRecyclerView)
        postRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val postItems: MutableList<PostItem> = ArrayList<PostItem>()
        postItems.add(PostItem(R.drawable.gambar1))
        postItems.add(PostItem(R.drawable.gambar14))
        postItems.add(PostItem(R.drawable.gambar2))
        postItems.add(PostItem(R.drawable.gambar13))
        postItems.add(PostItem(R.drawable.gambar14))
        postItems.add(PostItem(R.drawable.gambar5))
        postItems.add(PostItem(R.drawable.gambar12))
        postItems.add(PostItem(R.drawable.gambar7))
        postItems.add(PostItem(R.drawable.gambar14))
        postItems.add(PostItem(R.drawable.gambar8))
        postItems.add(PostItem(R.drawable.gambar9))
        postItems.add(PostItem(R.drawable.gambar13))
        postItems.add(PostItem(R.drawable.gambar10))
        postRecyclerView.adapter = PostsAdapter(postItems)
    }
}