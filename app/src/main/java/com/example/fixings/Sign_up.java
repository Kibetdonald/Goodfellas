package com.example.fixings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void gotopage(View view){
        Intent intent  = new Intent(this, menu.class);
        startActivity(intent);

        Toast.makeText(this, "Sign up successfull", Toast.LENGTH_SHORT).show();

        ProgressDialog mdialog = new ProgressDialog(Sign_up.this);
        mdialog.setMessage("Signing  up...");
        mdialog.show();
    }
}
