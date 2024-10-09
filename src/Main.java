
import java.time.LocalDate;

import br.com.dio.Desafio.dominio.Curso;
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




        
        System.out.println(curso1);
        System.out.println(curso2);
    }
    
}