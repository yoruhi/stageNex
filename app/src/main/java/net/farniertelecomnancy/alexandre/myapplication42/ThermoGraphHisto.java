package net.farniertelecomnancy.alexandre.myapplication42;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.github.clans.fab.FloatingActionButton;

/**
 * Created by alexandre on 30/07/2015.
 */
public class ThermoGraphHisto extends ActionBarActivity {
    Toolbar toolbar;
    ViewPager pager;
    ViewPagerThermoHisto adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"day","week","month","year"};
    int Numboftabs =4;
    ImageView imageView;
    RoundImage roundImage;
    FloatingActionButton FAB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thermo_graph);


        //put the pictures profile in a circle
        imageView = (ImageView) findViewById(R.id.imageView);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.morpheus);
        roundImage = new RoundImage(bm);
        imageView.setImageDrawable(roundImage);

        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerThermoHisto(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);

        tabs.setCustomTabView(R.layout.tab_1,R.id.textView);



    }






}
