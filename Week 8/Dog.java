class Dog implements Comparable<Dog> {

   private String name;
   private String breed;
   
   public Dog(String name, String breed){
      this.name = name;
      this.breed = breed;
   }
   
   public String getName(){
      return name;
   }
   public String getBreed(){
      return breed;
   }
   public void bark(){
      System.out.println("barking...");
   } 
   public void eat(){
      System.out.println("I eat. I happy. Puppy eyes.");
   }
   public String toString(){
      return "[" + name + ", " + breed + "]";
   } 
   public boolean equals(Dog dog){
      return dog.getName().equals(name) && dog.getBreed().equals(breed);
   }
   
   public int compareTo(Dog dog) {
      String d1 = this.name + this.breed;
      String d2 = dog.getName() + dog.getBreed();
      return d1.compareTo(d2);
   }
   
}