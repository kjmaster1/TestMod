package com.kjmaster.testmod;

public abstract class CommonProxy {

    public void preInit() {
        com.kjmaster.testmod.mbe12_item_nbt_animate.StartupCommon.preInitCommon();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupCommon.preInitCommon();
    }

    public void Init() {}

    abstract public boolean isDedicatedServer();
}
