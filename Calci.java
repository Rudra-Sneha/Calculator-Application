package com.sneha.calclator;

// @author Sneha Rudra
public class Calci extends javax.swing.JFrame {

    double num1=0,num2=0;
    String operator=null;
    /**
     * Creates new form Calci
     */
    public Calci() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        t1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 302, 37));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 105, 58, -1));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 105, 58, -1));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(58, 23));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 105, -1, -1));

        bdiv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        getContentPane().add(bdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 105, 58, -1));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 140, 58, -1));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 140, 58, -1));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 140, 58, -1));

        bmul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });
        getContentPane().add(bmul, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 140, 58, -1));

        b1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 175, 58, -1));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 175, 58, -1));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 175, 58, -1));

        bsub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsub.setText("-");
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });
        getContentPane().add(bsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 175, 58, -1));

        b0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 216, 58, -1));

        bdot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        getContentPane().add(bdot, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 216, 58, -1));

        bequal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });
        getContentPane().add(bequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 216, 58, -1));

        badd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        badd.setText("+");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        getContentPane().add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 216, 58, -1));

        bclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bclear.setText("Clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 257, 140, -1));

        bback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bback.setText("Back");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });
        getContentPane().add(bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 257, 130, -1));

        pack();
    }// </editor-fold>                        

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       t1.setText(t1.getText()+"7");
    }                                  

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {                                     
        num1=Double.parseDouble(t1.getText());
        t1.setText("");
        operator="-";
    }                                    

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"8");
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        t1.setText(t1.getText()+"9");
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"4");
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"5");
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        t1.setText(t1.getText()+"6");
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        t1.setText(t1.getText()+"1");
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"2");
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"3");
    }                                  

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         t1.setText(t1.getText()+"0");
    }                                  

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {                                     
         t1.setText(t1.getText()+".");
    }                                    

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {                                     
        num1=Double.parseDouble(t1.getText());
        t1.setText("");
        operator="/";
    }                                    

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {                                     
        num1=Double.parseDouble(t1.getText());
        t1.setText("");
        operator="*";
    }                                    

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {                                     
       num1=Double.parseDouble(t1.getText());
        t1.setText("");
        operator="+";
    }                                    

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        num2=Double.parseDouble(t1.getText());
        double ans=0;
        if(operator=="+"){
            ans=num1+num2;
        }
        if(operator=="-"){
            ans=num1-num2;
        }
        if(operator=="*"){
            ans=num1*num2;
        }
        if(operator=="/"){
            ans=num1/num2;
        }
        t1.setText(""+ans);
        
        operator=null;
    }                                      

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {                                       
        t1.setText("");
    }                                      

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String str=t1.getText();
       t1.setText(str.substring(0,str.length()-1));
    }                                     

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calci().setVisible(true);
            }
        });
    }

    // Variables declaration                      
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bback;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField t1;
    // End of variables declaration                   
}
