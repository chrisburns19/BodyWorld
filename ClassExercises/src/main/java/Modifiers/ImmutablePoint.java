package Modifiers;

/**
 * Created by christopherburns on 9/13/16.
 */
public class ImmutablePoint {
    private int x,y,z;

    public ImmutablePoint(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    int getX(){return this.x;}
    int getY(){return this.y}
    int getZ(){return this.z}
}
