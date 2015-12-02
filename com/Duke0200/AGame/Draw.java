/*     */ package com.Duke0200.AGame;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.image.BufferStrategy;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class Draw
/*     */ {
/*     */   JFrame frame;
/*     */   Canvas canvas;
/*     */   JFrame stats;
/*     */   Canvas canvaS;
/*     */   JLabel points;
/*     */   JLabel health;
/*     */   JLabel attack;
/*     */   JLabel defense;
/*     */   JLabel speed;
/*     */   JLabel range;
/*     */   StringBuffer s;
/*     */   BufferStrategy bufferStrategy;
/*     */   BufferStrategy bS;
/*  39 */   public static int WIDTH = 640;
/*  40 */   public static int HEIGHT = 480;
/*     */ 
/*     */   Draw() {
/*  43 */     this.frame = new JFrame("A Game | By Duke0200 |'Completed'");
/*  44 */     JPanel panel = (JPanel)this.frame.getContentPane();
/*  45 */     panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
/*  46 */     panel.setLayout(null);
/*     */ 
/*  48 */     this.canvas = new Canvas();
/*  49 */     this.canvas.setBounds(0, 0, WIDTH - 100, HEIGHT);
/*  50 */     this.canvas.setIgnoreRepaint(true);
/*  51 */     this.frame.setDefaultCloseOperation(3);
/*     */ 
/*  53 */     this.points = new JLabel();
/*  54 */     this.health = new JLabel();
/*  55 */     this.attack = new JLabel();
/*  56 */     this.defense = new JLabel();
/*  57 */     this.speed = new JLabel();
/*  58 */     this.range = new JLabel();
/*  59 */     showStats();
/*  60 */     panel.add(this.points);
/*  61 */     panel.add(this.health);
/*  62 */     panel.add(this.attack);
/*  63 */     panel.add(this.defense);
/*  64 */     panel.add(this.speed);
/*  65 */     panel.add(this.range);
/*     */ 
/*  67 */     this.frame.pack();
/*     */ 
/*  69 */     this.frame.setResizable(false);
/*  70 */     this.frame.setVisible(true);
/*     */ 
/*  72 */     panel.add(this.canvas);
/*  73 */     this.canvas.createBufferStrategy(2);
/*  74 */     this.bufferStrategy = this.canvas.getBufferStrategy();
/*     */ 
/*  76 */     this.canvas.requestFocus();
/*     */ 
/*  78 */     this.canvas.setBackground(Color.BLACK);
/*     */ 
/*  80 */     this.canvas.addKeyListener(new ButtonHandler());
/*     */   }
/*     */ 
/*     */   void Render() {
/*  84 */     Graphics2D g = (Graphics2D)this.bufferStrategy.getDrawGraphics();
/*  85 */     Graphics2D e = (Graphics2D)this.bufferStrategy.getDrawGraphics();
/*  86 */     g.clearRect(0, 0, WIDTH, HEIGHT);
/*  87 */     renderPlayer(g);
/*  88 */     renderEnemy(e);
/*  89 */     showStats();
/*  90 */     g.dispose();
/*  91 */     e.dispose();
/*  92 */     this.bufferStrategy.show();
/*     */   }
/*     */ 
/*     */   protected void renderPlayer(Graphics2D g)
/*     */   {
/*  97 */     g.drawImage(Instances.player.img, Instances.player.getX(), Instances.player.getY(), null);
/*     */   }
/*     */   protected void renderEnemy(Graphics2D g) {
/* 100 */     g.drawImage(Instances.enemy.img, Instances.enemy.getX(), Instances.enemy.getY(), null);
/*     */   }
/*     */ 
/*     */   protected void showStats()
/*     */   {
/* 105 */     this.points.setText("Points - " + Instances.player.displayPoints());
/* 106 */     this.health.setText("Player Health - " + Instances.player.displayHealth());
/* 107 */     this.attack.setText("Player Attack - " + Instances.player.displayAttack());
/* 108 */     this.defense.setText("Player Defense - " + Instances.player.displayDefense());
/* 109 */     this.speed.setText("Player Speed - " + Instances.player.displaySpeed());
/* 110 */     this.range.setText("Player Range - " + Instances.player.displayRange());
/*     */   }
/*     */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Draw
 * JD-Core Version:    0.6.2
 */