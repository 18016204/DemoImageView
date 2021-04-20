package sg.edu.rp.c346.id18016204.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
// Declare the ImageView object called ivDay2
    ImageView ivDay2;
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the imageview obj and assign to ivday2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        //set the image
        ivDay2.setImageResource(R.drawable.day2);


        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        //set the image
        ivDay3.setImageResource(R.drawable.day3);


        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        //set the image
        ivDay4.setImageResource(R.drawable.day4);


        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        //set the image
        ivDay5.setImageResource(R.drawable.day5);
    }
}