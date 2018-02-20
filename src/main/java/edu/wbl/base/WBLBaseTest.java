package edu.wbl.base;

import edu.wbl.util.WBLConfiguration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    public WBLConfiguration config;
    
    
    public BaseTest() {
    
    }
    
    @BeforeSuite
    public void setUp() throws Exception {
         config = WBLConfiguration.loadConfiguration();
        //construction of other with api, reports, logging to be done
    }
    
    @AfterSuite
    public void tearDown(){
        config = null;
    }

}
