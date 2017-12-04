/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Exceptions.WrongCityFormatException;
import Exceptions.WrongPhoneNumberFormatException;
import Exceptions.WrongZipNumberFormatException;
import Spike.Address;
import Spike.Home;
import Spike.HomeBooking;
import Spike.Role;
import Spike.User;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mathiasjepsen
 */
public class Tests {
    
    Home home1;
    Address address1;
    Role adminRole;
    Role userRole;
    User user1;
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws WrongPhoneNumberFormatException, WrongZipNumberFormatException, WrongCityFormatException {
        address1 = new Address("Holte", "2840", "Kongevejen 438");
        home1 = new Home(address1, "A lovely place", "image.png");
        adminRole = new Role("Admin");
        userRole = new Role("User");
        user1 = new User("lovro", "1234", "Lovro", "Billyjessica", "432543534", "lovro@mail.com");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void calculateAverageRatingTest() {
        HashMap<String, Double> ratings = new HashMap();
        ratings.put("Lovro", 5.0);
        ratings.put("Mathias", 3.0);
        ratings.put("Dimitri", 4.5);
        ratings.put("Thomas", 0.7);
        home1.setRatings(ratings);
        int calculatedRating = home1.calculateRating();
        assertEquals(3, calculatedRating);
    }
    
    @Test
    public void addHomeBookingTest() {
        HomeBooking booking1 = new HomeBooking("Lovro", "03-12-2017");
        HomeBooking booking2 = new HomeBooking("Lovro", "04-12-2017");
        HomeBooking booking3 = new HomeBooking("Lovro", "05-12-2017");
        home1.addBooking(booking1);
        home1.addBooking(booking2);
        home1.addBooking(booking3);
        assertEquals(3, home1.getHomeBookings().size());
    }
    @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTest() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", "blabla", "lovro@mail.com");
    }
     @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTestEmptyString() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", "", "lovro@mail.com");
    }
     @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTestNumberAndLetters() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", "123b456", "lovro@mail.com");
    }
     @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTestSpecialCharacters() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", "123/456", "lovro@mail.com");
    }
     @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTestSpace() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", " ", "lovro@mail.com");
    }
     @Test(expected = WrongPhoneNumberFormatException.class)
    public void WrongFormatPhoneTestNumbersAndSpace() throws WrongPhoneNumberFormatException {
      User userTest = new User("lovro", "1234", "Lovro", "Billyjessica", "678 989", "lovro@mail.com");
    }
    @Test(expected = WrongZipNumberFormatException.class) 
    public void WrongFormatZipTest() throws WrongZipNumberFormatException, WrongCityFormatException {
        Address addressTest = new Address("Copenhagen", "testing", "Gl. Amtsvej");
    }
    @Test(expected = WrongCityFormatException.class) 
    public void WrongFormatCityTest() throws WrongCityFormatException, WrongZipNumberFormatException {
    Address addresTest2 = new Address("471207", "1620", "Vestebrogade");
    }
     @Test(expected = WrongCityFormatException.class) 
    public void WrongFormatCityTestEmptyString() throws WrongCityFormatException, WrongZipNumberFormatException {
    Address addresTest2 = new Address("", "1620", "Vestebrogade");
    }
     @Test(expected = WrongCityFormatException.class) 
    public void WrongFormatCityTestSpecialCharacter() throws WrongCityFormatException, WrongZipNumberFormatException {
    Address addresTest2 = new Address("/*", "1620", "Vestebrogade");
    }
     @Test(expected = WrongCityFormatException.class) 
    public void WrongFormatCityTestNumbersAndSpace() throws WrongCityFormatException, WrongZipNumberFormatException {
    Address addresTest2 = new Address("471 97", "1620", "Vestebrogade");
    }
     @Test(expected = WrongCityFormatException.class) 
    public void WrongFormatCityTestSpace() throws WrongCityFormatException, WrongZipNumberFormatException {
    Address addresTest2 = new Address(" ", "1620", "Vestebrogade");
    }
    

    
}
