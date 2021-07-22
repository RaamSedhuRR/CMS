package com.rty.firebase.util;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Common 
{
   public static void initFirebase(){
       FileInputStream refreshToken = null;
       try {
           refreshToken = new FileInputStream("credentials.json");
           FirebaseOptions options = FirebaseOptions.builder()
                   .setCredentials(GoogleCredentials.fromStream(refreshToken))
                   .setDatabaseUrl("https://clgmanagement-2741a-default-rtdb.firebaseio.com/")
                   .build();
           FirebaseApp.initializeApp(options);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               refreshToken.close();
           } catch (IOException ex) {
               Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }    
}
