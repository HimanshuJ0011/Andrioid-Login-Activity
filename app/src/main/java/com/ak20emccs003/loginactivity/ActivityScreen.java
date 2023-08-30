package com.ak20emccs003.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityScreen extends AppCompatActivity {
    EditText txt_email;
    EditText txt_pswd;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        txt_email=findViewById(R.id.txt_email);
        txt_pswd=findViewById(R.id.txt_pswd);
        login_btn=findViewById(R.id.login_btn);

        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email=txt_email.getText().toString();
                        String pswd=txt_pswd.getText().toString();
                        if(email.equals("test") && pswd.equals("test")){
                            Toast.makeText(getApplicationContext(), "Logging In...", Toast.LENGTH_LONG).show();
                            finish();
                            startActivity(new Intent(ActivityScreen.this, FinalActivity.class));
                        }else{
                            Toast.makeText(getApplicationContext(), "Incorrect Credentials...", Toast.LENGTH_LONG).show();
                            txt_email.setText("");
                            txt_pswd.setText("");
                        }
                    }
                }
        );

    }
}