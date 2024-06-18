package sanchez.juan.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        var id = -1
        val titulo = intent.getStringExtra("titulo")
        val sinopsis = intent.getStringExtra("sinopsis")
        val header = intent.getIntExtra("header", 0)
        val seatsLeft = intent.getIntExtra("numberSeats",0)
        id = intent.getIntExtra("pos",0)



        val headerImageView: ImageView = findViewById(R.id.DetailHeader)
        val titleTextView: TextView = findViewById(R.id.DetailTitle)
        val synopsisTextView: TextView = findViewById(R.id.DetailDescription)
        val seatsLeftTextView : TextView = findViewById(R.id.seatsLeft)
        val butTicketsButton: Button = findViewById(R.id.buy_tickets)

        headerImageView.setImageResource(header)
        titleTextView.text = titulo
        synopsisTextView.text = sinopsis
        seatsLeftTextView.text = ("$seatsLeft seats available")

        if(seatsLeft == 0 ){
            butTicketsButton.isActivated = false

        }
        else{
            butTicketsButton.setOnClickListener{
                val intent: Intent = Intent(this,SeatSelection::class.java)

                intent.putExtra("movie", id)
                intent.putExtra("name", titulo)

            }
        }


    }
}