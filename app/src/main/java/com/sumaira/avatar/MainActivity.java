package com.sumaira.avatar;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface face1=Typeface.createFromAsset(getAssets(), "fonts/Klavika Regular Plain.otf");
        Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/Myriad Pro Regular.ttf");

        TextView setavatar = (TextView) findViewById(R.id.setavatar);
        setavatar.setTypeface(face1,Typeface.BOLD);
        TextView building = (TextView) findViewById(R.id.building);
        building.setTypeface(face1,Typeface.BOLD);

        TextView skip = (TextView) findViewById(R.id.skip);
        skip.setTypeface(face2);
        TextView text = (TextView) findViewById(R.id.text);
        text.setTypeface(face2);
        TextView take = (TextView) findViewById(R.id.take);
        take.setTypeface(face2);
        TextView gallery = (TextView) findViewById(R.id.gallery);
        gallery.setTypeface(face2);
        TextView angry_btn = (TextView) findViewById(R.id.angry_btn);
        angry_btn.setTypeface(face2);

    }
}
