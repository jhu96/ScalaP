object N99 {
  def main(args: Array[String]): Unit = {
    println("九九乘法表")
    for(i <- 1 to 9 ; j <- 1 to i){
      printf(s"${i} * ${j} = %d  ",i*j)
      if(j==i)
        println
    }
  }
}
