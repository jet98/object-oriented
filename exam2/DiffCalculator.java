import java.util.*;
import java.io.*;

public class DiffCalculator{
    private List<IDiffAlg> m_diffAlgs;
    
    public static void main(String[] args) throws IOException{
        new DiffCalculator().go();
    }
    
    public void go(){
        File file = new File("./Sequences.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> list = new ArrayList<String>();
            try{
                String line = reader.readLine();
                while(line != null){
                    String[] temp = line.split(",");
                    System.out.println(OrderAlg.getInstance().difference(temp[0], temp[1]));
                    line = reader.readLine();
                }
            }
            catch(IOException io){
                System.err.println(io);
            }
        }
        catch(FileNotFoundException fnf){
            System.err.println(fnf);
        }
    }
}