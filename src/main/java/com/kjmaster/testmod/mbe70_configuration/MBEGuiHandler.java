package com.kjmaster.testmod.mbe70_configuration;

import com.kjmaster.testmod.TestMod;
import net.minecraftforge.common.config.Config;

@Config(modid = TestMod.MODID, name = "config", category = "testmod")
public class MBEGuiHandler {

    @Config.Name("testmod")
    @Config.LangKey("gui.mbe70_configuration.testmod")
    public static TestMod testMod = new TestMod();

    public static class TestMod {

        @Config.Name("category_general")
        @Config.LangKey("gui.mbe70_configuration.category_general")
        public CategoryGeneral categoryGeneral = new CategoryGeneral();

        public class CategoryGeneral {

            @Config.RangeInt(min = 3, max = 12)
            @Config.LangKey("gui.mbe70_configuration.myInteger")
            @Config.Comment("Configuration integer (myInteger)")
            public int myInteger = 10;

            @Config.LangKey("gui.mbe70_configuration.myBoolean")
            public boolean myBoolean = true;

            @Config.RangeDouble(min = 0.0, max = 1.0)
            @Config.LangKey("gui.mbe70_configuration.myDouble")
            @Config.Comment("Configuration double (myDouble)")
            public double myDouble = 0.8;

            @Config.LangKey("gui.mbe70_configuration.myString")
            @Config.Comment("Configuration String (myString)")
            public String myString = "default";

            @Config.LangKey("gui.mbe70_configuration.myIntList")
            @Config.Comment("Configuration integer list (myIntList)")
            public int [] myIntList = new int[] { 1, 2, 3, 4, 5};
        }
    }
}
