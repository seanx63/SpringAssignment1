package org.example;

import org.springframework.stereotype.Component;

// Configuration using annotations
@Component
public class Phone {
    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
    @Override
    public String toString() {
        return getMob();
    }

    private String mob;
}
