package com.example.lsx.activitylife;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

   private final static String TAG="MainActivity";
    private  EditText edit_info=null;
    public final static String NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edit_info= (EditText) findViewById(R.id.edit_info);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void dial(View v)
    {
        String info=edit_info.getText().toString().trim();
       Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra(NAME,info);
        startActivity(intent);
        //Toast.makeText(this, "单击信息成功",Toast.LENGTH_LONG).show();
       // Toast.makeText(MainActivity.this, "单击信息成功", Toast.LENGTH_SHORT).show();
    }
  
}
