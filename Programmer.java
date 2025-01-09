/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author User
 */
public class Programmer extends Employee {
    private int happiness;
    
    public int getHappiness() {
        return happiness;
    }
    
    public void setHappiness(int happiness) {
        this.happiness += happiness;
    }
    
    public void coding(String str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            this.setEnergy(-30);
            this.setHappiness(-30);
        }
        else {
            System.out.println("Error Error Error");
            this.setEnergy(-30);
            this.setHappiness(-30);
        }
    }
    
    public void coding(char str) {
        if (this instanceof SeniorProgrammer){
            String text = String.valueOf(str);
            coding(text);
            return;
        }
        if (getEnergy() >= 30){
            System.out.println("Your code is " + str);
            setEnergy(-30);
            setHappiness(-30);
        } else{
            System.out.println("Error Error Error");
            setEnergy(-30);
            setHappiness(-30);
    }
}
}
