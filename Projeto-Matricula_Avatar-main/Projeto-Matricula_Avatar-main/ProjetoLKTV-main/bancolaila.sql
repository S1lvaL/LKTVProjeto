CREATE DATABASE matriculaaluno20;
USE matriculaaluno20;

CREATE TABLE Tipo_deficiencia (
codtipo_deficiencia int auto_increment primary key,
nometipo_deficiencia varchar (50)
);

CREATE TABLE Curso (
codcurso int auto_increment primary key,
nome_curso Varchar(100) not null,
carga_horaria int,
descricao text
);

CREATE TABLE Aluno (
codaluno int auto_increment primary key,
nomealuno Varchar(100) not null,
cpfaluno Varchar(14) unique not null,
data_nascimento date,
email_aluno Varchar(100) not null,
nomesocial_aluno varchar (100),
deficiente boolean default false,
tipo_deficiencia int,
enderecoaluno varchar(200) not null,
telefonealuno varchar (11) not null,
nomeresponsavel varchar (100) not null,
cpfresponsavel varchar (11) not null,
telefoneresponsavel varchar (11) not null,
foreign key (tipo_deficiencia) references Tipo_deficiencia(codtipo_deficiencia)
);
         
CREATE TABLE Matricula (
codmatricula int auto_increment primary key,
cod_aluno int,
cod_curso int,
datamatricula date,
foreign key (cod_aluno) references Aluno(codaluno),
foreign key (cod_curso) references Curso(codcurso)
)