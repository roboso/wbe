package com.tenebra.wow_bossencounter;

import com.example.wow_bossencounter.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WodIstaTorvaluna extends Activity{
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_ista_necrotorvaluna);
        Button italiano = (Button) findViewById(R.id.italiano);
        Button inglese = (Button) findViewById(R.id.inglese);
        
        
        italiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=0B2dBFvvy8y2hR0ZEdjFGUHFKb2c&authuser=0"));

            	startActivity(intent);
            	
    }
});
        inglese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=0B2dBFvvy8y2hazJnWDBuQ3hZaHM&authuser=0"));

            	startActivity(intent);
            	
    }
});
        
}

}
