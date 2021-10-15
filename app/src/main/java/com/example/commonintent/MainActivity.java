package com.example.commonintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView mapCard, browserCard, mediaCard, noteCard, emailCard, phoneCard, storageCard, messageCard, alarmCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai bao card tu id
        mapCard = (CardView) findViewById(R.id.mapIntent);
        browserCard = (CardView)findViewById(R.id.browserIntent);
        mediaCard = (CardView)findViewById(R.id.mediaIntent);
        noteCard = (CardView)findViewById(R.id.noteIntent);
        emailCard = (CardView)findViewById(R.id.emailIntent);
        phoneCard = (CardView)findViewById(R.id.phoneIntent);
        storageCard = (CardView)findViewById(R.id.storageIntent);
        messageCard = (CardView)findViewById(R.id.messageIntent);
        alarmCard = (CardView)findViewById(R.id.alarmIntent);

        // Set onClick cho moi card
        mapCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        browserCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                startActivity(intent);
            }
        });

        messageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
            }
        });

        browserCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                startActivity(intent);
            }
        });

        mediaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
            }
        });

        noteCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(intent);
            }
        });

        emailCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EmailActivity.class);
                startActivity(intent);
            }
        });

        phoneCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhoneActivity.class);
                startActivity(intent);
            }
        });

        storageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StorageActivity.class);
                startActivity(intent);
            }
        });

        messageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        alarmCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
            }
        });
    }
}