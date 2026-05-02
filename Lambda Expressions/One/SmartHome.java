package com.LambdaExpressions.One;

public class SmartHome{
    static void main(String[] args) {
        LightBehavior motionLight = () -> {
            System.out.println("Motion detected = Lights ON Full brightness");
        };
        LightBehavior nightLight = () -> {
            System.out.println("Night mode = Lights dimmed to 10%");
        };
        LightBehavior voiceLight = () -> {
            System.out.println("Voice command = Lights turned RED");
        };
        motionLight.activate();
        nightLight.activate();
        voiceLight.activate();
    }
}
