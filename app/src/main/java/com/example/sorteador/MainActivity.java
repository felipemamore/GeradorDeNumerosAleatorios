package com.example.sorteador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editTextmin, editTextmax;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextmin = findViewById(R.id.editTextmin);
        editTextmax = findViewById(R.id.editTextmax);
        textView = findViewById(R.id.resultado);

    }

    public void sorteia(View view){
        int min, max;

        min = Integer.parseInt((editTextmin.getText().toString()));
        max = Integer.parseInt(editTextmax.getText().toString());
        int result = new Random().nextInt(max-min)+min;
        textView.setText(Integer.toString(result));
    }
}