package com.example.Evaluacion2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.Evaluacion2.databinding.ActivityMenuBinding
import com.example.Evaluacion2.vistas.OperacionesFragment
import com.example.Evaluacion2.vistas.PerfilFragment

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttomNav.setOnItemSelectedListener {
            try {
                when (it.itemId) {


                    R.id.nav_operaciones-> {
                        val crudFragment = OperacionesFragment()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frameLayout, crudFragment)
                            .addToBackStack(null)
                            .commit()
                        true

                    }
                    R.id.nav_perfil -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frameLayout, PerfilFragment()).commit()
                        true
                    }
                    else -> false
                }
            } catch (e: Exception) {


                e.printStackTrace()
                Toast.makeText(this,
                    "Error Vista" + e.message, Toast.LENGTH_LONG).show()
                false
            }
        }

        binding.buttomNav.setOnItemReselectedListener{

                when (it.itemId) {

                    R.id.nav_operaciones -> Toast.makeText(this,
                        "Vista Dispositivos", Toast.LENGTH_SHORT).show()

                    R.id.nav_perfil -> Toast.makeText(this,
                        "Vista Perfil", Toast.LENGTH_SHORT).show()

                    else -> false
                }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {


        menuInflater.inflate(R.menu.button_nav_menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        try {
            when (item.itemId) {
                R.id.nav_operaciones-> {
                    return true
                }
                R.id.nav_perfil -> {
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this,
                "Error, acción invalida" + e.message, Toast.LENGTH_LONG).show()
            return false
        }
    }
}
