public class Aplicacion {
    public static void main(String[] args) {
        Juego primerJuego = new Juego(5);

        Juego segundoJuego = new Juego(5);

        primerJuego.QuitaVida();
        primerJuego.MuestraVIdasRestantes();
        primerJuego.ReiniciaPartida();
        primerJuego.MuestraVIdasRestantes();

        primerJuego.ActualizaRecord();
        segundoJuego.ActualizaRecord();
    }
}
