package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView valasztott;
    private ImageView gepvalaszott;
    private TextView embergyozelem;
    private TextView gepgyozelem;
    private Button ko;
    private Button papir;
    private Button ollo;
    private Toast veresegGyozelem;
    private AlertDialog.Builder Vegeredmeny;
    public int kopapirvagyollo=0;
    public int emberwin=0;
    public int gepwin=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztott.setImageResource(R.drawable.rock);
                kopapirvagyollo=1;
                jatek();
            }
        });
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztott.setImageResource(R.drawable.paper);
                kopapirvagyollo=2;
                jatek();
            }
        });
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztott.setImageResource(R.drawable.scissors);
                kopapirvagyollo=3;
                jatek();
            }
        });

    }

    public void jatek(){
        if (kopapirvagyollo==1){
            final int min = 1;
            final int max = 3;
            final int random = new Random().nextInt((max - min) + 1) + min;
            if (random==kopapirvagyollo){
                gepvalaszott.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this,
                        "DÖNTETLEN", Toast.LENGTH_SHORT).show();
            }
            if (random==3){
                gepvalaszott.setImageResource(R.drawable.paper);
                Toast.makeText(MainActivity.this,
                        "GYŐZTÉL", Toast.LENGTH_SHORT).show();
                emberwin++;
                embergyozelem.setText(String.format("%d",emberwin));
            }
            if (random==2){
                gepvalaszott.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this,
                        "VESZTETTÉL", Toast.LENGTH_SHORT).show();
                gepwin++;
                gepgyozelem.setText(String.format("%d",gepwin));            }
        }

        if (kopapirvagyollo==2){
            final int min = 1;
            final int max = 3;
            final int random = new Random().nextInt((max - min) + 1) + min;
            if (random==kopapirvagyollo){
                gepvalaszott.setImageResource(R.drawable.paper);
                Toast.makeText(MainActivity.this,
                        "DÖNTETLEN", Toast.LENGTH_SHORT).show();
            }
            if (random==1){
                gepvalaszott.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this,
                        "GYŐZTÉL", Toast.LENGTH_SHORT).show();
                emberwin++;
                embergyozelem.setText(String.format("%d",emberwin));
            }
            if (random==3){
                gepvalaszott.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this,
                        "VESZTETTÉL", Toast.LENGTH_SHORT).show();
                gepwin++;
                gepgyozelem.setText(String.format("%d",gepwin));            }
        }

        if (kopapirvagyollo==3){
            final int min = 1;
            final int max = 3;
            final int random = new Random().nextInt((max - min) + 1) + min;
            if (random==kopapirvagyollo){
                gepvalaszott.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this,
                        "DÖNTETLEN", Toast.LENGTH_SHORT).show();
            }
            if (random==2){
                gepvalaszott.setImageResource(R.drawable.paper);
                Toast.makeText(MainActivity.this,
                        "GYŐZTÉL", Toast.LENGTH_SHORT).show();
                emberwin++;
                embergyozelem.setText(String.format("%d",emberwin));
            }
            if (random==1){
                gepvalaszott.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this,
                        "VESZTETTÉL", Toast.LENGTH_SHORT).show();
                gepwin++;
                gepgyozelem.setText(String.format("%d",gepwin));            }
        }
    }

    public void jatekvege(){

    }

    public void init(){
        valasztott=findViewById(R.id.valasztott);
        gepvalaszott=findViewById(R.id.gepvalaszott);
        embergyozelem=findViewById(R.id.embergyozelem);
        gepgyozelem=findViewById(R.id.gepgyozelem);
        ko=findViewById(R.id.ko);
        papir=findViewById(R.id.papir);
        ollo=findViewById(R.id.ollo);
    }
}