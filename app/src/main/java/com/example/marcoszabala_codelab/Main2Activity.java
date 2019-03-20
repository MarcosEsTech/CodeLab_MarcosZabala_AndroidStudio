package com.example.marcoszabala_codelab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton= findViewById(R.id.boton2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Main2Activity.this, MainActivity.class));

            }
        });
    }

    public void goEmail(View view){
        Intent goToEmail = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
        startActivity(goToEmail);
    }

    public void goGit(View view){
        Intent goToGit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/MarcosEsTech"));
        startActivity(goToGit);
    }
}
