package com.example.tejas.weatherapp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity0 extends AppCompatActivity {

            Button button1;
            Button button2;
            Button button3;
            Button button4;
            Button button5;
            Button button6;
            Button button7;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main0);

            addListenerOnButton();
        }

        public void addListenerOnButton() {

            final Context context = this;

            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);


            button1.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity1.class);
                    startActivity(intent);

                }

            });
            button2.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);

                }

            });

            button3.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity3.class);
                    startActivity(intent);

                }

            });

            button4.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity4.class);
                    startActivity(intent);

                }

            });

            button5.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity5.class);
                    startActivity(intent);

                }

            });

            button6.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity6.class);
                    startActivity(intent);

                }

            });

            button7.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    Intent intent = new Intent(context, MainActivity7.class);
                    startActivity(intent);

                }

            });

        }

    }

