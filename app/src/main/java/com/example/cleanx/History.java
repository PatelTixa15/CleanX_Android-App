package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
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
        {  Intent myintent = new Intent(History.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(History.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(History.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(History.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(History.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(History.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(History.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(History.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
