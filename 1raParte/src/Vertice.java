import java.util.ArrayList;

public class Vertice {
    private int id;
    private ArrayList<Arco> arcos;
    private char visitado;

    public Vertice(int id) {
        this.id = id;
        this.arcos = new ArrayList<Arco>();
        this.visitado = 'b'; //blanco
    }

    public void agregarAdyacente(Arco a) {
        this.arcos.add(a);
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Arco> getArcos() {
        return this.arcos;
    }

    public int getVisitado() {
        return this.visitado;
    }

    public void setVisitado(char v) {
        this.visitado = v;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Vertice) { //si obj es una instacia de la clase Verice
            Vertice v = (Vertice) obj; //casteamos y tratamos a obj como objeto de clase Vertice
            return (v.getId() == this.getId());
        }
        else {
            return false;
        }
    }

}
