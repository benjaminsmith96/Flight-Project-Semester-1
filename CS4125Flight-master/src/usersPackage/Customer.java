/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersPackage;

import cs4125.control.data.UserManager;
import cs4125.control.ui.gui.UserMenu;

public class Customer extends AbstractUser implements UserManager {

	public Customer() {
		super();
	}

	public Customer(int userID, String email, String password, int role, String firstName, String lastName,
			String dateOfBirth, int gender, String contactNumber) {

		super(userID, email, password, role, firstName, lastName, dateOfBirth, gender, contactNumber);

	}

	@Override
	public void viewFlights() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayMenu() {
		UserMenu userMenu = new UserMenu();
    userMenu.setVisible(true);
	}

	@Override
	public String getUserDetails() {
		return "CustomerTest [getUserID()=" + getUserID() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getGender()=" + getGender()
				+ ", getContactNumber()=" + getContactNumber() + "]";
	}

}
