package com.final_spii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.final_spii.GlobalApplication.makeToast;

public class SecondaryActivity extends AppCompatActivity {
    private Button remote;
    private Button set_instructions;
    private Button previous_runs;
    private Button dc;
    private Button more;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Buttons are all set
        remote = (Button)findViewById(R.id.remote_control);
        set_instructions = (Button)findViewById(R.id.set_instructions);
        previous_runs = (Button)findViewById(R.id.previous_runs);
        dc = (Button)findViewById(R.id.disconnect);
        more = (Button)findViewById(R.id.more);

        //turn off pi
        remote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Remote Control : ", "REMOTE CONTROL BUTTON PRESSED");
                Intent intent = new Intent(SecondaryActivity.this, remote.class);
                startActivity(intent);
            }
        });

        set_instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(" : ", "SET INSTRUCTIONS BUTTON PRESSED");
                Intent intent = new Intent(SecondaryActivity.this, remote.class);
                startActivity(intent);
            }
        });

        previous_runs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(" : ", "PREVIOUS RUNS BUTTON PRESSED");
                Intent intent = new Intent(SecondaryActivity.this, remote.class);
                startActivity(intent);
            }
        });

        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(" : ", "DISCONNECT BUTTON PRESSED");
                Intent intent = new Intent(SecondaryActivity.this, MainActivity.class);
                makeToast("Disconnecting ...");
                startActivity(intent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(" : ", "MORE BUTTON PRESSED");
                Intent intent = new Intent(SecondaryActivity.this, remote.class);
                startActivity(intent);
            }
        });
    }
}
