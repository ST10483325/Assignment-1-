package vcmsa.ci.myapplicationassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val rdMorning = findViewById<RadioButton>(R.id.rdMorning)
        val rdMidMorning = findViewById<RadioButton>(R.id.rdMidmorning)
        val rdAfternoon = findViewById<RadioButton>(R.id.rdAfternoon)
        val rdMidAfternoon = findViewById<RadioButton>(R.id.rdMidAfternoon)
        val rdDinner = findViewById<RadioButton>(R.id.rdDinner)



        btnCalculate.setOnClickListener{
            var txtMu = txtResults.text.toString()

            if (rdMorning.isChecked)
            {
                txtMu = "Eggs, Waffles and syrup, Cereal:oats,Cornflakes or Whole-Grain"
            }

            else if (rdMidMorning.isChecked)
            {
                txtMu = "Fruit:Orange,Banana,BlueBerry"
            }
            else if (rdMidAfternoon.isChecked)
            {
                txtMu = "Cake,Snacks,Nuts and Seeds, Greek Yogurt"
            }
            else if (rdAfternoon.isChecked)
            {
                txtMu = "Sandwich, Crackers and Cheese, Popcorn, Boiled Eggs "
            }
            else if (rdDinner.isChecked)
            {
                txtMu = "Pasta,Taco's,Stir Fry,Frozen Pizza"
            }

            txtResults.text = txtMu

        }
        btnReset.setOnClickListener{
            txtResults.text = ""
        }























        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}