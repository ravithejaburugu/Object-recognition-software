/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controller;
import gui.jDialog.JDialogAbout;
import gui.jDialog.JDialogEditNeuralNetworkSensitivity;
import gui.jDialog.JDialogEditSensitivity;
import gui.jDialog.JDialogRecognitionAreaWidthAndHeight;
import gui.panel.JPanelVideoPlayer;
import gui.panel.JPanelWelcomePanel;
import gui.panel.paintWorker.IWorkerInterface;
import gui.panel.paintWorker.WorkerNormalVideo;
import gui.panel.paintWorker.WorkerShapesVideo;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author nick
 */
public class JFrameStart extends javax.swing.JFrame {

    /**
     * Creates new form JFrameStart
     */
    JPanel activePanel;
    IWorkerInterface paintWorker;

    public JFrameStart() {

        initComponents();
        setLabelValues();
        JPanelWelcomePanel welkome = new JPanelWelcomePanel();
        setActivePanel(welkome);
        Controller.getInstance().setFpsLabel(jLblFPS);
        Controller.getInstance().setFrameNumberLabel(jLblFrameNumber);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLblLoadedNeuralNetwork = new javax.swing.JLabel();
        jLblLoadedVideoFile = new javax.swing.JLabel();
        jLblFPS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLblFrameNumber = new javax.swing.JLabel();
        jPanelForPlayingMedia = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMItemPlayNormalVideo = new javax.swing.JMenuItem();
        jMItemPlayShapeVideo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Object recognition v1.0");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Playing file info:");

        jLabel2.setText("Fps:");

        jLabel3.setText("Neural network:");

        jLblLoadedNeuralNetwork.setText("Not enabled");

        jLblLoadedVideoFile.setText("Not enabled");

        jLblFPS.setText("Video not playing");

        jLabel4.setText("Frame number:");

        jLblFrameNumber.setText("Video not playing");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLblLoadedNeuralNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblLoadedVideoFile, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLblFPS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLblFrameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLblLoadedNeuralNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLblLoadedVideoFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLblFPS)
                    .addComponent(jLabel4)
                    .addComponent(jLblFrameNumber))
                .addGap(17, 17, 17))
        );

        jPanelForPlayingMedia.setBorder(null);
        jPanelForPlayingMedia.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout jPanelForPlayingMediaLayout = new javax.swing.GroupLayout(jPanelForPlayingMedia);
        jPanelForPlayingMedia.setLayout(jPanelForPlayingMediaLayout);
        jPanelForPlayingMediaLayout.setHorizontalGroup(
            jPanelForPlayingMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanelForPlayingMediaLayout.setVerticalGroup(
            jPanelForPlayingMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Load video file");
        jMenuItem1.setToolTipText("Load driver for decoding file content");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Load camera driver");
        jMenuItem2.setToolTipText("Load driver for decoding camera content");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Load neural network");
        jMenuItem3.setToolTipText("Load neural network that will be used");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");

        jMenuItem4.setText("Shape sensitivity");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jCheckBoxMenuItem2.setText("High shape contours");
        jCheckBoxMenuItem2.setToolTipText("Enabling high shape quality,  will lower performances");
        jCheckBoxMenuItem2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItem2StateChanged(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuItem8.setText("Neural network sensitivity");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jCheckBoxMenuItem3.setText("Object saving");
        jCheckBoxMenuItem3.setToolTipText("Save objects that are found");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Play");

        jMItemPlayNormalVideo.setText("Play normal video");
        jMItemPlayNormalVideo.setToolTipText("Start playing normal video");
        jMItemPlayNormalVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemPlayNormalVideoActionPerformed(evt);
            }
        });
        jMenu4.add(jMItemPlayNormalVideo);

        jMItemPlayShapeVideo.setText("Play shapes only");
        jMItemPlayShapeVideo.setToolTipText("Start playing video with shapes only");
        jMItemPlayShapeVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemPlayShapeVideoActionPerformed(evt);
            }
        });
        jMenu4.add(jMItemPlayShapeVideo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Stop");

        jMenuItem5.setText("Stop video");
        jMenuItem5.setToolTipText("Stop playing video");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Development");

        jCheckBoxMenuItem1.setText("Enable shape saving");
        jCheckBoxMenuItem1.setToolTipText("Enable saving of bi colour pictures");
        jCheckBoxMenuItem1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItem1StateChanged(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem4.setText("Disable neural network recognition");
        jCheckBoxMenuItem4.setToolTipText("Enabling will disable neural network functionality");
        jCheckBoxMenuItem4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItem4StateChanged(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem4);

        jMenuItem10.setText("Recognition area size");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Help");

        jMenuItem7.setText("About");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelForPlayingMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanelForPlayingMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //Create a file chooser
        JFileChooser fc = new JFileChooser();
        //In response to a button click:

        fc.setCurrentDirectory(new java.io.File("."));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println(file.getAbsolutePath());
            Controller.getInstance().setFileMediaPath(file.getAbsolutePath());
            jLblLoadedVideoFile.setText(file.getName());

            Controller.getInstance().setMedia("video");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        Controller.getInstance().setMedia("cam");
        jLblLoadedVideoFile.setText("Camera driver loaded");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMItemPlayNormalVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemPlayNormalVideoActionPerformed
        paintWorker = new WorkerNormalVideo();
        JPanelVideoPlayer jp = new JPanelVideoPlayer(paintWorker);
        setActivePanel(jp);
        Controller.getInstance().playMedia();
    }//GEN-LAST:event_jMItemPlayNormalVideoActionPerformed

    private void jMItemPlayShapeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemPlayShapeVideoActionPerformed
        paintWorker = new WorkerShapesVideo();
        JPanelVideoPlayer jp = new JPanelVideoPlayer(paintWorker);
        setActivePanel(jp);
        Controller.getInstance().playMedia();
    }//GEN-LAST:event_jMItemPlayShapeVideoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        paintWorker.stopExecuting();    //gasi paintWorker
//        paintWorker = null;
        Controller.getInstance().stopMedia();   //gasi media encoder
        JPanelWelcomePanel welkome = new JPanelWelcomePanel();
        setActivePanel(welkome);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JDialogEditSensitivity jdialog = new JDialogEditSensitivity(this, true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jCheckBoxMenuItem2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2StateChanged
        Controller.getInstance().changeHighLvlShapeState();
    }//GEN-LAST:event_jCheckBoxMenuItem2StateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        //Create a file chooser
        JFileChooser fc = new JFileChooser();
        //In response to a button click:

        fc.setCurrentDirectory(new java.io.File("."));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
//            System.out.println(file.getAbsolutePath());

//            Controller.getInstance().setMedia("video");
            Controller.getInstance().loadNeuralNetwork(file);
            jLblLoadedNeuralNetwork.setText(file.getName());

        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JDialogEditNeuralNetworkSensitivity jdialog = new JDialogEditNeuralNetworkSensitivity(this, true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jCheckBoxMenuItem1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1StateChanged
        Controller.getInstance().changeSavingPictureToShape();
    }//GEN-LAST:event_jCheckBoxMenuItem1StateChanged

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JDialogRecognitionAreaWidthAndHeight jdialog = new JDialogRecognitionAreaWidthAndHeight(this, true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jCheckBoxMenuItem4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4StateChanged
        Controller.getInstance().changeNeuralNetworkRecognizingState();
    }//GEN-LAST:event_jCheckBoxMenuItem4StateChanged

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JDialogAbout jdialog = new JDialogAbout(this, true);
        jdialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        //Create a file chooser
        JFileChooser fc = new JFileChooser();
        //In response to a button click:
        fc.setCurrentDirectory(new java.io.File("."));
        fc.setAcceptAllFileFilterUsed(false);

        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            Controller.getInstance().setOutputObjectFolder(file);
            if (!Controller.getInstance().isSaveObjects()) {
                Controller.getInstance().changeSaveObjectState();
            }
            jCheckBoxMenuItem3.setSelected(true);
        } else {
            if (Controller.getInstance().isSaveObjects()) {
                Controller.getInstance().changeSaveObjectState();
            }
            jCheckBoxMenuItem3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStart().setVisible(true);
            }
        });
    }

    private void setActivePanel(JPanel panel) {
        panel.setSize(640, 480);
        pack();
        if (activePanel != null) {
            jPanelForPlayingMedia.remove(activePanel);
        }
        jPanelForPlayingMedia.add(panel, BorderLayout.CENTER);
        this.pack();
        activePanel = panel;

        jPanelForPlayingMedia.revalidate();
        jPanelForPlayingMedia.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblFPS;
    private javax.swing.JLabel jLblFrameNumber;
    private javax.swing.JLabel jLblLoadedNeuralNetwork;
    private javax.swing.JLabel jLblLoadedVideoFile;
    private javax.swing.JMenuItem jMItemPlayNormalVideo;
    private javax.swing.JMenuItem jMItemPlayShapeVideo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelForPlayingMedia;
    // End of variables declaration//GEN-END:variables

    private void setLabelValues() {
        jLblLoadedVideoFile.setText("<html><font color='red'>Load driver!</font></html>");
        jLblLoadedNeuralNetwork.setText("<html><font color='red'>Load neural network!</font></html>");

    }
}
