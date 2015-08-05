package net.farniertelecomnancy.alexandre.myapplication42;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tab4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_4,container,false);
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
    }
}
