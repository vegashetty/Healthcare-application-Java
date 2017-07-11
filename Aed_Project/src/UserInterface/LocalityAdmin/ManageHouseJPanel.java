/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalityAdmin;

import Business.House.House;
import Business.House.HouseDirectory;
import Business.Locality.Locality;
import Business.Person.Person;
import Business.Utils.NumberVerifier;
import Business.Utils.StringVerifier;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vega
 */
public class ManageHouseJPanel extends javax.swing.JPanel {
  JPanel userProcessContainer;
   HouseDirectory houseDirectory;
   Locality locality;
     boolean gender;
    /** Creates new form AdminWorkAreaJPanel */
    public ManageHouseJPanel(JPanel userProcessContainer, Locality locality) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.houseDirectory = houseDirectory;
        this.locality = locality;
        populateHouseComboBox();
                addVerifiers();
                ButtonGroup();
                populateDateComboBox();
                populateMonthBox();
                populateYearComboBox();
                populateHouseComboBox1();


    }
     public void populateHouseComboBox1(){
        housejComboBox1.removeAllItems();
        
        for (House h : locality.getHouseDirectory().getHouseDirectory()){
           housejComboBox1.addItem(h);
        }
    }
    public void populateHouseComboBox(){
        housejComboBox.removeAllItems();
        
        for (House h : locality.getHouseDirectory().getHouseDirectory()){
           housejComboBox.addItem(h);
        }
    }
    public void populateMonthBox(){
      
        
        for (int i = 1 ; i <= 12 ; i ++)
        {
            monthjComboBox.addItem(i);
        }
    
    }
    public void populateDateComboBox(){
        
        
        for (int i = 1 ; i <= 31 ; i ++)
        {
            datejComboBox.addItem(i);
        }
    }
    public void populateYearComboBox(){
       
         for (int i = 1990 ; i <= 2015 ; i ++)
        {
            yearjComboBox.addItem(i);
        }
    
       
    }
     private void addVerifiers() {
        InputVerifier integerVerifier = new NumberVerifier();
        
         pnumberjTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new StringVerifier();
        namejTextField.setInputVerifier(stringVerifier);
    }
      private void populateTable(House house){
          
          
             
    
        DefaultTableModel model = (DefaultTableModel) personjTable.getModel();
         House h =(House)housejComboBox.getSelectedItem();
        model.setRowCount(0);
        
       
            for(Person p : h.getPersonDirectory().getPersonHistory())
            {
            Object[] row = new Object[3];
            row[0] = p.getPersonName();
            row[1] = p.getDob();
            row[2]= p.isGender();
            model.addRow(row);
        
    }
      }
    /**
     * Creates new form ManageHouseJPanel
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
        bsckjButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        malejRadioButton = new javax.swing.JRadioButton();
        femalejRadioButton = new javax.swing.JRadioButton();
        pnumberjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addjButton = new javax.swing.JButton();
        monthjComboBox = new javax.swing.JComboBox();
        datejComboBox = new javax.swing.JComboBox();
        yearjComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        housejComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personjTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        housejComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(231, 231, 253));

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel1.setText("Manage Locality Houses");

        bsckjButton.setBackground(new java.awt.Color(51, 51, 255));
        bsckjButton.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        bsckjButton.setForeground(new java.awt.Color(255, 255, 255));
        bsckjButton.setText("<<Back");
        bsckjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsckjButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/vega/Downloads/phca_logo.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Silom", 0, 10)); // NOI18N
        jLabel9.setText("National Pediatric Pneumonia Healthcare");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText(" Name :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Gender");

        malejRadioButton.setText("Male");
        malejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malejRadioButtonActionPerformed(evt);
            }
        });

        femalejRadioButton.setText("Female");
        femalejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalejRadioButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number");

        addjButton.setBackground(new java.awt.Color(51, 51, 255));
        addjButton.setFont(new java.awt.Font("MT Extra", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(255, 255, 255));
        addjButton.setText("Add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("M:");

        jLabel11.setText("D");

        jLabel12.setText("Y");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setText("Date of Birth :");

        housejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housejComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Select House");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(addjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(441, 441, 441))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(malejRadioButton)
                                .addGap(31, 31, 31)
                                .addComponent(femalejRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnumberjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(monthjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(12, 12, 12)
                                        .addComponent(datejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17)
                                .addComponent(yearjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(housejComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE)
                                .addComponent(namejTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(malejRadioButton)
                    .addComponent(femalejRadioButton))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(monthjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pnumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(addjButton)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(yearjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Add persons to House:", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        personjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Date Of Birth", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personjTable);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Choose House from list :");

        housejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        housejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housejComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(88, 88, 88)
                .addComponent(housejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View House", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(138, 138, 138)
                            .addComponent(jLabel9)
                            .addGap(11, 11, 11))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(686, 686, 686)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bsckjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(92, 92, 92)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(bsckjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
private  void ButtonGroup()
{  ButtonGroup group = new ButtonGroup();
group.add(femalejRadioButton);
group.add(malejRadioButton);

}
    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        House h = (House)housejComboBox1.getSelectedItem();

       // Product modelNumber;
if (checkBlankInput()==Boolean.TRUE)
        {
       
              
        String name = namejTextField.getText();
      
        int number = Integer.parseInt(pnumberjTextField.getText());
      
      
          
        
                      
   String fgender = femalejRadioButton.getActionCommand();


  String mgender = malejRadioButton.getActionCommand();
  int month = (int)monthjComboBox.getSelectedItem();
   int date = (int)datejComboBox.getSelectedItem();
    int year = (int)yearjComboBox.getSelectedItem();
            String d  = month +"/"+ date + "/" + year ;
//"/ date + "" + year" ;

           
        //{
        for(House ho : locality.getHouseDirectory().getHouseDirectory())
        {
            
         if(ho == h)
         {
             if(checkGender() == Boolean.FALSE)
             {
             ho.getPersonDirectory().createAndAddPerson(name,number,fgender,d);}
             else{
                          ho.getPersonDirectory().createAndAddPerson(name,number,mgender,d);
}
              // locality.getHouseDirectory().getPersonDirectory().createAndAddPerson(name);
       JOptionPane.showMessageDialog(this, "Person added!!", "Update", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            return;
        //}
         
        }
           }   
        }
                  
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values", "Error", JOptionPane.ERROR_MESSAGE);
        }
           
                // TODO add your handling code here:
    }//GEN-LAST:event_addjButtonActionPerformed

    private void housejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housejComboBoxActionPerformed
House house = (House) housejComboBox.getSelectedItem();
        if (house != null){
            populateTable(house); }       // TODO add your handling code here:
    }//GEN-LAST:event_housejComboBoxActionPerformed

    private void bsckjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsckjButtonActionPerformed
 userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_bsckjButtonActionPerformed
private Boolean checkGender()
    {
        if(femalejRadioButton.isSelected())
            {
                return false;
            }
        else{
        return true;
        }
    }
    private void malejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malejRadioButtonActionPerformed

 

// TODO add your handling code here:
    }//GEN-LAST:event_malejRadioButtonActionPerformed

    private void femalejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalejRadioButtonActionPerformed
      
  // TODO add your handling code here:
    }//GEN-LAST:event_femalejRadioButtonActionPerformed

    private void housejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housejComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housejComboBox1ActionPerformed
private void clearFields()
        {
            namejTextField.setText("");
         
                    pnumberjTextField.setText("");

        }
        
    private Boolean checkBlankInput()
    {
        if(namejTextField.getText().length()==0
           ||
                        pnumberjTextField.getText().length()==0
)
            {
                return false;
            }
        else{
        return true;
        }
     // TODO add your handling code here:
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JButton bsckjButton;
    private javax.swing.JComboBox datejComboBox;
    private javax.swing.JRadioButton femalejRadioButton;
    private javax.swing.JComboBox housejComboBox;
    private javax.swing.JComboBox housejComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton malejRadioButton;
    private javax.swing.JComboBox monthjComboBox;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTable personjTable;
    private javax.swing.JTextField pnumberjTextField;
    private javax.swing.JComboBox yearjComboBox;
    // End of variables declaration//GEN-END:variables
}