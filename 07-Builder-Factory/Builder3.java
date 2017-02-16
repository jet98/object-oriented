public class Builder3 implements Ibuilder{
    @Override
	public MrPotatoHead makePotatoHead() 
	{
        return new MrPotatoHead(22, 12, new NoHead(),
                new SmallEyes(), new SimpleNose(), new Sad());
	}
}