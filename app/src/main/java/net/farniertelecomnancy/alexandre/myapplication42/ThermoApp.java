package net.farniertelecomnancy.alexandre.myapplication42;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by alexandre on 04/08/2015.
 */
public class ThermoApp extends ActionBarActivity{
    Typeface lcd;
    ImageView imageView;
    RoundImage roundImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thermo_app);
        TextView textView = (TextView) findViewById(R.id.digit);
        lcd = Typeface.createFromAsset(getAssets(),"Bazaronite.ttf");
        textView.setTypeface(lcd);

        //put the pictures profile in a circle
        imageView = (ImageView) findViewById(R.id.imageView);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.morpheus);
        roundImage = new RoundImage(bm);
        imageView.setImageDrawable(roundImage);

    }
}
