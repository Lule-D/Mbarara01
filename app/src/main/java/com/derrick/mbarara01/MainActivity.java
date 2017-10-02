package com.derrick.mbarara01;

import android.content.Context;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"Carrots","Onions","Tomatoes"};
    String[] item1={"Carrots","Onions","Tomatoes"};
    
    private Context cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cont=MainActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.portrt);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout reltv= (RelativeLayout) findViewById(R.id.cc);
                RelativeLayout reltv2= (RelativeLayout) findViewById(R.id.oo);
                RelativeLayout reltv3 = (RelativeLayout) findViewById(R.id.tt);
              


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Carrots":

                            reltv.setVisibility(View.VISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);


                            break;
                        case "Onions":

                            reltv.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.VISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);

                            break;
                        case "Tomatoes":

                            reltv.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.VISIBLE);

                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscp);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,item1);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout reltv= (RelativeLayout) findViewById(R.id.cc1);
                RelativeLayout reltv2= (RelativeLayout) findViewById(R.id.oo1);
                RelativeLayout reltv3 = (RelativeLayout) findViewById(R.id.tt1);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Carrots":

                            reltv.setVisibility(View.VISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);


                            break;
                        case "Onions":

                            reltv.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.VISIBLE);
                            reltv3.setVisibility(view.INVISIBLE);

                            break;
                        case "Tomatoes":

                            reltv.setVisibility(View.INVISIBLE);
                            reltv2.setVisibility(View.INVISIBLE);
                            reltv3.setVisibility(view.VISIBLE);

                            break;

                    }
                }
            });
        }
    }
    }

