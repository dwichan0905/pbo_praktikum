/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.encapsulate;

import java.util.Scanner;

/**
 *
 * @author Dwi Candra Permana
 */
public class mdlMain {
    static mdlData mdl = new mdlData();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input player name: ");
        mdl.setPlayerName(sc.nextLine());
        
        System.out.print("Health: ");
        mdl.setHealth(sc.nextInt());
        
        System.out.print("Speed: ");
        mdl.setSpeed(sc.nextInt());
        
        System.out.println("GAME STARTS");
        System.out.println("=======================");
        System.out.println("Player Name: " + mdl.getPlayerName());
        System.out.println("=======================");
        if (mdl.isDead()) {
            System.out.println("Mission failed. " + mdl.getPlayerName() + " was died before his/her mission completed.");
            System.exit(0);
        } else if (mdl.isWounded()) 
            System.out.println(mdl.getPlayerName() + " is critically wounded.");
        
        System.out.println("Health: " + mdl.getHealthStatus() + "%");
        System.out.println("Speed: " + mdl.getSpeed() + " km/h");
        System.out.println(mdl.getPlayerName() + ": Mission Completed. You can return the game. ");
    }
    
}
