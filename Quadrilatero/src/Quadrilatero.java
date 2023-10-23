import java.util.List;

public class Quadrilatero {

    private List<Vertice> vertices;

    public Quadrilatero(List<Vertice> vertices) {
        if(vertices.size() == 4){
            this.vertices = vertices;
        }
    }
}
