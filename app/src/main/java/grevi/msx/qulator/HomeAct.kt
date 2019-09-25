package grevi.msx.qulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*
import java.lang.NumberFormatException

class HomeAct : AppCompatActivity() {

    private lateinit var input1:EditText
    private lateinit var input2:EditText
    private lateinit var hasilx:TextView

    private lateinit var mod:Button
    private lateinit var tambah:Button
    private lateinit var kurang:Button
    private lateinit var kali:Button
    private lateinit var bagi:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        input1 = findViewById(R.id.edt_1)
        input2 = findViewById(R.id.edt_2)
        hasilx = findViewById(R.id.hasil)

        mod = findViewById(R.id.mod_op)
        tambah = findViewById(R.id.plus_op)
        kurang = findViewById(R.id.min_op)
        kali = findViewById(R.id.kali_op)
        bagi = findViewById(R.id.bagi_op)

        bagi.setOnClickListener{
            var isEmptyField = false

            val angka1 = input1.text.toString().trim()
            val angka2 = input2.text.toString().trim()

            when {
                angka1.isEmpty() -> {
                    isEmptyField = true
                    edt_1.error = "Input Number !"
                }

                angka2.isEmpty() -> {
                    isEmptyField = true
                    edt_2.error = "Input Number !"
                }
            }

            if (!isEmptyField){
                val edt1 = toInt(angka1)
                val edt2 = toInt(angka2)

                val hasil = edt1 as Int / edt2 as Int

                hasilx.text = hasil.toString()
            }
        }

        kali.setOnClickListener{
            var isEmptyField = false

            val angka1 = input1.text.toString().trim()
            val angka2 = input2.text.toString().trim()

            when {
                angka1.isEmpty() -> {
                    isEmptyField = true
                    edt_1.error = "Input Number !"
                }

                angka2.isEmpty() -> {
                    isEmptyField = true
                    edt_2.error = "Input Number !"
                }
            }

            if (!isEmptyField){
                val edt1 = toInt(angka1)
                val edt2 = toInt(angka2)

                val hasil = edt1 as Int * edt2 as Int

                hasilx.text = hasil.toString()
            }
        }

        kurang.setOnClickListener{
            var isEmptyField = false

            val angka1 = input1.text.toString().trim()
            val angka2 = input2.text.toString().trim()

            when {
                angka1.isEmpty() -> {
                    isEmptyField = true
                    edt_1.error = "Input Number !"
                }

                angka2.isEmpty() -> {
                    isEmptyField = true
                    edt_2.error = "Input Number !"
                }
            }

            if (!isEmptyField){
                val edt1 = toInt(angka1)
                val edt2 = toInt(angka2)

                val hasil = edt1 as Int - edt2 as Int

                hasilx.text = hasil.toString()
            }
        }

        tambah.setOnClickListener{
            var isEmptyField = false

            val angka1 = input1.text.toString().trim()
            val angka2 = input2.text.toString().trim()

            when {
                angka1.isEmpty() -> {
                    isEmptyField = true
                    edt_1.error = "Input Number !"
                }

                angka2.isEmpty() -> {
                    isEmptyField = true
                    edt_2.error = "Input Number !"
                }
            }

            if (!isEmptyField){
                val edt1 = toInt(angka1)
                val edt2 = toInt(angka2)

                val hasil = edt1 as Int + edt2 as Int

                hasilx.text = hasil.toString()
            }
        }

        mod.setOnClickListener {
            var isEmptyField = false

            val angka1 = input1.text.toString().trim()
            val angka2 = input2.text.toString().trim()

            when {
                angka1.isEmpty() -> {
                    isEmptyField = true
                    edt_1.error = "Input Number !"
                }

                angka2.isEmpty() -> {
                    isEmptyField = true
                    edt_2.error = "Input Number !"
                }
            }

            if (!isEmptyField){
                val edt1 = toInt(angka1)
                val edt2 = toInt(angka2)

                val hasil = edt1 as Int % edt2 as Int

                hasilx.text = hasil.toString()
            }

        }
    }

    private fun toInt(str : String) :Int? {
        return try {
            str.toInt()
        } catch (e : NumberFormatException) {
            null
        }
    }
}
