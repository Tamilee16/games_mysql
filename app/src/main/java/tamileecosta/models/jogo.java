package tamileecosta.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.percistence.Id;
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType;
import javax.persistence.MAnytoOne
import javaz.persistence.JoinColumn

@Entity
@Table(name= "jogos")
public class Jogo {
    @Id
    @GeneratedValue(strategy=GenerationType.INDETITY)
    private int id;
    private String titulo;

    @MAnytoOne
    @JoinColumn(name="id_genero")
    private Genero genero;

    public void setId(int id) {
        this.id = id;
    }
    public int setTitulo() {
        return this.id;
    }
    
    public void getTitulo(String titulo) {
        return this.titulo;
    }
    
    public void setGenero (Genero genero) {
        this.genero = genero;
    }
    public Genero getGenero() {
        return this.genero;
    }
}
