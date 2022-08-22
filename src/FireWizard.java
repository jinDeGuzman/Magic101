public class FireWizard extends Wizard {
    int fireBalls;
    boolean fireSlash;
    String phoenixName;

    public FireWizard(int speed, int power, int fireBalls, boolean fireSlash, String phoenixName) {
        super(speed, power);
        this.fireBalls = fireBalls;
        this.fireSlash = fireSlash;
        this.phoenixName = phoenixName;
    }

    public int getPower()
    {
        return super.getPower();
    }
    public void setPower(int power)
    {
        super.setPower(power);
    }

    public int getFireBalls() {
        return fireBalls;
    }

    public boolean getFireSlash()
    {
        return fireSlash;
    }

    public String getPhoenixName()
    {
        return phoenixName;
    }

    public void setFireBalls(int fireBalls)
    {
        this.fireBalls = fireBalls;
    }

    public void setFireSlash(boolean fireSlash)
    {
        this.fireSlash = fireSlash;
    }

    public void setPhoenixName(String phoenixName)
    {
        this.phoenixName = phoenixName;
    }

    public String toString()
    {
        return "FireWizard{" +
                "fireBalls=" + fireBalls +
                ", fireSlash=" + fireSlash +
                ", phoenixName='" + phoenixName + '\'' +
                '}';
    }
}
