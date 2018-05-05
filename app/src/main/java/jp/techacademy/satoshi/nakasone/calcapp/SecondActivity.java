package jp.techacademy.satoshi.nakasone.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Intent intent = getIntent();
        double str = intent.getDoubleExtra("str",0.0 );


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(str));
    }
}
