public abstract class AbstractOrderAlg implements IDiffAlg{
    public int difference(String seq1, String seq2){
        int penalty = 0;
        if(seq1.length() == seq2.length()){
            for(int i = 0; i < seq1.length(); i++){
                if(seq1.charAt(i) != seq2.charAt(i)){
                    penalty++;
                }
            }
        }
        else
        System.out.println("Sequences are of different length");
        
        return penalty;
    }
    
    abstract protected int penalty(char ch1);
}