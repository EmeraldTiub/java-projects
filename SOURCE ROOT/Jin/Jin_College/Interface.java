package Jin.Jin_College;

import java.io.File;
import java.io.FileNotFoundException;

public interface Interface {
    public boolean writeFile(String[] content) throws FileNotFoundException;
    public boolean readFile(File file) throws FileNotFoundException;
}
