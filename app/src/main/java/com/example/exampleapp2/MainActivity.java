package com.example.exampleapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editname ;
    private EditText edtpass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editname= findViewById(R.id.Editname1);
        edtpass=findViewById(R.id.Editname2);
    }


    public void btnsubmit(View view) {
        String name = editname.getText().toString();
        String pass = edtpass.getText().toString();
        String msg = "name: " + name + " , pass : " + pass ;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}