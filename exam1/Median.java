import java.util.*;
public class Median implements IGrader
{
    protected int[] m_grades;
    protected Ifilter m_filter;
    
    public Median(int[] grades, Ifilter filter)
    {
        m_grades = grades;
        m_filter = filter;
    }
    
    public double grade()
    {
        return median();
    }
    
    public int[] filter(int[] ary){
        return null;
    }
    
    protected double median()
    {
        Arrays.sort(m_grades);
        double median = 0;
        int l = m_grades.length;
        if (l % 2 == 0)
        {
            median = (m_grades[l/2 - 1] + m_grades[l/2])/2.0;
        }
        else
        {
            median = m_grades[l/2];    
        }
        return median;
    }
}