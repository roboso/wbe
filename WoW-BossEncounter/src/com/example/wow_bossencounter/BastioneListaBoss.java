package com.example.wow_bossencounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle;




public class BastioneListaBoss extends Activity 
implements OnClickListener {

	
	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
           Object activity_cata_bastione_raid;
		// passo all'attivazione dell'activity Pagina.java   
           
           
         }
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_cata_bastione_raid);
		}

	        public void halfusguida (View Button) {
        		Intent intent = new Intent(this, HalfusGuida.class);
        		startActivity(intent);
	        }
            public void concilioguida (View Button) {
            		Intent intent = new Intent(this, ConcilioGuida.class);
            		startActivity(intent);
}
}
