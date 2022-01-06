package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Ratings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Ratings.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        myspinner.setAdapter(myadapter);
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
        {  Intent myintent = new Intent(Ratings.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(Ratings.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(Ratings.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(Ratings.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(Ratings.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(Ratings.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(Ratings.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(Ratings.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
