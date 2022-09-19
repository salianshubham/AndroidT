package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Login_SignIn extends AppCompatActivity {

    public void login(View view){
        ImageView image = (ImageView) findViewById(R.id.login);
        Intent intent = new Intent(Login_SignIn.this,login.class);
        startActivity(intent);
    }

    public void signIn(View view){
        ImageView image = (ImageView) findViewById(R.id.signIn);
        Intent intent = new Intent(Login_SignIn.this,singin.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login_sign_in);
    }
}