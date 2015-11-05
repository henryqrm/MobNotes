package tp.android.mobnotes.model;

/**
 * Created by diogo marcos on 01/11/2015.
 */
public class Notificacao {
    private Integer id;
    private int usuario;
    private int tarefa;
    private String nome;
    private String conteudo;

    /** Getters e Setters **/
    public Integer getId(){
        return (id);
    }

    public void setId(Integer id){
        this.id = id;
    }

    public int getUsuario(){
        return (usuario);
    }

    public void setUsuario(int usuario){
        this.usuario = usuario;
    }

    public int getTarefa(){
        return (tarefa);
    }

    public void setTarefa(int tarefa){
        this.tarefa = tarefa;
    }

    public String getNome(){
        return (nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getConteudo(){
        return (conteudo);
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
}
