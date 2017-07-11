/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author vega
 */
public class OrganizationDirectory {
   private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Caregiver.getValue())){
            organization = new CaregiverOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HealthOrgAdmin.getValue())){
            organization = new HealthCareOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        return organization;
    } 
}
