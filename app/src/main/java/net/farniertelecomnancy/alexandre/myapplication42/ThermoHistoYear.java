package net.farniertelecomnancy.alexandre.myapplication42;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by alexandre on 31/07/2015.
 */
public class ThermoHistoYear extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.thermo_histo_year, container, false);
        return v;
    }
    public void onViewCreated(View view, Bundle savedInstanceState){



        final ImageButton menu=(ImageButton) view.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(),ThermoGraph.class);
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
