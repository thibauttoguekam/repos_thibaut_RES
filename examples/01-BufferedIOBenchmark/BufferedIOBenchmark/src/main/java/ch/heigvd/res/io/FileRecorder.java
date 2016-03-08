/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import static ch.heigvd.res.io.BufferedIOBenchmark.LOG;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;

/**
 *
 * @author Togue Kamga Thibaut
 */
public class FileRecorder implements IRecorder {

    /**
     * the constructor inpout: String
     */
    public FileRecorder(String filname) {
        this.filname = filname;
    }

    public void record(Idata data) {
        serialized.serialisation(data, ps);
    }

    /**
     * this method creates the file and use
     *
     * @paramtIn :
     * @paramout :
     */
    public void init() throws IOException {
        try {
            File outputFile = new File(this.filname);
            this.ps = new PrintStream(outputFile);
            ps.println("operation" + "," + "stategy" + "," + "blockSize" + "," + "fileSizeInBytes" + "," + "duration");
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
            e.printStackTrace();
        }
    }

    public void close() {
        ps.close();
    }

    private PrintStream ps;
    private String filname;
    private ISerializer serialized = new CsvSerializer();
}
