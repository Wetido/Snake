public class Position {

    private int x;
    private int y;

    public Position() {}

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void addX( int size) {
        x += size;
    }

    public void addY( int size ) {
        y += size;
    }

    public void subX( int size ) {
        x -= size;
    }

    public void subY( int size ) {
        y -= size;
    }
}
