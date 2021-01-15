package com.gohool.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView nameText;
    private TextView bioText;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        imageView = (ImageView) findViewById(R.id.petImageViewId);
        nameText = (TextView) findViewById(R.id.nameId);
        bioText = (TextView) findViewById(R.id.bioTextId);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }

    }

    public void setUp(String name, String bio){
        if(name.equals("Roki")){
            //We show dog stuff
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            nameText.setText(name);
            bioText.setText(bio);
        }else if(name.equals("Tomi")){
            //We show cat stuff
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            nameText.setText(name);
            bioText.setText(bio);
        }
    }
}