import java.util.*;
import java.io.*;

public class RBITextRpt extends HomeRunTextRpt{
    public RBITextRpt(String dataFile, String reportFile){
        super(dataFile, reportFile);
    }
    
    public List<DataPair> loadData(){
        List<DataPair> list = new ArrayList<DataPair>();
        File file = new File(super.m_dataFile);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] temp = line.split(",", -1);
                try{
                    int num = Integer.parseInt(temp[2]);
                    list.add(new DataPair(temp[0], num));
                }
                catch(java.lang.NumberFormatException e){
                    System.err.println("No value given");
                }
                
                line = br.readLine();
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
        return list;
    }
}