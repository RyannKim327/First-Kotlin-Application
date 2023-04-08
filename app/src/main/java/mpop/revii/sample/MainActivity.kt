package mpop.revii.sample

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.view.View.OnClickListener;

class MainActivity : Activity() {
    override fun onCreate(bundle: Bundle?){
        super.onCreate(bundle)
        val base = LinearLayout(this)
        val user = EditText(this)
        val password = EditText(this)
        val login = Button(this)

        base.setOrientation(LinearLayout.VERTICAL)

        user.setSingleLine()
        user.setHint("Username")
        password.setSingleLine();
        password.setHint("Password")
        login.setText("Login")

        login.setOnClickListener(object: OnClickListener{
            override fun onClick(p0: View?) {
                if(user.text.toString().equals("Admin") && password.text.toString().equals(("admin123"))){
                    val alert = AlertDialog.Builder(this@MainActivity)
                    alert.setTitle("Welcome")
                    alert.setMessage("Logged in successfully")
                    alert.setPositiveButton("Continue", null)
                    alert.setCancelable(true)
                    alert.show()
                }else{
                    val alert = AlertDialog.Builder(this@MainActivity)
                    alert.setTitle("Error")
                    alert.setMessage("Username or password not match")
                    alert.setPositiveButton("Continue", null)
                    alert.setCancelable(true)
                    alert.show()
                }
            }
        })

        base.addView(user)
        base.addView(password)
        base.addView(login)

        setContentView(base)
    }
}