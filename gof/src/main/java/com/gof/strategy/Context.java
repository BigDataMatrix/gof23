package com.gof.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void draw(int radius,int x,int y){
        this.strategy.draw(radius,x,y);
    }

}
