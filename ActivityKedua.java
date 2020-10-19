package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        username = findViewById(R.id.un);
        password = findViewById(R.id.ps);

        Intent i            = getIntent();

        String kiriman1      = i.getStringExtra("username");
        String kiriman2      = i.getStringExtra("password");

        username.setText(String.valueOf(kiriman1));
        password.setText(String.valueOf(kiriman2));
    }

}