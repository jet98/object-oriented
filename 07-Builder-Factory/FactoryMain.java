public class FactoryMain
{
    public static void main(String[] args)
    {
        //IBodyPartFactory factory = new HappyHeadFactory();
        IBodyPartFactory factory = new SadHeadFactory();
        MrPotatoHead fred = new MrPotatoHead(22, 12, 
                factory.createHead(),
                factory.createEyes(), 
                factory.createNose(), 
                factory.createMouth());
        fred.draw();
        
        IBodyPartFactory factory2 = new GeorgeHeadFactory();
        MrPotatoHead George = new MrPotatoHead(22, 12, 
                factory2.createHead(),
                factory2.createEyes(), 
                factory2.createNose(), 
                factory2.createMouth());
        George.draw();
    }
}
