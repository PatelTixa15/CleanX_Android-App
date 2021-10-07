package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void pe(View view){
        Intent mapintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.phonepe.com/en/"));
        startActivity(mapintent);
    }

    public void free(View view){
        Intent mapintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freecharge.in/?utm_source=google&utm_medium=paid&utm_campaign=fc_sok_sem_reach_rma_web_in000_cc000_brand_generic&gclid=CjwKCAjwpqv0BRABEiwA-TySwXz7cMKJ_PzRtMmqnrDDzrWEPPBMpAQebBgKkyTYwTjPCwu3rZaA2hoCg8YQAvD_BwE"));
        startActivity(mapintent);
    }

    public void zon(View view){
        Intent mapintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/"));
        startActivity(mapintent);
    }

    public void tm(View view){
        Intent mapintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/"));
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
        {  Intent myintent = new Intent(Payment.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(Payment.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(Payment.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(Payment.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(Payment.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(Payment.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(Payment.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(Payment.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
