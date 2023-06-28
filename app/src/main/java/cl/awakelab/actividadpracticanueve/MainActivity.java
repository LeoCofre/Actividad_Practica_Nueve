package cl.awakelab.actividadpracticanueve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagenUno = R.drawable.image_uno;
    int imagenDos = R.drawable.image_dos;
    int imagenTres = R.drawable.image_tres;
    int imagenCuatro = R.drawable.image_cuatro;

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

        botonUno.setOnClickListener(v -> changeSecondActivity(imagenUno));
        botonDos.setOnClickListener(v -> changeSecondActivity(imagenDos));
        botonTres.setOnClickListener(v -> changeSecondActivity(imagenTres));
        botonCuatro.setOnClickListener(v -> changeSecondActivity(imagenCuatro));
    }

    public void changeSecondActivity(int image) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Clave", image);
        startActivity(intent);
    }
}