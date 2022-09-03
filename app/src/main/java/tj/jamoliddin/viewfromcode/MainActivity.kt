package tj.jamoliddin.viewfromcode

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var content: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        content = findViewById(R.id.content)


        //rootView
        //rootView
        val l = LinearLayout(applicationContext)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(100, 100, 100, 100)
        l.layoutParams = params
        l.orientation = LinearLayout.HORIZONTAL

        //EditText view

        //EditText view
        val e = EditText(applicationContext)
        val paramsEditText = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT)
        paramsEditText.weight = 1f
        e.layoutParams = paramsEditText
        e.hint = "Type new Task"


        // TextView
        val t = TextView(applicationContext)
        val paramsTextView = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT)
        paramsTextView.weight = 1f
        t.layoutParams = paramsTextView
        t.text = "TextView"
        t.setTextColor(Color.GREEN)

        l.addView(e)
        l.addView(t)

        content.addView(l)

    }
}