package jp.techacademy.taro.kirameki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.taro.kirameki.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var value1 = intent.getDoubleExtra("VALUE1", 0.0)
        var value2 = intent.getDoubleExtra("VALUE2", 0.0)
        var siki= intent.getIntExtra("KEISANSIKI",0)
        var msg = intent.getStringExtra("ERRMSG")

        when (siki){
            1 -> { textView.text = "${value1 + value2}" }
            2 -> { textView.text = "${value1 - value2}" }
            3 -> { textView.text = "${value1 * value2}" }
            4 -> { textView.text = "${value1 / value2}" }
            else -> { textView.text = msg}

        }


    }
}


