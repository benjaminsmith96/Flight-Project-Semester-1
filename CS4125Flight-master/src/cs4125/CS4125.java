/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4125;

import LoginManager.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import database.MySQLAccess;
import cs4125.control.ui.gui.LoginMenu;

/**
 * @author Ben Smith
 * @author Cailean
 */
public class CS4125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //test2
        //test 1
        //new Window(new GuiLogin());
        //NewClass login = new NewClass();
        //login.start();
         LoginMenu loginMenu = new LoginMenu();
         loginMenu.setVisible(true);
        // Login userLogin = new Login();
         //userLogin.login();
         
         
         
        //MySQLAccess dao = new MySQLAccess();
        //dao.readDataBase();
    }

}
