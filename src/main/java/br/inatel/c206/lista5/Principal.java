package br.inatel.c206.lista5;

import br.inatel.c206.lista5.csv.CSV;

import java.nio.file.*;

public class Principal {
    public static void main(String[] args) {
        Path arquivo = Paths.get("funcionarios.csv");
        CSV.generateCSVFuncs(arquivo);

    }
}
