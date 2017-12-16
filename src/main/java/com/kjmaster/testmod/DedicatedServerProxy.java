package com.kjmaster.testmod;

public class DedicatedServerProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void Init() {
        super.Init();
    }

    @Override
    public boolean isDedicatedServer() {
        return true;
    }
}
