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

public class EmailActivity extends AppCompatActivity {

    private EditText emailEditText, subjectEditText, bodyEditText, ccEditText;
    private Button sendButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        getSupportActionBar().setTitle("Email Intent");

        emailEditText = findViewById(R.id.toEditText);
        subjectEditText = findViewById(R.id.subjectEditText);
        bodyEditText = findViewById(R.id.mailEditText);
        sendButton = findViewById(R.id.sendButton);
        ccEditText = findViewById(R.id.CCEditText);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!emailEditText.getText().toString().isEmpty() && !subjectEditText.getText().toString().isEmpty()
                        && !bodyEditText.getText().toString().isEmpty()) {

                    String [] CCs = ccEditText.getText().toString().split(",");

                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{emailEditText.getText().toString()});
                    intent.putExtra(Intent.EXTRA_SUBJECT, subjectEditText.getText().toString());
                    intent.putExtra(Intent.EXTRA_TEXT, bodyEditText.getText().toString());
                    intent.putExtra(Intent.EXTRA_CC, CCs);
                    intent.setData(Uri.parse("mailto:"));

                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    } else {
                        Toast.makeText(EmailActivity.this, "There is no application that support this action",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(EmailActivity.this, "Please fill all the fields",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
