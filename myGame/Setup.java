import java.io.*;
import java.util.*;

public class Setup{
  String hero;
  String enemy1;
  String enemy2;
  
  public Setup(){
    try {
      String[] temp;
      BufferedReader reader = new BufferedReader(new FileReader("./Setup.txt"));
      String line = reader.readLine();
      while(line != null){
        temp = line.split(": ", 2);
        if(!line.contains("//")){
          if(temp.length == 2){
            String x = temp[1].trim();
            if(line.contains("Hero"))
              hero = x;
            if(line.contains("Enemy1"))
              enemy1 = x;
            if(line.contains("Enemy2"))
              enemy2 = x;
          }
        }
        line = reader.readLine();
      }
    }
    catch (Exception e){
      throw new Error("Unable to find file");
    }
  }
  
  public String getHero(){
    return hero;
  }
  
  public String getEnemy1(){
    return enemy1;
  }
  
  public String getEnemy2(){
    return enemy2;
  }
}
