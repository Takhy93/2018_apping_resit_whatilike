package com.example.mbengue.whatilike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private Button b1 = null;
    private Button b2 = null;
    private Button b3 = null;
    private Button b4 = null;
    private Button b5 = null;
    private Button b6 = null;
    private Button b7 = null;
    private Button b8 = null;
    private ImageButton about = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btpopup1);
        b2 = (Button) findViewById(R.id.btpopup2);
        b3 = (Button) findViewById(R.id.btpopup3);
        b4 = (Button) findViewById(R.id.btpopup4);
        b5 = (Button) findViewById(R.id.btpopup5);
        b6 = (Button) findViewById(R.id.btpopup6);
        b7 = (Button) findViewById(R.id.btpopup7);
        b8 = (Button) findViewById(R.id.btpopup8);
        about = (ImageButton) findViewById(R.id.ImageButton01);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(MainActivity.this, Main2Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity1 = new Intent(MainActivity.this, Main3Activity.class/*activity sur le quel on redirige*/);
                startActivity(secondActivity1);
            }
        });

    }


    public void onClick(View view) {
        if (view.getId() == R.id.btpopup1) {
            b1.setText("A");
        }
        if (view.getId() == R.id.btpopup2) {
            b2.setText("F");
        }
        if (view.getId() == R.id.btpopup3) {
            b3.setText("X");
        }
        if (view.getId() == R.id.btpopup4) {
            b4.setText("1");
        }
        if (view.getId() == R.id.btpopup5) {
            b5.setText("U");
        }
        if (view.getId() == R.id.btpopup6) {
            b6.setText("T");
        }
        if (view.getId() == R.id.btpopup7) {
            b7.setText("H");
        }
        if (view.getId() == R.id.btpopup8) {
            b8.setText("Y");
        }
    }
}