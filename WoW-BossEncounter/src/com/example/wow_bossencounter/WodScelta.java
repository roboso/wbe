package com.example.wow_bossencounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class WodScelta extends ActionBarActivity {
	
	
	Button raid;
	Button istanze;
	Button challenge;
	 
	
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_scelta);
        raid = (Button) this.findViewById(R.id.raid);
        istanze = (Button) this.findViewById(R.id.istanze);
        challenge = (Button) this.findViewById(R.id.challenge); 
    }
	public void startraidwod (View ImageButton) {
		Intent intent = new Intent(this, WodListaRaid.class);
		startActivity(intent);
		}
	public void startistanzewod (View ImageButton) {
		Intent intent = new Intent(this, WodListaIstanze.class);
		startActivity(intent);
}
	public void startlchallengewod (View ImageButton) {
		Intent intent = new Intent(this, WodListaChallenge.class);
		startActivity(intent);	
}
	}