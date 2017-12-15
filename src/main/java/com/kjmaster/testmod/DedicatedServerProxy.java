package com.kjmaster.testmod;

public class DedicatedServerProxy extends CommonProxy {

    public void preInit() {
        super.preInit();
    }

    @Override
    public boolean isDedicatedServer() {
        return true;
    }
}
