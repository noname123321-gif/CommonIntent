package com.example.commonintent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AlarmActivity extends AppCompatActivity {
    EditText hourEditText, minutesEditText;
    Button alarmButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        getSupportActionBar().setTitle("Alarm Clock Intent");

        hourEditText = (EditText) findViewById(R.id.hourEditText);
        minutesEditText = (EditText) findViewById(R.id.minuteEditText);
        alarmButton = (Button) findViewById(R.id.alarmButton);

        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = Integer.parseInt(hourEditText.getText().toString());
                int minute = Integer.parseInt(minutesEditText.getText().toString());

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);

                if(hour <= 24 && minute <= 60){
                    startActivity(intent);
                }else {
                    Toast.makeText(AlarmActivity.this, "Please enter the valid value!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
