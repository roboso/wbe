package com.example.wow_bossencounter;

import java.io.File;
import java.io.InputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;






public class BastioneListaBoss extends Activity 
implements OnClickListener {


	
		
		@Override    
         public void onClick(View View) {    
           // definisco l'intenzione  
           Object activity_cata_bastione_raid;
		// passo all'attivazione dell'activity Pagina.java   
		}
         
         
		@Override
	    public void onCreate (Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_cata_bastione_raid);     
	        
	        Button button = (Button) findViewById(R.id.halfus);
	        button.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View arg0) {
	            	      
	            	Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/0B7vwPzmhIvQzbkJBZ0VLZ3kxelE/view?usp=sharing"));
	            	startActivity(intent); 
	            	
	            	
	    }
	});
		}
}

