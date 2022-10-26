package pt.pa.model;

/**
 *
 * @author patriciamacedo
 */

public class FileContainer {

    private String name;

    @Override
    public String toString() {
        return    "name='" + name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileContainer(String name) {
        this.name = name;
    }
}
