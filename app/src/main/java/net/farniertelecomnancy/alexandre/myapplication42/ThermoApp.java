package net.farniertelecomnancy.alexandre.myapplication42;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by alexandre on 04/08/2015.
 */
public class ThermoApp extends ActionBarActivity{
    Typeface lcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thermo_app);
        TextView textView = (TextView) findViewById(R.id.digit);
        lcd = Typeface.createFromAsset(getAssets(),"Bazaronite.ttf");
        textView.setTypeface(lcd);
    }
}
