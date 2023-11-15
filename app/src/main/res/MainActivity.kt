import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtLogin = findViewById<EditText>(R.id.txtLogin)
        val editPass = findViewById<EditText>(R.id.editPass)
        val buttonInicioSesion = findViewById<Button>(R.id.button_inicio_sesion)

        buttonInicioSesion.setOnClickListener {
            val usuario = txtLogin.text.toString()
            val contraseña = editPass.text.toString()

            if (usuario == "admin" && contraseña == "1234") {
                // Las credenciales son correctas, puedes redirigir al usuario a la actividad del menú.
                // Reemplaza "ButtonNavMenuActivity" con el nombre correcto de tu actividad del menú.
                val intent = Intent(this, ButtonNavMenuActivity::class.java)
                startActivity(intent)
            } else {
                // Las credenciales son incorrectas, muestra un mensaje de error o toma la acción adecuada.
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
