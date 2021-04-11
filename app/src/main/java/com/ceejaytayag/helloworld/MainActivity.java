package com.ceejaytayag.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.form);
        Button button2 = findViewById(R.id.data);
        Button button3 = findViewById(R.id.resource);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.form:
                goToUrl ( "https://forms.gle/MuS3a7FtBW5vCZC37");
                break;
            case R.id.data:
                goToUrl ( "https://docs.google.com/spreadsheets/d/1aYUaxWu8q2OVu7_7XBOdnbpBrvPspfwQE5SBf6DgQ2A/edit#gid=536483911");
                break;
            case R.id.resource:
                goToUrl ( "https://www.businesslist.ph/location/pasig?amp=1");
                break;

        }
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}