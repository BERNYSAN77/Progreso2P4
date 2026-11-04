package arreglos.tienda.modelo;

public class AppStore {
    private static final int MAX = 4;
    private Juego juegos[];
    private int indice;

    public AppStore(){
        juegos = new Juego[MAX];
        indice = -1;
    }

    public Juego[] getJuegos() {
        return juegos;
    }
/* El set no se utiliza porque los datos se ingresan a demanda
    public void setJuegos(Juego juegos[]) {
        this.juegos = juegos;
    }
    */

    public boolean agregarJuego(Juego j){
        if(j != null && indice < MAX - 1){
            juegos[++indice] = j;
            return true;
        }
        return false;
    }
    public void agregarJuegoEx(Juego j){
        if(j != null && indice < MAX - 1){
            juegos[++indice] = j;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("No existe espacio");
    }

    public Juego buscarJuego(String nombre){
        return null;
    }

}
