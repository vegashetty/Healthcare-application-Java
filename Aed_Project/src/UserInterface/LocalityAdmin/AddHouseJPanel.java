/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalityAdmin;

import Business.House.House;
import Business.House.HouseDirectory;
import Business.Locality.Locality;
import static Business.Locality.Locality.LocalityType.RuralLocality;
import Business.Locality.LocalityDirectory;
import Business.Locality.RuralLocality;
import Business.Locality.SuburbanLocality;
import Business.Locality.UrbanLocality;
import Business.State.State;
import Business.Utils.NumberVerifier;
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
public class AddHouseJPanel extends javax.swing.JPanel {
 private HouseDirectory houseDirectory;
    private JPanel userProcessContainer;
    private Locality locality;
    private State state;

    public AddHouseJPanel(JPanel userProcessContainer,Locality locality) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.houseDirectory = houseDirectory;
        this.locality = locality;
        this.state=state;
        addVerifiers();
    }
    private void addVerifiers() {
        InputVerifier integerVerifier = new NumberVerifier();
         zipjTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new StringVerifier();
        hidjTextField.setInputVerifier(stringVerifier);
        streetjTextField.setInputVerifier(stringVerifier);
    }
    
    /**
     * Creates new form AddHouseJPanel
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hidjTextField = new javax.swing.JTextField();
        streetjTextField = new javax.swing.JTextField();
        zipjTextField = new javax.swing.JTextField();
        submitjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 253));

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel1.setText("Add House to Locality:");

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel2.setText("House ID :");

        jLabel3.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel3.setText("Street");

        jLabel4.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel4.setText("Zipcode");

        hidjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidjTextFieldActionPerformed(evt);
            }
        });

        submitjButton.setBackground(new java.awt.Color(51, 51, 255));
        submitjButton.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        submitjButton.setForeground(new java.awt.Color(255, 255, 255));
        submitjButton.setText("Submit");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });

        backjButton.setBackground(new java.awt.Color(51, 51, 255));
        backjButton.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(255, 255, 255));
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 483, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitjButton)
                        .addGap(338, 338, 338))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(backjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57)
                .addComponent(submitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hidjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hidjTextFieldActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        if (checkBlankInput()==Boolean.TRUE)
        {
            // Locality l = null;
        //for (Locality loc : state.getLocalityDirectory().getLocalityList()){
            // if (locality instanceof RuralLocality || locality instanceof UrbanLocality || locality instanceof SuburbanLocality){
              //  locality = l;
              //  break;
            
             String hid= hidjTextField.getText();
         House house=locality.getHouseDirectory().createAndAddHouse(hid);
         
         
          
            house.setStreet(streetjTextField.getText());
                       house.setZip(Integer.parseInt(zipjTextField.getText()));

            JOptionPane.showMessageDialog(this, "House added!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
                  
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                                
        private void clearFields()
        {
            zipjTextField.setText("");
            streetjTextField.setText("");
            hidjTextField.setText("");

        }
        
    private Boolean checkBlankInput()
    {
        if(zipjTextField.getText().trim().length()==0
            || streetjTextField.getText().length()==0
                 || hidjTextField.getText().length()==0 
)
            {
                return false;
            }
        else{
        return true;
        }
     // TODO add your handling code here:
    }//GEN-LAST:event_submitjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
 userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField hidjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField streetjTextField;
    private javax.swing.JButton submitjButton;
    private javax.swing.JTextField zipjTextField;
    // End of variables declaration//GEN-END:variables
}
