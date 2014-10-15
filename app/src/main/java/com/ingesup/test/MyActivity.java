package com.ingesup.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button btnMonNom = (Button)findViewById(R.id.btn_mon_nom);
        Button btnRomainGaillard = (Button) findViewById(R.id.btn_RomainGaillard);


        btnMonNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bonjour !", Toast.LENGTH_LONG).show();
            }
        });

        btnRomainGaillard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bonjour M.Gaillard !", Toast.LENGTH_LONG).show();
            }
        });
        Button btnMonNomDenuc = (Button)findViewById(R.id.btn_mon_nom_Denuc);

        btnMonNomDenuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Bonjour !", Toast.LENGTH_LONG).show();


        Button btnMatthieuDurindel = (Button) findViewById(R.id.btn_matthieu_durindel);

        btnMatthieuDurindel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello !", Toast.LENGTH_LONG).show();
            }
        });

        Button btnMathea = (Button)findViewById(R.id.btn_mathea);
        btnMathea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Coucou toi !", Toast.LENGTH_LONG).show();
            }
        });


        // https://github.com/yallrick/Test_1.git

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
