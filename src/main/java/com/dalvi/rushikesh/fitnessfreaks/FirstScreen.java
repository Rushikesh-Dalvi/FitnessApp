package com.dalvi.rushikesh.fitnessfreaks;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstScreen extends AppCompatActivity {
    ListView lv;
    ArrayList<String > Titles;
    ArrayList<String> charArray;
    ArrayList<Integer> imagearray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Titles=new ArrayList<>();
        Titles.add("ABS");
        Titles.add("BACK");
        Titles.add("BICEPS");
        Titles.add("CALF");
        Titles.add("CHEST");
        Titles.add("FOREARMS");
        Titles.add("LEGS");
        Titles.add("SHOULDERS");
        Titles.add("TRICEPS");


        imagearray=new ArrayList<>();
        imagearray.add(R.mipmap.abs);
        imagearray.add(R.mipmap.back);
        imagearray.add(R.mipmap.biceps);
        imagearray.add(R.mipmap.calves);
        imagearray.add(R.mipmap.chest);
        imagearray.add(R.mipmap.forearm);
        imagearray.add(R.mipmap.legs);
        imagearray.add(R.mipmap.shoulder);
        imagearray.add(R.mipmap.triceps);



        ListViewAdapter lva=new ListViewAdapter();
        lv=findViewById(R.id.list);
        lv.setAdapter(lva);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String select=Titles.get(i).toString();
                Intent ii=new Intent(FirstScreen.this,Secondscreen.class);
                ii.putExtra("Key11",select);
                Toast.makeText(FirstScreen.this,select, Toast.LENGTH_SHORT).show();
                startActivity(ii);
            }
        });
    }
    class ListViewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Titles.size();
        }

        @Override
        public Object getItem(int i) {
            return Titles.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li=getLayoutInflater();
            View v1=li.inflate(R.layout.activity_row_view,null);
            TextView tv1=v1.findViewById(R.id.txt1);
            tv1.setText(Titles.get(i));
            ImageView iv=v1.findViewById(R.id.img);
            iv.setColorFilter(imagearray.get(i));
            return v1;
        }
    }
}

