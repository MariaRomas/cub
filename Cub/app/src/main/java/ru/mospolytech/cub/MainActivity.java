package ru.mospolytech.cub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final Random rand = new Random();
    TextView answer;
    Button cub6;
    Button cub10;
    Button cub15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = findViewById(R.id.answer);
        cub6 = findViewById(R.id.cub6);
        cub10 = findViewById(R.id.cub10);
        cub15  = findViewById(R.id.cub15);

        cub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(String.valueOf(rand.nextInt(6)+1));
            }
        });
        cub10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(String.valueOf(rand.nextInt(10)+1));
            }
        });
        cub15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(String.valueOf(rand.nextInt(15)+1));
            }
        });
    }
}
