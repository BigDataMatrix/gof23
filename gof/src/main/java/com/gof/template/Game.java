package com.gof.template;

public abstract class Game {

    abstract void startPlay();

    abstract void initialize();

    abstract void endPlay();

    public void play(){
        this.initialize();
        this.startPlay();
        this.endPlay();
    }

}
