public class Universidade {
    private String nome;
    private int quantAlunos;

    public Universidade(String nome, int quantAlunos){
        this.nome = nome;
        this.quantAlunos = quantAlunos;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantAlunos(){
        return this.quantAlunos;
    }
    public void setQuantAlunos(int quantAlunos){
        this.quantAlunos = quantAlunos;
    }

    @Override
    public String toString(){
        return "Universidade: "+nome+"; Quantidade de Alunos: "+quantAlunos;
    }

    public void imprimeUniversidades(Universidade[] arrayDeUniversidades){
        for(Universidade universidade : arrayDeUniversidades){
            if(universidade != null){
                System.out.println(universidade.toString());
            }
        }
    }

    public Universidade maisAlunos(Universidade[] arrayDeUniversidades){
        Universidade universidadeComMaisAlunos = null;
        int numeroDeAlunos = 0;
        for(Universidade universidade : arrayDeUniversidades){
            if(universidade != null){
                if(universidade.getQuantAlunos() > numeroDeAlunos){
                    numeroDeAlunos = universidade.getQuantAlunos();
                    universidadeComMaisAlunos = universidade;
                }
            }
        } return universidadeComMaisAlunos;
    }
}
