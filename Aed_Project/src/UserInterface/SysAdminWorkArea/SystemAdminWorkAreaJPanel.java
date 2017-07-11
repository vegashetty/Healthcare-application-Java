/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdminWorkArea;

import Business.Ecosystem;
import Business.Locality.Locality;
import Business.Organization.Organization;
import Business.State.State;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author vega
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
 JPanel userProcessContainer;
    Ecosystem system;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTree();
         Font font = new Font("", Font.BOLD, 12);
        jLabel1.setBackground(Color.WHITE);
    }

    public void populateTree() {
        
        DefaultTreeModel model = (DefaultTreeModel)jTree1.getModel();

        
        
        ArrayList<State> stateList = system.getStateList();
        ArrayList<Locality> localityList;
        ArrayList<Organization> organizationList;
        State state;
        Locality locality;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode stateNode;
        DefaultMutableTreeNode localityNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < stateList.size(); i++) {
            state = stateList.get(i);
            stateNode = new DefaultMutableTreeNode(state.getStateName());
            networks.insert(stateNode, i);

            localityList = state.getLocalityDirectory().getLocalityList();

            for (int j = 0; j < localityList.size(); j++) {
                locality = localityList.get(j);
                localityNode = new DefaultMutableTreeNode(locality.getName());
                stateNode.insert(localityNode, j);

                organizationList = locality.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    localityNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }
    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        manageStatejButton = new javax.swing.JButton();
        manageAdminjButton = new javax.swing.JButton();
        manageLocalityjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jPanel2.setBackground(new java.awt.Color(95, 123, 208));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(231, 231, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageStatejButton.setBackground(new java.awt.Color(51, 51, 255));
        manageStatejButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        manageStatejButton.setForeground(new java.awt.Color(255, 255, 255));
        manageStatejButton.setText("Manage State");
        manageStatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStatejButtonActionPerformed(evt);
            }
        });
        jPanel3.add(manageStatejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 248, 220, -1));

        manageAdminjButton.setBackground(new java.awt.Color(51, 51, 255));
        manageAdminjButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        manageAdminjButton.setForeground(new java.awt.Color(255, 255, 255));
        manageAdminjButton.setText("Manage Locality Admin");
        manageAdminjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdminjButtonActionPerformed(evt);
            }
        });
        jPanel3.add(manageAdminjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 319, 220, -1));

        manageLocalityjButton.setBackground(new java.awt.Color(51, 51, 255));
        manageLocalityjButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        manageLocalityjButton.setForeground(new java.awt.Color(255, 255, 255));
        manageLocalityjButton.setText("Manage Locality");
        manageLocalityjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLocalityjButtonActionPerformed(evt);
            }
        });
        jPanel3.add(manageLocalityjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 283, 220, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText(" Welcome Application System Administrator!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 191, -1, -1));

        jLabel2.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel2.setText("National Pediatric Pneumonia Healthcare");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SysAdminWorkArea/phca_logo.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 251, -1));

        jLabel3.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel3.setText("Add States under system");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 258, -1, -1));

        jLabel5.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel5.setText("Add Locality to each state");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 294, -1, -1));

        jLabel6.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel6.setText("Create Account for each locality");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 330, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SysAdminWorkArea/inspire_device_demonstration.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, 297));
        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 564, 245, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Superclarendon", 1, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nAccording to WHO statistics, pneumonia remains the single biggest killer of children under 5 globally, \nclaiming the lives of more than 1 million girls and boys every year. However, the disease is treatable \nand preventable. Accurate and early detection of the disease is key. An Infant Respiratory Rate\nSensor device has been developed by Inspire Living organization through their efforts in smart \nobject sensing and pattern recognition.This device is specifically designed for use by community \nhealth workers who have limited medical training and must accurately determine respiratory rates \nin children as part of diagnosing pneumonia. \n\n\n\nThe Pediatric Pneumonia Diagnostic System will use the Infant Respiratory Rate Sensor device to  \nget information regarding the vital signs of a child in any remote area. Based on the analysis of the\nvital signs obtained, the application will detect if the signs are abnormal and the child requires \ntreatment for pneumonia. The caregiver handling the device will be immediately notified of the \nabnormality and the child shall be admitted to a hospital for further treatment. This application will \nhelp provide pediatric healthcare  in remote areas and reduce mortality rate. It will also give healthcare\nstatistics of a particular community and help the government concentrate on eradicating pneumonia \nin those areas.\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("About Us", jPanel1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Contact Us", jPanel4);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 660, 350));

        jSplitPane2.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageStatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStatejButtonActionPerformed
 ManageStateJPanel manageStateJPanel = new ManageStateJPanel(userProcessContainer, system);
        userProcessContainer.add("manageJPanel", manageStateJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_manageStatejButtonActionPerformed

    private void manageLocalityjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLocalityjButtonActionPerformed
      ManageLocalityJPanel manageLocalityJPanel = new ManageLocalityJPanel(userProcessContainer, system);
        userProcessContainer.add("manageLocalityJPanel", manageLocalityJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);   // TODO add your handling code here:
    }//GEN-LAST:event_manageLocalityjButtonActionPerformed

    private void manageAdminjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdminjButtonActionPerformed
       ManageLocalityAdminJPanel manageLocalityJPanel = new ManageLocalityAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("manageLocalityJPanel", manageLocalityJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  // TODO add your handling code here:
    }//GEN-LAST:event_manageAdminjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton manageAdminjButton;
    private javax.swing.JButton manageLocalityjButton;
    private javax.swing.JButton manageStatejButton;
    // End of variables declaration//GEN-END:variables
}