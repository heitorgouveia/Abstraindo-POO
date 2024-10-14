
import java.time.LocalDate;

import br.com.dio.Desafio.dominio.Bootcamp;
import br.com.dio.Desafio.dominio.Curso;
import br.com.dio.Desafio.dominio.Dev;
import br.com.dio.Desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descricao BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devHeitor.getConteudosInscritos()); 
        devHeitor.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos " + devHeitor.getConteudosInscritos());
        System.out.println("COnteúdos Concluídos " + devHeitor.getConteudosConcluidos());
        System.out.println("XP " + devHeitor.calcularTotalXp());
        devHeitor.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos " + devHeitor.getConteudosInscritos());
        System.out.println("COnteúdos Concluídos " + devHeitor.getConteudosConcluidos());
        System.out.println("XP " + devHeitor.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("COnteúdos Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-----------");

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("COnteúdos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("COnteúdos Concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());





        


      
    }
    
}
