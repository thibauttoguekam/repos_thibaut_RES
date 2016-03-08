/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @ thibaut togue kamga
 */
public interface IRecorder {

    public void record(Idata data);

    public void init() throws IOException;

    public void close();
}
