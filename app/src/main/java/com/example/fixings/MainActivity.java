package com.example.fixings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ButtonClick (View view){
        EditText edt1 = (EditText) findViewById(R.id.email);
        EditText edt2 = (EditText) findViewById(R.id.password);

        String email = edt1.getText().toString();
        String password = edt2.getText().toString();

        String oemail="admin";
        String opassword="admin";

        if (email.equals(oemail)&& password.equals(opassword)){
            Intent intent = new Intent(this, menu.class);
            startActivity(intent);

            ProgressDialog mdialog = new ProgressDialog(MainActivity.this);
            mdialog.setMessage("Please wait....");
            mdialog.show();



        }else{
            Toast.makeText(this, "Wrong Email or password", Toast.LENGTH_SHORT).show();
        }

    }
    public  void Sign(View view){
        Intent intent = new Intent(this, Sign_up.class);
        startActivity(intent);
    }
}
