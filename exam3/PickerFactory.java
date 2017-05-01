import java.util.*;

public class PickerFactory
{
    private static PickerFactory m_instance;
    public static PickerFactory getInstance()
    {
        if (m_instance == null)
            m_instance = new PickerFactory();
        return m_instance;
    }
    private PickerFactory() {}
    
    public IWordPicker makePicker()
    {
        Random r = new Random();
        int rand = r.nextInt(2);
        
        if(rand == 0){
            return new LengthPicker();
        }
        else{
            return new ConsonantsPicker();
        }
    }
}