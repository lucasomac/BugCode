package br.com.lucolimac.mywallet.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.lucolimac.mywallet.R
import br.com.lucolimac.mywallet.domain.Usuario
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Click in button login
        btnLogin.setOnClickListener {
            callMain(getInformationUser())
        }

        //Click in textView cadastrar
        tvCadastrar.setOnClickListener {
            callCadastro()
        }

    }

    //Pega as informações do usuario
    fun getInformationUser(): Usuario {
        val username = edUserName.text.toString()
        val senha = edPassword.text.toString()

        return Usuario(1, username, senha)
    }

    //Chama MainActivity
    fun callMain(usuario: Usuario) {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }

    //Chama CadastroActivity
    fun callCadastro() {
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}