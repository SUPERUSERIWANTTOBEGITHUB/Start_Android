package yvg68.measurer.start_andoid
//
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var counView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var count:Int = 0   //Integer.parseInt(counView.toString())
    lateinit var quantity:TextView


    fun pushMe(view:View){
        val pushMe = Toast.makeText(this, "Hello a new User!", Toast.LENGTH_SHORT)
        pushMe.show()
        counView = findViewById(R.id.countView)
        count++
        counView.text = count.toString()
        quantity = findViewById(R.id.textLabel)
        quantity.text ="QUANTITY:"
    }


}