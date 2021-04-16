package jp.techacademy.tomoya.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                    if (2 <= hourOfDay && hourOfDay < 10) {
                    textView.setText("おはよう")
                } else if (10 <= hourOfDay && hourOfDay < 18) {
                    textView.setText("こんにちわ")
                } else if (18 <= hourOfDay && hourOfDay < 24) {
                    textView.setText("こんばんわ")
                } else if (0 <= hourOfDay && hourOfDay < 2) {
                    textView.setText("こんばんわ")
                }

                },
                13, 0, true)
        timePickerDialog.show()
    }
}