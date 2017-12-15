package com.kjmaster.testmod;

public class ClientOnlyProxy extends CommonProxy {

    public void preInit() {
        super.preInit();
        com.kjmaster.testmod.mbe12_item_nbt_animate.StartupClientOnly.preInitClientOnly();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupClientOnly.preInitClientOnly();
    }

    @Override
    public void Init() {
        super.Init();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupClientOnly.initClientOnly();
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }
}
