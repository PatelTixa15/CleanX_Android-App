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

public class PasswordActivity1 extends AppCompatActivity {

    private EditText email;
    private Button resetpsw;
    ProgressBar progress;
   private FirebaseAuth firebaseAuth;

   // FirebaseAuth firebaseAuth;
  //  FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password1);

        firebaseAuth = FirebaseAuth.getInstance();
     //   firebaseDatabase = FirebaseDatabase.getInstance();


        email = (EditText)findViewById(R.id.email2);
        resetpsw = (Button) findViewById(R.id.reset);
        progress = findViewById(R.id.main_progressBar);
        firebaseAuth = FirebaseAuth.getInstance();

       /** resetpsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String useremail = email.getText().toString().trim();

                if (useremail.equals("")){
                    Toast.makeText(PasswordActivity1.this,"Please enter your registered email ID",Toast.LENGTH_SHORT).show();

                }
                else {
                    firebaseAuth.sendPasswordResetEmail(useremail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                           if (task.isSuccessful()){
                               Toast.makeText(PasswordActivity1.this,"Password reset email sent !",Toast.LENGTH_SHORT).show();
                              // finish();
                               startActivity(new Intent(PasswordActivity1.this,Login.class));
                           }
                           else {
                               Toast.makeText(PasswordActivity1.this,"Error in sending password reset email",Toast.LENGTH_SHORT).show();
                           }
                        }
                    });
                }

            }
        });*/

        resetpsw.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (email.getText().toString().trim().equals(""))
                {
                    email.setError("Email is Required!!");


                }
                else {

                    progress.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Please check your Email Account , If you want to Reset your password",Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(PasswordActivity1.this, Login.class));
                }
              /**  final String userEmail = resetpsw.getText().toString();
                if (email.getText().toString().trim().equals(""))
                {
                    email.setError("Email is Required!!");


                }
                else {
                    firebaseAuth.sendPasswordResetEmail(userEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(PasswordActivity1.this,"Please check your Email Account , If you want to Reset your password",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(PasswordActivity1.this,Login.class));
                            }
                            else {
                                String message = task.getException().getMessage();
                                Toast.makeText(PasswordActivity1.this,"Error Occured" + message,Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }*/

              /**  else
                {
                    progress.setVisibility(View.VISIBLE);
                    final Task<Void> ResetPassword_successfully = firebaseAuth.sendPasswordResetEmail(email.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progress.setVisibility(View.GONE);
                            // if(task.isSuccessful())
                            //{
                            // startActivity(new Intent(Login.this,About.class));
                            Toast.makeText(getApplicationContext(), "ResetPassword Successfully", Toast.LENGTH_LONG).show();
                            //  if(true) {
                            Intent intent = new Intent(PasswordActivity1.this, Login.class);
                            startActivity(intent);
                            //}
                        }
                    });
                }*/
             }
    });

}
}





