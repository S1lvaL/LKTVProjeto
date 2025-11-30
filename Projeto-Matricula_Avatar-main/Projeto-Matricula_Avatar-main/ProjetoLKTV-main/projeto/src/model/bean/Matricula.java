package model.bean;

import java.util.Date;

public class Matricula {

    private int codmatricula;
    private int cod_aluno;
    private int cod_curso;
    private Date datamatricula;
    private Aluno aluno;
    private Curso curso;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodmatricula() {
        return codmatricula;
    }

    public void setCodmatricula(int codmatricula) {
        this.codmatricula = codmatricula;
    }

    public int getCod_aluno() {
        return cod_aluno;
    }

    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public Date getDatamatricula() {
        return datamatricula;
    }

    public void setDatamatricula(Date datamatricula) {
        this.datamatricula = datamatricula;
    }

}
