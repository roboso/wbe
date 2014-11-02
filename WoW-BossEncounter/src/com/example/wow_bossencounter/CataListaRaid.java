package com.example.wow_bossencounter;



import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class CataListaRaid extends Activity {
	
	ImageButton bastione;
	ImageButton trono;
	ImageButton anima;
	ImageButton sotterranei;
	ImageButton terre;
	
	
		@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cata_list_raid);
        bastione = (ImageButton) this.findViewById(R.id.bdc);
        trono = (ImageButton) this.findViewById(R.id.tdqv);
        anima = (ImageButton) this.findViewById(R.id.add);
        sotterranei = (ImageButton) this.findViewById(R.id.sdan);
        terre = (ImageButton) this.findViewById(R.id.tdf);
		}
        	public void startbastioneboss (View ImageButton) {
        		Intent intent = new Intent(this, BastioneListaBoss.class);
        		startActivity(intent);
        		}
        	public void starttronoboss (View ImageButton) {
        		Intent intent = new Intent(this, TronoListaBoss.class);
        		startActivity(intent);
        		}
        	public void startanimaboss (View ImageButton) {
        		Intent intent = new Intent(this, AnimaListaBoss.class);
        		startActivity(intent);
        		}
        	public void startsotterraneiboss (View ImageButton) {
        		Intent intent = new Intent(this, SotterraneiListaBoss.class);
        		startActivity(intent);
        	}
        	public void startterreboss (View ImageButton) {
            		Intent intent = new Intent(this, TerreListaBoss.class);
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