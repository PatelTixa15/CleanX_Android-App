package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void map1(View view){
        Intent mapintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.0752256,72.5614592/vishwakarma+government+engineering+college/@23.0914125,72.5596902,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x395e83c959d4de6f:0x748d0828c02cf9fa!2m2!1d72.5949187!2d23.1069404"));
        startActivity(mapintent);
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
        {  Intent myintent = new Intent(Contact.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(Contact.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(Contact.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(Contact.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(Contact.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(Contact.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(Contact.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(Contact.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
