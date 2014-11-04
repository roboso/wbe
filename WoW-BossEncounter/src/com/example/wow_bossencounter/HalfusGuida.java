package com.example.wow_bossencounter;
//iText imports
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity; 
import android.os.Bundle;
import android.content.Intent;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;


public class HalfusGuida {

	private static String Halfus  = "C:Muro.pdf";
	  
	 public static void main(String[] args) throws DocumentException, IOException {
	  Document document = new Document();
	        document.open();
      PdfReader reader = new PdfReader(Halfus);
      int n = reader.getNumberOfPages();
      PdfImportedPage page;
      // Go through all pages
      for (int i = 1; i <= n; i++) {
          // Only page number 2 will be included
          if (i == 2) {
         Image instance = Image.getInstance(Halfus);
              // here you can show image on your phone
          }
      }
	 
	  }
}
