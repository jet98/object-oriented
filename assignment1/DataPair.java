public class DataPair{
    private String m_name;
    private int m_stat;
    
    public DataPair(String name, int stat){
        m_name = name;
        m_stat = stat;
    }
    
    public String getName(){
        return m_name;
    }
    
    public int getStat(){
        return m_stat;
    }
    
    @Override
    public String toString(){
        return String.format("%-30s%s%n", m_name, m_stat);
    }
}