package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityKetiga extends AppCompatActivity implements View.OnClickListener{

    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);
        reset = findViewById(R.id.button3);

        reset.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Toast.makeText(ActivityKetiga.this, "Password berhasil di reset!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}