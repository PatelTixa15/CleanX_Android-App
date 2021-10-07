package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

public class AddPost extends AppCompatActivity {

    private EditText e1,e2,e3,e4,e5;
    private Button b1,b2;
    private CheckBox c1,c2,c3;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
        setupUIViews();

        Spinner myspinner = (Spinner) findViewById(R.id.type);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(AddPost.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.types));
        myadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        myspinner.setAdapter(myadapter);

        Spinner myspinner1 = (Spinner) findViewById(R.id.time);

        ArrayAdapter<String> myadapter1 = new ArrayAdapter<String>(AddPost.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.slot));
        myadapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        myspinner1.setAdapter(myadapter1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    // upload data to database
                    String user_email = e2.getText().toString().trim();

                    Intent intent = new Intent(AddPost.this, Home.class);
                 //   String st = address1.getText().toString();
                  //  intent.putExtra("Value",st);
                   startActivity(intent);
                   finish();

                    //      openActivity2();

                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().trim().equals("")) {
                    e1.setError("Name is Required!!");
                } else if (e2.getText().toString().trim().equals("")) {
                    e2.setError("Mobile No. is Required!!");
                } else if (e3.getText().toString().trim().equals("")) {
                    e3.setError("Address is Required!!");
                } else if (e4.getText().toString().trim().equals("")) {
                    e4.setError("Date is Required!!");
                } else if (c1.getText().toString().trim().equals("")) {
                    c1.setError("Quantity is Required!!");
                } else if (e5.getText().toString().trim().equals("")) {
                    e5.setError("Exact Amount of Waste is Required!!");
                }

                else
                {
                    progress.setVisibility(View.VISIBLE);
                //    progress.setVisibility(View.GONE);
                    AlertDialog.Builder builder = new AlertDialog.Builder(AddPost.this);
                    builder.setCancelable(true);
                    builder.setTitle("Message");
                    builder.setMessage("Submitted Successfully!!!");

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                         }
                });
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        b1.setVisibility(View.VISIBLE);
                    }
                });
                    builder.show();
                    progress.setVisibility(View.GONE);

            }
            }
        });

    }
            private void setupUIViews(){
                e1 = (EditText)findViewById(R.id.company1);
                e2 = (EditText)findViewById(R.id.no1);
                e3 = (EditText)findViewById(R.id.address1);
                e4 = (EditText)findViewById(R.id.date);
                c1 = (CheckBox) findViewById(R.id.checkBox);
             //   c2 = (CheckBox) findViewById(R.id.checkBox1);
                //  c3 = (CheckBox) findViewById(R.id.checkBox2);
                e5 = (EditText)findViewById(R.id.quantity);
                b1 = (Button) findViewById(R.id.button1);
                b2 = (Button) findViewById(R.id.button2);
                progress = findViewById(R.id.main_progress1);


            }

            private  Boolean validate(){
                Boolean result = false;
                String n1 = e1.getText().toString();
                String n2 = e2.getText().toString();
                String n3 = e3.getText().toString();
                String n4 = e4.getText().toString();
                String a1 = c1.getText().toString();
                String n5 = e5.getText().toString();
           //     String a2 = c2.getText().toString();
           //     String a3 = c3.getText().toString();


                if (n1.isEmpty() && n2.isEmpty() && n3.isEmpty() && n4.isEmpty() && a1.isEmpty()&& n5.isEmpty()){
                    Toast.makeText(this,"Please enter all the details", Toast.LENGTH_SHORT).show();
                }
                else {
                    result = true;

                }
                return  result;
            }

            public void cancel(){
                //  EditText editText1 = (EditText) findViewById(R.id.address);
                // String text = editText1.getText().toString();

                //  EditText editText2 = (EditText) findViewById(R.id.mobile);
                //int number = Integer.parseInt(editText2.getText().toString());
                Intent intent = new Intent(this, Home.class);
                //intent.putExtra(EXTRA_TEXT, text);
                //intent.putExtra(EXTRA_NUMBER, number);
                startActivity(intent);

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
        {  Intent myintent = new Intent(AddPost.this, Home.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pick)
        {  Intent myintent = new Intent(AddPost.this, Address.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.detail)
        {  Intent myintent = new Intent(AddPost.this, AddPost.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.rating)
        {  Intent myintent = new Intent(AddPost.this, Ratings.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.pay)
        {  Intent myintent = new Intent(AddPost.this, Payment.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.contact)
        {  Intent myintent = new Intent(AddPost.this, Contact.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.history)
        {  Intent myintent = new Intent(AddPost.this, History.class);
            startActivity(myintent);
            return  false;
        }
        if (id == R.id.logout)
        {  Intent myintent = new Intent(AddPost.this, Logout.class);
            startActivity(myintent);
            return  false;
        }

        return super.onOptionsItemSelected(item);
    }



}
