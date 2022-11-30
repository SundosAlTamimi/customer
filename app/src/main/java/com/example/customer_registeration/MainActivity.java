package com.example.customer_registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout first_linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_linear=findViewById(R.id.first_linear);
        first_linear.setOnClickListener(v->{
            Intent intent=new Intent(this,add_customer.class);
            startActivity(intent);
        });
    }
}