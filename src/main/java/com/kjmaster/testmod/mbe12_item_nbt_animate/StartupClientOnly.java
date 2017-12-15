package com.kjmaster.testmod.mbe12_item_nbt_animate;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupClientOnly {

    public static void preInitClientOnly() {
        // model to be used for rendering this item
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("testmod:mbe12_item_nbt_animate",
                "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemNBTAnimate, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    }
}
