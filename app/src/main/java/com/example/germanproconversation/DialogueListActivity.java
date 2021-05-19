package com.example.germanproconversation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DialogueListActivity extends AppCompatActivity {
    ListView mListView;
    Toolbar mToolbar;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue_list);

        ListView mListView = (ListView) findViewById(R.id.DialogueListId);//connect listview with activit


// the first Arrayadapter
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(DialogueListActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.A1_Dialogue));
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(DialogueListActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.A2_Dialogue));
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(DialogueListActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.B1_Dialogue));
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(DialogueListActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.B2_Dialogue));

        mListView.setAdapter(arrayAdapter);



//the seconde  Arrayadapter


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DialogueListActivity.this, TextShowActivity.class);

                intent.putExtra("A1_dialogue", mListView.getItemAtPosition(position).toString());
                intent.putExtra("A2_dialogue", mListView.getItemAtPosition(position).toString());
                intent.putExtra("B1_dialogue", mListView.getItemAtPosition(position).toString());
                intent.putExtra("B2_dialogue", mListView.getItemAtPosition(position).toString());


                startActivity(intent);
            }
        });


    }
}











              //  ArrayAdapter <String> arrayAdapter2 = new ArrayAdapter<>(DialogueListActivity.this,
              //  android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.A2_Dialogue));



       /* Bundle bundle = getIntent().getExtras();
        if (bundle!= null) {
            mToolbar.setTitle(bundle.getString("levels"));
            */




