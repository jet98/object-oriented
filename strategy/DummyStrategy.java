public class DummyStrategy implements IGuessStrategy{
    @Override
    public int guess(int start, int end){
        return end / 2;
    }
}