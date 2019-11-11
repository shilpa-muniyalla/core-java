//example of interface 
interface Human{
	 
	 public void department();
	 public void jobRole();
 }

 interface Teachers extends Human{
	 public void subject();
 }
 
public interface Math_Teacher extends Human,Teachers {
	public void division();

}
