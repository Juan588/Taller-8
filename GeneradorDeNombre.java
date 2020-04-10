public class GeneradorDeNombre{
    String[] nombresH = { "Carlos", "David", "Andrés", "Juan", "Pablo", "Santiago", "Cristian", "Esteban",
            "Sebastian", "Anderson", "Simón", "José", "Felipe", "Fernando", "Guillermo" };

    String[] nombresM = {"Andrea", "Mariana","María", "Paulina", "Susana", "Estefanía", "Isabella", "Maria Clara", 
            "Valentina", "Maria José", "Antonia", "Sofía", "Carolina", "Ana", "Valeria" };

    String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Soto", "Cardona", "Restrepo", "Rincón", "Alvarez",
            "Viera", "Sierra", "Urrego", "Castro", "Bedoya", "Rios", "Escobar", "Giraldo", "Ospina",
            "Uribe", "Gaviria", "Alzate" };    
            
    public String generarNombre(String sexo){
        String NomH;
        String NomM;           
        if(sexo.equalsIgnoreCase("Hombre") || sexo.equalsIgnoreCase("Masculino")){
            NomH = nombresH[(int) (Math.floor(Math.random()* ((nombresH.length - 1) - 0 + 1) + 0))] + " " +
            apellidos[(int) (Math.floor(Math.random()* ((apellidos.length - 1) - 0 + 1) + 0))] + " " +
            apellidos[(int) (Math.floor(Math.random()* ((apellidos.length - 1) - 0 + 1) + 0))];

            return NomH;
        }
        
         if(sexo.equalsIgnoreCase("Mujer") || sexo.equalsIgnoreCase("Femenino")){
            NomM = nombresM[(int) (Math.floor(Math.random()* ((nombresM.length - 1) - 0 + 1) + 0))] + " " +
            apellidos[(int) (Math.floor(Math.random()* ((apellidos.length - 1) - 0 + 1) + 0))] + " " +
            apellidos[(int) (Math.floor(Math.random()* ((apellidos.length - 1) - 0 + 1) + 0))];

            return NomM;
        }
        return null;
    }

    public static void imprimir(String[] nombresGenerados) {
        for (int i = 0; i < nombresGenerados.length; i++) {
            System.out.println(nombresGenerados[i]);
        }
    }
}