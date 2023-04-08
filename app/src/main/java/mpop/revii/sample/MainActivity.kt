package mpop.revii.sample

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : Activity() {
    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        val base = LinearLayout(this)
        val user = EditText(this)
        val password = EditText(this)

        base.setOrientation(LinearLayout.VERTICAL)

        user.setSingleLine()
        user.setHint("Username")
        password.setSingleLine();
        password.setHint("Password")


        base.addView(user)
        base.addView(password)

        setContentView(base)
    }
}