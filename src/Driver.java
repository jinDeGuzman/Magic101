public class Driver
{
    public static void main(String[] args)
    {
        Wizard Rioux = new Wizard(2,2);
        FireWizard Maddison = new FireWizard(2,2,10,true,"jinisaloser420");
        IceWizard Maurice = new IceWizard(3,5,12,false,"icey");
        ElectricWizard Richy = new ElectricWizard(4,2,1,true,"Lt Surge");
        Dragon Rico = new Dragon("Fire");

        System.out.println("\n" + Maddison);
        System.out.println(Rioux);
        System.out.println(Maurice);
        System.out.println(Richy);
        System.out.println(Rico);
    }
}
