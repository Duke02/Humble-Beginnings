/*     */ package com.Duke0200.AGame;
/*     */ 
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ 
/*     */ public class Enemy
/*     */ {
/*     */   private int x;
/*     */   private int y;
/*     */   public boolean power;
/*     */   public int speed;
/*     */   public BufferedImage img;
/*     */   int health;
/*     */   int attack;
/*     */   int defense;
/*     */   int range;
/*     */ 
/*     */   public Enemy()
/*     */   {
/*  19 */     this.y = 240;
/*     */ 
/*  21 */     this.speed = 1;
/*  22 */     this.img = null;
/*  23 */     this.health = 400;
/*  24 */     this.attack = 3;
/*  25 */     this.defense = 1;
/*  26 */     this.range = 1;
/*     */     try
/*     */     {
/*  30 */       this.img = ImageIO.read(getClass().getResource("/com/Duke0200/AGame/Assets/Enemy.jpg"));
/*     */     } catch (IOException e) {
/*  32 */       e.getMessage();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void update() {
/*  37 */     if (!Instances.player.WinOrLose()) {
/*  38 */       move();
/*     */       try {
/*  40 */         Thread.sleep(40L);
/*  41 */         Attack();
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {
/*     */       }
/*  45 */       Sacrifice();
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getX()
/*     */   {
/*  51 */     return this.x;
/*     */   }
/*     */   public int getY() {
/*  54 */     return this.y;
/*     */   }
/*     */ 
/*     */   public void move() {
/*  58 */     int left = (int)Math.round(Math.random() * 2.0D);
/*  59 */     int right = (int)Math.round(Math.random() * 2.0D);
/*  60 */     int up = (int)Math.round(Math.random() * 2.0D);
/*  61 */     int down = (int)Math.round(Math.random() * 2.0D);
/*     */ 
/*  63 */     if ((left == 1) && (getX() - this.speed != 0)) {
/*  64 */       this.x -= this.speed;
/*     */     }
/*  66 */     if ((right == 1) && (getX() + this.img.getWidth() + this.speed != Draw.WIDTH)) {
/*  67 */       this.x += this.speed;
/*     */     }
/*  69 */     if ((down == 1) && (getY() + this.img.getHeight() + this.speed != Draw.HEIGHT)) {
/*  70 */       this.y += this.speed;
/*     */     }
/*  72 */     if ((up == 1) && (getY() - this.img.getHeight() - this.speed != 0))
/*  73 */       this.y -= this.speed;
/*     */   }
/*     */ 
/*     */   public int displayHealth() {
/*  77 */     if (this.health < 0) {
/*  78 */       this.health = 0;
/*     */     }
/*  80 */     return this.health;
/*     */   }
/*     */   public void Sacrifice() {
/*  83 */     double r = Math.random() * 150.0D;
/*  84 */     if (r <= 3.75D) {
/*  85 */       this.range += 1;
/*     */     }
/*  87 */     double h = Math.random() * 150.0D;
/*  88 */     if (h <= 4.75D) {
/*  89 */       this.health += (int)Math.round(Math.random() * 4.0D);
/*     */     }
/*  91 */     double a = Math.random() * 150.0D;
/*  92 */     if (a <= 4.75D) {
/*  93 */       this.attack += (int)Math.round(Math.random() * 1.0D);
/*     */     }
/*  95 */     double d = Math.random() * 150.0D;
/*  96 */     if (d <= 4.75D)
/*  97 */       this.defense += (int)Math.round(Math.random() * 1.0D);
/*     */   }
/*     */ 
/*     */   public void Attack()
/*     */   {
/* 112 */     int xxdiff = Instances.player.getX() - getX();
/* 113 */     int yydiff = Instances.player.getY() - getY();
/* 114 */     if (xxdiff < 0) {
/* 115 */       xxdiff *= -1;
/*     */     }
/* 117 */     if (yydiff < 0)
/* 118 */       yydiff *= -1;
/*     */     boolean attacking;
/*     */     boolean attacking;
/* 120 */     if ((xxdiff <= this.range) && (yydiff <= this.range)) {
/* 121 */       attacking = true;
/*     */     }
/*     */     else {
/* 124 */       attacking = false;
/*     */     }
/* 126 */     if (attacking) {
/* 127 */       int damage = this.attack - Instances.player.defense;
/* 128 */       damage += (int)Math.round(Math.random() * 2.0D);
/* 129 */       if (damage < 0) {
/* 130 */         damage = 0;
/*     */       }
/* 132 */       Instances.player.health -= damage;
/*     */     }
/*     */   }
/*     */ 
/* 136 */   public int displayRange() { return this.range; }
/*     */ 
/*     */   public int displaySpeed() {
/* 139 */     return this.speed;
/*     */   }
/*     */   public int displayAttack() {
/* 142 */     return this.attack;
/*     */   }
/*     */   public int displayDefense() {
/* 145 */     return this.defense;
/*     */   }
/*     */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Enemy
 * JD-Core Version:    0.6.2
 */