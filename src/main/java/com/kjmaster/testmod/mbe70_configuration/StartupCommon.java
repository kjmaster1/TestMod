package com.kjmaster.testmod.mbe70_configuration;

public class StartupCommon {

    public static void preInitCommon()
    {
        MBEConfiguration.preInit();
        System.out.println("MBE70: myInteger=" + MBEConfiguration.myInteger
                + "; myBoolean=" + MBEConfiguration.myBoolean
                + "; myString=" + MBEConfiguration.myString);
        System.out.println("MBE70: myDouble=" + MBEConfiguration.myDouble
                + "; myColour=" + MBEConfiguration.myColour);
        System.out.print("MBE70: myIntList=");
        for (int value : MBEConfiguration.myIntList) {
            System.out.print(value + "; ");
        }
        System.out.println();

    }
}
