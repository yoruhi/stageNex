package net.farniertelecomnancy.alexandre.myapplication42;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.clans.fab.FloatingActionButton;

/**
 * Created by hp1 on 21-01-2015.
 */
public class    Tab1 extends Fragment {
    FloatingActionButton fab;
    FloatingActionButton fab1;
    FloatingActionButton fab2;
    FloatingActionButton fab3;
    FloatingActionButton fab4;
    FloatingActionButton fab5;
    FloatingActionButton fab6;
    FloatingActionButton fab7;
    FloatingActionButton fab8;
    FloatingActionButton fab9;
    FloatingActionButton fab10;
    FloatingActionButton fab11;




    private Bitmap getCircleBitmap(Bitmap bitmap) {
        final Bitmap output = Bitmap.createBitmap(bitmap.getWidth(),
                bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(output);

        final int color = Color.RED;
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(color);
        canvas.drawOval(rectF, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);

        bitmap.recycle();

        return output;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);
        return v;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        //icone round fab
     /********************************icon fab****/
        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.female1);
       bm=Bitmap.createScaledBitmap(bm,169,169,true);
        fab.setImageBitmap(getCircleBitmap(bm));
        fab.setLabelVisibility(View.VISIBLE);fab.setLabelText("Billie");

        fab1 = (FloatingActionButton) view.findViewById(R.id.fab1);
        Bitmap bm1 = BitmapFactory.decodeResource(getResources(), R.drawable.female2);
        bm1=Bitmap.createScaledBitmap(bm1,169,169,true);
        fab1.setImageBitmap(getCircleBitmap(bm1));

        fab2 = (FloatingActionButton) view.findViewById(R.id.fab2);
        Bitmap bm2 = BitmapFactory.decodeResource(getResources(), R.drawable.male1);
        bm2=Bitmap.createScaledBitmap(bm2,169,169,true);
        fab2.setImageBitmap(getCircleBitmap(bm2));

        fab3 = (FloatingActionButton) view.findViewById(R.id.fab3);
        Bitmap bm3 = BitmapFactory.decodeResource(getResources(), R.drawable.male2);
        bm3=Bitmap.createScaledBitmap(bm3,169,169,true);
        fab3.setImageBitmap(getCircleBitmap(bm3));

        fab4 = (FloatingActionButton) view.findViewById(R.id.fab4);
        Bitmap bm4 = BitmapFactory.decodeResource(getResources(), R.drawable.male3);
        bm4=Bitmap.createScaledBitmap(bm4,169,169,true);
        fab4.setImageBitmap(getCircleBitmap(bm4));

        fab5 = (FloatingActionButton) view.findViewById(R.id.fab5);
        Bitmap bm5 = BitmapFactory.decodeResource(getResources(), R.drawable.temperature);
        bm5=Bitmap.createScaledBitmap(bm5,169,169,true);
        fab5.setImageBitmap(getCircleBitmap(bm5));

        fab6 = (FloatingActionButton) view.findViewById(R.id.fab6);
        Bitmap bm6 = BitmapFactory.decodeResource(getResources(), R.drawable.pwa);
        bm6=Bitmap.createScaledBitmap(bm6,169,169,true);
        fab6.setImageBitmap(getCircleBitmap(bm6));
        fab6.setLabelText("Bpm");


        fab7 = (FloatingActionButton) view.findViewById(R.id.fab7);
        Bitmap bm7 = BitmapFactory.decodeResource(getResources(), R.drawable.o2_logo);
        bm7=Bitmap.createScaledBitmap(bm7,80,80,true);
        fab7.setImageBitmap(getCircleBitmap(bm7));

        fab8 = (FloatingActionButton) view.findViewById(R.id.fab8);
        Bitmap bm8 = BitmapFactory.decodeResource(getResources(), R.drawable.scale);
        bm8=Bitmap.createScaledBitmap(bm8,110,110,true);
        fab8.setImageBitmap(getCircleBitmap(bm8));


        fab9 = (FloatingActionButton) view.findViewById(R.id.fab9);
        Bitmap bm9 = BitmapFactory.decodeResource(getResources(), R.drawable.email);
        bm9=Bitmap.createScaledBitmap(bm9,100,100,true);
        fab9.setImageBitmap(getCircleBitmap(bm9));

        fab10 = (FloatingActionButton) view.findViewById(R.id.fab10);
        Bitmap bm10 = BitmapFactory.decodeResource(getResources(), R.drawable.location);
        bm10=Bitmap.createScaledBitmap(bm10,169,169,true);
        fab10.setImageBitmap(getCircleBitmap(bm10));

        fab11 = (FloatingActionButton) view.findViewById(R.id.fab11);
        Bitmap bm11 = BitmapFactory.decodeResource(getResources(), R.drawable.social);
        bm11=Bitmap.createScaledBitmap(bm11,169,169,true);
        fab11.setImageBitmap(getCircleBitmap(bm11));

        /***********icon fab*//////////////////



        final CardView cardView=(CardView) view.findViewById(R.id.cardview);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick(View v) {


                Intent intent = new Intent(getActivity(),ThermoGraph.class);
                getActivity().finish();
                startActivity(intent);
                /*Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();*/


        }
        });

    final FloatingActionButton floatingActionButton=(FloatingActionButton) view.findViewById(R.id.fab5);
    floatingActionButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(getActivity(), ThermoApp.class);
            getActivity().finish();
            startActivity(intent);

                /*Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_SHORT).show();*/


        }
    });
}


}
