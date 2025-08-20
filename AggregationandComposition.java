package coreJava;
class Charger{
	private String Brand;
	private float voltage;
	public Charger(String Brand,float voltage){
		this.Brand=Brand;
		this.voltage=voltage;
		
	}
	public String getBrand() {
		return Brand;
	}
	public float getVoltage() {
		return voltage;
	}
}
	 class Os{
		private String name;
		private int size;
		public Os(String name,int size) {
			this.name=name;
			this.size=size;
			
		}
		public String getName() {
			return name;
		}
		public int getSize() {
			return size;
		}
	}

	 class Mobile{
		Os os=new Os("ANDRIOD",1);
		//charger is the loss bound 
		public void hasA(Charger c){
			System.out.println(c.getBrand());
			System.out.println(c.getVoltage());
		}
	}
		
	
	

public class AggregationandComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger c=new Charger("SAMSUNG",2.0f);
		Mobile m=new Mobile();
		m.hasA(c);
		m=null;
		//System.out.println(m.os.getName());
		//System.out.println(m.os.getSize());
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());

	}

}
