package com.aleyha.character;

import com.aleyha.status.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huyqp_000 on 5/9/2017.
 */
public abstract class Character {
    private String player;
    private String role;
    private int maxHealth;
    private int health;
    private int speed;
    private int staminaCurrent = 0;
    private int staminaNext = 100;
    private int attackDamage;
    private double varianceLow = 0.7;
    private double varianceHigh = 1.3;
    private double speedMultLow = 0.9;
    private double speedMultHigh = 1.1;
    private List<Status> statuses = new ArrayList<>();
    private int ultTurns = 3;

    public Character() {
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void skill_1();
    public abstract void skill_2();
    public abstract void skill_3();
    public abstract void skill_ult();
}
