package com.kototo.spring.pojo;

public class HappyComponent {
    private String componentName;

    private HappyMachine happyMachine;

    public HappyMachine getHappyMachine() {
        return happyMachine;
    }

    public void setHappyMachine(HappyMachine happyMachine) {
        this.happyMachine = happyMachine;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void doWork() {
        System.out.println("HappyComponent.doWork");
    }

    @Override
    public String toString() {
        return "HappyComponent{" +
                "componentName='" + componentName + '\'' +
                ", happyMachine=" + happyMachine +
                '}';
    }
}
