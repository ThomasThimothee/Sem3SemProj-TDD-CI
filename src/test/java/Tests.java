/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Spike.Address;
import Spike.Home;
import Spike.Role;
import Spike.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

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
    public void setUp() {
        address1 = new Address("Holte", "2840", "Kongevejen 438");
        home1 = new Home(address1, "A lovely place", "image.png");
        adminRole = new Role("Admin");
        userRole = new Role("User");
        user1 = new User("lovro", "1234", "Lovro", "Billyjessica", "432543534", "lovro@mail.com");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
}
