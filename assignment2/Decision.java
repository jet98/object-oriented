import java.util.*;

public class Decision implements IDecision{
    private String m_question = "Do you want to buy a snowboard";
    private IDecision m_yes;
    private IDecision m_no;
    private String m_yesTerminal;
    private String m_noTerminal;
    
    public Decision(String question, IDecision yes, IDecision no, String yesTerminal, String noTerminal){
        m_question = question;
        setYes(yes);
        setNo(no);
        setYesTerminal(yesTerminal);
        setNoTerminal(noTerminal);
    }
    
    public void setYes(IDecision yes){
        m_yes = yes;
    }
    
    public void setNo(IDecision no){
        m_no = no;
    }
    
    public void setYesTerminal(String terminal){
        m_yesTerminal = terminal;
    }
    
    public void setNoTerminal(String terminal){
        m_noTerminal = terminal;
    }
    
    public IDecision ask(){
        System.out.println(m_question);
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        while(!(x.toLowerCase().equals("yes") || x.toLowerCase().equals("y") || x.toLowerCase().equals("no") || x.toLowerCase().equals("n"))){
            System.out.println("please enter yes or no");
            x = in.nextLine();
        }
        if(x.toLowerCase().equals("yes") || x.toLowerCase().equals("y")){
            if(m_yes == null){
                System.out.println(m_yesTerminal);
            }
            return this.m_yes;
        }
        else{
            if(m_no == null){
                System.out.println(m_noTerminal);
            }
            return this.m_no;
        }
    }
}