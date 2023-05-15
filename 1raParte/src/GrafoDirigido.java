import java.util.ArrayList;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T>{

    private ArrayList<Vertice> vertices = new ArrayList<>();

    /**
    * Complejidad: O(n) donde n depende de la cantidad de vertices en la lista vertices, ya que como en el peor de los casos
    * recorrera todos los vertices del array para verificar si el vertice a agregar existe o no.
    */
    @Override
    public void agregarVertice(int verticeId) {
        Vertice v = new Vertice(verticeId);
        if (!this.vertices.contains(v)) {
            this.vertices.add(v);
        }
    }

    /**
    * Complejidad: 
    * Contains: O(n) donde n es el numero de elementos en la lista, y en el peor de los casos recorrera 
    * todos los elementos de la lista de vertices.
    * La funcion completa seria O(n2) donde n es el numero de vertices/arcos, y cuadrado porque depende de la cantidad
    * de vertices y arcos que tenga cada lista. O(n) * O(n) = O(n2)
    */
    @Override
    public void borraVertice(int verticeId) {
        Vertice v = new Vertice(verticeId);
        ArrayList<Arco> arcos = new ArrayList<>(); //guardamos todos los arcos relacionados para poder eliminarlos
        if (vertices.contains(v)) {
            for (int i = 0; i < this.vertices.size(); i++) {
                if (vertices.get(i).getId() == v.getId()) {
                    vertices.remove(i);
                }
                else {
                    //eliminamos arcos que tienen como destino verticeId
                    arcos = this.vertices.get(i).getArcos();
                    for (int j = 0; j < arcos.size(); j++) {
                        if (arcos.get(j).getVerticeDestino() == verticeId) {
                            arcos.remove(j);
                        }
                    }
                }
            }
        }
    }

    //...

    @Override
    public void agregarArco(int verticeId1, int verticeId2, int info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarArco'");
    }

    @Override
    public void borrarArco(int verticeId1, int verticeId2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrarArco'");
    }

    @Override
    public boolean contieneVerice(int verticeId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contieneVerice'");
    }

    @Override
    public boolean existeArco(int verticeId1, int verticeId2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existeArco'");
    }

    @Override
    public int obtenerArco(int verticeId1, int verticeId2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerArco'");
    }

    @Override
    public int cantidadVertices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantidadVertices'");
    }

    @Override
    public int cantidadArcos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantidadArcos'");
    }

    @Override
    public Iterator<Integer> obtenerVertices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVertices'");
    }

    @Override
    public Iterator<Integer> obtenerAdyacentes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerAdyacentes'");
    }

    @Override
    public Iterator<Arco> obtenerArcos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerArcos'");
    }

    @Override
    public Iterator<Arco> obtenerArcos(int verticeId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerArcos'");
    }
    
}
