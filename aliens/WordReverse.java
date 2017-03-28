public class WordReverse implements ICrypto {
  private static WordReverse m_instance = null;

  private WordReverse(){
  }

  public static WordReverse getInstance(){
    if (m_instance == null) {
      m_instance = new WordReverse();
    }
    return m_instance;
  }

  @Override
  public String encrypt(String message){
    return message;
  }

  @Override
  public String decrypt(String message){
    Factory factory = Factory.getInstance();
    IMessageParser msg = factory.createParser(message);
    message = "";
    for(int i = 0; i < msg.getWordCount(); i++){
      String word = msg.getWord(i);
      int position = word.length();
      while(position > 0){
        message += word.substring(position-1, position);
        position--;
      }
      message += " ";
    }
    return message;
  }
}
