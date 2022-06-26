package com.example.tictactoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    Button reloadAgain;
    TextView playerOneName,playerTwoName;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        reloadAgain = findViewById(R.id.reloadBtn);
        constraintLayout = findViewById(R.id.constraintLayout);

        reloadAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playerOneName = findViewById(R.id.plOne);
                playerTwoName = findViewById(R.id.plTwo);

                String name1 = getIntent().getStringExtra("keyname1");
                String name2 = getIntent().getStringExtra("keyname2");

                playerOneName.setText(name1);
                playerTwoName.setText(name2);

                Intent intent = new Intent(WinActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}