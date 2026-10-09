package pilhaefila.basica;

public class Processo {


    private int pid;
    private String conteudo;

    public Processo(int pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }

    public int getPid() {
        return pid;
    }

    public String getConteudo() {
        return conteudo;
    }

}


