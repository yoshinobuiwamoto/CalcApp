package jp.techacademy.taro.kirameki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import jp.techacademy.taro.kirameki.calcapp.SecondActivity
import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var keisanSiki: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTasu.setOnClickListener (this)
        buttonHiku.setOnClickListener (this)
        buttonKakeru.setOnClickListener(this)
        buttonWaru.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        when (v!!.id ){
            R.id.buttonTasu -> {keisanSiki = 1 }  //式　＋
            R.id.buttonHiku -> {keisanSiki = 2 }  //式　－
            R.id.buttonKakeru -> {keisanSiki= 3}  //式　×
            R.id.buttonWaru -> {keisanSiki= 4}    //式　÷
        }
        when ((editText1.text.isEmpty() == true) || (editText2.text.isEmpty() == true)){
            true -> {
                val intent= Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", 1.0)
                intent.putExtra("VALUE2", 1.0)
                intent.putExtra("KEISANSIKI",5) //値１または値２がnull
                intent.putExtra("ERRMSG","値１または値２が正しくない")
                startActivity(intent)

            }
            else ->{
                val intent= Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent.putExtra("KEISANSIKI",keisanSiki)
                intent.putExtra("ERRMSG","")
                startActivity(intent)

            }
        }


    }
}
