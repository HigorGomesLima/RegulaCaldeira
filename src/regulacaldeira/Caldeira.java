package regulacaldeira;

public class Caldeira {
    static int tempAtual;
    static int quantAguaAtual;
    static int maxTemp = 200;
    static int minTemp = 90;
    static int maxAgua = 130;
    static int minAgua = 10;
    static int fogoAtual = 50;
    static int aguaIN = 2;
    
    private static Caldeira instance;
    
    private Caldeira(){
        tempAtual = 100;
        quantAguaAtual = 60;
        fogoAtual = 60;
        aguaIN = 50;
    }
    
    public static int getTempAtual() {
        if(instance == null)
            instance = new Caldeira();
        return tempAtual;
    }
    public static int getQuantAguaAtual() {
        if(instance == null)
            instance = new Caldeira();
        return quantAguaAtual;
    }
    public static int getMaxTemp() {
        if(instance == null)
            instance = new Caldeira();
        return maxTemp;
    }
    public static int getMinTemp() {
        if(instance == null)
            instance = new Caldeira();
        return minTemp;
    }
    public static int getMaxAgua() {
        if(instance == null)
            instance = new Caldeira();
        return maxAgua;
    }
    public static int getMinAgua() {
        if(instance == null)
            instance = new Caldeira();
        return minAgua;
    }
    public static int getFogoAtual() {
        if(instance == null)
            instance = new Caldeira();
        return fogoAtual;
    }
    public static int getAguaIN() {
        if(instance == null)
            instance = new Caldeira();
        return aguaIN;
    }

    public static void atualizarCaldeira(){
        if(instance == null)
            instance = new Caldeira();
        quantAguaAtual += aguaIN;
        if(tempAtual > 0){
            tempAtual += (((fogoAtual*130)/100) - quantAguaAtual)/25 + 1;          
        }
        if(tempAtual < 0)
            tempAtual = 0;
        if (tempAtual > 99){
            double perda = Math.pow((tempAtual - 99),0.5) + 1;
            quantAguaAtual = quantAguaAtual - (int)perda;
        }
    }
    
    public static void setfogoAtual(int valor){
        if(instance == null)
            instance = new Caldeira();
        fogoAtual = valor;
    }
    
    public static void setaguaIN(int valor){
        if(instance == null)
            instance = new Caldeira();
        aguaIN = valor;
    }
    
    
}
