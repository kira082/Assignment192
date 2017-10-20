def main(args: Array[String]) {
 
    /**
      * Create RDD and Apply Transformations
      */
 
    val file_text= sc.textFile("home/acadgild/Desktop/sports.txt")
      .map(_.split(","))
      .map(frt => sports(frt(0), frt(1), frt(2),frt(3),frt(4).trim.toInt,frt(5),frt(6)))
      .toDF()
 
    /**
      * Store the DataFrame Data in a Table
      */
    fruits.registerTempTable("file_text")
 
    /**
      * Select Query on DataFrame
      */
    val records = sqlContext.sql("SELECT * FROM frt where frt(3) = 'Gold' and frt(4) > = 32");
	val records1 = sqlContext.sql("SELECT * FROM frt where frt(3) = 'Gold' and frt(4) < = 31");
	val records2 = sqlContext.sql("SELECT * FROM frt where frt(3) = 'Silver' and frt(4) > = 32");
	val records3 = sqlContext.sql("SELECT * FROM frt where frt(3) = 'Silver' and frt(4) < = 31");
    /**
      * To see the result data of allrecords DataFrame
      */
    records.show();
	records1.show();
	records2.show();
	records3.show();
	
 
  }
}
 