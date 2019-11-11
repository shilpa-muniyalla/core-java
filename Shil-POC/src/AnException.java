//user defined exception example
 class AnException extends Throwable {
	 String str1;
	 AnException(String str2){
		 this.str1=str2;
	 }
	  public String toString() {
		  return("output string = " +str1);
	  }

}
