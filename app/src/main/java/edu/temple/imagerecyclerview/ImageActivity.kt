package edu.temple.imagerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.Image

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun getHeros(): Array<ImageObject> {
        return arrayOf(ImageObject(R.drawable.BlackPanther, "Black Panther"),
            ImageObject(R.drawable.BlackWidow, "Black Widow"),
            ImageObject(R.drawable.CaptainAmerica, "Captain America"),
            ImageObject(R.drawable.DoctorStrange, "Doctor Strange"),
            ImageObject(R.drawable.Hulk, "Hulk"),
            ImageObject(R.drawable.IronMan, "Iron Man"),
            ImageObject(R.drawable.ShangChi, "Shang Chi"),
            ImageObject(R.drawable.SpiderMan, "Spider Man"),
            ImageObject(R.drawable.Thor, "Thor"),
            ImageObject(R.drawable.Vision, "Vision"),
            ImageObject(R.drawable.Wanda, "Wanda"))


    }
}