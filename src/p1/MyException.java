public class MyException extends Exception{

    private int x;
    private int y;

    public MyException(int x, int y, String message) {
        super(message);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
