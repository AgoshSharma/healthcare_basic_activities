package com.example.agosh.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Allergies extends AppCompatActivity {

    ListView lv3;
    String[] content={"Introduction","Common Allergies","Sympton of an allergic reaction","Getting help for allergies","How to manage an allergy","What causes allergies ?","Symptoms","Main allergy symptoms","Severe allergic reaction (anaphylaxis)",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergies);

        lv3=(ListView) findViewById(R.id.lstview3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,content);
        lv3.setAdapter(adapter);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int index=position;
                Toast.makeText(Allergies.this,"your selection done "+content[index],Toast.LENGTH_SHORT).show();
                if(content[index]=="Introduction")
                {
                    startActivity(new Intent(getApplicationContext(),Introduction.class));
                }

                else if(content[index]=="Common Allergies")
                {
                    startActivity(new Intent(getApplicationContext(),CommonAllergies.class));
                }

                else if(content[index]=="Sympton of an allergic reaction")
                {
                    startActivity(new Intent(getApplicationContext(),Symptonofanallergicreaction.class));
                }

                else if(content[index]=="Getting help for allergies")
                {
                    startActivity(new Intent(getApplicationContext(),Gettinghelpforallergies.class));
                }

                else if(content[index]=="How to manage an allergy")
                {
                    startActivity(new Intent(getApplicationContext(),Howtomanageanallergy.class));
                }

                else if(content[index]=="What causes allergies ?")
                {
                    startActivity(new Intent(getApplicationContext(),Whatcausesallergies.class));
                }

                else if(content[index]=="Symptoms")
                {
                    startActivity(new Intent(getApplicationContext(),Symptoms.class));
                }

                else if(content[index]=="Main allergy symptoms")
                {
                    startActivity(new Intent(getApplicationContext(),Mainallergysymptoms.class));
                }

                else if(content[index]=="Severe allergic reaction (anaphylaxis)")
                {
                    startActivity(new Intent(getApplicationContext(),Severeallergicreaction.class));
                }
            }
        });
    }
}