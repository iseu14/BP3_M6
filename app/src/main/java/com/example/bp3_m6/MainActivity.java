package com.example.bp3_m6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMoveActivity =
                findViewById(R.id.btn_activity2_main);
        btnMoveActivity.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_activity2_main) {
            Intent moveIntent = new
                    Intent(MainActivity.this, MainActivity2.class);
            startActivity(moveIntent);
        }
    }
}
