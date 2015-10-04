/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ku
 */
public class MakeChange {
    public static ArrayList<Integer> giveChange(double amount){
            int quarters = 0;
            int dimes    = 0;
            int nickels  = 0; 
            int pennies  = 0;
            ArrayList<Integer> returnedCoins = new ArrayList<>();
            amount=amount*100;
            while(amount!=0){
                while(amount-25>=0){
                    quarters+=1;
                    amount-=25;
                }
                while(amount-10>=0){
                    dimes+=1;
                    amount-=10;
                }
                while(amount-5>=0){
                    nickels+=1;
                    amount-=5;
                }
                while(amount-1>=0){
                    pennies+=1;
                    amount-=1;
                }
            }
            returnedCoins.add(quarters);
            returnedCoins.add(dimes);
            returnedCoins.add(nickels);
            returnedCoins.add(pennies);
            return returnedCoins;
    }
}