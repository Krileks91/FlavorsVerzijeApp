package com.ftninformatika.flavors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.flavorsverzijeapp.R;
import com.example.flavorsverzijeapp.SecondActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onClick(View view){
        Intent pokreni = new Intent(this, SecondActivity.class);
        startActivity(pokreni);
    }
    public void onKlikniMe(View view){
        Toast.makeText(this, "Ovo je demo verzija", Toast.LENGTH_SHORT).show();
    }
}