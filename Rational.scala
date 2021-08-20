object RationalNumbers extends App{
  val w = new Rational(3,1)
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val t = x - y - z
  println(t)
}

class Rational( x:Int , y:Int ) {
  def this( x : Int ) = this(x , 1)
  require(y>0 , "Denominator should be greater than or equal to one.")

  val numer=x

  val deno=y

  def +(that : Rational) :Rational = new Rational(this.numer * that.deno + that.numer * this.deno  , this.deno * that.deno)

  def neg : Rational = new Rational(-this.numer,this.deno)

  def -(that : Rational) : Rational = this + that.neg

  @Override
  override def toString() : String = {

    deno match {
      case x if x==1 => numer.toString
      case _ => numer + "/" + deno
    }
  }
}