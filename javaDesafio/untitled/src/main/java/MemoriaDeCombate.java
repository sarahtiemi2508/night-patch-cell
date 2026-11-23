import java.util.ArrayList;
import java.util.List;

public class MemoriaDeCombate {
    List<String> historico;

    public MemoriaDeCombate() {
        this.historico = new ArrayList<>();
    }

    public void registrar(String evento){
        historico.add(evento);
    }

    public String ultimoEvento(){
        return historico.getLast();
    }

    public int tamanho(){
        return historico.size();
    }


}
