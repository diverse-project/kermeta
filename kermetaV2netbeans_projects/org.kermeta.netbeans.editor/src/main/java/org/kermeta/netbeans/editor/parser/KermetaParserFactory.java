/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.netbeans.editor.parser;

import java.util.Collection;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;

/**
 *
 * @author ffouquet
 */
public class KermetaParserFactory extends ParserFactory {

    @Override
    public Parser createParser(Collection<Snapshot> clctn) {
        System.out.println("Parser Creation "+clctn);
        return new KermetaParser();
    }

}
