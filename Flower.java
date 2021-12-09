import java.util.Comparator;

public class Flower implements Comparable<Flower>{
	
	
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public int compareTo(Flower o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}