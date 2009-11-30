package fr.irisa.triskell.kermeta.scala.framework.language.structure

trait Contracted
{
	class AssertionFailed extends Error
 
	type Conds=List[()=>Boolean]
	
	protected case class Contract(reqs:Conds,enss:Conds) {
	
		def require(test: =>Boolean)=Contract((()=>test)::reqs,enss)
		
		def ensure(test: =>Boolean)=Contract(reqs,(()=>test)::enss)
		
		def in[T](body: =>T):T={
			for(r<-reqs.reverse if(!r()))throw new AssertionFailed()
			val ret=body
			for(e<-enss.reverse if(!e()))throw new AssertionFailed()
			ret
		}			
	}
 
	def require(test: =>Boolean)=Contract((()=>test)::Nil,Nil)
 
	def ensure(test: =>Boolean)=Contract(Nil,(()=>test)::Nil)
}