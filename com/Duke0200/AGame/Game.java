/*    */ package com.Duke0200.AGame;
/*    */ 
/*    */ public class Game
/*    */   implements Runnable
/*    */ {
/* 14 */   Display display = new Display();
/*    */ 
/*    */   public void run()
/*    */   {
/*    */     while (true) {
/* 19 */       Instances.player.update();
/* 20 */       Instances.enemy.update();
/* 21 */       this.display.Render();
/* 22 */       Instances.music.loop();
/*    */       try {
/* 24 */         Thread.sleep(35L);
/* 25 */         Instances.player.getPoints();
/*    */       } catch (InterruptedException e) {
/* 27 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Game
 * JD-Core Version:    0.6.2
 */