package com.example.lsx.activitylife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by lsx on 2016/7/22.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView textshow = null;
    private Button seccond_button=null;
    private EditText mNameEditText=null;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        textshow = (TextView)findViewById(R.id.textshow);
        seccond_button=(Button) findViewById(R.id.second_activity_button);
         mNameEditText = (EditText) findViewById(R.id.second_activity_edit_text);
        String information = getIntent().getStringExtra(MainActivity.NAME);
        //Toast.makeText(SecondActivity.this, information, Toast.LENGTH_SHORT).show();
        textshow.setText(information);
        String name = mNameEditText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("back", name);
        setResult(RESULT_OK, intent);
        finish();


    }

    @Override
    public void onStart() {
        super.onStart();


    }

    @Override
    public void onStop() {
        super.onStop();

    }
}
