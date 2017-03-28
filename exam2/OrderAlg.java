public class OrderAlg extends AbstractOrderAlg{
    private static OrderAlg m_instance;
    private int penalty = 0;
    
    public static OrderAlg getInstance()
    {
        if (m_instance == null)
            m_instance = new OrderAlg();
        return m_instance;
    }
    
    private OrderAlg() {}
    
    protected int getPenalty(char ch1){
        return penalty;
    }
    
    @Override
    protected int penalty(char ch1){
        penalty++;
        return penalty;
    }
}