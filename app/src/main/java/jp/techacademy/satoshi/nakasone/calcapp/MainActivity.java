package jp.techacademy.satoshi.nakasone.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText mEditText;
    EditText mEditText2 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);


        mEditText = (EditText) findViewById(R.id.editText);
        mEditText2 = (EditText) findViewById(R.id.editText2);



    }


    @Override
    public void onClick(View v) {
        String str = (mEditText.getText().toString());
        String str2 = (mEditText2.getText().toString());

        if(str.length()==0||str2.length()==0){
            Toast.makeText(getApplicationContext(), "数値を入力して下さい", Toast.LENGTH_LONG).show();
            return;
        }



        double n = Double.parseDouble(str);
        double m = Double.parseDouble(str2);
        double i = 0;

        if (v.getId() == R.id.button1) {
            i = n + m;
        } else if (v.getId() == R.id.button2) {
            i = n - m;
        } else if (v.getId() == R.id.button3) {
            i = n * m;
        } else if (v.getId() == R.id.button4) {
            i = n / m;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("str", i);
        startActivity(intent);




    }

}