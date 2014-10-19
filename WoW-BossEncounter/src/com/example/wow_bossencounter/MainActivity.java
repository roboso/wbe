package com.example.wow_bossencounter;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {
	
	ImageButton wrat;
	ImageButton cata;
	ImageButton mop;
	ImageButton wod;
	
	
		@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wrat = (ImageButton) this.findViewById(R.id.wrat_guida);
        cata = (ImageButton) this.findViewById(R.id.cata_guida);
        mop = (ImageButton) this.findViewById(R.id.mop_guida);
        wod = (ImageButton) this.findViewById(R.id.wod_guida);
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
        	public void startlistwodraid (View ImageButton) {
        		Intent intent = new Intent(this, WodListaRaid.class);
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
}

