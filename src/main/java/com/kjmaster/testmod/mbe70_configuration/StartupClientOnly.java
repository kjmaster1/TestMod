package com.kjmaster.testmod.mbe70_configuration;

public class StartupClientOnly {

    public static void preInitClientOnly() {
        MBEConfiguration.clientPreInit(); // used to set up and event handler for the GUI so that the altered values
                                            // are saved back to disk
    }
}
