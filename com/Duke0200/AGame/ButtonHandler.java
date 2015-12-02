/*    */ package com.Duke0200.AGame;
/*    */ 
/*    */ import java.awt.event.KeyAdapter;
/*    */ import java.awt.event.KeyEvent;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ButtonHandler extends KeyAdapter
/*    */ {
/*    */   public ButtonHandler()
/*    */   {
/* 19 */     System.out.println("Button handler init.");
/*    */   }
/*    */ 
/*    */   public void keyTyped(KeyEvent arg0) {
/*    */   }
/*    */ 
/*    */   public void keyReleased(KeyEvent key) {
/* 26 */     switch (key.getKeyCode()) {
/*    */     case 38:
/* 28 */       Instances.player.setUp(false);
/* 29 */       System.out.println("\nIt's quite the wonderous tale, actually...");
/* 30 */       break;
/*    */     case 40:
/* 32 */       Instances.player.setDown(false);
/* 33 */       System.out.println("\nTrust me, it's not one of those tales!");
/* 34 */       break;
/*    */     case 37:
/* 36 */       Instances.player.setLeft(false);
/* 37 */       System.out.println("\nI readied my shield...");
/* 38 */       break;
/*    */     case 39:
/* 40 */       Instances.player.setRight(false);
/* 41 */       System.out.println("\nBut I made a mistake and left my knee in the open. Thus I am no longer an adventurer.");
/* 42 */       break;
/*    */     case 87:
/* 44 */       Instances.player.setUp(false);
/* 45 */       break;
/*    */     case 83:
/* 47 */       Instances.player.setDown(false);
/* 48 */       break;
/*    */     case 65:
/* 50 */       Instances.player.setLeft(false);
/* 51 */       break;
/*    */     case 68:
/* 53 */       Instances.player.setRight(false);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void keyPressed(KeyEvent key) {
/* 58 */     switch (key.getKeyCode()) {
/*    */     case 38:
/* 60 */       Instances.player.setUp(true);
/* 61 */       System.out.println("\nShall I tell thee a tale?");
/* 62 */       break;
/*    */     case 40:
/* 64 */       Instances.player.setDown(true);
/* 65 */       System.out.println("\nThere I was a knight in shining armor.");
/* 66 */       break;
/*    */     case 37:
/* 68 */       Instances.player.setLeft(true);
/* 69 */       System.out.println("\nMy gorgeous blonde hair waving in the sunset, as the enemy advanced.");
/* 70 */       break;
/*    */     case 39:
/* 72 */       Instances.player.setRight(true);
/* 73 */       System.out.println("\nAnd I began to charge.");
/* 74 */       break;
/*    */     case 87:
/* 76 */       Instances.player.setUp(true);
/* 77 */       break;
/*    */     case 83:
/* 79 */       Instances.player.setDown(true);
/* 80 */       break;
/*    */     case 65:
/* 82 */       Instances.player.setLeft(true);
/* 83 */       break;
/*    */     case 68:
/* 85 */       Instances.player.setRight(true);
/* 86 */       break;
/*    */     case 80:
/* 88 */       Instances.player.speed += 5;
/* 89 */       System.out.println("Player speed - " + Instances.player.speed);
/* 90 */       break;
/*    */     case 79:
/* 93 */       Instances.enemy.speed += 5;
/* 94 */       System.out.println("Enemy speed - " + Instances.enemy.speed);
/* 95 */       break;
/*    */     case 91:
/* 97 */       Instances.enemy.speed -= 5;
/* 98 */       System.out.println("Enemy speed - " + Instances.enemy.speed);
/* 99 */       break;
/*    */     case 93:
/* 101 */       Instances.player.speed -= 5;
/* 102 */       System.out.println("Player speed - " + Instances.player.speed);
/* 103 */       break;
/*    */     case 49:
/* 105 */       Instances.player.upgradeAttack();
/* 106 */       break;
/*    */     case 50:
/* 108 */       Instances.player.upgradeDefense();
/* 109 */       break;
/*    */     case 51:
/* 111 */       Instances.player.upgradeRange();
/* 112 */       break;
/*    */     case 52:
/* 114 */       Instances.player.upgradeHealth();
/*    */     }
/*    */   }
/*    */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.ButtonHandler
 * JD-Core Version:    0.6.2
 */