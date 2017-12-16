package com.kjmaster.testmod;

public class ClientOnlyProxy extends CommonProxy {

    public void preInit() {
        super.preInit();
        com.kjmaster.testmod.mbe70_configuration.StartupClientOnly.preInitClientOnly();

        com.kjmaster.testmod.mbe12_item_nbt_animate.StartupClientOnly.preInitClientOnly();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupClientOnly.preInitClientOnly();
        com.kjmaster.testmod.mbe04_block_dynamic_block_model1.StartupClientOnly.preInitClientOnly();
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupClientOnly.preInitClientOnly();
        com.kjmaster.testmod.mbe50_particle.StartupClientOnly.preInitClientOnly();
    }

    @Override
    public void Init() {
        super.Init();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupClientOnly.initClientOnly();
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupClientOnly.initClientOnly();
    }

    @Override
    public void postInit() {
        super.postInit();
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupClientOnly.postInitClientOnly();
    }

    @Override
    public boolean isDedicatedServer() {
        return false;
    }
}
