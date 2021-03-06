/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KadirIrpik.k_en_yakin_komsu;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author irpik
 */
public class Main extends javax.swing.JFrame {
    
    DefaultTableModel gozlemVerileriModel;
    DefaultTableModel sonucTabloModel;
    
    

    /**
     * Creates new form Main
     */
    public Main() {
        this.setTitle("K-en Yakın Komşu Algoritması");
        initComponents();
        nitelikLBL.requestFocusInWindow();
        gozlemVerileriModel = (DefaultTableModel) gozlemVerileriTBL.getModel();
        sonucTabloModel = (DefaultTableModel) sonucTBL.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nitelikLBL = new javax.swing.JLabel();
        nitelikSayisiTF = new javax.swing.JTextField();
        nitelikSayisiBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gozlemVerileriTBL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gozlemVeriGirisiTF = new javax.swing.JTextField();
        ekleBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kDegeriTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hesaplanacakGozlemTF = new javax.swing.JTextField();
        hesaplaBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sonucTBL = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sonucLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        nitelikLBL.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nitelikLBL.setForeground(new java.awt.Color(204, 0, 0));
        nitelikLBL.setText("Nitelik Sayısını Giriniz:");

        nitelikSayisiTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nitelikSayisiTF.setForeground(new java.awt.Color(0, 204, 0));
        nitelikSayisiTF.setText("Örn: 2");
        nitelikSayisiTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nitelikSayisiTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nitelikSayisiTFFocusLost(evt);
            }
        });
        nitelikSayisiTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitelikSayisiTFKeyTyped(evt);
            }
        });

        nitelikSayisiBTN.setBackground(new java.awt.Color(204, 204, 0));
        nitelikSayisiBTN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nitelikSayisiBTN.setForeground(new java.awt.Color(204, 0, 0));
        nitelikSayisiBTN.setText("Oluştur");
        nitelikSayisiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitelikSayisiBTNActionPerformed(evt);
            }
        });

        gozlemVerileriTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gozlemVerileriTBL);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Gözlem Verileri");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Gözlem Verilerini Giriniz");

        gozlemVeriGirisiTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gozlemVeriGirisiTF.setForeground(new java.awt.Color(0, 204, 0));
        gozlemVeriGirisiTF.setText("Örn: 2,4,İyi");
        gozlemVeriGirisiTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gozlemVeriGirisiTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gozlemVeriGirisiTFFocusLost(evt);
            }
        });

        ekleBTN.setBackground(new java.awt.Color(204, 204, 0));
        ekleBTN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ekleBTN.setForeground(new java.awt.Color(204, 0, 0));
        ekleBTN.setText("Ekle");
        ekleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("K değerini giriniz:");

        kDegeriTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kDegeriTF.setForeground(new java.awt.Color(0, 204, 0));
        kDegeriTF.setText("Örn: 4");
        kDegeriTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kDegeriTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kDegeriTFFocusLost(evt);
            }
        });
        kDegeriTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kDegeriTFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Hesaplanacak Gözlem Noktası:");

        hesaplanacakGozlemTF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hesaplanacakGozlemTF.setForeground(new java.awt.Color(0, 204, 0));
        hesaplanacakGozlemTF.setText("Örn: 8,4");
        hesaplanacakGozlemTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hesaplanacakGozlemTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hesaplanacakGozlemTFFocusLost(evt);
            }
        });

        hesaplaBTN.setBackground(new java.awt.Color(204, 204, 0));
        hesaplaBTN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hesaplaBTN.setForeground(new java.awt.Color(204, 0, 0));
        hesaplaBTN.setText("Hesapla");
        hesaplaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaBTNActionPerformed(evt);
            }
        });

        sonucTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(sonucTBL);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("SONUÇ TABLOSU");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Yeni Gözlem Sınıfı:");

        sonucLBL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sonucLBL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gozlemVeriGirisiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ekleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hesaplanacakGozlemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kDegeriTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(hesaplaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nitelikLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nitelikSayisiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nitelikSayisiBTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonucLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(624, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nitelikLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nitelikSayisiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nitelikSayisiBTN))
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gozlemVeriGirisiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ekleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kDegeriTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hesaplanacakGozlemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(hesaplaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sonucLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nitelikSayisiTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitelikSayisiTFKeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                ||(vchar == KeyEvent.VK_BACK_SPACE)
                ||(vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nitelikSayisiTFKeyTyped

    private void nitelikSayisiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitelikSayisiBTNActionPerformed
        int tabloSutunSayisi = Integer.valueOf(nitelikSayisiTF.getText());
        for (int i = 0; i < tabloSutunSayisi; i++) {
            String isim = "X"+(i+1);
            gozlemVerileriModel.addColumn(isim);
            sonucTabloModel.addColumn(isim);
        }
        gozlemVerileriModel.addColumn("Durum");
        sonucTabloModel.addColumn("Uzaklık");
        sonucTabloModel.addColumn("Sıra");
        sonucTabloModel.addColumn("k komşusunun y değeri");
    }//GEN-LAST:event_nitelikSayisiBTNActionPerformed
int satirNo = 0;
//String[] veriler2;
    private void ekleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleBTNActionPerformed
        String[] veriler = new String[Integer.valueOf(nitelikSayisiTF.getText())+1];
//        veriler2 = new String[Integer.valueOf(nitelikSayisiTF.getText())];
        veriler = gozlemVeriGirisiTF.getText().split(",");
//        for (int i = 0; i < veriler2.length; i++) {
//            veriler2[i] = veriler[i];
//        }
        gozlemVerileriModel.insertRow(satirNo, veriler);
//        sonucTabloModel.insertRow(satirNo, veriler2);
        satirNo++;
    }//GEN-LAST:event_ekleBTNActionPerformed

    private void hesaplaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaBTNActionPerformed
        
        String[] hesaplanacakGozlemVerileri = hesaplanacakGozlemTF.getText().split(",");
        int[] hesplanacakGozlemYeni = new int[hesaplanacakGozlemVerileri.length];
        for (int i = 0; i < hesaplanacakGozlemVerileri.length; i++) {
            hesplanacakGozlemYeni[i] = Integer.valueOf(hesaplanacakGozlemVerileri[i]);
        }

        Double[] uzakliklar = new Double[getTableDataGozlemVerileri().length];
        for (int i = 0; i < getTableDataGozlemVerileri().length; i++) {
            double uzaklik = 0;
            for (int j = 0; j < getTableDataGozlemVerileri()[0].length; j++) {
                uzaklik += Math.pow(getTableDataGozlemVerileri()[i][j]-hesplanacakGozlemYeni[j],2); 
            }
            uzakliklar[i] = Math.sqrt(uzaklik);   
        }
        Double[] sirali = new Double[uzakliklar.length];
        for (int i = 0; i < uzakliklar.length; i++) {
            sirali[i] = uzakliklar[i];
        }
        Arrays.sort(sirali);
       
        int[] sira = new int[uzakliklar.length];   
        for (int i = 0; i < uzakliklar.length; i++) {
            sira[i] = Arrays.asList(sirali).indexOf(uzakliklar[i])+1;
            sirali[Arrays.asList(sirali).indexOf(uzakliklar[i])] = -1.0;
        }
        
        String[] sonucKontrol = new String[Integer.valueOf(kDegeriTF.getText())]; 
        int say = 0;
        
        for (int i = 0; i < getTableDataGozlemVerileri().length; i++) {
            String[] ekle = new String[Integer.valueOf(nitelikSayisiTF.getText())+3];
            for (int j = 0; j < Integer.valueOf(nitelikSayisiTF.getText()); j++) {
                ekle[j] = String.valueOf(getTableDataGozlemVerileri()[i][j]);
            }
            ekle[Integer.valueOf(nitelikSayisiTF.getText())] = String.valueOf(uzakliklar[i]);
            ekle[Integer.valueOf(nitelikSayisiTF.getText())+1] = String.valueOf(sira[i]);
            
            if(sira[i] <= Integer.valueOf(kDegeriTF.getText())){ 
                ekle[Integer.valueOf(nitelikSayisiTF.getText())+2] = ilkTabloVerileri()[i][Integer.valueOf(nitelikSayisiTF.getText())];
                sonucKontrol[say] = ekle[Integer.valueOf(nitelikSayisiTF.getText())+2];
                say++;
            }
            else{
                ekle[4] = "";
            }
            sonucTabloModel.insertRow(i, ekle);
        }
        int e = 0;
        int h = 0;
        String evet = sonucKontrol[0];
        String hayir = "";
        for (int i = 0; i < sonucKontrol.length; i++) {
            if (sonucKontrol[i].equalsIgnoreCase(sonucKontrol[0])) {
                e++;
            }
            else{
                h++;
                hayir = sonucKontrol[i];
            }
        }
        if (e > h) {
            sonucLBL.setText(evet);
        }
        else if(e == h){
            sonucLBL.setText("Eşit");
        }
        else{
            sonucLBL.setText(hayir);
        }
    }//GEN-LAST:event_hesaplaBTNActionPerformed

    private void kDegeriTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kDegeriTFKeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                ||(vchar == KeyEvent.VK_BACK_SPACE)
                ||(vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_kDegeriTFKeyTyped

    private void nitelikSayisiTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nitelikSayisiTFFocusGained
        if (nitelikSayisiTF.getText().equals("Örn: 2")) {
            nitelikSayisiTF.setText("");                                              
            nitelikSayisiTF.setForeground(new Color(0,204,0));                              
        }
    }//GEN-LAST:event_nitelikSayisiTFFocusGained

    private void nitelikSayisiTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nitelikSayisiTFFocusLost
       if (nitelikSayisiTF.getText().equals("")) {                                     
            nitelikSayisiTF.setText("Örn: 2");                                       
            nitelikSayisiTF.setForeground(new Color(0,204,0));
        }
    }//GEN-LAST:event_nitelikSayisiTFFocusLost

    private void gozlemVeriGirisiTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gozlemVeriGirisiTFFocusGained
        if (gozlemVeriGirisiTF.getText().equals("Örn: 2,4,İyi")) {
            gozlemVeriGirisiTF.setText("");                                              
            gozlemVeriGirisiTF.setForeground(new Color(0,204,0));                              
        }
    }//GEN-LAST:event_gozlemVeriGirisiTFFocusGained

    private void gozlemVeriGirisiTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gozlemVeriGirisiTFFocusLost
        if (gozlemVeriGirisiTF.getText().equals("")) {                                     
            gozlemVeriGirisiTF.setText("Örn: 2,4,İyi");                                       
            gozlemVeriGirisiTF.setForeground(new Color(0,204,0));
        }
    }//GEN-LAST:event_gozlemVeriGirisiTFFocusLost

    private void kDegeriTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kDegeriTFFocusGained
        if (kDegeriTF.getText().equals("Örn: 4")) {
            kDegeriTF.setText("");                                              
            kDegeriTF.setForeground(new Color(0,204,0));                              
        }
    }//GEN-LAST:event_kDegeriTFFocusGained

    private void kDegeriTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kDegeriTFFocusLost
        if (kDegeriTF.getText().equals("")) {                                     
            kDegeriTF.setText("Örn: 4");                                       
            kDegeriTF.setForeground(new Color(0,204,0));
        }
    }//GEN-LAST:event_kDegeriTFFocusLost

    private void hesaplanacakGozlemTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hesaplanacakGozlemTFFocusGained
        if (hesaplanacakGozlemTF.getText().equals("Örn: 8,4")) {
            hesaplanacakGozlemTF.setText("");                                              
            hesaplanacakGozlemTF.setForeground(new Color(0,204,0));                              
        }
    }//GEN-LAST:event_hesaplanacakGozlemTFFocusGained

    private void hesaplanacakGozlemTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hesaplanacakGozlemTFFocusLost
        if (hesaplanacakGozlemTF.getText().equals("")) {                                     
            hesaplanacakGozlemTF.setText("Örn: 8,4");                                       
            hesaplanacakGozlemTF.setForeground(new Color(0,204,0));
        }
    }//GEN-LAST:event_hesaplanacakGozlemTFFocusLost

    
    
    public String[][] ilkTabloVerileri () {                                     
    DefaultTableModel dtm = (DefaultTableModel) gozlemVerileriTBL.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
    String[][] tableData = new String[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++)
        for (int j = 0 ; j < nCol ; j++)
            tableData[i][j] = (String)dtm.getValueAt(i,j);
    return tableData;
    }
    
    public int[][] getTableDataGozlemVerileri () {                                     
    DefaultTableModel dtm = (DefaultTableModel) gozlemVerileriTBL.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount()-1;
    int[][] tableData = new int[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++)
        for (int j = 0 ; j < nCol ; j++)
            tableData[i][j] = Integer.parseInt((String)dtm.getValueAt(i,j));
    return tableData;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekleBTN;
    private javax.swing.JTextField gozlemVeriGirisiTF;
    private javax.swing.JTable gozlemVerileriTBL;
    private javax.swing.JButton hesaplaBTN;
    private javax.swing.JTextField hesaplanacakGozlemTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kDegeriTF;
    private javax.swing.JLabel nitelikLBL;
    private javax.swing.JButton nitelikSayisiBTN;
    private javax.swing.JTextField nitelikSayisiTF;
    private javax.swing.JLabel sonucLBL;
    private javax.swing.JTable sonucTBL;
    // End of variables declaration//GEN-END:variables
}
