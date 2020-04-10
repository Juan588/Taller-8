import java.text.DecimalFormat;
public class Persona
{
    private String nombre;
    private String sexo;
    private double peso;
    private double estatura;
    DecimalFormat df = new DecimalFormat("#.00");

    public Persona(String nombre, String sexo, double peso, double estatura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" +
        "Sexo: " + sexo + "\n" +
        "Peso: " + df.format(peso) + " Kg" + "\n" + 
        "Estatura: " + df.format(estatura)  + " M" + "\n" + "\n";
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.sexo = sexo;
    }

    public double getEstatura(){
        return this.estatura;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
}