package com.inceptez.learnscala
import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer
object scalaworkouts {


	def greater(a:Int,b:Int,c:Int)={

		if (a>c && a>b){

			println("A is greater" + a)

		} else {

			if (b>c){

				println("B is greater" + b)

			}else {

				println ("C is greater" + c)
			}


		}


	}

	def coursefee(course:Array[String])={

		for (i <- 0 to course.length-1){

			if (course(i) == "bigdata")
			{
				println("FEES FOR bigdata 10000")

			}else {

				if (course(i)=="spark")

				{
					println("FEES FOR spark 20000")

				}
				else {

					if (course(i) == "datas")
					{

						println("FEES FOR datascience 30000")
					}

				}


			}



		}


	}

	def coursefee(course:Map[String,Int],modifyFee:Map[String,Int])={

		for (i<-course.keys){

			for (j <- modifyFee.keys)
			{

				if (i == j){

					course(i) = modifyFee(j)
							println ("COURSE FEE" + course(i))
				}      


			}

		}
	}


	def coursefee(course:Map[String,Int])={

		for (i<-course.keys){


			if (i=="bigdata"){

				println("big data FEE" + course(i))
				course(i)=120000
				println("big data FEE" + course(i))

			}else {

				if (i=="spark") {

					println("spark FEE" + course(i))

				}else{

					if (i=="datas") {

						println("Data Science FEE" + course(i))

					}

				}
			}



		}

	}

	def findval(x:Any)={
		var y=100
				val z = 50
				println ("STR" + " " +  z.toString() )

				if (x.isInstanceOf[Int]== true){

					println ("the passed value is int")
					y = y + x.asInstanceOf[Int]

							println("Y VALUE" + y);
				}
				else {

					if (x.isInstanceOf[String]==true){


						println("the passed value is string")

					}

				}


	}
	var muthu=Range(1,10);

	def findnumber()={

		muthu.filter { _%2==0 }.foreach { println }

		//println("short even num" + " " +  eve)
		var odd = muthu.filter { _%2 !=0}
		println("short odd num" + " " + odd)
	}



	def findnumber (x:Range)={


		for (i<-0 to x.length by 2){

			println ("Even Numbers" + i)

		}

		for (i<- 1 to x.length by 2){

			println ("Odd Numbers" + i)
		}

		var y = x.slice(5, 20)
				println(y.length)


				for (i<- y) {

					var xx = i % 2
							if (xx==0){

								println ("Even numbers" + i)
							}
							else{

								println ("Odd Numbers" + i)

							}
				}

	}
	var x3p = Range(0,21)
			def hopby3()={

		for (i<- x3p by 3)
		{

			println ("print numbers hop by 3" + " " + i)
		}
	}

	var num = 4
			def divby4(x:Range){

		for (i<- x){
			if (i%num==0){

				println("divisible by 4" + " " + i)
			}

		}


	}


	def cube1():Int={


			return num*num*num  

	}

	def calculator (x15:AnyVal,y11:AnyVal,ops:String):Any = {

			var z:Double=0.0

					ops match {

					case x1 if (ops=="add") =>
					{
						if (x15.isInstanceOf[Int] && y11.isInstanceOf[Int])
						{
							z = x15.asInstanceOf[Int] + y11.asInstanceOf[Int]
									return z
						}
					}

					case y1 if(ops=="mul")=>
					{
						if ((x15.isInstanceOf[Int] && y11.isInstanceOf[Int]))
						{

							z = x15.asInstanceOf[Int] * y11.asInstanceOf[Int]
									return z

						}else {

							if  (x15.isInstanceOf[Double] && y11.isInstanceOf[Double]){

								z = x15.asInstanceOf[Double] * y11.asInstanceOf[Double]
										return z
							}

						}


					}
					case z1 if (ops=="div")=>
					{

						var myz = x15.asInstanceOf[Int] / y11.asInstanceOf[Int]
								return myz
					}


	}

	}

	def findMean(myMean:Array[Int]):Int={

			var l1 = myMean.length;
			var mean1 = 0


					for (i<-myMean){

						mean1 = mean1 + i 

					}

			var avg1 = mean1/l1

					return avg1

	}

	def findMedian(myMedian:Array[Int]):Double = {

			var l1 = myMedian.length
					var l11 = 0
					var median1 = 0
					var ll2=0
					var ll3=0


					if (l1%2==0)
					{
						println("LENGTH" + l1)

						ll2 = myMedian(l1/2)
						ll3 = myMedian((l1/2)-1)

						/* for (i<- l1 to l1/2 by -1){

	      ll2 = i

	    } 

	    for (i<- 1 to l1/2-1){

	      ll3+=1
	    }*/
						println (ll2)
						println(ll3)

						median1 = (ll2+ll3)/ 2

						return median1
					}

					else {

						var l12 = l1/2
								l11 = myMedian(l1/2)

								/* for (i<- 0 to l12-1)
	    {
	      l11+=1   

	    }*/

								median1 = l11

					}

			return median1

	}

	def mulreturn(a:String,b:Int,ss:String):Any={

			var c:Any = 0
					if (ss == "ad"){
						c = a.toInt + b
					}else{
						c = a+b
					}
	return c

	}

	def part2(value:Any)={
		try {
			value match {

			case x  if(value.isInstanceOf[Int]) => {
				println ("The Passed value is Integer" + value)
			}

			case y if (value.isInstanceOf[String]) => {
				println ("The Passed value is String" + value)

			}
			case z if (value.isInstanceOf[Double])=> {

				println("The Passed value is Double" + value)

			} 

			}
		}catch  {

		case x: java.lang.ArithmeticException => {

			println ("please divide by non zero number" + " " + x)
		}
		case y: java.lang.Exception => {


			println ("The passed value not handled, please pass only Int, String,DOuble" + " " + y)
		}

		}

	}
	var num1:Int= 0
			def metExcep(numerator:Int,denomerator:Int):Int={

			try {

				num1 = (numerator/denomerator)


			}catch {

			case a:java.lang.Exception => {

				println("The denomerator is 0 going to divied with 1")
				num1 = (numerator / 1 )
			}

			}

			return num1
	}

	def myarr_list(n1:Array[Int],n2:List[Int])={

		var myar = n1.length
				var myll1 = n2.length
				n1(2) = 10
				n1.update(1, 11)

				var myr = n1.map { x => x }.foreach { println }
				var myl = n2.map { x => x }.foreach { println }

				var myarB = scala.collection.mutable.ArrayBuffer[Int](100,101,102)
						var myarb = myarB.map { x => x }.foreach{println}
						myarB+=103
								myarB-=101
								myarb = myarB.map { x => x }.foreach{println}
								myarB.update(0, 104)
								myarb = myarB.map { x => x }.foreach{println}

								var mylisB = scala.collection.mutable.ListBuffer[Int](200,201,202)
										mylisB+=203
										mylisB+=(204,205,206)
										var mylb = mylisB.map { x => x }.foreach { println }
										mylisB-=(200,201)
												mylb = mylisB.map { x => x }.foreach { println }
												mylisB.update(0,209)
												mylb = mylisB.map { x => x }.foreach { println }
	}

	def mytup(t:Int,t1:Int,t2:Int)={

		println (t+t1+t2)
		var t9 = (1,"a",3.0,"muthu")
		print(t9._1)
		println(t9._3)
		var t10 = new Tuple4(90,19,"ml",10.0)
		var t11 = new Tuple2(t10._1,t10._2)
		println(t11._2)
		println (t10._2)
		println (t10._4)
		
		case class temp1(id:Int,cid:Int)
		
		var t15 = temp1(t11._1,t11._2)
		var t16 = temp1 (888,999)
		
		println("CASE CLASS " + t15.id)
		println("CASE CLASS " + t15.cid)
		
		println("CASE CLASS " + t16.id)
		println("CASE CLASS " + t16.cid)
		
		


	}

	def maxArr(mya:Array[Int]) = {
	
	  if(mya.isEmpty!=true){
		  val mya1:Array[Int] =  mya.sorted; 
	  var maxv = mya1(mya1.length-1)
			  println("max num using sorted " + maxv)
			  var fi = mya(0)


			  for ( i <- mya)


			  {

				  if (i>fi){

					  fi=i

				  }

			  }
	  
	  println("max number with for loop " + fi)
	  }
	  else {
	    
	    println("ARRAY is empty")
	  }
	  }
	
	def maxMinArr (mya11:Array[Int]):ArrayBuffer[Int]={
	  
	  var myarr3:ArrayBuffer[Int]= scala.collection.mutable.ArrayBuffer[Int]()
		var myarr4:ArrayBuffer[Int]= scala.collection.mutable.ArrayBuffer[Int]()
	  
	  if (mya11.length >= 2){
	    
		  var my18:Array[Int] = mya11.sorted

				  


				  myarr4+=my18(0)
				  myarr4+=my18(my18.length-1)

				  for (i<-myarr4)
				  {

					  println ("MAX AND MIN values with sort" + i)

				  }
				  var a19 = mya11(0)
						  var a20 = mya11(mya11.length-1)

						  for (i<-mya11) {

							  if (i>a19)
							  {
								  a19=i

							  }
							  else {

								  a20=i

							  }


						  }
	  
	 
	  myarr3+=a20
	  myarr3+=a19
	}
	  else {
	    
	    println ("Minimum 2 array elements required to find the min and max, will return empty array")
	  }
	  
	  return myarr3
	  
	}
	
	def listExample(rr:List[Range]):Int={
	  
	  
	  var xsum:Int = 0
	  var xsum1:Int=0
	  for (i<-  rr)
	  {
	   for (j <- i){
	    xsum+=j
	    }
	  }
	  println ("SUM using loop" + xsum)
	  //var xsum1 = rr.map { x => x }
	  //xsum=xsum1.map { x => x}.sum
	  xsum1 = rr.map { x => x }.flatMap { x => x }.sum
	   
	  return xsum1
	  
	}
	
	def stringList (SL:List[String])={
	  
	  var len = SL.length;
	  println ("LENGTH of LIST" + len)
	  var co = SL.count { x => true }
	  println (co)
	  
	}
	
	def mapEx (m1:Map[String,String])={
	  
	  var IndCap = m1("India")
	  println("INDIA CAPITAL " + IndCap)
	  var Countries:Array[String] = m1.keys.toArray
	  var coun:scala.collection.mutable.ArrayBuffer[String]=scala.collection.mutable.ArrayBuffer[String]()
	  Countries.map { x => x }.foreach { println}
	  for (i<-m1.keys)
	  {
	    println("countries list " +i)
	    
	  }
	  
	  var countL = m1.keys
	  var counL:List[String] = countL.toList
	  
	  
	  counL.map(x=>x).foreach(println)
	  
	  
	}
	
	def extractWords (st:String)={
	  
	  var substr:Array[String] = st.split("\\s") 
	  var nowords = substr.length
	  println ("NO. OF WORDS " + nowords)
	  
	  var ch1 = st.toCharArray()
	  
	  var ch2:scala.collection.mutable.ArrayBuffer[String] = scala.collection.mutable.ArrayBuffer[String] ()
	  
	  for (i<- substr) {
	 
	    if (i.charAt(0)=='H' || i.charAt(0)=='h')
	      
	    {
	      
	      ch2+=i
	      
	    } 
	    
	    
	  }
	  
	  ch2.map { x => x }.foreach { println }  
	  
	}
	def palin(mystr:String)={

		var revstr = mystr.reverse
				var charst = ""
				var chararr =  mystr.toCharArray()
				print (chararr.length)
				var i = chararr.length-1

				while(i >= 0){

					charst = charst + chararr(i)
							i-=1
				}
		/*  for (i<-  chararr.length-1 to 0 by -1)
    {

      println(chararr(i))
      charst = charst + chararr(i)
      println (charst)


    }*/

		println ("charst"+charst)
		if (mystr==charst){

			println ("the string is palindrom")

		}
		else{

			println("the string is not palindrom")
		}

		if (revstr==mystr)
		{
			println("the string is palindrome using reverse function");
		}

		else{

			println("the string is not palindrome using reverse func");
		}

	}
	def main(args:Array[String])={

		greater(1,3,2)
		coursefee(Array("spark","bigdata","spark"))
		coursefee(Map("bigdata"->90000,"spark"->20000,"datas"->30000),Map("bigdata"->8999,"spark"->9000))
		coursefee(Map("bigdata"->90000,"spark"->20000,"datas"->30000))
		palin("madam")
		findval(10)
		findnumber(Range(1,30))
		findnumber()
		hopby3()
		val obj1 = new scalaCollections(4)
		val obj2 = new scalaPattern()
		var mul2 = obj1.mulNum()
		println("MUL" + mul2)
		obj2.pat1()
		println(obj1.myvar1)
		divby4(Range(1,21))
		var c = cube1()
		println("cube of 4" + " " + c)
		var t1 = calculator(14,5,"div")
		println ("CALC" + t1)
		var mm1 = findMean (Array(3,4,5,4,2,1,4,7))
		println ("mean" + " " + mm1)
		var med1 = findMedian(Array(1,2,3))
		println("MEDIAN" + " " + med1)
		var rr = mulreturn("5",6,"ada")
		println(rr)
		part2("MK")
		part2(5) 
		part2(55.0)
		part2(Array(5,3,2))
		var denom = metExcep(190,2)
		println("my denom" + denom)
		myarr_list(Array(1,2,3),List(4,5,6))
		val arg1 = (1,2,4)
		(mytup _).tupled(arg1)
		maxArr(Array(8))
		var myma:ArrayBuffer[Int] = maxMinArr(Array(10,8))
		var mmya = myma.map { x => x }.foreach { println }
		var sum1 = listExample(List(Range(1,4)))
		println (sum1)
		stringList(List("muthu","nithya","spark","hadoop"))
		mapEx (Map("India" -> "Delhi","USA"->"New York","UK"->"London"));
		extractWords("Hello how are you doing?. This home made house")
	}


}