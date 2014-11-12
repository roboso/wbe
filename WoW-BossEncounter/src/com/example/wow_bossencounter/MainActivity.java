package com.example.wow_bossencounter;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends Activity 
	implements OnClickListener {
    final Context context = this;
	
	ImageButton wrat;
	ImageButton cata;
	ImageButton mop;
	ImageButton wod_guida;
	
		@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wrat = (ImageButton) this.findViewById(R.id.wrat_guida);
        cata = (ImageButton) this.findViewById(R.id.cata_guida);
        mop = (ImageButton) this.findViewById(R.id.mop_guida);
        wod_guida = (ImageButton) findViewById(R.id.wod_guida);
			
        	wod_guida.setOnClickListener(new OnClickListener() {
				
            	@Override      		                 	
            	public void onClick(View v) {
       			// custom dialog
      			final Dialog dialog = new Dialog(context);
      			dialog.setContentView(R.layout.activity_wod_scelta);
      			dialog.setTitle("Dove vuoi andare?");
       
      			// set the custom dialog components - text, image and button
      			Button raid = (Button) dialog.findViewById(R.id.dialograidwod);
      			Button challenge = (Button) dialog.findViewById(R.id.dialogchallengedwod);
      			Button istanze = (Button) dialog.findViewById(R.id.dialogistanzawod);
       
				raid.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						 clickSuRaid(); 
					}

					private void clickSuRaid() {
						// TODO Auto-generated method stub
						Intent intent = new Intent(null, null, context, WodListaRaid.class);
	             		startActivity(intent);
					}
						
				});
				challenge.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						clicSuChallenge(); 
					}

					private void clicSuChallenge() {
						// TODO Auto-generated method stub
						Intent intent = new Intent(null, null, context, WodListaChallenge.class);
	             		startActivity(intent);
					}
				});
				istanze.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						clicSuIstanze (); 

					}

					private void clicSuIstanze() {
						// TODO Auto-generated method stub
						Intent intent = new Intent(null, null, context, WodListaIstanze.class);
	             		startActivity(intent);
					}
				});
				dialog.show();
            	}
      		});
            
}
        	
        	
        	public void startlistwratraid (View ImageButton) {
        		Intent intent = new Intent(this, WratListaRaid.class);
        		startActivity(intent);
        		}
        	public void startlistcataraid (View ImageButton) {
        		Intent intent = new Intent(this, CataListaRaid.class);
        		startActivity(intent);
        		}
        	public void startlistmopraid (View ImageButton) {
        		Intent intent = new Intent(this, MopListaRaid.class);
        		startActivity(intent);
        	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


	}


	
		
	
	

