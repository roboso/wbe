package com.tenebra.wow_bossencounter;

import com.example.wow_bossencounter.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodRaidAltomaglio extends Activity 
implements OnClickListener {
	@Override    
    public void onClick(View View) {    
      // definisco l'intenzione  
	// passo all'attivazione dell'activity Pagina.java   
      
      
    }
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_raid_altomaglio);
        Button mano = (Button) findViewById(R.id.manotagliente);    //manonera
        Button mace = (Button) findViewById(R.id.macellaio);		//macellaio
        Button tect = (Button) findViewById(R.id.tectus);			//tectus
        Button spor = (Button) findViewById(R.id.sporafelce);		//sporafelce
        Button ogro = (Button) findViewById(R.id.ogron);			//gemelli ogron
        Button kora = (Button) findViewById(R.id.koragh);			//koragh
        Button marg = (Button) findViewById(R.id.margok);			//margok
        
        
        //inizio implement pdf manonera
        mano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hbHJFTkczZF9yN1k/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        //inizio implement pdf macellaio
        mace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hTWNCTjdYaDZiQ3c/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        //inizio implement pdf tectus
        tect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hTkloa1NRWkVRQm8/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        //inizio implement pdf sporafelce
        spor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hUmw0OXNCZUFIYm8/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        //inizio implement pdf gemelli ogron
        ogro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hQUxqaHRFSldXNUk/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        
        //inizio implement pdf koragh
        kora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hcHlEUy1FeDBaTGc/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
        //inizio implement pdf margok
        marg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B2dBFvvy8y2hNVNCYWNaR2R1VDg/view?usp=sharing"));

            	startActivity(intent);
            	
    }
});
}
}