class Farm {
   private Animal [] aBunchOfAnimals = new Animal[3];
   public Farm(){
     aBunchOfAnimals[0] = new NamedCow("cow", "jim", "moo");
     aBunchOfAnimals[1] = new Chick("chick","cheep", "cluck");
     aBunchOfAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds(){
     for(int i = 0; i < aBunchOfAnimals.length; i++){
         System.out.println("the " + aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
     }
     NamedCow c = (NamedCow) aBunchOfAnimals[0];
     System.out.println("the " + c.getType() + " named " + c.getName() + " goes " + c.getSound());
   }
}
