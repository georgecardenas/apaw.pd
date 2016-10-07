package apaw.pd.state.connection;

public class Conexion {
    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        setState(new Cerrado());
    }
    
    protected void setState(State state) {
        this.state = state;
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.state.getEstado();
    }

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }

    public void parar() {
        state.parar(this);
    }

    public void iniciar() {
        state.iniciar(this);
    }

    public void enviar(String msg) {
        state.enviar(this, getLink(), msg);
    }

    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
    }

}
