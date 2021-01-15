package com.gohool.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catId);
        dogView = (ImageView) findViewById(R.id.dogId);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.catId :
                //Go to second activity
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name","Tomi");
                catIntent.putExtra("bio","Great cat. Loves people and meows a lot.");
                startActivity(catIntent);
                //Toast.makeText(MainActivity.this,"Cat",Toast.LENGTH_LONG).show();
                break;
            case R.id.dogId :
                //Go to second activity
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name","Roki");
                dogIntent.putExtra("bio","Great dog. Loves people and barks a lot.");
                startActivity(dogIntent);
                //Toast.makeText(MainActivity.this,"Dog",Toast.LENGTH_LONG).show();
                break;
        }

    }
}