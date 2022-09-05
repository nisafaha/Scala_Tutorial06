//20000065

object CaeserCipher
{
    def main(args:Array[String]) = 
    {
        val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        //Encrypt function
        val Encrypt = (c:Char,key:Int,a:String) => a((a.indexOf(c.toUpper)+key)%a.size)

        //Decrypt function
        val Decrypt = (c:Char,key:Int,a:String) => if ((a.indexOf(c.toUpper)-key)<0) a((a.indexOf(c.toUpper)-key+a.size) % a.size)
            else a((a.indexOf(c.toUpper)-key)%a.size)

        //Cipher function
        val Cipher = (algo:(Char,Int,String) => Char,s:String,key:Int,a:String) => s.map(algo(_,key,a))

        val text = "Computer Science"
        val f = text.replace(" ","")


        val ct = Cipher(Encrypt,f,1,Alphabet)
        val cp = Cipher(Decrypt,ct,1,Alphabet)

        println(ct)
        println(cp)
    }
}