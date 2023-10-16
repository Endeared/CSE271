class Dog extends Animal{  
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
   
   public void setName(String n) {
      name = n;
   }
   public void setBreed(String b) {
      breed = b;
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
} 