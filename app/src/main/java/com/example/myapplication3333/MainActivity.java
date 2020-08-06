package com.example.myapplication3333;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        button1.setVisibility(View.INVISIBLE);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView image = findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);

        TextView text = findViewById(R.id.status_text_view);
        text.setText("I'm so full");

        Button button = findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);

       Button button1 = findViewById(R.id.button1);
       button1.setVisibility(View.VISIBLE);

        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
    public void eatCookie1(View view) {

        ImageView image = findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.before_cookie);

        TextView text = findViewById(R.id.status_text_view);
        text.setText("I'm so hungry");

        Button button1 = findViewById(R.id.button1);
        button1.setVisibility(View.INVISIBLE);

        Button button = findViewById(R.id.button);
        button.setVisibility(View.VISIBLE);

    }
}