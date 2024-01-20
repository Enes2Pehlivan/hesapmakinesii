/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hesapmakinesi;

/**
 *
 * @author Enes
 */
public class hesapmakinesi extends javax.swing.JFrame
{

    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public hesapmakinesi() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sonuc = new javax.swing.JTextField();
        bes = new javax.swing.JButton();
        artieski = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        c = new javax.swing.JButton();
        artı = new javax.swing.JButton();
        eksi = new javax.swing.JButton();
        carpı = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        dokuz = new javax.swing.JButton();
        sekiz = new javax.swing.JButton();
        yedi = new javax.swing.JButton();
        dort = new javax.swing.JButton();
        bir = new javax.swing.JButton();
        iki = new javax.swing.JButton();
        uc = new javax.swing.JButton();
        altı = new javax.swing.JButton();
        geri = new javax.swing.JButton();
        sıfır = new javax.swing.JButton();
        nokta = new javax.swing.JButton();
        esittir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sonuc.setBackground(new java.awt.Color(147, 177, 166));
        sonuc.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        sonuc.setForeground(new java.awt.Color(255, 255, 255));
        sonuc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(sonuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 340, 70));

        bes.setBackground(new java.awt.Color(92, 131, 116));
        bes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bes.setForeground(new java.awt.Color(255, 255, 255));
        bes.setText("5");
        bes.setToolTipText("");
        bes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besActionPerformed(evt);
            }
        });
        getContentPane().add(bes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 74, 70));

        artieski.setBackground(new java.awt.Color(24, 61, 61));
        artieski.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        artieski.setForeground(new java.awt.Color(255, 255, 255));
        artieski.setText("+/\n\n-");
        artieski.setToolTipText("");
        artieski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artieskiActionPerformed(evt);
            }
        });
        getContentPane().add(artieski, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 74, 70));

        ce.setBackground(new java.awt.Color(24, 61, 61));
        ce.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        ce.setForeground(new java.awt.Color(255, 255, 255));
        ce.setText("CE");
        ce.setToolTipText("");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });
        getContentPane().add(ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 74, 70));

        c.setBackground(new java.awt.Color(24, 61, 61));
        c.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("C");
        c.setToolTipText("");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 74, 70));

        artı.setBackground(new java.awt.Color(24, 61, 61));
        artı.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        artı.setForeground(new java.awt.Color(255, 255, 255));
        artı.setText("+");
        artı.setToolTipText("");
        artı.setBorder(null);
        artı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artıActionPerformed(evt);
            }
        });
        getContentPane().add(artı, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 74, 70));

        eksi.setBackground(new java.awt.Color(24, 61, 61));
        eksi.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        eksi.setForeground(new java.awt.Color(255, 255, 255));
        eksi.setText("-");
        eksi.setToolTipText("");
        eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksiActionPerformed(evt);
            }
        });
        getContentPane().add(eksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 74, 70));

        carpı.setBackground(new java.awt.Color(24, 61, 61));
        carpı.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        carpı.setForeground(new java.awt.Color(255, 255, 255));
        carpı.setText("x");
        carpı.setToolTipText("");
        carpı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpıActionPerformed(evt);
            }
        });
        getContentPane().add(carpı, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 74, 70));

        bolme.setBackground(new java.awt.Color(24, 61, 61));
        bolme.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bolme.setForeground(new java.awt.Color(255, 255, 255));
        bolme.setText("/");
        bolme.setToolTipText("");
        bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolmeActionPerformed(evt);
            }
        });
        getContentPane().add(bolme, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 74, 70));

        dokuz.setBackground(new java.awt.Color(92, 131, 116));
        dokuz.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dokuz.setForeground(new java.awt.Color(255, 255, 255));
        dokuz.setText("9");
        dokuz.setToolTipText("");
        dokuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokuzActionPerformed(evt);
            }
        });
        getContentPane().add(dokuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 74, 70));

        sekiz.setBackground(new java.awt.Color(92, 131, 116));
        sekiz.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        sekiz.setForeground(new java.awt.Color(255, 255, 255));
        sekiz.setText("8");
        sekiz.setToolTipText("");
        sekiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekizActionPerformed(evt);
            }
        });
        getContentPane().add(sekiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 74, 70));

        yedi.setBackground(new java.awt.Color(92, 131, 116));
        yedi.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        yedi.setForeground(new java.awt.Color(255, 255, 255));
        yedi.setText("7");
        yedi.setToolTipText("");
        yedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yediActionPerformed(evt);
            }
        });
        getContentPane().add(yedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 74, 70));

        dort.setBackground(new java.awt.Color(92, 131, 116));
        dort.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dort.setForeground(new java.awt.Color(255, 255, 255));
        dort.setText("4");
        dort.setToolTipText("");
        dort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dortActionPerformed(evt);
            }
        });
        getContentPane().add(dort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 74, 70));

        bir.setBackground(new java.awt.Color(92, 131, 116));
        bir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bir.setForeground(new java.awt.Color(255, 255, 255));
        bir.setText("1");
        bir.setToolTipText("");
        bir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birActionPerformed(evt);
            }
        });
        getContentPane().add(bir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 74, 70));

        iki.setBackground(new java.awt.Color(92, 131, 116));
        iki.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        iki.setForeground(new java.awt.Color(255, 255, 255));
        iki.setText("2");
        iki.setToolTipText("");
        iki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiActionPerformed(evt);
            }
        });
        getContentPane().add(iki, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 74, 70));

        uc.setBackground(new java.awt.Color(92, 131, 116));
        uc.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        uc.setForeground(new java.awt.Color(255, 255, 255));
        uc.setText("3");
        uc.setToolTipText("");
        uc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucActionPerformed(evt);
            }
        });
        getContentPane().add(uc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 74, 70));

        altı.setBackground(new java.awt.Color(92, 131, 116));
        altı.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        altı.setForeground(new java.awt.Color(255, 255, 255));
        altı.setText("6");
        altı.setToolTipText("");
        altı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altıActionPerformed(evt);
            }
        });
        getContentPane().add(altı, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 74, 70));

        geri.setBackground(new java.awt.Color(24, 61, 61));
        geri.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        geri.setForeground(new java.awt.Color(255, 255, 255));
        geri.setText("←");
        geri.setToolTipText("");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });
        getContentPane().add(geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 74, 70));

        sıfır.setBackground(new java.awt.Color(92, 131, 116));
        sıfır.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        sıfır.setForeground(new java.awt.Color(255, 255, 255));
        sıfır.setText("0");
        sıfır.setToolTipText("");
        sıfır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sıfırActionPerformed(evt);
            }
        });
        getContentPane().add(sıfır, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 74, 70));

        nokta.setBackground(new java.awt.Color(24, 61, 61));
        nokta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nokta.setForeground(new java.awt.Color(255, 255, 255));
        nokta.setText(".");
        nokta.setToolTipText("");
        nokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noktaActionPerformed(evt);
            }
        });
        getContentPane().add(nokta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 74, 70));

        esittir.setBackground(new java.awt.Color(147, 177, 166));
        esittir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        esittir.setForeground(new java.awt.Color(255, 255, 255));
        esittir.setText("=");
        esittir.setToolTipText("");
        esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittirActionPerformed(evt);
            }
        });
        getContentPane().add(esittir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 74, 70));

        jPanel1.setBackground(new java.awt.Color(4, 13, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 380, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void EnterNumbers(String q ) {
         String Nums = sonuc.getText() + q;
         sonuc.setText(Nums);
         
     }
    private void ucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucActionPerformed
       EnterNumbers("3"); 
    }//GEN-LAST:event_ucActionPerformed

    private void birActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birActionPerformed
     EnterNumbers("1");        // TODO add your handling code here:
    }//GEN-LAST:event_birActionPerformed

    private void ikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiActionPerformed
        EnterNumbers("2"); 
    }//GEN-LAST:event_ikiActionPerformed

    private void dortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dortActionPerformed
       EnterNumbers("4"); 
    }//GEN-LAST:event_dortActionPerformed

    private void besActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besActionPerformed
        EnterNumbers("5"); 
    }//GEN-LAST:event_besActionPerformed

    private void altıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altıActionPerformed
   EnterNumbers("6"); 
    }//GEN-LAST:event_altıActionPerformed

    private void yediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yediActionPerformed
        EnterNumbers("7"); 
    }//GEN-LAST:event_yediActionPerformed

    private void sekizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekizActionPerformed
    EnterNumbers("8"); 
    }//GEN-LAST:event_sekizActionPerformed

    private void dokuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokuzActionPerformed
       EnterNumbers("9"); 
    }//GEN-LAST:event_dokuzActionPerformed

    private void sıfırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sıfırActionPerformed
     EnterNumbers("0"); 
    }//GEN-LAST:event_sıfırActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolmeActionPerformed
       NumEnter1 = Double.parseDouble(sonuc.getText());
       sonuc.setText("");
       op ="/";
    }//GEN-LAST:event_bolmeActionPerformed

    private void carpıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpıActionPerformed
      NumEnter1 = Double.parseDouble(sonuc.getText());
       sonuc.setText("");
       op ="x";
    }//GEN-LAST:event_carpıActionPerformed

    private void eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksiActionPerformed
        NumEnter1 = Double.parseDouble(sonuc.getText());
       sonuc.setText("");
       op ="-";
    }//GEN-LAST:event_eksiActionPerformed

    private void artıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artıActionPerformed
       NumEnter1 = Double.parseDouble(sonuc.getText());
       sonuc.setText("");
       op ="+";
    }//GEN-LAST:event_artıActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
      sonuc.setText("");
    }//GEN-LAST:event_cActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
       {                                   
    sonuc.setText("");
}
    }//GEN-LAST:event_ceActionPerformed

    private void artieskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artieskiActionPerformed
   {                                         
    double num = Double.parseDouble(sonuc.getText());
    num = -num;
    sonuc.setText(String.valueOf(num));
}
    }//GEN-LAST:event_artieskiActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
      String backSp = null;
      
      if(sonuc.getText().length() > 0)
      {
          StringBuilder ab = new StringBuilder(sonuc.getText());
          ab.deleteCharAt(sonuc.getText().length()-1);
          backSp = ab.toString();
          sonuc.setText(backSp);
      }
    }//GEN-LAST:event_geriActionPerformed

    private void noktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noktaActionPerformed
       if (! sonuc.getText().contains("."))
       {
           sonuc.setText(sonuc.getText() + nokta.getText());
       }
    }//GEN-LAST:event_noktaActionPerformed

    private void esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittirActionPerformed
  NumEnter2 = Double.parseDouble(sonuc.getText());
  if ( op == "+")
  {
      Result = NumEnter1 + NumEnter2;
      sonuc.setText(String.valueOf(Result));
  }
  else if (op == "-")
  {
      Result = NumEnter1 - NumEnter2;
      sonuc.setText(String.valueOf(Result));
  } 
  else if (op == "x")
  {
      Result = NumEnter1 * NumEnter2;
      sonuc.setText(String.valueOf(Result));
  }
   else if (op == "/")
  {
      Result = NumEnter1 / NumEnter2;
      sonuc.setText(String.valueOf(Result));
  }
    }//GEN-LAST:event_esittirActionPerformed

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
            java.util.logging.Logger.getLogger(hesapmakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hesapmakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hesapmakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hesapmakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new hesapmakinesi().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altı;
    private javax.swing.JButton artieski;
    private javax.swing.JButton artı;
    private javax.swing.JButton bes;
    private javax.swing.JButton bir;
    private javax.swing.JButton bolme;
    private javax.swing.JButton c;
    private javax.swing.JButton carpı;
    private javax.swing.JButton ce;
    private javax.swing.JButton dokuz;
    private javax.swing.JButton dort;
    private javax.swing.JButton eksi;
    private javax.swing.JButton esittir;
    private javax.swing.JButton geri;
    private javax.swing.JButton iki;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nokta;
    private javax.swing.JButton sekiz;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton sıfır;
    private javax.swing.JButton uc;
    private javax.swing.JButton yedi;
    // End of variables declaration//GEN-END:variables
}
