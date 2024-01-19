public class ValorDolar {
    double valorEmDolares;
    double real;

    public ValorDolar(double valorEmDolares, double real) {
        this.valorEmDolares = valorEmDolares;
        this.real = real;
    }


    public double converterDolares(double valorDolar, double real){
        return valorDolar * real;
        
    }

}
