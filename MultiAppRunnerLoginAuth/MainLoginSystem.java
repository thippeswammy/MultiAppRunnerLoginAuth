package com.thippeswamy.app.MultiAppRunnerLoginAuth;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 * A simple login system with a GUI.Succesful logged in
 * User: thippeswamy
 */
public class MainLoginSystem extends JFrame {

    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    final String USERNAME = "THIPPESWAMY";
    final String PASSWORD = "THIPPESWAMY";

    public MainLoginSystem() {
        initComponents();
    }

    /**
     * @param args the command com.thippeswamy.app.swing.Line.line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(com.thippeswamy.app.MultiAppRunnerLoginAuth.MainLoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainLoginSystem().setVisible(true));
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        // Variables declaration - do not modify
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JButton jlogin = new JButton();
        JButton jexit = new JButton();
        JButton jreset = new JButton();
        JSeparator jSeparator1 = new JSeparator();
        JSeparator jSeparator2 = new JSeparator();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 30)); // NOI18N
        jLabel1.setText("Login system");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 25)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 25)); // NOI18N
        jLabel3.setText("User name");

        password.setFont(new java.awt.Font("Tahoma", Font.BOLD, 25)); // NOI18N

        username.setFont(new java.awt.Font("Tahoma", Font.BOLD, 25)); // NOI18N
        username.addActionListener(this::usernameActionPerformed);

        jlogin.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 23)); // NOI18N
        jlogin.setText("login");
        jlogin.addActionListener(this::loginButtonActionPerformed);

        jexit.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 23)); // NOI18N
        jexit.setText("exit");
        jexit.addActionListener(this::exitButtonActionPerformed);

        jreset.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 23)); // NOI18N
        jreset.setText("reset");
        jreset.addActionListener(this::resetButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jreset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(username))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(password))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlogin)
                                        .addComponent(jexit)
                                        .addComponent(jreset))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Implement action if needed
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String enteredPassword = password.getText();
        String enteredUsername = username.getText();
        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            password.setText("");
            username.setText("");
            //you can do what action u want if username and password matches
            // Successful login action or function_name()
            settings settings = new settings();
            settings.run();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login", JOptionPane.ERROR_MESSAGE);
            username.setText(enteredUsername);
            password.setText("");
        }
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        username.setText("");
        password.setText("");
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame frame = new JFrame("Exit");
        if ((JOptionPane.showConfirmDialog(frame, "Comfirm if you want to exit", "Confirmtion Dialog",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)) {
            System.exit(0);
        }
    }

    public void SuccessfulLoginAction() {
        JFrame frame = new JFrame("Successful");
        if ((JOptionPane.showConfirmDialog(frame, "Successful logged in", "Confirmtion Dialog",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)) {
            System.exit(0);
        }
    }
}

