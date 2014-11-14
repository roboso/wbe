package com.example.wow_bossencounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodIstaAuchindoun extends Activity 
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
        setContentView(R.layout.activity_wod_ista_auchindoun);
        Button vigi = (Button) findViewById(R.id.vigilante);
        Button nyam = (Button) findViewById(R.id.nyami);
        Button azza = (Button) findViewById(R.id.azzakel);
        Button tero = (Button) findViewById(R.id.terongor);
        
        vigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        nyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        azza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        tero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
}
}