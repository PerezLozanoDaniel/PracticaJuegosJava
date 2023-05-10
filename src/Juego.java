public abstract class Juego {
    private int vidasRestantes;
    private int vidasIniciales = 5;
    private int record = 0;

    public Juego(int vidasIniciales) {
        this.vidasRestantes = vidasIniciales;
    }
    public void MuestraVIdasRestantes() {
        System.out.println("\nVidas restantes: " + this.vidasRestantes);
    }
    public boolean QuitaVida() {
        boolean quedanVidas=true;
        this.vidasRestantes -= 1;
        if (this.vidasRestantes == 0) {
            quedanVidas = false;
            System.out.println("\nJuego Terminado");
        }
        return quedanVidas;
    }
    public void ReiniciaPartida() {
        this.vidasRestantes = this.vidasIniciales;
    }
    public void ActualizaRecord() {
        if (this.vidasRestantes == this.record) {
            System.out.println("\nHas alcanzado el record");
        }
        if (this.vidasRestantes > this.record) {
            this.record = this.vidasRestantes;
            System.out.println("\nHas batido el record. El nuevo record es: " + this.record);
        }
    }
    public abstract void Juega();
}
