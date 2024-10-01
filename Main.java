import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("|||||CONVERSOR DE MOEDAS |||||");

        //moeda que será convertida;
        System.out.println("Moeda de Origem \n1.Real \n2.Dolar \n3.Euro \n4.Libra");
        String moedaOrigem=scan.nextLine();

        //moeda convertida;
        System.out.println("Moeda de Destino \n1.Real \n2.Dolar \n3.Euro \n4.Libra");
        String moedaDestino= scan.nextLine();

        //valor para converter;
        System.out.println("Qual valor deseja converter?");
        double converterValor= scan.nextDouble();

        switch (moedaOrigem){
            case "Real":
                switch (moedaDestino){
                    case "Dolar":
                        System.out.println("Real -> Dolar "+ converterValor*0.18);
                        break;
                    case "Euro":
                        System.out.println("Real -> Euro "+ converterValor*0.16);
                        break;
                    case "Libra":
                        System.out.println("Real -> Libra "+converterValor*0.13);
                        break;
                    default:
                        System.out.println("Invalido!");
                }
             break;
            case "Dolar":
                switch (moedaDestino){
                    case "Real":
                        System.out.println("Dolar -> Real "+ converterValor*5.47);
                        break;
                    case "Euro":
                        System.out.println("Dolar -> Euro "+ converterValor*0.90);
                        break;
                    case "Libra":
                        System.out.println("Dolar -> Libra "+converterValor*0.75);
                        break;
                    default:
                        System.out.println("Invalido!");
                }
                break;
            case "Euro":
                switch (moedaDestino){
                    case "Real":
                        System.out.println("Euro -> Real "+ converterValor*6.06);
                        break;
                    case "Dolar":
                        System.out.println("Euro -> Dolar "+ converterValor*0.90);
                        break;
                    case "Libra":
                        System.out.println("Euro -> Libra "+converterValor*0.83);
                        break;
                    default:
                        System.out.println("Invalido!");
                }
                break;
            case "Libra":
                switch (moedaDestino){
                    case "Dolar":
                        System.out.println("Libra -> Euro "+ converterValor*1.2);
                        break;
                    case "Euro":
                        System.out.println("Libra -> Dolar "+ converterValor*1.33);
                        break;
                    case "Real":
                        System.out.println("Libra -> Real "+converterValor*7.27);
                        break;
                    default:
                        System.out.println("Invalido!");
                }
                break;
        }


}}
