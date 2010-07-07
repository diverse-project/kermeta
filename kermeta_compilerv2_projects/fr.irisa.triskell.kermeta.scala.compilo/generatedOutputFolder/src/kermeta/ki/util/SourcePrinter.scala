package kermeta.ki.util
trait SourcePrinter extends fr.irisa.triskell.kermeta.language.structure.Object{

    def append(text : _root_.java.lang.String) : _root_.kermeta.ki.util.SourcePrinter
    def indent() : _root_.kermeta.ki.util.SourcePrinter
    override def toString() : _root_.java.lang.String
    def nl() : _root_.kermeta.ki.util.SourcePrinter
    def deindent() : _root_.kermeta.ki.util.SourcePrinter
    def initialize(out : _root_.scala.StringBuilder) : Unit}

