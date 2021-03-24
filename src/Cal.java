import java.awt.Toolkit;
import java.text.DecimalFormat;
public class Cal extends javax.swing.JFrame {
    double firstNum;
    double secondNum;
    double total;
    double plusminus;

    int plusClick;
    int minusClick;
    int multiplyClick;
    int devideClick;
    int decimalClick;
    public Cal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        ac = new javax.swing.JButton();
        change = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        dvide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        equal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NJM.png")));
        setPreferredSize(new java.awt.Dimension(325, 455));
        getContentPane().setLayout(null);

        display.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display);
        display.setBounds(18, 11, 270, 55);

        ac.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        ac.setText("AC");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        getContentPane().add(ac);
        ac.setBounds(18, 72, 132, 63);

        change.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        change.setText("+/-");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change);
        change.setBounds(156, 72, 63, 63);

        one.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one);
        one.setBounds(18, 141, 63, 63);

        two.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two);
        two.setBounds(87, 141, 63, 63);

        three.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three);
        three.setBounds(156, 141, 63, 63);

        four.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four);
        four.setBounds(18, 210, 63, 63);

        five.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five);
        five.setBounds(87, 210, 63, 63);

        six.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six);
        six.setBounds(156, 210, 63, 63);

        seven.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven);
        seven.setBounds(18, 279, 63, 63);

        eight.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight);
        eight.setBounds(87, 279, 63, 63);

        nine.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine);
        nine.setBounds(156, 279, 63, 63);

        zero.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero);
        zero.setBounds(18, 348, 63, 63);

        point.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        getContentPane().add(point);
        point.setBounds(87, 348, 63, 63);

        dvide.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        dvide.setText("÷");
        dvide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvideActionPerformed(evt);
            }
        });
        getContentPane().add(dvide);
        dvide.setBounds(225, 72, 63, 63);

        multiply.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        getContentPane().add(multiply);
        multiply.setBounds(225, 141, 63, 63);

        minus.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus);
        minus.setBounds(225, 210, 63, 63);

        plus.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus);
        plus.setBounds(225, 279, 63, 132);

        equal.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal);
        equal.setBounds(156, 348, 63, 63);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        display.setText("");
        decimalClick=0;
    }//GEN-LAST:event_acActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        plusminus=(Double.parseDouble(String.valueOf(display.getText())));
        plusminus=plusminus*(-1);
        display.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_changeActionPerformed

    private void dvideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvideActionPerformed
        firstNum=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        devideClick=1;
        decimalClick=0;
    }//GEN-LAST:event_dvideActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed

    }//GEN-LAST:event_displayActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        display.setText(display.getText()+one.getText());
    }//GEN-LAST:event_oneActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        display.setText(display.getText()+four.getText());
    }//GEN-LAST:event_fourActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        display.setText(display.getText()+seven.getText());
    }//GEN-LAST:event_sevenActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        display.setText(display.getText()+zero.getText());
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        display.setText(display.getText()+two.getText());
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        display.setText(display.getText()+three.getText());
    }//GEN-LAST:event_threeActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        firstNum=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        multiplyClick=1;
        decimalClick=0;
    }//GEN-LAST:event_multiplyActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        display.setText(display.getText()+five.getText());
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        display.setText(display.getText()+six.getText());
    }//GEN-LAST:event_sixActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
       firstNum=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        minusClick=1;
        decimalClick=0;
    }//GEN-LAST:event_minusActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        display.setText(display.getText()+eight.getText());
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        display.setText(display.getText()+nine.getText());
    }//GEN-LAST:event_nineActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        firstNum=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        plusClick=1;
        decimalClick=0;
    }//GEN-LAST:event_plusActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if(decimalClick==0){
        display.setText(display.getText()+point.getText());
        decimalClick=1;
    } 
    }//GEN-LAST:event_pointActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        DecimalFormat df=new DecimalFormat(".00");
        secondNum=(Double.parseDouble(String.valueOf(display.getText())));
        if(plusClick>0){
        total = firstNum + secondNum;
        display.setText(String.valueOf(df.format(total)));
        firstNum = 0;
        secondNum = 0;
        plusClick = 0;
        }


         if(minusClick>0){
         total = firstNum - secondNum;
         display.setText(String.valueOf(df.format(total)));
         firstNum = 0;
         secondNum = 0;
         minusClick = 0;

        }                                      
    
         if(multiplyClick>0){
         total = firstNum * secondNum;
         display.setText(String.valueOf(df.format(total)));
         firstNum = 0;
         secondNum = 0;
         multiplyClick = 0;
     
        }

        if(devideClick>0){
        total = firstNum / secondNum;
        display.setText(String.valueOf(df.format(total)));
         firstNum = 0;
        secondNum = 0;
         devideClick = 0;

      }
    }//GEN-LAST:event_equalActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton change;
    private javax.swing.JTextField display;
    private javax.swing.JButton dvide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
