/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spike;

/**
 *
 * @author mathiasjepsen
 */
public class HomeBooking {
    
    private String userName;
    private String date;

    public HomeBooking(String userName, String date) {
        this.userName = userName;
        this.date = date;
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
