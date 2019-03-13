package com.gof.template;

public class Proxy {

    public Game game;

    public Proxy(Game game){
        this.game = game;
    }

    public void play(){
        this.game.play();
    }

    public void switchGame(Game game){
        this.game = game;
    }


}
