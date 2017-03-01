public class Mean implements IGrader
{
    protected int[] m_grades;
    protected Ifilter m_filter;
    
    public Mean(int[] grades, Ifilter filter)
    {
        m_grades = grades;
        m_filter = filter;
    }
    
    public double grade()
    {
        return average();
    }
    
    // @Override
    public int[] filter(int[] ary){
        return null;
    }
    
    protected double average()
    {
        double sum = 0.0;
        for (int i : m_grades)
            sum += i;
        return sum/m_grades.length;
    }
}