import java.util.Vector;

public class PointVecytor {

	public static void main(String[] args) {
		Vector<Pint> pv = new Vector<Pint>();
		
		pv.add(new Pint(1,2));
		pv.add(new Pint(2,3));
		pv.add(new Pint(2,3));
		
		for(int i = 0; i < pv.size(); i++){
			Pint tmp = pv.get(i);
			System.out.println(tmp);
		}
		//System.out.println(pv.remove(Pint(2,3))); //.remove<o)

	}

}
