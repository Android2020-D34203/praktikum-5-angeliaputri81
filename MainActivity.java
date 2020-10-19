package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.user);
        password = findViewById(R.id.pass);
    }

    public void login(View view){
        Intent i = new Intent(this, ActivityKedua.class);

        String user = username.getText().toString();
        String pass = password.getText().toString();

        i.putExtra("username", user);
        i.putExtra("password", pass);

        startActivity(i);
    }

    public void forget(View view){
        Intent i = new Intent(this, ActivityKetiga.class);

//        String user = username.getText().toString();
//        String pass = password.getText().toString();
//
//        i.putExtra("username", user);
//        i.putExtra("password", pass);

        startActivity(i);
    }
}