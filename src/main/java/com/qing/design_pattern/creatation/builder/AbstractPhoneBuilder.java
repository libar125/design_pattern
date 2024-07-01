package com.qing.design_pattern.creatation.builder;

public abstract class AbstractPhoneBuilder {

    public Phone phone = new Phone();

    public abstract AbstractPhoneBuilder customCpu(String cpu);

    public abstract AbstractPhoneBuilder customMemory(String memory);

    public abstract AbstractPhoneBuilder customDisk(String disk);

    public abstract AbstractPhoneBuilder customCamera(String camera);

    public  Phone getProduct(){
        return phone;
    }
}
