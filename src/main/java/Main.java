import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:");
        devCamila.getConteudosInscritos().forEach(conteudo -> System.out.println(conteudo.getTitulo()));
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.getConteudosInscritos().forEach(conteudo -> System.out.println(conteudo.getTitulo() +" INSCRITO!"));
        devCamila.getConteudosConcluidos().forEach(conteudo -> System.out.println(conteudo.getTitulo() + " CONCLUIDO!"));
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:");
        devJoao.getConteudosInscritos().forEach(conteudo -> System.out.println(conteudo.getTitulo()));
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.getConteudosInscritos().forEach(conteudo -> System.out.println(conteudo.getTitulo() +" INSCRITO!"));
        devJoao.getConteudosConcluidos().forEach(conteudo -> System.out.println(conteudo.getTitulo() + " CONCLUIDO!"));
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}