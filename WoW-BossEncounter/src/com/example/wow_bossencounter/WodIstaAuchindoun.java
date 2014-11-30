package com.example.wow_bossencounter;

import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodIstaAuchindoun extends Activity  {
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_ista_auchindoun);
        Button italiano = (Button) findViewById(R.id.italiano);
        Button inglese = (Button) findViewById(R.id.inglese);
        
        
        italiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=0B2dBFvvy8y2hUlA0QUVGUUI5eTg&authuser=0"));

            	startActivity(intent);
            	
    }
});
        inglese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=0B2dBFvvy8y2hb1ZCLXluRnJyQzA&authuser=0"));

            	startActivity(intent);
            	
    }
});
        
}

	
	

}
