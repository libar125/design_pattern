package com.qing.design_pattern.creatation.builder;

public class XiaomiPhoneBuilder extends AbstractPhoneBuilder {
    @Override
    public AbstractPhoneBuilder customCpu(String cpu) {
        phone.setCpu(cpu);
        return this;
    }

    @Override
    public AbstractPhoneBuilder customMemory(String memory) {
        phone.setMem(memory);
        return this;

    }

    @Override
    public AbstractPhoneBuilder customDisk(String disk) {
        phone.setDisk(disk);
        return this;

    }

    @Override
    public AbstractPhoneBuilder customCamera(String camera) {
        phone.setCamera(camera);
        return this;
    }
}
