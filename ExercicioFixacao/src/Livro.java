public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "Livro: "+titulo+"; Autor: "+autor+"; Ano: "+ano;
    }

    public boolean verificaLivro(Livro[] arrayDeLivros, String titulo){
        for(Livro livro : arrayDeLivros){
            if(livro != null){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    return true;
                }
            }
        } return false;
    }

    public Livro retornaLivro(Livro[] arrayDeLivros, String titulo){
        for(Livro livro : arrayDeLivros){
            if(livro != null){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    return livro;
                }
            }
        } return null;
    }
}
