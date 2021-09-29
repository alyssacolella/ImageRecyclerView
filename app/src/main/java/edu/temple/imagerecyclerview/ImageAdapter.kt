package edu.temple.imagerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (_context: Context, _items: Array<ImageObject>,
                    val clickListener: (ImageObject) -> Unit):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    val items = _items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.photo_layout, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //val image: ImageObject = items[position]
        (holder as ImageViewHolder).bind(items[position], clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    public class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(img: ImageObject, clickListener: (ImageObject) -> Unit){
            val imageView: ImageView = itemView.findViewById(R.id.heroPicture)
            imageView.setImageResource(img.image)
            imageView.setOnClickListener { (clickListener(img)) }
        }

    }
}

