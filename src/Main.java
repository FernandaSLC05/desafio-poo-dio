import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernanda: " + devFernanda.getConteudosInscritos());
        System.out.println("-");
        devFernanda.progredir();
        devFernanda.progredir();
        devFernanda.progredir();
        System.out.println("Conteúdos Inscritos Fernanda: " + devFernanda.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devFernanda.getConteudosComcluidos());
        System.out.println("XP: " + devFernanda.calcularTotalXp());

        System.out.println("============================");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("-");
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteúdos Incritos Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devGabriel.getConteudosComcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("============================");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("-");
        devLuiz.progredir();
        System.out.println("Conteúdos Incritos Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devLuiz.getConteudosComcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());




    }
}