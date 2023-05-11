public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero nuevoJuego =new JuegoAdivinaNumero(3,7);
        JuegoAdivinaPar nuevoJuegoPar =new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar nuevoJuegoImpar =new JuegoAdivinaImpar(3,9);


        nuevoJuego.Juega();
        nuevoJuegoPar.Juega();
        nuevoJuegoImpar.Juega();
    }
}
