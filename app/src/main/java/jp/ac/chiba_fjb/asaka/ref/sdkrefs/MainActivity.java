package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, 0, "Menu1").setIcon(R.mipmap.ic_launcher_round);
        menu.add(Menu.NONE, 1, 1, "Menu2").setIcon(R.mipmap.ic_launcher);
        return super.onCreateOptionsMenu(menu);
    }
}
