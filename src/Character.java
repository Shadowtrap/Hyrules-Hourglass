import java.util.ArrayList;

public class Character extends Rectangle {

    private int health;
    private int speed;
    private boolean isAttacking;
    private boolean isBlocking;

    public Character(int x, int y, int health, int speed) {
        super(x, y, 50, 50);
        this.health = health;
        this.speed = speed;
        isAttacking = false;
        isBlocking = false;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean IsAttacking() {
        return isAttacking;
    }

    public boolean IsBlocking() {
        return isBlocking;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAttacking(boolean attacking) {
        isAttacking = attacking;
    }

    public void setBlocking(boolean blocking) {
        isBlocking = blocking;
    }

}
