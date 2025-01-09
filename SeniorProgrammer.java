/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author User
 */
public class SeniorProgrammer extends Programmer {
    @Override
    public void coding(String str) {
        if (this.getEnergy() >= 10) {
            System.out.println("I'm coding about " + str);
            this.setEnergy(-5);
            this.setHappiness(-5);
        }
        else {
            System.out.println("ZzZzZz");
            this.setEnergy(-5);
            this.setHappiness(-5);
        }
    }
    
    public void coding(String str, int num) {
        for (int i = 0; i < num; i++) {
            if (this.getEnergy() >= 10) {
                System.out.println("I'm coding about " + str);
                this.setEnergy(-5);
                this.setHappiness(-5);
            }
            else {
                System.out.println("ZzZzZz");
                this.setEnergy(-5);
                this.setHappiness(-5);
            }
        }
    }
    
    public void compliment(Programmer p) {
        p.setHappiness(20);
        System.out.println(p.getName() + " in a good mood");
    }
    
    public void blame(Programmer p) {
        p.setHappiness(-20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
