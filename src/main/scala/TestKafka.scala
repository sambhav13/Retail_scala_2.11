import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession

class TestKafka{

	def add(a:Int,b:Int):Int ={
		
		return (a + b)
	}

}

object TestKafka{

	def main(args:Array[String]) = {

		//val conf = new SparkConf()

		println("hello sambhav")
		/*
		val spark = SparkSession
  				.builder
				.master("local[2]")
  				.appName("StructuredNetworkWordCount")
  				.getOrCreate()	
	
		import spark.implicits._*/	
		


		// Subscribe to 1 topic
		/*val ds1 = spark
  				.readStream
  				.format("kafka")
  				.option("kafka.bootstrap.servers", "localhost:9092")
  				.option("subscribe", "test")
  				.load()
		*/

	}

}