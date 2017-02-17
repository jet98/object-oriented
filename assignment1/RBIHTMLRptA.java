import java.util.*;
import java.io.*;

public class RBIHTMLRptA extends HomeRunHTMLRpt{
    public RBIHTMLRptA(String dataFile, String reportFile){
        super(dataFile, reportFile);
    }
    
    public void generateReport(List<DataPair> data){
        File file = new File(super.m_reportFile + ".html");
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("<html>\n<body>\n<table><thead>\n<th>Player</th>\n<th>RBI's</th>\n</thead>\n<tbody>\n");
            for(int i = 0; i < data.size(); i++){
	            bw.write("<tr>\n<td>" + data.get(i).getName() + "</td>\n<td>" + data.get(i).getStat() + "</td>\n</tr>\n"); 
            }
            bw.write("</tbody>\n</body>\n</html>\n");
            bw.close();
        }
        catch(IOException e){
            System.err.println("Close file");
        }
    }
}