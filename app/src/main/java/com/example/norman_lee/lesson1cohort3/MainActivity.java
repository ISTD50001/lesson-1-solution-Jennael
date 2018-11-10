package com.example.norman_lee.lesson1cohort3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;


//TODO 1.1 Put in the images in the drawables folder
//TODO 1.2 Go to activity_main.xml and put in the layout

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images;
    Button charaButton;
    Button firstImgButton;
    ImageView charaImage;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // called when the activity is first launched
        // e.g. when user clicks on your app icon.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1.3 Instantiate an ArrayList object
        images = new ArrayList<>();

        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.doraemon);
        images.add(R.drawable.dory);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.garfield);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.marinabayotter);
        images.add(R.drawable.nemo);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.totoro);
        images.add(R.drawable.wolverine);
        images.add(R.drawable.yoda);

        //TODO 1.5 Get references to charaButton and charaImage using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);

        //TODO 1.6 For charaButton, invoke the setOnClickListenerMethod (3 methods)
        //TODO 1.7 Create an anonymous class which implements View.OnClickListener
        //TODO 1.8 Write code to randomly select an image ID from the ArrayList and display it in the ImageView

        //method2: anonymous class defined in the input to setOnClickListener
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = count % images.size();
                count = count + 1;
                int id = images.get(index);
                charaImage.setImageResource(id);

            }
        });

        //TODO 1.9 [On your own] Create another Button to always display the first image

        firstImgButton = findViewById(R.id.firstImgButton);

        firstImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = images.get(0);
                charaImage.setImageResource(id);

            }
        });

    }
}
