package ca.jfmcode.pass_note.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.jfmcode.pass_note.Object.OnConfigFinished;
import ca.jfmcode.pass_note.R;
import ca.jfmcode.pass_note.Systeme.PassNoteConfig;

public class LaunchActivity extends AppCompatActivity {

    private static final Class<?> NEXTCLASS = MainActivity.class; //to later implement ads activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

    }

    @Override
    protected void onStart() {
        super.onStart();

        PassNoteConfig.getInstance().init(LaunchActivity.this, new OnConfigFinished() {
            @Override
            public void finished() {
                startActivity(new Intent(LaunchActivity.this, NEXTCLASS));
            }
        });
    }
}
