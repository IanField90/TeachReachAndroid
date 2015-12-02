package uk.co.ianfield.teachreach.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getFragmentManager().beginTransaction()
                .replace(R.id.container, new HomeFragment())
                .commit();

        setActionBar(toolbar);


    }

}
