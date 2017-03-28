package com.example.jair.butterknifeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.editText)
    EditText edit;

    @Bind(R.id.send_button)
    Button button;

    @Bind(R.id.textView)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.send_button)
    public  void SendText(){
        String txt = edit.getText().toString();
        if(!txt.isEmpty()){
            text.setText(txt);
        }else{
            Toast.makeText(getApplicationContext(),"Ingresa datos",Toast.LENGTH_SHORT).show();
        }
    }
}
