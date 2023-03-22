package PatternObserver2;

public interface Subject {
 

public void removeObserver(Observer ob);
public void addObserver(Observer ob);
public void notifyObserver(); 
  
}
