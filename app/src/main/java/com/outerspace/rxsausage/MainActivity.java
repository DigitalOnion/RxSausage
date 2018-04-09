package com.outerspace.rxsausage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button demoButton;
    private int colorIdx = 0;
    private int[] colors = {
            R.color.light_white,
            R.color.light_pink,
            R.color.light_green,
            R.color.light_blue,
            R.color.light_gray,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoButton = findViewById(R.id.button_demo);

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorIdx++;
                if( colorIdx >= colors.length)
                    colorIdx = 0;
                demoButton.setBackgroundColor(
                        MainActivity
                                .this
                                .getBaseContext()
                                .getResources()
                                .getColor(colors[colorIdx], null));
            }
        });
    }
}
