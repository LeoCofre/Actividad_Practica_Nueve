package cl.awakelab.actividadpracticanueve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListener();

        Intent intent = getIntent();
        int idImagen = intent.getIntExtra("image", 0);
        ImageButton imgSecond = findViewById(R.id.imageSecond);
        imgSecond.setImageResource(idImagen);
    }

    private void initListener() {

        Button botonVolver = findViewById(R.id.buttonBack);
        botonVolver.setOnClickListener(v -> onBackPressed());
    }


}