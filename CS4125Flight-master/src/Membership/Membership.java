/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Membership;

import database.MySQLAccess;
import cs4125.control.data.MembershipManager;
import usersPackage.Customer;

/**
 *
 * @author Cailean
 */
public class Membership extends Customer implements MembershipInterface {

    private int points;

    public Membership(){

    }

    public Membership(int points, int userID){
        this.userID = userID;
        this.points = points;

    }

    public int getUserID(){
        return userID;
    }


    public int getPoints(int userID) throws Exception{
        MySQLAccess db = new MySQLAccess();
        int points = db.setMembershipPoints(userID);
        return points;
    }

    public void setPoints(int userID) throws Exception{
        this.points = getPoints(userID);
    }

    public void addPoints(int points, int userID) throws Exception{
        this.points += points;
        MySQLAccess db = new MySQLAccess();
        db.addMembershipPoints(userID, points);
    }

    public void subtractPoints(int points){
        this.points -= points;
    }

}
