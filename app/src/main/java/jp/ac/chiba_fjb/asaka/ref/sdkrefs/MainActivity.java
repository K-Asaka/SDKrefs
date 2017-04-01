package jp.ac.chiba_fjb.asaka.ref.sdkrefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, Menu.NONE, "Menu1");
        menu.add(Menu.NONE, 1, Menu.NONE, "Menu2");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "Menu1", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Menu2", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
