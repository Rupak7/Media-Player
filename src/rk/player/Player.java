/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rk.player;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author Rupak Kalita
 */
public class Player extends BorderPane{
    Media media;
    MediaPlayer player;
    MediaView view;
    Pane mpane;
    MediaBar bar;
    public Player(String file){
        media = new Media(file);
        player = new MediaPlayer(media);
        view = new MediaView(player);
        mpane = new Pane();
        bar = new MediaBar(player);
        mpane.getChildren().add(view);
        
        setBottom(bar);
        setStyle("-fx-background-color: #bfc2c7");
        setCenter(mpane);
        player.play();
    }
}
