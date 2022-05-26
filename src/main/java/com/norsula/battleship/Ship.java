package com.norsula.battleship;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ship {
    int size,direction,X,Y;
    ImageView picture;

    public Ship(int size,int direction,int X,int Y){
        this.size=size;
        this.direction=direction;
        this.X=X;
        this.Y=Y;
        ImageView imageView = new ImageView();
        if ((size==3) && (direction==0)){
            Image img= new Image(getClass().getResource("3a-h.png").toString());
            imageView.setImage(img);
        }
        if ((size==3) && (direction==1)){
            Image img= new Image(getClass().getResource("3a-v.png").toString());
            imageView.setImage(img);
        }


        this.picture=imageView;


    }
}
