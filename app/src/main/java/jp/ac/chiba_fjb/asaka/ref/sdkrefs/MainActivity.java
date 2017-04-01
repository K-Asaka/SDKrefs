package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // トーストの表示
        Toast.makeText(this, "トースト表示", Toast.LENGTH_LONG).show();

    }
}
