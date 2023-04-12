import java.util.Scanner;

public class ChatbotBakery {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome;
        String boloPao;
        String bBolis;
      
        

        System.out.println("Olá, qual seu nome?");
        nome = ler.nextLine();

        System.out.println("Muito prazer, "+ nome +", poderia me dizer se quer comprar bolo 🎂 ou pão 🥖?");
        boloPao = ler.nextLine();

        if(boloPao.equals("bolo")  ){
            System.out.println("você quer bolo de chocolate ou de murango🍰 ?");
            bBolis = ler.nextLine();
            if(bBolis.equals("chocolate") ){
                System.out.println("Okay! seu bolo de "+bBolis+" 🍫 será enviado, a cobrança será feita pelo entregador na chegada");

            }else if(bBolis.equals("murango")||bBolis.equals("morango")){
                System.out.println( "Okay! seu bolo de "+bBolis+"🍓será enviado, a cobrança será feita pelo entregador na chegada");
            }
        }else if (boloPao.equals("pão")|| boloPao.equals("pao" )){
            System.out.println("você só terá direito a 2 reais de pão carteira, 4 francês e dois doces e será entregue na sua casa, pague na chegada");
        }
        System.out.println("muito obrigado pela preferência 🤪");


        ler.close();
    }
}
