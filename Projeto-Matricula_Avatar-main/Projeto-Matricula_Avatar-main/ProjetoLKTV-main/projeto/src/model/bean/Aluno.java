package model.bean;

import java.util.Date;

public class Aluno {
    private int codaluno;
    private String nomealuno;
    private String cpfaluno;
    private Date data_nascimento;
    private String email_aluno;
    private String nomesocial_aluno;
    private boolean deficiente;
    private int tipo_deficiencia;
    private String enderecoaluno;
    private String telefonealuno;
    private String nomeresponsavel;
    private String cpfresponsavel;
    private String telefoneresponsavel;

    public int getCodaluno() {
        return codaluno;
    }

    public void setCodaluno(int codaluno) {
        this.codaluno = codaluno;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getCpfaluno() {
        return cpfaluno;
    }

    public void setCpfaluno(String cpfaluno) {
        this.cpfaluno = cpfaluno;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public String getNomesocial_aluno() {
        return nomesocial_aluno;
    }

    public void setNomesocial_aluno(String nomesocial_aluno) {
        this.nomesocial_aluno = nomesocial_aluno;
    }

    public boolean isDeficiente() {
        return deficiente;
    }

    public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }

    public int getTipo_deficiencia() {
        return tipo_deficiencia;
    }

    public void setTipo_deficiencia(int tipo_deficiencia) {
        this.tipo_deficiencia = tipo_deficiencia;
    }

    public String getEnderecoaluno() {
        return enderecoaluno;
    }

    public void setEnderecoaluno(String enderecoaluno) {
        this.enderecoaluno = enderecoaluno;
    }

    public String getTelefonealuno() {
        return telefonealuno;
    }

    public void setTelefonealuno(String telefonealuno) {
        this.telefonealuno = telefonealuno;
    }

    public String getNomeresponsavel() {
        return nomeresponsavel;
    }

    public void setNomeresponsavel(String nomeresponsavel) {
        this.nomeresponsavel = nomeresponsavel;
    }

    public String getCpfresponsavel() {
        return cpfresponsavel;
    }

    public void setCpfresponsavel(String cpfresponsavel) {
        this.cpfresponsavel = cpfresponsavel;
    }

    public String getTelefoneresponsavel() {
        return telefoneresponsavel;
    }

    public void setTelefoneresponsavel(String telefoneresponsavel) {
        this.telefoneresponsavel = telefoneresponsavel;
    }

}