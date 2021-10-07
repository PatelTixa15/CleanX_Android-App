package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class RequestPickup extends AppCompatActivity {

    TextView t1;
    String st;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_pickup);


       t1 = (TextView) findViewById(R.id.pick);
       st = getIntent().getExtras().getString("Value");
       t1.setText(st);


        //     Bundle bn = getIntent().getExtras();
    //    String msg = bn.getString("message");
     //   t1.setText(msg);

        Intent intent = getIntent();
        //String text = intent.getStringExtra(Registration.EXTRA_TEXT);
        //int number = intent.getIntExtra(Registration.EXTRA_NUMBER,0);

        //TextView textView1 = (TextView) findViewById(R.id.address);
       //TextView textView2 = (TextView) findViewById(R.id.mobile);

       // textView1.setText(text);
        //textView2.setText("" +number);




    }


 //   @Override
  //  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    //    int id = item.getItemId();
      //  switch (id)
       // {
         //   case R.id.rating:
           //     Toast.makeText(this,"rating clicked", Toast.LENGTH_SHORT).show();
            //    break;
           // case R.id.post:
             //   Toast.makeText(this,"post clicked", Toast.LENGTH_SHORT).show();
               // break;
           // case R.id.history:
             //   Toast.makeText(this,"history clicked", Toast.LENGTH_SHORT).show();
               // break;
           // case R.id.contact:
             //   Toast.makeText(this,"contact clicked", Toast.LENGTH_SHORT).show();
               // break;

       // }

       // return true;
   // }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home)
        {  Intent myintent = new Intent(RequestPickup.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(RequestPickup.this, RequestPickup.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(RequestPickup.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(RequestPickup.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(RequestPickup.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(RequestPickup.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(RequestPickup.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(RequestPickup.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }
}
