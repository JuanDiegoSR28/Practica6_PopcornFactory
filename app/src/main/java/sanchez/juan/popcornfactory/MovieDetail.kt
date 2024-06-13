package sanchez.juan.popcornfactory

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val titulo = intent.getStringExtra("titulo")
        val sinopsis = intent.getStringExtra("sinopsis")
        val header = intent.getIntExtra("header", 0)


        val headerImageView: ImageView = findViewById(R.id.DetailHeader)
        val titleTextView: TextView = findViewById(R.id.DetailTitle)
        val synopsisTextView: TextView = findViewById(R.id.DetailDescription)


        headerImageView.setImageResource(header)
        titleTextView.text = titulo
        synopsisTextView.text = sinopsis

    }
}