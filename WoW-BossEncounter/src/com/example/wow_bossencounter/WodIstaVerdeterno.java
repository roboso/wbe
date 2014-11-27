package com.example.wow_bossencounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodIstaVerdeterno extends Activity 
implements OnClickListener {
	@Override    
    public void onClick(View View) {    
      // definisco l'intenzione  
      Object activity_mop_assedio_raid;
	// passo all'attivazione dell'activity Pagina.java   
      
      
    }
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_ista_verdeterno);
        Button italiano = (Button) findViewById(R.id.italiano);
        Button inglese = (Button) findViewById(R.id.inglese);
        
        
        italiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=0B2dBFvvy8y2hWWRRZ0VVeUcybUE&authuser=0"));

            	startActivity(intent);
            	
    }
});
        inglese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        
}

}
