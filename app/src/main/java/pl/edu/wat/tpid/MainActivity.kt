package pl.edu.wat.tpid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.listener.OnItemChildClickListener
import pl.edu.wat.tpid.database.Database
import pl.edu.wat.tpid.view.DietsActivity
import pl.edu.wat.tpid.view.TrainerDetailsActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trainersList = findViewById<RecyclerView>(R.id.personal_trainers_list)

        val personalTrainerAdapter = PersonalTrainerAdapter()
        personalTrainerAdapter.setOnItemChildClickListener { adapter, view, position ->
            val personalTrainer = Database.getAllTrainers[position]

            val intent = Intent(this, TrainerDetailsActivity::class.java)
            intent.putExtra("DATA", personalTrainer)
            startActivity(intent)

        }

        trainersList.layoutManager = LinearLayoutManager(this)
        trainersList.adapter = personalTrainerAdapter

        personalTrainerAdapter.setNewInstance(Database.getAllTrainers)

        val btn = findViewById<Button>(R.id.show_diets)
        btn.setOnClickListener {
            startActivity(Intent(this, DietsActivity::class.java))
        }
    }
}