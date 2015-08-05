package net.farniertelecomnancy.alexandre.myapplication42;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by alexandre on 30/07/2015.
 */
public class ViewPagerThermoHisto extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerThermoHisto(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        Fragment f = null;
        switch (position) {
            case 0:
                ThermoHistoDay thermoDay= new ThermoHistoDay();
                f=thermoDay;
                break;
            case 1:
                ThermoHistoWeek thermoWeek = new ThermoHistoWeek();
                f=thermoWeek;
                break;
            case 2:
                ThermoHistoMonth thermoMonth =new ThermoHistoMonth();
                f=thermoMonth;
                break;
            case 3:
                ThermoHistoYear thermoYear =new ThermoHistoYear();
                f=thermoYear;
                break;
        }
        return f;
    }







    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }

}

