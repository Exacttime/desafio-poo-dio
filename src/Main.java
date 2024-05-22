import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.entity.Computador;
import br.com.dio.desafio.dominio.entity.MemoriaRam;
import br.com.dio.desafio.dominio.entity.PlacaMae;
import br.com.dio.desafio.dominio.entity.Processor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        MemoriaRam memoriaRam = new MemoriaRam();
        PlacaMae placaMae = new PlacaMae();
        computador.colocarProcessamento(memoriaRam);
        computador.colocarProcessamento(placaMae);
        System.out.println(computador.getProcesadores());
    }
}
