public class JuegoAdivinaNumero extends Juego{
    private int numeroVidas;
    private int numeroParaAdivinar=7;


    public JuegoAdivinaNumero(int vidasIniciales, int numeroVidas, int numeroParaAdivinar) {
        super(numeroVidas);
        this.numeroParaAdivinar = numeroParaAdivinar;
    }

    @Override
    public void Juega() {
        int numeroDelJugador;
        super.ReiniciaPartida();
        System.out.println("\nAdivina el número entre el 0 y el 10: \n");
        numeroDelJugador = Teclado.LeeEntero();
        if (numeroDelJugador == numeroParaAdivinar) {
            System.out.println("\nAcertaste!!!\n");
            ActualizaRecord();
        } else {
            if (QuitaVida() == true) {
                if (numeroDelJugador>numeroParaAdivinar){
                    System.out.println("\nEl numero a adivinar es menor que "+numeroDelJugador+". Inténtalo de nuevo.");
                }
                else {
                    System.out.println("\nEl numero a adivinar es mayor que "+numeroDelJugador+". Inténtalo de nuevo.");
                }
            }
        }
    }
}
