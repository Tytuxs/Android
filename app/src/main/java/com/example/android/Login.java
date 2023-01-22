package com.example.android;

        import android.content.Intent;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import org.w3c.dom.Text;

public class Login extends AppCompatActivity {


    private EditText mUsername;
    private EditText mPassword;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = findViewById(R.id.editTextTextEmailAddress);
        mPassword = findViewById(R.id.editTextTextPassword);
        mLoginButton = findViewById(R.id.loginButton);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsername.getText().toString();
                String password = mPassword.getText().toString();

                if (isValidCredentials(username, password)) {
                    Toast.makeText(Login.this,"VOUS ÊTES BIEN CONNECTÉ",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainMenuActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this,"LA CONNEXION A ÉCHOUÉE!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        Log.i("TRACE", "COUCOU");
        if(username.equals("admin") && password.equals("Adri")){

            Log.i("TRACE", "Connecté");
            /*Intent mainIntent = new Intent(Login.this, MainActivity.class);

            startActivity(mainIntent);
            finish();*/
            return true;
    }else {
            Log.i("TRACE", "NON-Connecté");
            Toast.makeText(Login.this,"LA CONNEXION A ÉCHOUÉE!!!",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}