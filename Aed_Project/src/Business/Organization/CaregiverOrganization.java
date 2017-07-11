/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.CaregiverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class CaregiverOrganization extends Organization{
public CaregiverOrganization() {
        super(Organization.Type.Caregiver.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CaregiverRole());
        return roles;
}
    
}
