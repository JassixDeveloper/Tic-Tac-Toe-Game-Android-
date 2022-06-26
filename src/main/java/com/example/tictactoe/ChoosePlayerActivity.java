package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChoosePlayerActivity extends AppCompatActivity {

    EditText one,two;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_player);

        one = (EditText) findViewById(R.id.playerone);
        two = (EditText) findViewById(R.id.playertwo);
    }
    public void start(View v){
        String a = one.getText().toString();
        String b = two.getText().toString();

        if (a.isEmpty() && b.isEmpty())
        {
            Toast.makeText(this, "Fill in Required Entry Fields", Toast.LENGTH_SHORT).show();
        }
        else
        {
            button = (Button) findViewById(R.id.startGame);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name1 = one.getText().toString();
                    String name2 = two.getText().toString();
                    Intent intent = new Intent(ChoosePlayerActivity.this,MainActivity.class);
                    intent.putExtra("keyname1",name1);
                    intent.putExtra("keyname2",name2);
                    startActivity(intent);
                }
            });
        }
    }
}