public class Builder{
    private static Builder m_instance;
    
    private Builder() {}
    
    public static Builder getInstance(){
        if (m_instance == null)
            m_instance = new Builder();
        return m_instance;
    }
    
    public IDecision buildWizard(){
        IDecision g = new Decision("Do you like to jump?", null, null, "Buy the ZR300 Model.", "Buy the ZR200 Model.");
        IDecision f = new Decision("Have you gone skiing before?", g, null, null, "Buy the ZR100 Model.");
        IDecision e = new Decision("Do you want to buy downhill skis?", f, null, null, "Recommend they try skiing one day.");
        IDecision d = new Decision("Do you like to go fast?", null, null, "Buy the XG300 Model", "Buy the XG200 Model.");
        IDecision c = new Decision("Are you an expert?", d, null, null, "Buy the XG200 Model.");
        IDecision b = new Decision("Have you snowboarded before?", c, null, null, "Buy the XG100 Model.");
        IDecision a = new Decision("Do you want to buy a snowboard?", b, e, null, null);
        return a;
    }
}