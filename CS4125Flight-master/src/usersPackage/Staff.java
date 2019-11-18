/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPackage;

/**
 *
 * @author Cailean
 */
 import control.data.StaffInterface;

 public class Staff extends AbstractUser implements StaffManager {

 	public Staff() {
 		super();
 	}

 	public Staff(int userID, String email, String password, int role, String firstName, String lastName,
 			String dateOfBirth, int gender, String contactNumber) {

 		super(userID, email, password, role, firstName, lastName, dateOfBirth, gender, contactNumber);

 	}

 	@Override
 	public void viewUserFlights(Customer customer) {
 		// TODO Auto-generated method stub

 	}

 	@Override
 	public void editFlight() {
 		// TODO Auto-generated method stub

 	}

 	@Override
 	public void updateUserInfo() {
 		// TODO Auto-generated method stub

 	}

}
