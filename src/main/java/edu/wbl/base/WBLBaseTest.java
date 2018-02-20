package edu.wbl.base;

import edu.wbl.util.WBLConfiguration;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public Configuration config;
    
    
    public BaseTest() {
    
    }
    
    @BeforeSuite
    public void setUp(){
         config = Configuration.loadConfiguration
    }

}
