package Jin.Jin_College;

import java.io.File;
import java.io.FileNotFoundException;

public interface Interface {
    public boolean writeFile(File file) throws FileNotFoundException;
    public boolean readFile(File file) throws FileNotFoundException;
}
