package com.example.android.dragonlegend.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.android.dragonlegend.R;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripton);

        TextView description, userName;

        description = (TextView)findViewById(R.id.description);

        String dec = getIntent().getStringExtra("fruit_detail");

        description.setText(dec);
    }
}
