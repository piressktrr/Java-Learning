package pedro.ProjetoJava.javacore.VIO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args)  throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated =  fileDiretorio.mkdir();

        System.out.println("Pasta criada? " +isDiretorioCreated);
        // cria um diretorio

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        // passa um arquivo pro objeto que ta criando a pasta
        // portanto, se ele nao for criado
        // o objeto também nao é
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado? " +isFileCreated);

        File fileRenamed =  new File(fileDiretorio, "renamed_archived.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renamed? " +isRenamed);

        File pastaRenamed = new File(fileDiretorio, "pasta2");
        boolean isPastaRenamed = fileDiretorio.renameTo(pastaRenamed);
        System.out.println("Pasta renamed? " +isPastaRenamed);
    }
}
