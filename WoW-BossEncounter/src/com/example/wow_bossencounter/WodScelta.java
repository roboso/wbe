package com.example.wow_bossencounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class WodScelta extends ActionBarActivity
implements OnClickListener {
	
	
	@Override
	public void onClick(View View) {
		// TODO Auto-generated method stub
		 Object activity_wod_scelta;
	}
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_scelta);
        
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