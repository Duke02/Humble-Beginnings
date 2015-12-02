/*     */ package com.Duke0200.AGame;
/*     */ 
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import javax.imageio.ImageIO;
/*     */ 
/*     */ public class Player
/*     */ {
/*     */   private int x;
/*     */   private int y;
/*     */   private boolean left;
/*     */   private boolean right;
/*     */   private boolean up;
/*     */   private boolean down;
/*     */   public boolean power;
/*     */   public boolean isDead;
/*     */   public int speed;
/*     */   public BufferedImage img;
/*     */   public int attack;
/*     */   public int defense;
/*     */   public int range;
/*     */   public int health;
/*     */   int points;
/*     */ 
/*     */   public Player()
/*     */   {
/*  22 */     this.isDead = false;
/*  23 */     this.speed = 1;
/*  24 */     this.img = null;
/*  25 */     this.attack = 2;
/*  26 */     this.defense = 1;
/*  27 */     this.range = 1;
/*  28 */     this.health = 500;
/*  29 */     this.points = 50;
/*     */     try
/*     */     {
/*  33 */       this.img = ImageIO.read(getClass().getResource("/com/Duke0200/AGame/Assets/Player.jpg"));
/*     */     } catch (IOException e) {
/*  35 */       e.getMessage();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void update()
/*     */   {
/*  41 */     move();
/*     */ 
/*  43 */     if (Instances.enemy.health > 0)
/*  44 */       Attack();
/*     */   }
/*     */ 
/*     */   public void setLeft(boolean newLeft)
/*     */   {
/*  51 */     this.left = newLeft;
/*     */   }
/*     */   public void setUp(boolean newUp) {
/*  54 */     this.up = newUp;
/*     */   }
/*     */   public void setDown(boolean newDown) {
/*  57 */     this.down = newDown;
/*     */   }
/*     */   public void setRight(boolean newRight) {
/*  60 */     this.right = newRight;
/*     */   }
/*     */ 
/*     */   public int getX()
/*     */   {
/*  65 */     return this.x;
/*     */   }
/*     */ 
/*     */   public int getY()
/*     */   {
/*  70 */     return this.y;
/*     */   }
/*     */ 
/*     */   public void move() {
/*  74 */     if ((getX() - this.speed != 0) && 
/*  75 */       (this.left)) {
/*  76 */       this.x -= this.speed;
/*     */     }
/*     */ 
/*  79 */     if ((getX() + 15 + this.speed != 640) && 
/*  80 */       (this.right)) {
/*  81 */       this.x += this.speed;
/*     */     }
/*     */ 
/*  84 */     if ((getY() - this.speed != 0) && 
/*  85 */       (this.up)) {
/*  86 */       this.y -= this.speed;
/*     */     }
/*     */ 
/*  89 */     if ((getY() + 15 + this.speed != 480) && 
/*  90 */       (this.down))
/*  91 */       this.y += this.speed;
/*     */   }
/*     */ 
/*     */   public void upgradeAttack()
/*     */   {
/* 102 */     if (this.points >= 10) {
/* 103 */       this.attack += 3;
/* 104 */       this.points -= 10;
/*     */     }
/*     */   }
/*     */ 
/* 108 */   public void upgradeDefense() { if (this.points >= 10) {
/* 109 */       this.defense += 3;
/* 110 */       this.points -= 10;
/*     */     } }
/*     */ 
/*     */   public void upgradeHealth() {
/* 114 */     if (this.points >= 10) {
/* 115 */       this.health += 10;
/* 116 */       this.points -= 10;
/*     */     }
/*     */   }
/*     */ 
/* 120 */   public void upgradeRange() { if (this.points >= 25) {
/* 121 */       this.range += 1;
/* 122 */       this.points -= 25;
/*     */     } }
/*     */ 
/*     */   public void getPoints() {
/* 126 */     int pnts = (int)Math.round(Math.random() * 9.0D);
/* 127 */     if (pnts == 1)
/* 128 */       this.points += (int)Math.round(Math.random() * 3.0D + 1.0D);
/*     */   }
/*     */ 
/*     */   public int displayPoints() {
/* 132 */     return this.points;
/*     */   }
/*     */   public int displayAttack() {
/* 135 */     return this.attack;
/*     */   }
/*     */   public int displayDefense() {
/* 138 */     return this.defense;
/*     */   }
/*     */   public int displayHealth() {
/* 141 */     if (this.health < 0) {
/* 142 */       this.health = 0;
/*     */     }
/* 144 */     return this.health;
/*     */   }
/*     */   public int displayRange() {
/* 147 */     return this.range;
/*     */   }
/*     */   public int displaySpeed() {
/* 150 */     return this.speed;
/*     */   }
/*     */ 
/*     */   public void Attack() {
/* 154 */     int xdiff = Instances.enemy.getX() - getX();
/* 155 */     int ydiff = Instances.enemy.getY() - getY();
/* 156 */     int diff = 0;
/*     */     boolean attacking;
/* 157 */     if ((xdiff <= this.range) && (ydiff <= this.range)) {
/* 158 */       boolean attacking = true;
/* 159 */       diff = xdiff;
/*     */     }
/*     */     else {
/* 162 */       attacking = false;
/*     */     }
/* 164 */     if (attacking) {
/* 165 */       int f = this.range - diff;
/* 166 */       if (f <= 0) {
/* 167 */         f = 1;
/*     */       }
/* 169 */       int damage = this.attack * 1 + 1 / f - Instances.enemy.defense;
/* 170 */       damage += (int)Math.round(Math.random() * 2.0D);
/* 171 */       if (damage < 0) {
/* 172 */         damage = 0;
/*     */       }
/* 174 */       Instances.enemy.health -= damage;
/* 175 */       System.out.println("Dealt " + damage + " damage.");
/* 176 */       int d = (int)Math.round(Math.random() * 8.0D);
/* 177 */       if (d == 1)
/* 178 */         this.points += Math.round(damage / 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   public String winOrLose()
/*     */   {
/* 187 */     if ((Instances.enemy.health <= 0) && (this.health > 0)) {
/* 188 */       System.out.println("Player has won!");
/* 189 */       return "Player has won!";
/*     */     }
/* 191 */     if ((Instances.enemy.health > 0) && (this.health <= 0)) {
/* 192 */       System.out.println("Player has lost!");
/* 193 */       return "Player has lost...";
/*     */     }
/* 195 */     if ((Instances.player.health <= 0) && (Instances.enemy.health <= 0)) {
/* 196 */       System.out.println("It's a tie?!");
/* 197 */       return "It's a tie?!";
/*     */     }
/*     */ 
/* 200 */     return "";
/*     */   }
/*     */ 
/*     */   public boolean WinOrLose() {
/* 204 */     if ((Instances.enemy.health <= 0) && (this.health > 0)) {
/* 205 */       System.out.println("Player has won!");
/* 206 */       return true;
/*     */     }
/* 208 */     if ((Instances.enemy.health > 0) && (this.health <= 0)) {
/* 209 */       System.out.println("Player has lost!");
/* 210 */       return false;
/*     */     }
/*     */ 
/* 213 */     return false;
/*     */   }
/*     */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Player
 * JD-Core Version:    0.6.2
 */