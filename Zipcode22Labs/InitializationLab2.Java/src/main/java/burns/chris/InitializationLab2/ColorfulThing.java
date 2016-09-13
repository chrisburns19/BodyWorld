package burns.chris.InitializationLab2;

public class ColorfulThing {

    Color color;

    public enum Color {
        BLUE, GREEN, RED, YELLOW, ORANGE
    }

    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public static void main(String[] args) {

    }

}


