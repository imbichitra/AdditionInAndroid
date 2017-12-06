package com.example.bpradhan.addnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AddNo(View v){
        EditText tx1=(EditText)findViewById(R.id.txtNumber1);
        EditText tx2=(EditText)findViewById(R.id.txtNumber2);
        TextView tv=(TextView)findViewById(R.id.txt);
        int num1=Integer.parseInt(tx1.getText().toString());
        int num2=Integer.parseInt(tx2.getText().toString());
        int sum=num1+num2;
        Toast.makeText(this, "Answer is"+sum, Toast.LENGTH_SHORT).show();
        tv.setText("Answer :"+String.valueOf(sum));
    }
}
