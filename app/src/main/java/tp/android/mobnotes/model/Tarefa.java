package tp.android.mobnotes.model;

import java.util.Date;

/**
 * Created by diogo marcos on 01/11/2015.
 */
public class Tarefa {
    private Integer id;
    private String nome;
    private boolean concluida;
    private boolean delegada;
    private int criador;
    private int realizador;
    private String descricao;
    private String tempoExecucao;
    private Date inicio;
    private Date fim;

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

    public boolean getConcluida(){
        return (concluida);
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    public boolean getDelegada(){
        return (delegada);
    }

    public void setDelegada(boolean delegada){
        this.delegada = delegada;
    }

    public int getCriador(){
        return (criador);
    }

    public void setCriador(int criador){
        this.criador = criador;
    }

    public int getRealizador(){
        return (realizador);
    }

    public void setRealizador(int realizador){
        this.realizador = realizador;
    }

    public String getDescricao(){
        return (descricao);
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getTempoExecucao(){
        return (tempoExecucao);
    }

    public void setTempoExecucao(String tempoExecucao){
        this.tempoExecucao = tempoExecucao;
    }

    public Date getInicio(){
        return (inicio);
    }

    public void setInicio(Date inicio){
        this.inicio = inicio;
    }

    public Date getFim(){
        return (fim);
    }

    public void setFim(Date fim){
        this.fim = fim;
    }
}
