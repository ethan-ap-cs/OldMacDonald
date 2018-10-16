class NamedCow extends Cow {
  private String myName;
  public NamedCow(String type, String name, String sound){
    super(type, sound);
    mySound = sound;
    myName = name;
    myType = type;
  }
  public String getName(){
    return(myName);
  }
}
