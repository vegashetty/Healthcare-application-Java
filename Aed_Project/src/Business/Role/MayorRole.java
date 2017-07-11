/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Locality.Locality;
import Business.Organization.MayorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.MayorAdmin.MayorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vega
 */
public class MayorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Locality locality, Ecosystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             return new MayorWorkAreaJPanel(userProcessContainer, account,(MayorOrganization) organization,locality,business);
    
}
    
}
