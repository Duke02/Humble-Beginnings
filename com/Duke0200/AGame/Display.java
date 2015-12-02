/*     */ package com.Duke0200.AGame;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.image.BufferStrategy;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ 
/*     */ public class Display extends JFrame
/*     */ {
/*     */   BufferStrategy bufferStrategy;
/*     */   private Canvas canvas1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel10;
/*     */   private JLabel jLabel11;
/*     */   private JLabel jLabel12;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private JLabel jLabel8;
/*     */   private JLabel jLabel9;
/*     */   private JSeparator jSeparator1;
/*     */ 
/*     */   public Display()
/*     */   {
/*  24 */     initComponents();
/*  25 */     setVisible(true);
/*  26 */     this.canvas1.requestFocus();
/*  27 */     this.canvas1.createBufferStrategy(2);
/*  28 */     this.bufferStrategy = this.canvas1.getBufferStrategy();
/*  29 */     this.canvas1.addKeyListener(new ButtonHandler());
/*     */   }
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  41 */     this.canvas1 = new Canvas();
/*  42 */     this.jSeparator1 = new JSeparator();
/*  43 */     this.jLabel7 = new JLabel();
/*  44 */     this.jLabel2 = new JLabel();
/*  45 */     this.jLabel3 = new JLabel();
/*  46 */     this.jLabel4 = new JLabel();
/*  47 */     this.jLabel5 = new JLabel();
/*  48 */     this.jLabel6 = new JLabel();
/*  49 */     this.jLabel1 = new JLabel();
/*  50 */     this.jLabel8 = new JLabel();
/*  51 */     this.jLabel9 = new JLabel();
/*  52 */     this.jLabel10 = new JLabel();
/*  53 */     this.jLabel11 = new JLabel();
/*  54 */     this.jLabel12 = new JLabel();
/*     */ 
/*  56 */     setDefaultCloseOperation(3);
/*  57 */     setPreferredSize(new Dimension(700, 600));
/*  58 */     setResizable(false);
/*     */ 
/*  60 */     this.canvas1.setBackground(new Color(50, 202, 88));
/*     */ 
/*  62 */     this.jSeparator1.setOrientation(1);
/*     */ 
/*  64 */     this.jLabel7.setText("Enemy Health - " + Instances.enemy.displayHealth());
/*     */ 
/*  66 */     this.jLabel2.setText("Player Attack - " + Instances.player.displayAttack());
/*     */ 
/*  68 */     this.jLabel3.setText("Player Health - " + Instances.player.displayHealth());
/*     */ 
/*  70 */     this.jLabel4.setText("Player Defense - " + Instances.player.displayDefense());
/*     */ 
/*  72 */     this.jLabel5.setText("Player Speed - " + Instances.player.displaySpeed());
/*     */ 
/*  74 */     this.jLabel6.setText("Player Range - " + Instances.player.displayRange());
/*     */ 
/*  76 */     this.jLabel1.setText("Points - " + Instances.player.displayPoints());
/*     */ 
/*  78 */     this.jLabel8.setText("Enemy Attack - " + Instances.enemy.displayAttack());
/*     */ 
/*  80 */     this.jLabel9.setText("Enemy Speed - " + Instances.enemy.displaySpeed());
/*     */ 
/*  82 */     this.jLabel10.setText("Enemy defense - " + Instances.enemy.displayDefense());
/*     */ 
/*  84 */     this.jLabel11.setText("Enemy Range - " + Instances.enemy.displayRange());
/*     */ 
/*  86 */     this.jLabel12.setText(Instances.player.winOrLose());
/*     */ 
/*  88 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  89 */     getContentPane().setLayout(layout);
/*  90 */     layout.setHorizontalGroup(
/*  91 */       layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  92 */       .addGroup(layout.createSequentialGroup()
/*  93 */       .addContainerGap()
/*  94 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  95 */       .addComponent(this.jLabel7, -1, 130, 32767)
/*  96 */       .addComponent(this.jLabel8, -1, -1, 32767)
/*  97 */       .addComponent(this.jLabel9, -1, -1, 32767)
/*  98 */       .addComponent(this.jLabel10, -1, -1, 32767)
/*  99 */       .addComponent(this.jLabel11, -1, -1, 32767))
/* 100 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 101 */       .addComponent(this.canvas1, -2, 326, -2)
/* 102 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 103 */       .addComponent(this.jSeparator1, -2, -1, -2)
/* 104 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 105 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 106 */       .addComponent(this.jLabel5, -1, -1, 32767)
/* 107 */       .addComponent(this.jLabel4, -1, -1, 32767)
/* 108 */       .addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/* 109 */       .addComponent(this.jLabel3, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/* 110 */       .addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/* 111 */       .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 112 */       .addComponent(this.jLabel6, -2, 250, -2)
/* 113 */       .addGap(0, 0, 32767))
/* 114 */       .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 115 */       .addComponent(this.jLabel12, -1, -1, 32767)
/* 116 */       .addContainerGap()))));
/*     */ 
/* 118 */     layout.setVerticalGroup(
/* 119 */       layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 120 */       .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 121 */       .addContainerGap()
/* 122 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 123 */       .addComponent(this.jSeparator1)
/* 124 */       .addComponent(this.canvas1, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/* 125 */       .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 126 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 127 */       .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 128 */       .addComponent(this.jLabel7, -2, 41, -2)
/* 129 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 130 */       .addComponent(this.jLabel8, -2, 38, -2)
/* 131 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 132 */       .addComponent(this.jLabel10, -2, 38, -2)
/* 133 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 134 */       .addComponent(this.jLabel9, -2, 38, -2)
/* 135 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 136 */       .addComponent(this.jLabel11, -2, 38, -2))
/* 137 */       .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
/* 138 */       .addComponent(this.jLabel1, -2, 41, -2)
/* 139 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 140 */       .addComponent(this.jLabel3, -2, 41, -2)
/* 141 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 142 */       .addComponent(this.jLabel2, -2, 41, -2)
/* 143 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 144 */       .addComponent(this.jLabel4, -2, 41, -2)
/* 145 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 146 */       .addComponent(this.jLabel5, -2, 41, -2)
/* 147 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 148 */       .addComponent(this.jLabel6, -2, 41, -2)))
/* 149 */       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 150 */       .addComponent(this.jLabel12, -1, -1, 32767)))
/* 151 */       .addContainerGap()));
/*     */ 
/* 154 */     pack();
/*     */   }
/*     */ 
/*     */   void Render()
/*     */   {
/* 175 */     Graphics2D g = (Graphics2D)this.bufferStrategy.getDrawGraphics();
/* 176 */     Graphics2D e = (Graphics2D)this.bufferStrategy.getDrawGraphics();
/* 177 */     g.clearRect(0, 0, 700, 600);
/*     */ 
/* 180 */     renderPlayer(g);
/* 181 */     renderEnemy(e);
/* 182 */     showPlayerStats();
/* 183 */     showEnemyStats();
/* 184 */     checkVictors();
/*     */ 
/* 186 */     g.dispose();
/* 187 */     e.dispose();
/* 188 */     this.bufferStrategy.show();
/*     */   }
/*     */ 
/*     */   protected void renderPlayer(Graphics2D g) {
/* 192 */     g.drawImage(Instances.player.img, Instances.player.getX(), Instances.player.getY(), null);
/*     */   }
/*     */   protected void renderEnemy(Graphics2D g) {
/* 195 */     g.drawImage(Instances.enemy.img, Instances.enemy.getX(), Instances.enemy.getY(), null);
/*     */   }
/*     */   protected void showPlayerStats() {
/* 198 */     this.jLabel1.setText("Points - " + Instances.player.displayPoints());
/*     */ 
/* 200 */     this.jLabel2.setText("Player Attack - " + Instances.player.displayAttack());
/*     */ 
/* 202 */     this.jLabel3.setText("Player Health - " + Instances.player.displayHealth());
/*     */ 
/* 204 */     this.jLabel4.setText("Player Defense - " + Instances.player.displayDefense());
/*     */ 
/* 206 */     this.jLabel5.setText("Player Speed - " + Instances.player.displaySpeed());
/*     */ 
/* 208 */     this.jLabel6.setText("Player Range - " + Instances.player.displayRange());
/*     */   }
/*     */   protected void showEnemyStats() {
/* 211 */     this.jLabel7.setText("Enemy Health - " + Instances.enemy.displayHealth());
/* 212 */     this.jLabel8.setText("Enemy Attack - " + Instances.enemy.displayAttack());
/*     */ 
/* 214 */     this.jLabel9.setText("Enemy Speed - " + Instances.enemy.displaySpeed());
/*     */ 
/* 216 */     this.jLabel10.setText("Enemy defense - " + Instances.enemy.displayDefense());
/*     */ 
/* 218 */     this.jLabel11.setText("Enemy Range - " + Instances.enemy.displayRange());
/*     */   }
/*     */   protected void checkVictors() {
/* 221 */     this.jLabel12.setText(Instances.player.winOrLose());
/*     */   }
/*     */ }

/* Location:           /Users/trystan/Downloads/Humble Beginnings.jar
 * Qualified Name:     com.Duke0200.AGame.Display
 * JD-Core Version:    0.6.2
 */