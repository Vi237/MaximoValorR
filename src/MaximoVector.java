public class MaximoVector {
    private static int maximoVector(int[]vector,int indice,int maximo){
        if (indice==vector.length-1){//caso base
            if (vector[indice]>maximo){
                maximo=vector[indice];
            }
        }else {//llamada a recursividad
            if(vector[indice]>maximo){
                maximo=vector[indice];
            }
            maximo=maximoVector(vector,indice+1,maximo);
        }
        return maximo;
    }
    //METODO AXILIAR Q' LLAMA A METODO RECURSIVO
    public static int maximoVector(int[]vector){
        return maximoVector(vector,0,0);
    }
}
