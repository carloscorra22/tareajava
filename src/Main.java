
public class Main {
    public static void main(String[] args) {
        positivoNegativo();
        menorQueTres();
        soluUnaVez();
        bucleFor();
        estaciones();

    }




    public static void positivoNegativo(){
        System.out.println("positivoNegativo");
        var numeroIf= 3;
        if (numeroIf<0){
            System.out.println("negativo");
        }else
        {
            System.out.println("positivo");
        }
    }
    public static void menorQueTres(){
        System.out.println("menorQueTres");
        var numeroWhile=0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    public static void soluUnaVez(){
        System.out.println("soloUnaVez");
        var numeroWhile=2;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);
    }
    private static void bucleFor() {
        System.out.println("blucleFor");
         for (int numeroFor=0;numeroFor<3;numeroFor++){
             System.out.println(numeroFor);
         }
    }
    private static void estaciones() {
        System.out.println("estaciones");
        var estacion= "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            default:
                System.out.println(estacion);
        }
    }
}