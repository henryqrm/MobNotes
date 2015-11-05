package tp.android.mobnotes.model;


/**
 * Created by diogo marcos on 01/11/2015.
 */
public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;


    /** Getters e Setters **/
    public Integer getId(){
        return (id);
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return (nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return (email);
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return (senha);
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getDataNascimento(){
        return (dataNascimento);
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

}
