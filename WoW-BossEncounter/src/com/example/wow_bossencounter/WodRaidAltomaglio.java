package com.example.wow_bossencounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodRaidAltomaglio extends Activity 
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
        setContentView(R.layout.activity_wod_raid_altomaglio);
        Button mano = (Button) findViewById(R.id.manotagliente);
        Button mace = (Button) findViewById(R.id.macellaio);
        Button tect = (Button) findViewById(R.id.tectus);
        Button spor = (Button) findViewById(R.id.sporafelce);
        Button ogro = (Button) findViewById(R.id.ogron);
        Button kora = (Button) findViewById(R.id.koragh);
        Button marg = (Button) findViewById(R.id.margok);
        
        mano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hbHJFTkczZF9yN1k/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        mace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hTWNCTjdYaDZiQ3c/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        tect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hTkloa1NRWkVRQm8/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        spor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hUmw0OXNCZUFIYm8/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        ogro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hQUxqaHRFSldXNUk/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        kora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hcHlEUy1FeDBaTGc/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        marg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hNVNCYWNaR2R1VDg/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
}
}