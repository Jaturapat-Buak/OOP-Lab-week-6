/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author User
 */
public class Seller extends Employee {
    public Food sell(Employee e) {
        if (e.getWallet().getBalance() >= Food.getPrice()){
            getWallet().setBalance(Food.getPrice());
            e.getWallet().setBalance(-Food.getPrice());
            return new Food();
        }
        else {
            System.out.println("Your money is not enough. ");
            return null;
        }
    }
}
