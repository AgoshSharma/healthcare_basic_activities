package com.example.agosh.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    ListView lv;
    String[] deseasecategory={"Eye Care","Brain Care","All you can see here"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        lv=(ListView) findViewById(R.id.lstview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,deseasecategory);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=position;
                Toast.makeText(StartActivity.this, "Your Selection Done "+deseasecategory[index], Toast.LENGTH_SHORT).show();

                if(deseasecategory[index]=="Eye Care")
                {
                    startActivity(new Intent(getApplicationContext(),Eye.class));
                }
                else if(deseasecategory[index]=="Brain Care")
                {
                    startActivity(new Intent(getApplicationContext(),Brain.class));
                }
                else if(deseasecategory[index]=="All you can see here")
                {
                    startActivity(new Intent(getApplicationContext(),Allcategory.class));
                }
            }
        });


    }
}
