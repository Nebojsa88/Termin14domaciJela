package com.aad.termin14domacijela.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.aad.termin14domacijela.R;
import com.aad.termin14domacijela.model.Jelo;
import com.aad.termin14domacijela.provider.JeloProvider;

import java.util.List;

public class FirstActivity extends Activity {

    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       // for(final Jelo jelo: Jelo.JELA) {
        //    Button button = new Button(this);
        //    button.setText(jelo.getNaziv());
        //    button.setOnClickListener(new View.OnClickListener() {
        //        @Override
         //       public void onClick(View v) {
         //           Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
          //          intent.putExtra("id", jelo.getId());
          //          startActivity(intent);
          //      }
         //   });
          //
          //  LinearLayout layout = findViewById(R.id.linear_layout);
           // layout.addView(button);


       // }
        final List<String> naziviJela = JeloProvider.getJalaNames();

        listView1 = findViewById(R.id.list_view);
        ArrayAdapter dataAdapter = new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1, naziviJela);
        ListView listView =  findViewById(R.id.list_view);
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);

            }
        });






   }
}
