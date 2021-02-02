package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class Catalogue extends ArrayList<Movie>{
    List<Movie> catalogue = new ArrayList<Movie>();

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean add(Movie e) {
        return super.add(e);
    }
    
         
}
