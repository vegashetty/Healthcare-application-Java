/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Locality.Locality;
//import Business.Organization.HealthCareOrg;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.HospitalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vega
 */
public class HospitalAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Locality locality, Ecosystem business) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             return new HospitalWorkAreaJPanel(userProcessContainer, account,(HospitalOrganization) organization,locality);
}
    
}
