package sv.edu.utec.parcial2kevin;

public class Personas {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    private String cargo;
    private String compania;

    public Personas(String nombre, String cargo, String compania) {
        this.nombre=nombre;
        this.cargo=cargo;
        this.compania=compania;
      }

}
