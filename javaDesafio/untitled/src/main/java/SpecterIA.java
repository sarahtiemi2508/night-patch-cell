public abstract class SpecterIA {
    private String nome;
    private int energia;
    private MemoriaDeCombate memoriaDeCombate;

    public SpecterIA( String nome, MemoriaDeCombate memoriaDeCombate) {
        this.nome = nome;
        this.energia = 100;
        this.memoriaDeCombate = memoriaDeCombate;
    }

    public abstract void executarTurno();

    public void receberDano(int valor ){
        if (valor < 0 ){
            return;
        }

        energia = Math.max(0,energia- valor);
    }

    public Boolean estaAtivo(){
        if (energia > 0){
            return true;
        }else {
            return false;
        }
    }



    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public MemoriaDeCombate getMemoriaDeCombate() {
        return memoriaDeCombate;
    }
}
