package cl.awakelab.actividadpracticanueve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageButton botonUno = findViewById(R.id.button1);
        ImageButton botonDos = findViewById(R.id.button2);
        ImageButton botonTres = findViewById(R.id.button3);
        ImageButton botonCuatro = findViewById(R.id.button4);

        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSecondActivity();

            }
        });
        botonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSecondActivity();

            }
        });
        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSecondActivity();

            }
        });
        botonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSecondActivity();

            }
        });
    }

    public void changeSecondActivity() {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}