package com.chandrawansha.shavin;

import javafx.scene.shape.Ellipse;
import javafx.util.Pair;

public class Disk {

    private DiskType diskType;
    private int positionX;
    private int positionY;

    private Pair<Ellipse, Ellipse> diskImages;

    public Disk(DiskType diskType, int x, int y) throws Exception{
        if (x < 0 || x >= DamModel.BOARD_SIZE)
            throw new Exception("Invalid Position");
        if (y < 0 || y >= DamModel.BOARD_SIZE)
            throw new Exception("Invalid Position");
        this.diskType = diskType;
        this.positionX = x;
        this.positionY = y;

    }

    public void setDiskType(DiskType diskType){
        this.diskType = diskType;
    }

    public DiskType getDiskType(){
        return diskType;
    }

    public void setPositionX(int x){
        this.positionX = x;
    }

    public void setPositionY(int y){
        this.positionY = y;
    }

    public int getX(){
        return positionX;
    }

    public int getY(){
        return positionY;
    }

    public void setPosition(Position position){
        this.positionX = position.getX();
        this.positionY = position.getY();
    }

    public Position getPosition(){
        return new Position(positionX, positionY);
    }

    public void setDiskImages(Ellipse activeDisk, Ellipse mirrorDisk){
        diskImages = new Pair<>(activeDisk, mirrorDisk);
    }

    public Ellipse getActiveDisk(){
        return diskImages.getKey();
    }

    public Ellipse getMirrorDisk(){
        return diskImages.getValue();
    }
}
