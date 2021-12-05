package yvg68.measurer.start_andoid
//
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun pushMe(view:View){
        val pushMe = Toast.makeText(this, "Hello a new User!", Toast.LENGTH_SHORT)
        pushMe.show()

    }
}