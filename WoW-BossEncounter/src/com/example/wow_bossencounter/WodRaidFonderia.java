package com.example.wow_bossencounter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class WodRaidFonderia extends Activity 
implements OnClickListener {
	@Override    
    public void onClick(View View) {    
      // definisco l'intenzione  
      Object activity_mop_assedio_raid;
	// passo all'attivazione dell'activity Pagina.java   
      
      
    }
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_raid_fonderiaroccianera);
        Button grul = (Button) findViewById(R.id.grull);
        Button trit = (Button) findViewById(R.id.tritaroccia);
        Button sign = (Button) findViewById(R.id.signoredellebestie);
        Button doma = (Button) findViewById(R.id.domafiamme);
        Button fran = (Button) findViewById(R.id.franzok);
        Button oper = (Button) findViewById(R.id.operatore);
        Button alto = (Button) findViewById(R.id.altoforno);
        Button krom = (Button) findViewById(R.id.kromog);
        Button dame = (Button) findViewById(R.id.dameferro);
        Button mano = (Button) findViewById(R.id.manonera);
        
        grul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        trit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        doma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        fran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        oper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        alto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        krom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        dame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
        mano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
            	      
            	
            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"));

            	startActivity(intent);
            	
    }
});
}
}