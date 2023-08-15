import java.text.DecimalFormat;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        String[] nomes = {"João", "Ana", "Ramon", "Laura", "Lucas", "Luisa", "Clinton", "Eduarda", "Johnny", "Viviane"};

        Pessoa[] alunos = new Pessoa[10];

        Random random = new Random();
        DecimalFormat df = new DecimalFormat("0.00");

        for(int i=0; i<alunos.length; i++){
            String nome = nomes[random.nextInt(nomes.length)];
            int idade = random.nextInt(20) +18;
            double peso = random.nextDouble() *50+50;
            double altura = random.nextDouble() *0.5+1.5;

            alunos[i] = new Pessoa(nome, idade, peso, altura);
        }

        Presenca registroPresenca = new Presenca(alunos);
        registroPresenca.gerarPresencaAleatoria();
        registroPresenca.imprimirPresenca(df);
    }
}
