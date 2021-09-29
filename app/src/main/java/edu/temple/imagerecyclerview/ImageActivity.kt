package edu.temple.imagerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.Image
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager


class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var heroList: Array<ImageObject> = arrayOf(ImageObject(R.drawable.blackpanther, "Black Panther"),
            ImageObject(R.drawable.blackwidow, "Black Widow"),
            ImageObject(R.drawable.captainamerica, "Captain America"),
            ImageObject(R.drawable.doctorstrange, "Doctor Strange"),
            ImageObject(R.drawable.hulk, "Hulk"),
            ImageObject(R.drawable.ironman, "Iron Man"),
            ImageObject(R.drawable.shangchi, "Shang Chi"),
            ImageObject(R.drawable.spiderman, "Spider Man"),
            ImageObject(R.drawable.thor, "Thor"),
            ImageObject(R.drawable.vision, "Vision"),
            ImageObject(R.drawable.wanda, "Wanda"))


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
        recyclerView.adapter = ImageAdapter(this, heroList) { image: ImageObject ->
            imageClicked(
                image
            )
        }
    }

    private fun imageClicked(image: ImageObject) {

        val text: TextView = R.id.heroName as TextView
        text.text = image.name

        val img: ImageView = R.id.heroPicture as ImageView
        img.setImageResource(image.image)


        Toast.makeText(this, "Clicked: ${image.name}", Toast.LENGTH_LONG).show()

    }
}