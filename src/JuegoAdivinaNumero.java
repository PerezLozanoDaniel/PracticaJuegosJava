public class JuegoAdivinaNumero extends Juego{
        private int numeroParaAdivinar;


    public JuegoAdivinaNumero(int vidasIniciales, int numeroParaAdivinar) {
        super(vidasIniciales);
        this.numeroParaAdivinar = numeroParaAdivinar;
    }

    @Override
    public void Juega() {
        int numeroDelJugador;
        super.ReiniciaPartida();
        System.out.println("\nAdivina el número entre el 0 y el 10: \n");

        while (super.MuestraVIdasRestantes()>0) {
            numeroDelJugador = Teclado.LeeEntero();
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


