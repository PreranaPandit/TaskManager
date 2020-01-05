package com.example.prerana.taskmanager.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.prerana.taskmanager.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //will hide the title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title bar
        getSupportActionBar().hide();
        //enable full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sign_up);
    }
}
