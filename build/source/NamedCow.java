class NamedCow extends Cow {
  String myName;
  NamedCow(String type, String name, String sound){
    super(type, sound);
    mySound = sound;
    myName = name;
    myType = type;
  }
  public void getName(){
    System.out.println(myName);
  }
}
