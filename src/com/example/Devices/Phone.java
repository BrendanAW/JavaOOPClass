package com.example.Devices;

public class Phone extends Devices {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    void mute() {

    }

    public void mute(int minutes) {

    }

    public void installAnApp(String appName) {
        installAnApp(appName, 0.0);
    }

    public void installAnApp(String appName, Double version) {
        System.out.println("The app " + appName + "was installed on the version: " + version);
    }

    public void installAnApp(String[] apps) {
        for (String app : apps) {
            installAnApp(app);
        }
    }

}
