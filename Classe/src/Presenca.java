import java.text.DecimalFormat;

public class Presenca {
    private boolean[] presenca;
    private Pessoa[] alunos;

    public Presenca(Pessoa[] alunos){
        this.alunos = alunos;
        this.presenca = new boolean[alunos.length];
    }

    public boolean[] getPresenca(){
        return presenca;
    }
    public void setPresenca(boolean[] presenca){
        this.presenca = presenca;
    }

    public void marcarPresenca(int indice){
        if(indice >=0 && indice < alunos.length){
            presenca[indice] = true;
            System.out.println("Presença marcada para o aluno " + alunos[indice].getNome());
        } else{
            System.out.println("Índice inválido!");
        }
    }

    public void gerarPresencaAleatoria(){
        for(int i=0; i<presenca.length; i++){
            presenca[i] = Math.random() < 0.5;
        }
    }

    public void imprimirPresenca(DecimalFormat df){
        for(int i=0; i<alunos.length; i++){
            System.out.println("Posição: "+i);
            if(alunos != null){
                System.out.println("Aluno: " + alunos[i].getNome());
                System.out.println("Idade: " + alunos[i].getIdade());
                System.out.println("Peso: " + df.format(alunos[i].getPeso()));
                System.out.println("Altura: " + df.format(alunos[i].getAltura()));

                if(presenca[i]){
                    System.out.println("Presença: Presente");
                }else{
                    System.out.println("Presença: Ausente");
                }
            }else{
                System.out.println("Aluno não presente");
            }System.out.println();
        }
    }
}
