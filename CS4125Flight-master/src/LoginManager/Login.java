/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginManager;
import usersPackage.*;
import cs4125.control.ui.gui.*;
import database.*;
import Membership.Membership;

/**
 *
 * @author Cailean
 */
public class Login {
    
    public void login(){
        //LoginMenu loginMenu = new LoginMenu();
        //loginMenu.setVisible(true);
    }
    
    public void createUser(String email, String password) throws Exception{
        int role = 0;
        
        MySQLAccess u = new MySQLAccess();
        role = u.getRole(email, password);
        
        if(role == 1){
        Test_customer c1 = new Test_customer();
        u.inputDetails(c1, email, password);
        int userID = c1.getUserID();
        Membership m1 = new Membership(userID, 0);
        m1.setPoints(userID);
        System.out.println(m1.getPoints(userID));
        
        
        c1.displayMenu();
        
        }
    }
    
}
