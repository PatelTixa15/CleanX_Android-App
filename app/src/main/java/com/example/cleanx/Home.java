package com.example.cleanx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout gal = findViewById(R.id.gal);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i=0 ; i<6 ; i++){
           View view = inflater.inflate(R.layout.item, gal, false);
            TextView textView = view.findViewById(R.id.tv);
            textView.setText("Item "+1);

            ImageView imageView = view.findViewById(R.id.img);
           // imageView.setImageResource(R.drawable.img2);
           // imageView.setImageResource(R.drawable.img3);
           // imageView.setImageResource(R.drawable.img4);
           imageView.setImageResource(R.mipmap.img2);
            gal.addView(view);
      }
        request = (Button)findViewById(R.id.req);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, AddPost.class);
                startActivity(intent);
                //  finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home)
        {  Intent myintent = new Intent(Home.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(Home.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(Home.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(Home.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(Home.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(Home.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(Home.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
