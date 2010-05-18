/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.parser;

import javax.swing.event.ChangeListener;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author ffouquet
 */
public class KermetaParser extends Parser {

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        String texttoParse = snpsht.getText().toString();

        //Parser parser = new org.kermeta.scala.parser.Parser();
        try {
            //org.kermeta.scala.parser.Parser.parse(texttoParse);

            System.out.println("wuill parse");
            //System.out.println(org.kermeta.scala.parser.);

            parser = new org.kermeta.scala.parser.Parser();
            parser.parse(texttoParse);

            snapshot = snpsht;
            
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    org.kermeta.scala.parser.Parser parser ;
    Snapshot snapshot;

    @Override
    public Result getResult(Task task) throws ParseException {
        return new KermetaParserResult(snapshot,parser);
    }

    @Override
    public void cancel() {}

    @Override
    public void addChangeListener(ChangeListener cl) {}

    @Override
    public void removeChangeListener(ChangeListener cl) {}




}
