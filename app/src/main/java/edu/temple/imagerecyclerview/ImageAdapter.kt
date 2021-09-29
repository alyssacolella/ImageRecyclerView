package edu.temple.imagerecyclerview

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class ImageViewHolder(_imageView: ImageView): RecyclerView.ViewHolder(_imageView){
        val imageView = _imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}