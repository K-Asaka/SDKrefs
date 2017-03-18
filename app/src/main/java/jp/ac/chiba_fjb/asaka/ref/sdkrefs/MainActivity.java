package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("LIFECYCLE", "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LIFECYCLE", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LIFECYCLE", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("LIFECYCLE", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("LIFECYCLE", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LIFECYCLE", "onDestory()");
    }
}
