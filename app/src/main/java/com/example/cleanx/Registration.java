package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

//import com.google.firebase.auth.FirebaseAuthException;
//import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;

public class Registration extends AppCompatActivity {

    private EditText name,email1,address1,city1,area1, pincode1 ,company1,number,psw,con;
    private Button register1,loginuser;
    ProgressBar progress;

    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
   // private FirebaseAuth firebaseAuth;
   // private DatabaseHelper databaseHelper;
  //  private ArrayList<String> arrayList;
   // private FirebaseAuthException firebaseAuthException;
    //private FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider;

  //  EditText ed1;
   // String message;
   // public static final String EXTRA_TEXT = "com.example.cleanx.example.EXTRA_TEXT";
    //public static final String EXTRA_NUMBER = "com.example.cleanx.example.EXTRA_NUMBER";

   // private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();


        //  firebaseAuth = FirebaseAuth.getInstance();

        name = (EditText)findViewById(R.id.fullname);
        email1 = (EditText)findViewById(R.id.email);
        address1 = (EditText)findViewById(R.id.msg1);
        city1 = (EditText)findViewById(R.id.city);
        area1 = (EditText)findViewById(R.id.area);
        pincode1 = (EditText)findViewById(R.id.pin);
        company1 = (EditText)findViewById(R.id.company);
        number = (EditText)findViewById(R.id.mobile);
        psw = (EditText)findViewById(R.id.password);
        con = (EditText)findViewById(R.id.conf);
        register1 = (Button) findViewById(R.id.register);
        loginuser = (Button) findViewById(R.id.user_login);
        progress = findViewById(R.id.main_progress);




      //  databaseHelper = new DatabaseHelper(this);

     /**   register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    // upload data to database
                    String user_email = email1.getText().toString().trim();

              // getUserRecord();

                    Intent intent = new Intent(Registration.this, Login.class);
                    String st = address1.getText().toString();
                    intent.putExtra("Value",st);
                    startActivity(intent);

             //     databaseHelper.addStudentDetail(name.getText().toString());
                   //name.setText("");
                    Toast.makeText(Registration.this, "Stored Successfully!", Toast.LENGTH_SHORT).show();



                }

           }
        }); */

        register1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (name.getText().toString().trim().equals(""))
                {
                    name.setError("Name is Required!!");
                }
                else if (email1.getText().toString().trim().equals(""))
                {
                    email1.setError("Email is Required!!");
                }
                else if (address1.getText().toString().trim().equals(""))
                {
                    address1.setError("Address is Required!!");
                }
                else if (city1.getText().toString().trim().equals(""))
                {
                    city1.setError("City is Required!!");
                }
                else if (area1.getText().toString().trim().equals(""))
                {
                    area1.setError("Area is Required!!");
                }
                else if (pincode1.getText().toString().trim().equals(""))
                {
                    pincode1.setError("Pincode is Required!!");
                }
                else if (number.getText().toString().trim().equals(""))
                {
                    number.setError("Number is Required!!");
                }
                else if (psw.getText().toString().trim().equals(""))
                {
                    psw.setError("Password is Required!!");
                }
                else if (con.getText().toString().trim().equals(""))
                {
                    con.setError("Confirm Password is Required!!");
                }
                else
                {
                    progress.setVisibility(View.VISIBLE);
                    firebaseAuth.signInWithEmailAndPassword(email1.getText().toString(),psw.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                    {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            progress.setVisibility(View.GONE);
                            // if(task.isSuccessful())
                            //{
                            // startActivity(new Intent(Login.this,About.class));
                            Toast.makeText(getApplicationContext(),"Register Successfully",Toast.LENGTH_LONG).show();

                           // Intent intent = null;
                            //String st = address1.getText().toString();
                            //intent.putExtra("Value",st);
                            //  if(true) {
                         //   Intent intent = new Intent(Registration.this, Userlogin.class);
                           // startActivity(intent);
                            //}
                            //}

                            //else
                            // {
                            //   Toast.makeText(getApplicationContext(),"Invalid Credentials or Please Register first",Toast.LENGTH_LONG).show();
                            //}
                        }
                    });
                }
            }
        });

        loginuser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });

    }



   /** private  Boolean validate(){
       Boolean result = false;
      String n1 = name.getText().toString();
       String e2 = email1.getText().toString();
      String add1 = address1.getText().toString();
        String c1 = city1.getText().toString();
        String a1 = area1.getText().toString();
       String p1 = pincode1.getText().toString();
        String comp1 = company1.getText().toString();
        String num1 = number.getText().toString();
       String psw1 = psw.getText().toString();
       String r1 = con.getText().toString();

       if (n1.isEmpty() && e2.isEmpty() && add1.isEmpty() && c1.isEmpty() && a1.isEmpty() && p1.isEmpty() && comp1.isEmpty() && num1.isEmpty() && psw1.isEmpty() && r1.isEmpty()  ){
           Toast.makeText(this,"Please enter all the details", Toast.LENGTH_SHORT).show();
            }

       else {
           result = true;

            }
       return  result;
    } */

   /** private void getUserRecord()
    {
        final String n1,e2,add1,c1,a1,p1,comp1,num1,psw1,r1;
        n1 = name.getText().toString().trim();
        e2 = email1.getText().toString().trim();
        add1 = address1.getText().toString().trim();
        c1 = city1.getText().toString().trim();
        a1 = area1.getText().toString().trim();
        p1 = pincode1.getText().toString().trim();
        comp1 = company1.getText().toString().trim();
        num1 = number.getText().toString().trim();
        psw1 = psw.getText().toString().trim();
        r1 = con.getText().toString().trim();

        if (n1.equals(""))
        {   name.setError("Name is Required!!");
        }
        else if (e2.equals(""))
        {   email1.setError("Email is Required!!");
        }
        else if (add1.equals(""))
        {   address1.setError("Address is Required!!");
        }
        else if (c1.equals(""))
        {   city1.setError("City is Required!!");
        }
        else if (a1.equals(""))
        {   area1.setError("Area is Required!!");
        }
        else if (p1.equals(""))
        {   pincode1.setError("Pincode is Required!!");
        }
        else if (comp1.equals(""))
        {   company1.setError("Company is Required!!");
        }
        else if (num1.equals(""))
        {   number.setError("Mobile No. is Required!!");
        }
        else if (psw1.equals(""))
        {   psw.setError("Password is Required!!");
        }
        else if (r1.equals(""))
        {   con.setError("Please ReEnter Password!!");
        }
        else
        {
            progress.setVisibility(View.VISIBLE);
            firebaseAuth.createUserWithEmailAndPassword(e2,psw1).addOnCompleteListener(new OnCompleteListener<AuthResult>()
            {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task)
                {
                    progress.setVisibility(View.GONE);
                    if(task.isSuccessful())
                    {
                        NormalUser un = new NormalUser( n1,e2,add1,c1,a1,p1,comp1,num1,psw1,r1);
                        FirebaseDatabase.getInstance().getReference("Normal User")
                                .child(firebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(un).addOnCompleteListener(new OnCompleteListener<Void>()
                        {
                            @Override
                            public void onComplete(@NonNull Task<Void> task)
                            {
                                Toast.makeText(Registration.this,"Registered Successfully, Please Login", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Something went wrong! Please try again.",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

    }*/
}
