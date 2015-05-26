package com.tenebra.wow_bossencounter;

import com.tenebra.wow_bossencounter.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class WodListaRaid extends Activity 
implements OnClickListener {

	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
		// passo all'attivazione dell'activity Pagina.java   
           
           
         }
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_wod_list_raid);
	        getActionBar().setDisplayHomeAsUpEnabled(true);
		 
		}
		public void startaltomaglio (View ImageButton) {
			Intent intent = new Intent(this, WodRaidAltomaglio.class);
			startActivity(intent);
			}
		public void startfornace (View ImageButton) {
			Intent intent = new Intent(this, WodRaidFonderia.class);
			startActivity(intent);
			}
	}