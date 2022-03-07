package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd;
    private Spinner spn;
    private EditText eName;
    private ListView lst;
    private ArrayAdapter<String> adapCT, adapQ;
    private ArrayList<String> lstCon = new ArrayList<>();
    private ArrayList<String> lstQ = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        spn = findViewById(R.id.spnQQ);
        eName = findViewById(R.id.edName);
        lst = findViewById(R.id.lstCT);

        lstQ.add("Que quan");
        lstQ.add("Ha Noi");
        lstQ.add("HCM");

        adapQ= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,lstQ);
        spn.setAdapter(adapQ);

        lstCon.add("An-Ha Noi");
        adapCT= new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,lstCon);
        lst.setAdapter(adapCT);

        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,lstCon.get(i).toString(),Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    public void AddClick(View view)
    {
        if (eName.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this,"Hay nhap ten vao truoc",Toast.LENGTH_LONG).show();
            return;
        }

        if (spn.getSelectedItem().toString()=="Que quan") {
            Toast.makeText(MainActivity.this, "Hay chon que", Toast.LENGTH_LONG).show();
            return;
        }
        lstCon.add(eName.getText().toString()+"-"+spn.getSelectedItem().toString());
        adapCT.notifyDataSetChanged();
        reset();
    }
    public void reset(){
        eName.setText("");
        spn.setSelection(0);
    }
}