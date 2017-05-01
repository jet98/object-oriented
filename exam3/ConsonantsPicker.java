public class ConsonantsPicker implements IWordPicker{
    @Override
    public boolean approveWord(String word){
        double v = 0;
        double c = 0;
        
        for(int i = 0; i < word.length(); i++){
            char x = word.charAt(i);
            switch(Character.toString(x)){
                case "a":
                case "A":
                    v++;
                    break;
                case "e":
                case "E":
                    v++;
                    break;
                case "i":
                case "I":
                    v++;
                    break;
                case "o":
                case "O":
                    v++;
                    break;
                case "u":
                case "U":
                    v++;
                    break;
                default:
                    c++;
                    break;
            }
        }
        
        return (v/c) > 0.33;
    }
}