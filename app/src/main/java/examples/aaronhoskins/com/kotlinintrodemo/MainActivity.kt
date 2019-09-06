package examples.aaronhoskins.com.kotlinintrodemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// :  takes the place of BOTH extends and implements
class MainActivity : AppCompatActivity() {

    // 2 kinds of variable declarations
    //val TAG = "MAIN_ACTIVITY"  //Val is IMMUTABLE (final)
    val TAG by lazy { setTagValue() }
    var name  = ""   //Var in mutable (can be changed)
    lateinit var name2 : String
    var car = Car("","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(MainActivity@this, SecondActivity::class.java)
        //startActivity(intent)

        val conditionalValue = 5

        when(conditionalValue) {
            5 -> Log.d(TAG, "Value is 5")
            else -> Log.d(TAG, "Value is not 5")
        }

        //for(int i = 0 ; i < 5 ; i++){}
        for(i in 5 downTo 0) {

        }

        tvDisplay.text = "Hello My Class"


    }

    fun setTagValue() : String = "MAIN_ACT"
    fun onClick(view: View) {
        when(view.id) {
            R.id.tvDisplay -> setTagValue()
            else -> {}
        }
    }
}
