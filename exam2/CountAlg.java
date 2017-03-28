public class CountAlg implements IDiffAlg{
    private static CountAlg m_instance;
    
    public static CountAlg getInstance()
    {
        if (m_instance == null)
            m_instance = new CountAlg();
        return m_instance;
    }
    
    private CountAlg() {}
    
    public int difference(String seq1, String seq2){
        int a = 0;
        int c = 0;
        int t = 0;
        int g = 0;
        int a2 = 0;
        int c2 = 0;
        int t2 = 0;
        int g2 = 0;
        int difference = 0;
        if(seq1.length() == seq2.length()){
            for(int i = 0; i < seq1.length(); i++){
                if(seq1.charAt(i) != seq2.charAt(i)){
                    if(seq1.charAt(i) == 'A')
                        a++;
                    if(seq1.charAt(i) == 'C')
                        c++;
                    if(seq1.charAt(i) == 'T')
                        t++;
                    if(seq1.charAt(i) == 'G')
                        g++;
                    if(seq2.charAt(i) == 'A')
                        a2++;
                    if(seq2.charAt(i) == 'C')
                        c2++;
                    if(seq2.charAt(i) == 'T')
                        t2++;
                    if(seq2.charAt(i) == 'G')
                        g2++;
                }
            }
        }
        else
        System.out.println("Sequences are of different length");
        
        difference = (a - a2) + (g - g2) + (c - c2) + (t - t2);
        
        return difference;
    }
}