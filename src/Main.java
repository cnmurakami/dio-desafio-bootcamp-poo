import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Caio: " + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("Conteúdos inscritos Caio: " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Caio: " + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXp());

        Dev devJoao = new Dev();
        devCaio.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
