package com.tenebra.wow_bossencounter;



import com.tenebra.wow_bossencounter.R;

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

public class CataListaRaid extends Activity
implements OnClickListener{
	

	@Override    
    public void onClick(View View) {    
      // definisco l'intenzione  
      Object activity_mop_list_raid;
	// passo all'attivazione dell'activity Pagina.java   
      
      
    }	
	
		@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cata_list_raid);
		}
        	public void startbastioneboss (View ImageButton) {
        		Intent intent = new Intent(this, CataRaidBastionedelcrepuscolo.class);
        		startActivity(intent);
        		}
        	public void starttronoboss (View ImageButton) {
        		Intent intent = new Intent(this, CataRaidTronodeiquattroventi.class);
        		startActivity(intent);
        		}
        	public void startanimaboss (View ImageButton) {
        		Intent intent = new Intent(this, CataRaidAnimadidrago.class);
        		startActivity(intent);
        		}
        	public void startsotterraneiboss (View ImageButton) {
        		Intent intent = new Intent(this, CataRaidSotterraneidellalanera.class);
        		startActivity(intent);
        	}
        	public void startterreboss (View ImageButton) {
            		Intent intent = new Intent(this, CataRaidTerredelfuoco.class);
            		startActivity(intent);
        		}
	
}