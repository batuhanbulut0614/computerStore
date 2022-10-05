package computerStore;

public class GraphicCard {
	public String name;
	public int memory;
	public int bit;
	public boolean hdmi;
	public boolean vga;
	public String brand;
	public void printInfo() {
		System.out.print(this.name.toUpperCase());
		System.out.println(" "+this.memory+"GByte"+" "+this.bit+"Bit"+(this.hdmi?" HDMI":"") + (this.vga?" VGA ":"")+"Marka:Asus");
		System.out.print(this.name.toUpperCase());
		
	}
    public void printHdmi() {
    	System.out.println(this.hdmi?"var":"yok");
    	System.out.println(this.hdmi?"var":"yok");
    	System.out.println(this.hdmi?"var":"yok");
    }
}
