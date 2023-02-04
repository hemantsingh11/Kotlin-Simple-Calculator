package com.example.mycalculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.example.mycalculator1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlin.properties.Delegates

private fun String.equals(other: String, ignoreCase: () -> Unit) {

}

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var input1 : String
    private lateinit var input2 : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.BtnAdd.setOnClickListener { view: View ->
            input1 = binding.EtPlainTextInput1.text.toString()
            input2 = binding.EtPlainTextInput2.text.toString()
            var answer : String = CalculatorModel.add(input1, input2)
            if (answer.equals("invalid")){

                val snackBarView  = Snackbar.make(view,
                    R.string.invalidInput,
                    Snackbar.LENGTH_SHORT)
                val view = snackBarView.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snackBarView.show()
            }
            binding.TvResutWindow.setText(answer.toString())
        }


        binding.BtnSubtract.setOnClickListener { view: View ->
            input1 = binding.EtPlainTextInput1.text.toString()
            input2 = binding.EtPlainTextInput2.text.toString()
            var answer : String = CalculatorModel.sub(input1, input2)
            if (answer.equals("invalid")){

                val snackBarView  = Snackbar.make(view,
                    R.string.invalidInput,
                    Snackbar.LENGTH_SHORT)
                val view = snackBarView.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snackBarView.show()
            }
            binding.TvResutWindow.setText(answer.toString())
        }

        binding.BtnDivide.setOnClickListener { view: View ->
            input1 = binding.EtPlainTextInput1.text.toString()
            input2 = binding.EtPlainTextInput2.text.toString()
            var answer : String = CalculatorModel.div(input1, input2)
            if (answer.equals("invalid")){

                val snackBarView  = Snackbar.make(view,
                    R.string.invalidInput,
                    Snackbar.LENGTH_SHORT)
                val view = snackBarView.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snackBarView.show()
            }
            if (answer.equals("invalid operand")){

                val snackBarView  = Snackbar.make(view,
                    R.string.invalidOperand,
                    Snackbar.LENGTH_SHORT)
                val view = snackBarView.view
                val params = view.layoutParams as FrameLayout.LayoutParams
                params.gravity = Gravity.TOP
                view.layoutParams = params
                snackBarView.show()
            }
            binding.TvResutWindow.setText(answer.toString())
        }
    }
}