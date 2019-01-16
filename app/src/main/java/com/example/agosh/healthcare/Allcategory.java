package com.example.agosh.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Allcategory extends AppCompatActivity {

    ListView lv2;
    String[] category={"Amoebiasis","Ascariasis","Allergies","Ankle problems","Back pain","Calf problems","Catarrh","Chest pain","Cold sore","Chronic pain","Chilblains","Constipation","Cough","Dehydration",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allcategory);

        lv2=(ListView) findViewById(R.id.lstview2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,category);
        lv2.setAdapter(adapter);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=position;
                Toast.makeText(Allcategory.this, "Your Selection done "+category[index], Toast.LENGTH_SHORT).show();
                if(category[index]=="Amoebiasis")
                {
                    startActivity(new Intent(getApplicationContext(),Amoebiasis.class));
                }
                else if(category[index]=="Ascariasis")
                {
                    startActivity(new Intent(getApplicationContext(),Ascariasis.class));
                }

                else if(category[index]=="Allergies")
                {
                    startActivity(new Intent(getApplicationContext(),Allergies.class));
                }

                else if(category[index]=="Ankle problems")
                {
                    startActivity(new Intent(getApplicationContext(),Ankleproblems.class));
                }

                else if(category[index]=="Back pain")
                {
                    startActivity(new Intent(getApplicationContext(),Backpain.class));
                }

                else if(category[index]=="Calf problems")
                {
                    startActivity(new Intent(getApplicationContext(),Calfproblems.class));
                }

                else if(category[index]=="Catarrh")
                {
                    startActivity(new Intent(getApplicationContext(),Catarrh.class));
                }

                else if(category[index]=="Chest pain")
                {
                    startActivity(new Intent(getApplicationContext(),Chestpain.class));
                }

                else if(category[index]=="Cold sore")
                {
                    startActivity(new Intent(getApplicationContext(),Coldsore.class));
                }

                else if(category[index]=="Chronic pain")
                {
                    startActivity(new Intent(getApplicationContext(),Chronicpain.class));
                }

                else if(category[index]=="Chilblains")
                {
                    startActivity(new Intent(getApplicationContext(),Chilblains.class));
                }

                else if(category[index]=="Constipation")
                {
                    startActivity(new Intent(getApplicationContext(),Constipation.class));
                }

                else if(category[index]=="Cough")
                {
                    startActivity(new Intent(getApplicationContext(),Cough.class));
                }

                else if(category[index]=="Dehydration")
                {
                    startActivity(new Intent(getApplicationContext(),Dehydration.class));
                }
            }
        });

    }
}
