/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalityAdmin;

import Business.Employee.Employee;
import Business.Locality.Locality;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Utils.StringVerifier;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vega
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {
private JPanel container;
    private Locality locality;

    public ManageUserAccountJPanel(JPanel container, Locality locality) {
        initComponents();
        this.locality = locality;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    addVerifiers();
    }

    private void addVerifiers() {
        
        InputVerifier stringVerifier = new StringVerifier();
        nameJTextField.setInputVerifier(stringVerifier);
        passwordJTextField.setInputVerifier(stringVerifier);
    }
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : locality.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : locality.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }
    /**
     * Creates new form ManageUserAccountJPanel
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 437, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 380, 146, -1));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 54, 438, 149));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 494, -1, -1));

        passwordJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJTextFieldActionPerformed(evt);
            }
        });
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 490, 146, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 336, -1, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 333, 146, -1));

        backjButton1.setBackground(new java.awt.Color(51, 51, 255));
        backjButton1.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 612, 112, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        createUserJButton.setBackground(new java.awt.Color(51, 51, 255));
        createUserJButton.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 559, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 279, 146, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 433, 146, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 383, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 6, 255, -1));

        jLabel7.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel7.setText("National Pediatric Pneumonia Healthcare");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 125, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        if(checkBlankInput() == Boolean.TRUE)
        {String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        popData();
         JOptionPane.showMessageDialog(this, "User added!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
                  
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                                
        private void clearFields()
        {
            nameJTextField.setText("");
            passwordJTextField.setText("");
                 

        }
        
    private Boolean checkBlankInput()
    {
        if(nameJTextField.getText().trim().length()==0
            || passwordJTextField.getText().trim().length()==0 
                        
)
            {
                return false;
            }
        else{
        return true;
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void passwordJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}