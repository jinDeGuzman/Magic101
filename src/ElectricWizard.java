public class ElectricWizard extends Wizard
{
    int zappies;
    boolean hasClouds;
    String elecGiantName;

    public ElectricWizard(int speed, int power, int zappies, boolean hasClouds, String elecGiantName)
    {
        super(speed, power);
        this.zappies = zappies;
        this.hasClouds = hasClouds;
        this.elecGiantName = elecGiantName;
    }

    public int getZappies()
    {
        return zappies;
    }

    public int getPower()
    {
        return super.getPower();
    }
    public void setPower(int power)
    {
        super.setPower(power);
    }

    public boolean getHasClouds()
    {
        return hasClouds;
    }

    public String getElecGiantName()
    {
        return elecGiantName;
    }

    public void setZappies(int zappies)
    {
        this.zappies = zappies;
    }

    public void setHasClouds(boolean hasClouds)
    {
        this.hasClouds = hasClouds;
    }

    public void setElecGiantName(String elecGiantName)
    {
        this.elecGiantName = elecGiantName;
    }

    public String toString() {
        return "ElectricWizard{" +
                "zappies=" + zappies +
                ", hasClouds=" + hasClouds +
                ", elecGiantName='" + elecGiantName + '\'' +
                '}';
    }
}
