package com.example.wow_bossencounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class WodListaIstanze extends ActionBarActivity {
	
	Button auchindoun;
	Button roccianerasuperiori;
	Button darsenaferro;
	Button magliorosso;
	Button torvaluna;
	Button frecciacupa;
	Button verdeterno;
	Button vistacieli;
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_list_istanze);
        auchindoun = (Button) this.findViewById(R.id.auchindoun);
        roccianerasuperiori = (Button) this.findViewById(R.id.roccianerasuperiori);
        darsenaferro = (Button) this.findViewById(R.id.darsena);
        magliorosso = (Button) this.findViewById(R.id.magliorosso);
        torvaluna = (Button) this.findViewById(R.id.torvaluna);
        frecciacupa = (Button) this.findViewById(R.id.frecciacupa);
        verdeterno = (Button) this.findViewById(R.id.verdeterno);
        vistacieli = (Button) this.findViewById(R.id.vistacieli);
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
