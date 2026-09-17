package Hooks;

import BasePack.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class hooks extends baseClass {

    @Before
    public static void start() throws InterruptedException, IOException {

      Initializebrowser();


    }

    @After
    public static void end(){

        //baseClass.exit();


    }
}
