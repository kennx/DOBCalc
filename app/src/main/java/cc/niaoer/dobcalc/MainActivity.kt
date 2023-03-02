package cc.niaoer.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import cc.niaoer.dobcalc.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)

        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    fun clickDatePicker() {

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
                Toast.makeText(this, "Datepicker works", Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day
            ).show()
    }

}