package com.tenebra.wow_bossencounter;

import com.example.wow_bossencounter.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;



public class CataRaidTronodeiquattroventi extends Activity 
implements OnClickListener {

	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
           Object activity_cata_trono_raid;
		// passo all'attivazione dell'activity Pagina.java   
           
           
         }
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_lavori_in_corso);
	     /**   Button conc = (Button) findViewById(R.id.conclave);
	        Button alak = (Button) findViewById(R.id.alakir);
	       
	        conc.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View arg0 ) {
	            	      
	            	
	            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

	            	startActivity(intent);
	            	
	    }
	});
	        alak.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View arg0 ) {
	            	      
	            	
	            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

	            	startActivity(intent);
	            	
	    }
	});    */

}
}