package co.com.ps.c4;

class Persona {

    private String nombre;
    private int edad;
   private String cedula;



    public Persona(){
    }
   // public Persona(String nombre){
     //   this.nombre=nombre;
   // }
  //  public Persona(int edad){
        //this.edad=edad;
    //}

    public Persona(String cedula){
        this.cedula =cedula;

    }

    //public Persona(String nombre,int edad){
      //  this.nombre=nombre;
        //this.edad=edad;


   public String getNombre() {
       return nombre;
    }

   public void setNombre(String nombre) {
       this.nombre = nombre;
    }

   public int getEdad() {
       return edad;
    }

   public void setEdad(int edad) {
       this.edad = edad;
    }
}
