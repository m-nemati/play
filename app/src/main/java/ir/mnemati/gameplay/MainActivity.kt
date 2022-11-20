package ir.mnemati.gameplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var playMan = 0
    var cellStates = arrayOf(10,10,10,10,10,10,10,101,10) // empty = 10, oo -> 1, x -> 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickOnImages(view: View){
        val clickedImage: ImageView = view as ImageView
        var tagId = clickedImage.getTag().toString().toInt()
        //Toast.makeText(this, tagId, Toast.LENGTH_LONG).show()
        cellStates[tagId-1] = playMan

        clickedImage.translationY = -1500f
        if (playMan == 0) {
            clickedImage.setImageResource(R.drawable.x)
            playMan = 1
        }
        else{
            clickedImage.setImageResource(R.drawable.oo)
            playMan = 0
        }
        clickedImage.animate().translationYBy(1500f).rotation(3600f).duration = 2000

    }
}