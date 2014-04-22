package br.ufg.inf.fs.android.a02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by fabio_000 on 22/04/2014.
 */
public class TerceiraActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceira);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_terceira, menu);
        return true;
    }
}