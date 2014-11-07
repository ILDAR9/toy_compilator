package innopolis.icc.toy.compilator;

import java.io.IOException;

public interface ICompilator {
    byte[] compile(String filePath) throws IOException;
}