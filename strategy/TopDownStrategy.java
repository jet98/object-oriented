public class TopDownStrategy implements IGuessStrategy{
    private int lastGuess = -1;
    
    @Override
    public int guess(int start, int end){
        lastGuess++;
        return end - lastGuess;
    }
}