package com.aleyha.action;

import com.aleyha.status.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huyqp_000 on 5/9/2017.
 */
public abstract class Skill {
    private String name;
    private double varianceLow = 0.8;
    private double varianceHigh = 1.2;
    private List<Status> effects = new ArrayList<>();
    private List<Double> effectsChances = new ArrayList<>();
}
