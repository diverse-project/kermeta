package test

class Account(b: Int) extends fr.irisa.triskell.kermeta.scala.framework.language.structure.Contracted
{
	var balance = b
 
	def withdraw(amount: Int)
	{
		val old_balance=balance
		(
			require(amount>0)
			require(balance-amount>=0)
			ensure(old_balance-amount==balance)
		) in {
			balance-=amount
		}
	}
	
	def credit(amount: Int)
	{
		val old_balance=balance
		(//Note these can come in any order, although all ensures then all requires in more logical
			ensure(balance<=1000) //Fairly arbitrary restriction as an example
			ensure(balance>=0)
			require(amount>0)
			ensure(old_balance+amount==balance)
		) in {
			balance+=amount
		}
	}
	
	def print()
	{
		println("Balance:"+balance)
	}
}

object TestAccount {
  def main(args : Array[String]) : Unit = {
		  val a=new Account(100)
		a.print()
		a.withdraw(50)
		a.print()
		a.withdraw(50)
		a.print()
		a.credit(100)
		a.print()
		a.credit(1000)
		a.print()

  }
}