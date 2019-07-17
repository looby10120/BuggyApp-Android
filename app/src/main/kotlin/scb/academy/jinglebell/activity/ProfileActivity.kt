package scb.academy.jinglebell.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var receive: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(scb.academy.jinglebell.R.layout.fragment_pass_profile)

        receive = findViewById(scb.academy.jinglebell.R.id.textView2);

        receive.text = intent.getStringExtra("EdiTtEXTvALUE");


    }

}
