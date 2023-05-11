public class JuegoAdivinaNumero extends Juego{
    private int numeroParaAdivinar;
    private int numeroDelJugador;


    public JuegoAdivinaNumero(int vidas, int numeroParaAdivinar) {
        super(vidas);
        this.numeroParaAdivinar = numeroParaAdivinar;
    }

    @Override
    public void Juega() {
                super.ReiniciaPartida();
        System.out.println("\nAdivina el número entre el 0 y el 10: \n");

        while (super.MuestraVIdasRestantes()>0) {
            numeroDelJugador = Teclado.LeeEntero();
            if (ValidaNumero(numeroDelJugador) == true) {

                if (numeroDelJugador == this.numeroParaAdivinar) {
                    System.out.println("\nAcertaste!!!\n");
                    ActualizaRecord();
                    break;
                } else {
                    if (QuitaVida() == true) {
                        if (numeroDelJugador > numeroParaAdivinar) {
                            System.out.println("\nEl numero a adivinar es menor que " + numeroDelJugador + ". Inténtalo de nuevo.");
                        } else {
                            System.out.println("\nEl numero a adivinar es mayor que " + numeroDelJugador + ". Inténtalo de nuevo.");
                        }
                    }
                }
            }
        }
    }

    public boolean ValidaNumero(int numeroDelJugador){
        return true;
    }
}


