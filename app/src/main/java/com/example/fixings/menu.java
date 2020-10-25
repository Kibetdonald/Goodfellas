package com.example.fixings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,R.id.navigation_offers,R.id.navigation_cart)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        Button btn =(Button)findViewById(R.id.submit_btn);
    }
    public void add(View view){
        Intent intent = new Intent(this, details.class);
        startActivity(intent);
    }

    public void submit_clicker(View view) {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(menu.this);
        alertdialog.setIcon(R.drawable.ic_shopping_cart_black_24dp);
        alertdialog.setTitle("One more step");
        alertdialog.setMessage("Enter your address");
        alertdialog.setCancelable(false);

        LayoutInflater inflater = LayoutInflater.from(this);
        View layoutin = inflater.inflate(R.layout.activity_cart_fragment, null);

        EditText edtcomment =(EditText)layoutin.findViewById(R.id.addresss);
        alertdialog.setView(layoutin);



        alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(menu.this, "Order placed successfully", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(menu.this, "Order Cancelled", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = alertdialog.create();
        dialog.show();


    }
    public void changepaas(View view){
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(menu.this);
        alertdialog.setIcon(R.drawable.ic_security_black_24dp);
        alertdialog.setTitle("Fill all the spaces!!");
        alertdialog.setMessage("Change password!!");
        alertdialog.setCancelable(false);

        LayoutInflater inflater = LayoutInflater.from(this);
        View layoutin = inflater.inflate(R.layout.activity_changepass, null);


        alertdialog.setView(layoutin);

        alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(menu.this, "Password changes successfully", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(menu.this, "Password change Cancelled", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = alertdialog.create();
        dialog.show();




    }
    public void openOrders(View view){
        Intent intent = new Intent(this,myorders.class);
        startActivity(intent);
    }
}
