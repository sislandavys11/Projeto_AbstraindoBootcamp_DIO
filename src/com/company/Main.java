package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devS = new Dev();
        devS.setNome("Sislan");
        devS.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos: " + devS.getConteudosInscritos());
        devS.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos: " + devS.getConteudosInscritos());
        System.out.println("Conteúdo concluidos: " + devS.getConteudosConcluidos());

        System.out.println("XP: "+devS.calcularTotalXp());
        System.out.println("------------");

        Dev devD = new Dev();
        devS.setNome("Davys");
        devS.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos: " + devD.getConteudosInscritos());
        devD.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos: " + devD.getConteudosInscritos());
        System.out.println("Conteúdo concluidos: " + devD.getConteudosConcluidos());
        System.out.println("XP: "+devS.calcularTotalXp());




    }
}
