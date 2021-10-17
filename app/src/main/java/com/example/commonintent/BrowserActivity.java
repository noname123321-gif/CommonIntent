package com.example.commonintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BrowserActivity extends AppCompatActivity {
    EditText urlEditText;
    Button openButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        getSupportActionBar().setTitle("Web Browser Activity");

        urlEditText = (EditText) findViewById(R.id.urlEditText);
        openButton = (Button) findViewById(R.id.openButton);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = urlEditText.getText().toString();
                Uri web = Uri.parse(url);

                Intent intent =  new Intent(Intent.ACTION_VIEW, web);
                if(url != null){
                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }
                }
                else{
                    Toast.makeText(BrowserActivity.this, "Please enter the URL!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
