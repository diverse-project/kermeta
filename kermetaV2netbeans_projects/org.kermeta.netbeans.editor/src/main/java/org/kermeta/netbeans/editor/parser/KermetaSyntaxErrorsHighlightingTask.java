/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.netbeans.editor.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import org.kermeta.scala.parser.ParseException;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;

/**
 *
 * @author ffouquet
 */
public class KermetaSyntaxErrorsHighlightingTask extends ParserResultTask {

    @Override
    public void run(Result t, SchedulerEvent se) {

        KermetaParserResult kresult = (KermetaParserResult) t;
        try {

            if (kresult.getParser().getErrors().isDefined()) {

                List<ErrorDescription> errors = new ArrayList<ErrorDescription>();

                ParseException excpt = kresult.getParser().getErrors().get();
                Document document = kresult.getSnapshot().getSource().getDocument(false);
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, excpt.errMsg(), document, excpt.line());
                errors.add(errorDescription);
                HintsController.setErrors(document, "kermeta", errors);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }





        //HintsController.

        //t.getSnapshot().get

        // try {
        //SqlParser.SqlEditorParserResult sjResult = (SqlParser.SqlEditorParserResult) result;
        //List<SyntaxError> syntaxErrors = sjResult.getSqlParser().syntaxErrors;
        //Document document = result.getSnapshot().getSource().getDocument(false);
        //List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
        //for (SyntaxError syntaxError : syntaxErrors) {
        //  RecognitionException exception = syntaxError.exception;
        // String message = syntaxError.message;

        //int line = exception.line;
        //if (line <= 0) {
        //   continue;
        //}
                /*ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
        Severity.ERROR,
        message,
        document,
        line);
        errors.add(errorDescription);*/
    }

    //HintsController.setErrors(document, "sqlr", errors);
    //} catch (Exception ex) {
    //    ex.printStackTrace();
    // }
    //}
    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
    }
}
