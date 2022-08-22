public class IceWizard extends Wizard
{
    int snowBalls;
    boolean iceSpear;
    String gollumName;

    public IceWizard(int speed, int power, int snowBalls, boolean iceSpear, String gollumName)
    {
        super(speed, power);
        this.snowBalls = snowBalls;
        this.iceSpear = iceSpear;
        this.gollumName = gollumName;
    }

    public int getPower()
    {
        return super.getPower();
    }
    public void setPower(int power)
    {
        super.setPower(power);
    }
    public int getSnowBalls()
    {
        return snowBalls;
    }

    public boolean getIceSpear()
    {
        return iceSpear;
    }

    public String getGollumName()
    {
        return gollumName;
    }

    public void setSnowBalls(int snowBalls)
    {
        this.snowBalls = snowBalls;
    }

    public void setIceSpear(boolean iceSpear)
    {
        this.iceSpear = iceSpear;
    }

    public void setGollumName(String gollumName)
    {
        this.gollumName = gollumName;
    }

    public String toString() {
        return "IceWizard{" +
                "snowBalls=" + snowBalls +
                ", iceSpear=" + iceSpear +
                ", gollumName='" + gollumName + '\'' +
                '}';
    }
}
