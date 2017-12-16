package com.kjmaster.testmod;

public abstract class CommonProxy {

    public void preInit() {
        com.kjmaster.testmod.mbe70_configuration.StartupCommon.preInitCommon();

        com.kjmaster.testmod.mbe12_item_nbt_animate.StartupCommon.preInitCommon();
        com.kjmaster.testmod.mbe21_tileentityspecialrenderer.StartupCommon.preInitCommon();
        com.kjmaster.testmod.mbe04_block_dynamic_block_model1.StartupCommon.preInitCommon();
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupCommon.preInitCommon();
        com.kjmaster.testmod.mbe50_particle.StartupCommon.preInitCommon();
    }

    public void Init() {
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupCommon.initCommon();
    }

    public void postInit() {
        com.kjmaster.testmod.mbe05_block_dynamic_block_model2.StartupCommon.postInitCommon();
    }

    abstract public boolean isDedicatedServer();
}
