package com.example.android;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username =(TextView) findViewById(R.id.editTextTextEmailAddress);
        TextView password =(TextView) findViewById(R.id.editTextTextPassword);

        Button loginButton = (Button) this.findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("Adri")){
                    Toast.makeText(Login.this,"VOUS ÊTES BIEN CONNECTÉ",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login.this,"LA CONNEXION A ÉCHOUÉE!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}