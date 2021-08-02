package com.example.uas_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText textEmail, textPassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textEmail = (EditText) findViewById(R.id.textEmail);
        textPassword = (EditText) findViewById(R.id.textPassword);
        button = (Button)findViewById(R.id.button_click);;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TextEmail = textEmail.getText().toString();
                String TextPassword = textPassword.getText().toString();

                if (TextEmail.equals("raniazahara331@gmail.com") && TextPassword.equals("12345")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomeActivity.this, PostCommentTodo.class);
                    HomeActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                    builder.setMessage("Invalid Username and Password!")
                            .setNegativeButton("OK", null).create().show();
                }
            }
        });
    }
}