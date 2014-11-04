package com.example.wow_bossencounter;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity; 
import android.os.Bundle;
import android.content.Intent;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ConcilioGuida extends Activity {
/**
 * @param args
 */
public static void main(String[] args) {
    try {
         
        PdfReader reader = new PdfReader("c:/Muro.pdf");
        System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
        String page = PdfTextExtractor.getTextFromPage(reader, 2);
        System.out.println("Page Content:\n\n"+page+"\n\n");
        System.out.println("Is this document tampered: "+reader.isTampered());
        System.out.println("Is this document encrypted: "+reader.isEncrypted());

    } catch (IOException e) {
        e.printStackTrace();
    }

}

}