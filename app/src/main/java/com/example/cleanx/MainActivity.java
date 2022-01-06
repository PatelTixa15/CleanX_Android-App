package com.example.cleanx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.login);
        button = (Button) findViewById(R.id.register2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login1();
            }
        });

    }
    public void Login(){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);

    }
    public void Login1(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

    }

}
