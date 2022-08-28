package pl.edu.wat.tpid.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pl.edu.wat.tpid.R
import pl.edu.wat.tpid.model.PersonalTrainer

class TrainerDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainer_details)

        val personalTrainer = intent.getParcelableExtra<PersonalTrainer>("DATA")


        Toast.makeText(this, personalTrainer.toString(), Toast.LENGTH_LONG).show()
    }
}