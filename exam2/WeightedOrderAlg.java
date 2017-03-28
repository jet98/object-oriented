public class WeightedOrderAlg extends AbstractOrderAlg{
    private static WeightedOrderAlg m_instance;
    private int penalty = 0;
    
    public static WeightedOrderAlg getInstance()
    {
        if (m_instance == null)
            m_instance = new WeightedOrderAlg();
        return m_instance;
    }
    
    private WeightedOrderAlg() {}
    
    protected int getPenalty(char ch1){
        return penalty;
    }
    
    @Override
    protected int penalty(char ch1){
        penalty = 0;
        if(ch1 == 'A')
            penalty = 1;
        if(ch1 == 'C')
            penalty = 2;
        if(ch1 == 'G')
            penalty = 3;
        else
            penalty = 4;
        return penalty;
    }
}