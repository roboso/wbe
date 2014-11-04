package com.example.wow_bossencounter;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;


public class WodListaRaid extends ActionBarActivity 
implements OnClickListener {

	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
           Object activity_wod_list_raid;
		// passo all'attivazione dell'activity Pagina.java   
           
           
         }
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_wod_list_raid);
		 
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