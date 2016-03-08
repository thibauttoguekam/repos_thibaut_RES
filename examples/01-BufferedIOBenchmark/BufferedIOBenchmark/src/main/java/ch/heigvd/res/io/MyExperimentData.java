/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thibaut togue kamga cette methode permet de d'acceder au MAP privée
 * et sera utilisé lors de la serialisation des données pour recupéré les
 * données.
 *
 * @paramIN : String
 * @paramout: Object
 */
public class MyExperimentData implements Idata {

    public Object getvalue(String s) {
        return hm.get(s);
    }

    /**
     * cette methode permet le stockage des données à serialisé dans un MAP
     *
     * @paramIN: operation String such operation
     * @paramIN: ioStrategy IOStrategy the strategy for reading or writing data
     * to the file
     * @paramIN: int blockSize the size of data to read or write to the file
     * @paramIN: long fileSizeInBytes
     * @paramIN:duration the duration of reading or writing, which depends on
     * the strategy used
     */
    public MyExperimentData(String operation, BufferedIOBenchmark.IOStrategy ioStrategy, int blockSize, long fileSizeInBytes, long duration) {
        hm.put("operation", operation);
        hm.put("strategy", ioStrategy);
        hm.put("blockSize", blockSize);
        hm.put("fileSizeInBytes", fileSizeInBytes);
        hm.put("durationninMs", duration);

    }

    private Map<String, Object> hm = new HashMap<String, Object>();
}
