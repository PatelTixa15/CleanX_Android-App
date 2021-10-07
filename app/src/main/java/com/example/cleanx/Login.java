package com.example.cleanx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    private EditText et1,et2;
    private TextView forgotpsw;
    private Button login2;
    ProgressBar progress;

    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();

        et1 = (EditText)findViewById(R.id.user_email);
        et2 = (EditText)findViewById(R.id.pass);
        login2 = (Button)findViewById(R.id.login1);
        progress = findViewById(R.id.main_progressBar);

        forgotpsw = (TextView)findViewById(R.id.forgot);

        forgotpsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, PasswordActivity1.class);
                startActivity(intent);

            }
        });



        login2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (et1.getText().toString().trim().equals(""))
                {
                    et1.setError("Email is Required!!");
                }
                else if (et2.getText().toString().trim().equals(""))
                {
                    et2.setError("Password is Required!!");
                }
                else
                {
                    progress.setVisibility(View.VISIBLE);
                    firebaseAuth.signInWithEmailAndPassword(et1.getText().toString(),et2.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                    {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            progress.setVisibility(View.GONE);
                           // if(task.isSuccessful())
                            //{
                               // startActivity(new Intent(Login.this,About.class));
                                Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
                              //  if(true) {
                                    Intent intent = new Intent(Login.this, Userlogin.class);
                                    startActivity(intent);
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

    }




}
