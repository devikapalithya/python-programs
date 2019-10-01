mkdir beeware
cd beeware
python3 -m venv venv
source venv/bin/activate
git clone git@github.com:<your github username>/colosseum.git
cd colosseum

public class Box<T> {
 
  private T t;
 
  public void set(T t) {
    this.t = t;
  }
 
  public T get() {
    return t;
  }
}
