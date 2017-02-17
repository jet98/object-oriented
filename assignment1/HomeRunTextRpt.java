import java.util.*;
import java.io.*;

public class HomeRunTextRpt{
    protected String m_dataFile;
    protected String m_reportFile;
    
    public HomeRunTextRpt(String dataFile, String reportFile){
        m_dataFile = dataFile;
        m_reportFile = reportFile;
    }
    
    public List<DataPair> loadData(){
        List<DataPair> list = new ArrayList<DataPair>();
        File file = new File(m_dataFile);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] temp = line.split(",", -1);
                try{
                    int num = Integer.parseInt(temp[1]);
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
    
    public void generateReport(List<DataPair> data){
        File file = new File(m_reportFile);
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < data.size(); i++){
	            bw.write(data.get(i).toString()); 
            }
            bw.close();
        }
        catch(IOException e){
            System.err.println("Close file");
        }
    }
}