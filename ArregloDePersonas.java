import java.lang.reflect.Array; 
import java.util.Random;
import java.util.*;
public class ArregloDePersonas
{
    Persona[] personas;
    GeneradorDeNombre generadorNombres = new GeneradorDeNombre();
    String[] sexos = {"Hombre", "Mujer"};
    Random random = new Random();

    public ArregloDePersonas(int n) { 
        personas = new Persona[n];
        for(int i = 0; i < personas.length; i++){
            int random = (int) Math.round(generadorValoresRandomEnRango(0,1.1));
            personas[i] = crearPersona(random);
        }
    }

    private Persona crearPersona(int random){
        String sexo = sexos[random];
        String nombre = generadorNombres.generarNombre(sexo);
        double peso = generadorValoresRandomEnRango(45, 110);
        double estatura = generadorValoresRandomEnRango(0.5, 1.95);
        return new Persona(nombre, sexo, peso, estatura);
    }

    private static double generadorValoresRandomEnRango(double min, double max) {
        Random r = new Random();
        double randomValue = min + (max - min) * r.nextDouble();
        return randomValue;
    }

    private static void ordNomAlfabeticoDescendente(Persona[] arreglo) {
        int in;
        for (int i = 1 ; i < arreglo.length ; i++) {
            Persona aux = arreglo[i];
            in = i;
            while (in > 0 && arreglo[in - 1].getNombre().compareTo(aux.getNombre()) < 0) {
                arreglo[in] = arreglo[in - 1];
                --in;
            }
            arreglo[in] = aux;
        }
    }

    private Persona[] bubbleSortObjects(Persona[] personas){    
        for(int i = 1; i < personas.length; i++){
            for(int j = 0; j < personas.length - 1; j++){
                if(personas[j].getEstatura() > personas[j+1].getEstatura()){
                    double aux = personas[j].getEstatura();
                    personas[j].setEstatura(personas[j+1].getEstatura());
                    personas[j+1].setEstatura(aux);
                }
            }
        }
        return personas;
    }

    public void MostrarPersonas(){
        for(int i = 0; i < personas.length; i++){
            System.out.println("Persona: " + (i+1) + "\n" + personas[i]);
        }
    }

    public Persona[] PersonasPorSexo(String sexo){
        Persona personasMismoSexo[];
        int x = 0;
        int y = 0;
        for(int i = 0; i < personas.length; i++){
            if(personas[i].getSexo().equalsIgnoreCase(sexo)){
                x++;
            }
        }  
        personasMismoSexo = new Persona[x];
        for(int i = 0; i < personas.length; i++){
            if(personas[i].getSexo().equalsIgnoreCase(sexo)){ 
                personasMismoSexo[y] = personas[i];
                y++;
            }
        }  
        return personasMismoSexo;
    }

    public Persona[] personaMasAlta(){
        double may = 0;
        Persona personaMasAlta[] = new Persona[1];
        for(int i = 0; i < personas.length; i++){
            if(personas[i].getEstatura() > may){
                may = personas[i].getEstatura();
                personaMasAlta[0] = personas[i];
            }                   
        }
        return personaMasAlta;
    } 

    public String personaMasPesada(){
        double may = 0;
        Persona personaMasPesada[] = new Persona[1];
        for(int i = 0; i < personas.length; i++){
            if(personas[i].getPeso() > may){
                may = personas[i].getPeso();
                personaMasPesada[0] = personas[i];
            }                     
        }    
        return personaMasPesada[0].getNombre();
    }

    public Persona[] PersonasMasAltaPorSexo(String sexo){
        Persona personasMasAltaPorSexo[] = new Persona[1];
        double may = 0;            
        for(int i = 0; i < personas.length; i++){
            if(sexo.equalsIgnoreCase("Hombre") || sexo.equalsIgnoreCase("Masculino")){
                if(personas[i].getEstatura() > may){
                    may = personas[i].getEstatura();
                    personasMasAltaPorSexo[0] = personas[i];
                }
            } 
        }

        for(int i = 0; i < personas.length; i++){
            if(sexo.equalsIgnoreCase("Mujer") || sexo.equalsIgnoreCase("Femenino")){
                if(personas[i].getEstatura() > may){
                    may = personas[i].getEstatura();
                    personasMasAltaPorSexo[0] = personas[i];
                }
            } 
        }
        return personasMasAltaPorSexo;
    }

    public double diferenciaEntreMasPesados(){
        double mayH = 0;
        double mayM = 0;
        String SexoM = "hombre";
        String SexoF = "mujer";
        for(int i = 0; i < personas.length; i++){
            if(personas[i].getSexo().equalsIgnoreCase(SexoM)){
                if(personas[i].getPeso() > mayH){
                    mayH = personas[i].getPeso();
                }
            }
        }

        for(int i = 0; i < personas.length; i++){
            if(personas[i].getSexo().equalsIgnoreCase(SexoF)){
                if(personas[i].getPeso() > mayM){
                    mayM = personas[i].getPeso();
                }
            }
        }
        return Math.abs(mayH - mayM);
    }
}
