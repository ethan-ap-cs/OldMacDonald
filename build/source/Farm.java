class Farm {
   private Animal [] aBunchOfAnimals = new Animal[3];
   public Farm(){
     aBunchOfAnimals[0] = new NamedCow("cow", "jim", "moo");
     aBunchOfAnimals[1] = new Chick("chick","cheep", "cluck");
     aBunchOfAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds(){
     for(int i = 0; i < aBunchOfAnimals.length; i++){
       if (aBunchOfAnimals[i].getType() == "cow"){
         System.out.println("the " + aBunchOfAnimals[i].getType() + " named " + aBunchOfAnimals[i].getName() + " goes " + aBunchOfAnimals[i].getSound());
       }
       else{
         System.out.println("the " + aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
       }
     }
   }
}
