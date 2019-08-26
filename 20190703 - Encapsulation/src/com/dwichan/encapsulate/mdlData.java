/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.encapsulate;

/**
 *
 * @author Dwi Candra Permana
 */
public class mdlData {
    
    private int health;
    private int speed;
    private String playerName;
    
    public String getPlayerName() {
        return playerName;
    }
    
    public int getHealthStatus() {
        return health;
    }
    
    public int getSpeed() {
        if (speed < 35) System.out.println(playerName + "'s speed is too slow.");
        else if (speed > 60 && speed <= 150) System.out.println("[!] " + playerName + "'s speed is too fast.");
        else if (speed > 150) System.out.println("[!] " + playerName + "'s speed is extremely fast.");
        return speed;
    }
    
    public void setPlayerName(String aPlayerName) {
        this.playerName = aPlayerName;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setHealth(int healthNow) {
        this.health = healthNow;
    }
    
    public boolean isDead() {
        if (getHealthStatus() == 0) return true;
        return false;
    }
    
    public boolean isWounded() {
        if (getHealthStatus() < 20) return true;
        return false;
    }
}
