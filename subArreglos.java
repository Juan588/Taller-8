public class subArreglos
{
    public int[] subArregloInt(int[] A){
        int x = 0;
        int y = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > A[0]){
                x++;
            }
        }
        int[] Res = new int[x];
        for(int i = 0; i < A.length; i++){
            if(A[i] > A[0]){
                Res[y] = A[i];
                y++;
            } 
        }
        return Res;
    }

    public double[] subArregloDouble(double[] B){
        int x = 0;
        int y = 0;
        for(int i = 0; i < B.length; i++){
            if(B[i] < B[B.length - 1]){
                x++;
            }
        }
        double[] Res = new double[x];
        for(int i = 0; i < B.length; i++){
            if(B[i] < B[B.length - 1]){
                Res[y] = B[i];
                y++;
            } 
        }
        return Res;
    }

    public String[] subArregloString(String[] C){
        String VocalInic;
        int x = 0;
        int y = 0;
        for(int i = 0; i < C.length; i++){
            VocalInic = C[i].substring(0,1);
            if((VocalInic.equalsIgnoreCase("A")) || (VocalInic.equalsIgnoreCase("E")) || (VocalInic.equalsIgnoreCase("I")) || (VocalInic.equalsIgnoreCase("O")) || (VocalInic.equalsIgnoreCase("U"))){
                x++;
            }
        }
        String[] Res = new String[x];
        for(int i = 0; i < C.length; i++){
            VocalInic = C[i].substring(0,1);
            if((VocalInic.equalsIgnoreCase("A")) || (VocalInic.equalsIgnoreCase("E")) || (VocalInic.equalsIgnoreCase("I")) || (VocalInic.equalsIgnoreCase("O")) || (VocalInic.equalsIgnoreCase("U"))){
                Res[y] = C[i];
                y++;
            }
        }
        return Res;
    }
}
