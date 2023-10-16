public class Parallelepiped_RH extends Rectangle_RH {
   private float length;
   
   public Parallelepiped_RH {
      this.length = 0;
      super();
   }
   
   public Parallelepiped_RH(float w, float h, float l) {
      this.length = l;
      super(w, h);
   }
   
   public float baseArea() {
      return super.area();
   }
   
   public float area() {
      float baseArea = super.area() * 2;
      float widthArea = super.getWidth() * length * 2;
      float heightArea = super.getHeight() * length * 2;
      float totalArea = baseArea + widthArea + heightArea;
      return totalArea;
   }
   
   public float volume() {
      return(super.getWidth() * super.getHeight() * length);
   }
}