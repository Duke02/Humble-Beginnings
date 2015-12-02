/*    */ package com.Duke0200.AGame;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ import javax.sound.sampled.AudioInputStream;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.Clip;
/*    */ import javax.sound.sampled.LineUnavailableException;
/*    */ import javax.sound.sampled.UnsupportedAudioFileException;
/*    */ 
/*    */ public class Sound
/*    */ {
/*    */   private Clip clip;
/*    */ 
/*    */   public Sound(String fileName)
/*    */   {
/*    */     try
/*    */     {
/* 36 */       URL url = getClass().getClassLoader().getResource(fileName);
/* 37 */       if (url.getFile() != null) {
/* 38 */         AudioInputStream sound = AudioSystem.getAudioInputStream(url);
/*    */ 
/* 40 */         this.clip = AudioSystem.getClip();
/* 41 */         this.clip.open(sound);
/*    */       }
/*    */       else {
/* 44 */         throw new RuntimeException("Sound: file not found: " + fileName);
/*    */       }
/*    */     }
/*    */     catch (MalformedURLException e) {
/* 48 */       e.printStackTrace();
/* 49 */       throw new RuntimeException("Sound: Malformed URL: " + e);
/*    */     }
/*    */     catch (UnsupportedAudioFileException e) {
/* 52 */       e.printStackTrace();
/* 53 */       throw new RuntimeException("Sound: Unsupported Audio File: " + e);
/*    */     }
/*    */     catch (IOException e) {
/* 56 */       e.printStackTrace();
/* 57 */       throw new RuntimeException("Sound: Input/Output Error: " + e);
/*    */     }
/*    */     catch (LineUnavailableException e) {
/* 60 */       e.printStackTrace();
/* 61 */       throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void play()
/*    */   {
/* 67 */     this.clip.setFramePosition(0);
/* 68 */     this.clip.start();
/*    */   }
/*    */   public void loop() {
/* 71 */     this.clip.loop(-1);
/*    */   }
/*    */   public void stop() {
/* 74 */     this.clip.stop();
/*    */   }
/*    */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Sound
 * JD-Core Version:    0.6.2
 */