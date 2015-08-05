package net.farniertelecomnancy.alexandre.myapplication42;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

/**
 * Created by hp1 on 21-01-2015.
 */
public class    Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);
        return v;

    }

    public void onViewCreated(View view, Bundle savedInstanceState){



        final CardView cardView=(CardView) view.findViewById(R.id.cardview);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick(View v) {


                Intent intent = new Intent(getActivity(),ThermoGraph.class);
                startActivity(intent);
                /*Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();*/


        }
        });

    final FloatingActionButton floatingActionButton=(FloatingActionButton) view.findViewById(R.id.floating);
    floatingActionButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(getActivity(),ThermoApp.class);
            startActivity(intent);

                /*Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();*/


        }
    });
}

}
