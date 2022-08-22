public class Wizard
{
    int speed;
    int power;

    public Wizard(int speed, int power)
    {
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getPower()
    {
        return power;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public String toString()
    {
        return "Wizard{" +
                "speed=" + speed +
                ", power=" + power +
                '}';
    }
}
