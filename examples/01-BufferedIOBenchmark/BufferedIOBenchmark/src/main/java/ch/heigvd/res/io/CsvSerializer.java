/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io;

import java.io.PrintStream;

/**
 *
 * @Toguekamga
 */
/*
 *this method allows the serialization of data that is put on the shape of the .csv file
 */
public class CsvSerializer implements ISerializer {
    /*
     *this method allows the serialization of data that is put on the shape of the .csv file
     * it takes into parameter data is serialized and flow on what we want to write.   
     */

    public void serialisation(Idata data, PrintStream ps) {
        String csv = data.getvalue("operation") + "," + data.getvalue("strategy")
                + "," + data.getvalue("blockSize") + "," + data.getvalue("fileSizeInBytes")
                + "," + data.getvalue("durationninMs");
        ps.println(csv);
    }
}
