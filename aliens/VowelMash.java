public class VowelMash implements ICrypto {
  private static VowelMash m_instance = null;

  private VowelMash(){
  }

  public static VowelMash getInstance(){
    if (m_instance == null){
      m_instance = new VowelMash();
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
    for(int i = 0; i < msg.getCharCount(); i++){
      switch(msg.getChar(i)){
        case 'A':
          message = message.substring(0, i) + "U" + message.substring(i+1);
          break;
        case 'E':
          message = message.substring(0, i) + "A" + message.substring(i+1);
          break;
        case 'I':
          message = message.substring(0, i) + "E" + message.substring(i+1);
          break;
        case 'O':
          message = message.substring(0, i) + "I" + message.substring(i+1);
          break;
        case 'U':
          message = message.substring(0, i) + "O" + message.substring(i+1);
          break;
        default:
          break;
      }
    }
    return message;
  }
}
