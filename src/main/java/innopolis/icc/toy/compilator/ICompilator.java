package innopolis.icc.toy.compilator;

import innopolis.icc.toy.exceptions.ToyException;

import java.io.File;
import java.io.IOException;

public interface ICompilator {
    byte[] compile(String filePath) throws ToyException;
    void doFile(File file) throws ToyException;
}