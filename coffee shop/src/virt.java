
public class virt extends javax.swing.JFrame {

    
    public virt() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        coffee = new javax.swing.JRadioButton();
        cap = new javax.swing.JRadioButton();
        tea = new javax.swing.JRadioButton();
        burger = new javax.swing.JCheckBox();
        sandwhich = new javax.swing.JCheckBox();
        chocolate = new javax.swing.JCheckBox();
        subtotal = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        subtoatal1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tax1 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        total1 = new javax.swing.JTextPane();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("coffee shop");

        coffee.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        coffee.setForeground(new java.awt.Color(255, 153, 153));
        coffee.setText("coffee");
        coffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffeeActionPerformed(evt);
            }
        });

        cap.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cap.setForeground(new java.awt.Color(255, 51, 153));
        cap.setText("capcheno");
        cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capActionPerformed(evt);
            }
        });

        tea.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        tea.setForeground(new java.awt.Color(204, 0, 51));
        tea.setText("tea");
        tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaActionPerformed(evt);
            }
        });

        burger.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        burger.setForeground(new java.awt.Color(255, 51, 204));
        burger.setText("burger");
        burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerActionPerformed(evt);
            }
        });

        sandwhich.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sandwhich.setForeground(new java.awt.Color(255, 51, 51));
        sandwhich.setText("sandwhich");
        sandwhich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwhichActionPerformed(evt);
            }
        });

        chocolate.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        chocolate.setForeground(new java.awt.Color(255, 0, 102));
        chocolate.setText("chocolate");
        chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolateActionPerformed(evt);
            }
        });

        subtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtotal.setForeground(new java.awt.Color(255, 102, 51));
        subtotal.setText("subtotal");

        tax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tax.setText("tax");

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setText("total");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane3.setViewportView(subtoatal1);

        jScrollPane6.setViewportView(tax1);

        jScrollPane7.setViewportView(total1);

        enter.setText(" enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cap)
                            .addComponent(coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tea)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addComponent(sandwhich)
                            .addComponent(burger, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enter)
                            .addComponent(clear)
                            .addComponent(exit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffee)
                    .addComponent(burger))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cap)
                    .addComponent(sandwhich))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tea)
                    .addComponent(chocolate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtotal)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tax))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enter)
                                .addGap(18, 18, 18)
                                .addComponent(clear)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffeeActionPerformed
        // TODO add your handling code here:
        if(coffee.isSelected())
            cap.setSelected(false);
            tea.setSelected(false);
    }//GEN-LAST:event_coffeeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        coffee.setSelected(false);
        tea.setSelected(false);
        cap.setSelected(false);
        burger.setSelected(false);
        chocolate.setSelected(false);
        sandwhich.setSelected(false);
        subtoatal1.setText("");
          tax1.setText("");
            total1.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void capActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capActionPerformed
        // TODO add your handling code here:
         if(cap.isSelected())
            tea.setSelected(false);
            coffee.setSelected(false);
    }//GEN-LAST:event_capActionPerformed

    private void teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaActionPerformed
        // TODO add your handling code here:
         if(tea.isSelected())
            coffee.setSelected(false);
            cap.setSelected(false);
    }//GEN-LAST:event_teaActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        double total;
        double subtotal = 0;
        final double taxrate =0.9;
        double tax;
        if(coffee.isSelected()){
            subtotal = subtotal +2;
            
        }
        else if(tea.isSelected()){
             subtotal = subtotal +1;
              
        }
          else if(cap.isSelected()){
             subtotal = subtotal +9;
              
        }
        
        if(burger.isSelected()){
            subtotal = subtotal +99;
        }
        if(sandwhich.isSelected()){
            subtotal = subtotal +131;
        }
        if(chocolate.isSelected()){
            subtotal = subtotal +131;
        }
        subtoatal1.setText(Double.toString(subtotal));
        subtotal = Double.parseDouble(subtoatal1.getText());
        tax = subtotal * taxrate;
        total = tax + subtotal;
        
         
        tax1.setText(Double.toString(tax));
        total1.setText(Double.toString(total));
        
        
    }//GEN-LAST:event_enterActionPerformed

    private void burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_burgerActionPerformed

    private void sandwhichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwhichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sandwhichActionPerformed

    private void chocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chocolateActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new virt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox burger;
    private javax.swing.JRadioButton cap;
    private javax.swing.JCheckBox chocolate;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton coffee;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JCheckBox sandwhich;
    private javax.swing.JTextPane subtoatal1;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel tax;
    private javax.swing.JTextPane tax1;
    private javax.swing.JRadioButton tea;
    private javax.swing.JLabel total;
    private javax.swing.JTextPane total1;
    // End of variables declaration//GEN-END:variables
}
