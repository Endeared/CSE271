class Cat extends Animal {

   // instance vars
   private String name;
   private String breed;
   
   // constructor
   public Cat(String n, String b) {
      name = n;
      breed = b;
   }
   
   // accessors
   public String getName() {
      return name;
   }
   public String getBreed() {
      return breed;
   }
   
   // mutators
   public void setName(String n) {
      name = n;
   }
   public void setBreed(String b) {
      breed = b;
   }

   // other instance methods
   public void meow() {
      System.out.println("meowing...");
   }
   public void ignoreOwner() {
      System.out.println("Ignoring owner...");
   }
   public void eat(){
      System.out.println("Lick Lick..Tuna..");
   }
   
   // mandatory toString & equals methods
   public String toString() {
      return("[" + name + ", " + breed + "]");
   }
   public boolean equals(Cat c) {
      return c.getName().equals(name) && c.getBreed().equals(breed);
   }

}