/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kermeta.io

class StdIOClass extends kermeta.standard.EObjectImplForPrimitive {

    var _console : org.kermeta.console.Console = null
    def console_=(arg : _root_.org.kermeta.console.Console) = {_console = arg}

    def write(obj : AnyRef) : Unit = {
        if (_console == null){
            Console.print(obj)
        }else
            _console.write(obj.toString)
    }

    def errorln(obj : AnyRef) : Unit = {
        if (_console == null){
            Console.println(obj) //TODO PRINT TO ERR CONSOLE
        }else
            _console.errorln(obj.toString)

    }

    def error(obj : AnyRef) : Unit = {
        if (_console == null){
            Console.print(obj)
        }else
            _console.errorln(obj.toString)
    }

    def writeln(obj : AnyRef) : Unit = {
        if (_console == null){
            Console.println(obj)
        }else
            _console.writeln(obj.toString)
    }

    def read(prompt : String) : String = {
        if (_console == null){
            if (prompt != null){
                println(prompt);
            }
            var ligne_lue:String =null;
            var lecteur: java.io.InputStreamReader =new java.io.InputStreamReader(System.in);
            var entree:java.io.BufferedReader =new java.io.BufferedReader(lecteur);
            ligne_lue=entree.readLine();
            return ligne_lue;
        }else
        {
            _console.writeln(prompt)
            return _console.readln()
        }
    }

}

object StdIO extends StdIOClass{
}
