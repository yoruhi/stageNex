package net.farniertelecomnancy.alexandre.myapplication42;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

/**
 * Created by hp1 on 21-01-2015.
 */
public class    ThermoDay extends Fragment {

    ImageButton imageButton;
    RoundImage roundImage;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.thermo_day, container, false);
        return v;


    }
    public void onViewCreated(View view, Bundle savedInstanceState){



        final ImageButton menu=(ImageButton) view.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(),ThermoGraphHisto.class);
                startActivity(intent);
                //Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();


            }
        });

    final ImageButton retur=(ImageButton) view.findViewById(R.id.retur);
    retur.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(getActivity(),MainActivity.class);
            startActivity(intent);
            //Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();


        }
    });
}
}
