package com.example.wow_bossencounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class WodListaIstanze extends Activity 
	implements OnClickListener {
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
	}
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_list_istanze);
     
	}

	 public void startauchindoun (View Button) {
 		Intent intent = new Intent(this, WodIstaAuchindoun.class);
 		startActivity(intent);
     }
 	       public void startroccianera (View Button) {
 	    	   Intent intent = new Intent(this, WodIstaRoccianerasuperiori.class);
 	    	   startActivity(intent);
 	       }
     			public void startdarsena (View Button) {
     				Intent intent = new Intent(this, WodIstaDarsena.class);
     				startActivity(intent);
     			}
         			public void startmagliorosso (View Button) {
         				Intent intent = new Intent(this, WodIstaMagliorosso.class);
         				startActivity(intent);
         			}
             			public void starttorvaluna (View Button) {
             				Intent intent = new Intent(this, WodIstaTorvaluna.class);
             				startActivity(intent);
             			}
                 			public void startfrecciacupa (View Button) {
                 				Intent intent = new Intent(this, WodIstaFrecciacupa.class);
                 				startActivity(intent);
                 			}
                     			public void startverdeterno (View Button) {
                     				Intent intent = new Intent(this, WodIstaVerdeterno.class);
                     				startActivity(intent);
                     			}
                         			public void startvistacieli (View Button) {
                         				Intent intent = new Intent(this, WodIstaVistacieli.class);
                         				startActivity(intent);
                         			}
        
                                			
                                    		
	
		
}
