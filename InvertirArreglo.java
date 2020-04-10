public class InvertirArreglo{
    public double[] invertirReales(double[] Arr){
        for (int i=0; i<(Arr.length/2); i++){
            double temp = Arr[i];
            Arr[i]=Arr[Arr.length - i - 1];
            Arr[Arr.length - i - 1] = temp;
        }
        return Arr;
    }

    public String[] invertirString(String[] Arr){
        for(int i=0; i<(Arr.length/2); i++){
            String temp = Arr[i];
            Arr[i]=Arr[Arr.length - i - 1];
            Arr[Arr.length - i - 1] = temp;
        }
        return Arr;
    }

    public int[] invertirDoble(int[] Arr){
        for(int i=0; i<(Arr.length/2); i++){
            int temp = Arr[i]*2;
            Arr[i]=Arr[Arr.length - i - 1] * 2;
            Arr[Arr.length - i - 1] = temp * 2;
        }
        return Arr;
    }

    public String[] invertirStringMayusculas(String[] Arr){
        for(int i = 0; i < (Arr.length/2); i++){
            String temp = Arr[i];           
            Arr[i] = Arr[Arr.length - i - 1].toUpperCase();
            Arr[Arr.length - i -1] = temp.toUpperCase();

        }
        return Arr;
    }
}

