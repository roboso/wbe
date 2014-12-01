package com.tenebra.wow_bossencounter;


import com.example.wow_bossencounter.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity; 
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class MopListaRaid extends Activity 
implements OnClickListener {

	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
           Object activity_mop_list_raid;
		// passo all'attivazione dell'activity Pagina.java   
           
           
         }
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_mop_list_raid);
		 
		}
		
		
		
	        public void listasegrete (View ImageButton) {
        		Intent intent = new Intent(this, MopRaidSegretedimogushan.class);
        		startActivity(intent);
        		}
        	public void listacuore (View ImageButton) {
        		Intent intent = new Intent(this, MopRaidCuoredellapaura.class);
        		startActivity(intent);
        		}
        	public void listaterrazza (View ImageButton) {
        		Intent intent = new Intent(this, MopRaidTerrazzadelleternaprimavera.class);
        		startActivity(intent);
        		}
        	public void listaregnodeltuono (View ImageButton) {
        		Intent intent = new Intent(this, MopRaidRegnodeltuono.class);
        		startActivity(intent);
        	    }
        		public void listasoo (View ImageButton) {
            		Intent intent = new Intent(this, MopRaidAssediodiorgrimmar.class);
            		startActivity(intent);
        		
        		
        		}
		}
		
		
		
		
		
	
