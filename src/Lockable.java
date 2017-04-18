
public interface Lockable {

	public void setKey(int iKey) ;
	
	public void lock(int iKey) ;
	
	public void unLock(int iKey) ;
	
	public boolean locked() ;
	
	
}
