package com.example.count_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b1;
    Button b2; Button b3;
    Button b4;

    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.reset);
        b4=findViewById(R.id.toast);

        tv=findViewById(R.id.textcount);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv.setText(""+a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                tv.setText(""+a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                tv.setText(""+a);
            }
        });
        if(savedInstanceState!=null) {
            String s = savedInstanceState.getString("lahari");
            tv.setText(s);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("lahari",tv.getText().toString());
    }

    public void display(View view) {
        Toast.makeText(this, "your count is:"+a, Toast.LENGTH_SHORT).show();
    }
}