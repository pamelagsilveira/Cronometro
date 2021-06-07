/**
 ** A classe cronômetro atua como um contador de tempo baseado
 * no número informado pelo usuário, também utilizada da associação com a classe Teclado para
 * ler o tempo informado pelo usuário.
 * 
 * @author (Pâmela Gabrielle Silveira) 
 * @version (1.0)
 */
public class Cronometro
{
    public int t1, t2, tempo;
    /**
     * Construtor para objetos da classe Cronometro
     */
    public Cronometro(int t1, int t2, int tempo)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.tempo = tempo;        
        //solicita o tempo desejado pelo usuário
        //variável recebe e armazena o tempo digitado pelo usuário
        tempo = Teclado.leInt("Digite o tempo desejado: ");
        //representa os segundos e será inicializado em 00
        t1 = 00;
        //representa os minutos e será inicializado em 00 também
        t2 = 00;
        //enquanto o minuto for menor que o tempo os segundos continuam contabilizando
        while (t2 < tempo) {
            System.out.println("00:"+ t2 + ":0" + t1);
            t2++;
            //verifica se já chegou a 1 minuto, caso sim, aumenta para o próximo minuto
            if(t1 == 60) {
                t1++;
                t2 = 0;
            }
            try{
                 Thread.sleep(1000);
                }catch(Exception e){}
        }
            //mostra o tempo escolhido contado
            if(t2 == tempo){
                System.out.println("Cronômetro finalizado: 00: " + t1 + ":" +t2);
            }
                    
    
    }
    
}
   
    
    