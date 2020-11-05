package com.example.kalkulator
import net.objecthunter.exp4j.ExpressionBuilder
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.cal_text)
    }
    fun onNum(view: View)
    {
        txt.append((view as Button).text)
    }
    fun onOperator(view: View){
        txt.append((view as Button).text)
    }
    fun onDot(view: View){
        txt.append((view as Button).text)
    }
    fun onDel(view: View){
        this.txt.text =""
    }

    fun onE(view: View) {
        var text = txt.text.toString()
        val eval = ExpressionBuilder(text).build()
        val res =eval.evaluate()
        txt.text = res.toString()
    }

}
