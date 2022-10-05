package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1=new GraphicCard();
		gk1.name="Duel rtx 3060";
		gk1.memory=12;
		gk1.bit=192;
		gk1.hdmi=true;
		gk1.vga=true;
		gk1.brand="Asus";
		GraphicCard gk2=new GraphicCard();
		gk2.name="GeForce rtx 2060";
		gk2.memory=16;
		gk2.bit=256;
		gk2.hdmi=false;
		gk2.vga=false;
		gk2.brand="Gigabyte";
		GraphicCard gk3=new GraphicCard();
		gk3.name="ventus rtx 3060";
		gk3.memory=32;
		gk3.bit=360;
		gk3.hdmi=true;
		gk3.vga=false;
		gk3.brand="MSI";
		System.out.print(gk1.name);
		System.out.println(" "+gk1.memory+"GByte"+" "+gk1.bit+"bit"+(gk1.hdmi?" HDMI":"") + (gk1.vga?" VGA ":"")+"Marka:Asus");
		System.out.print(gk2.name);
		System.out.println(" "+gk2.memory+"GByte"+" "+gk2.bit+"bit "+(gk2.hdmi?" HDMI":"") + (gk2.vga?" VGA":"")+"Marka:Gigabyte");
		System.out.print(gk3.name);
		System.out.println(" "+gk3.memory+"GByte"+" "+gk3.bit+"bit"+(gk3.hdmi?" HDMI ":"") + (gk3.vga?" VGA":"")+"Marka:MSI");
		gk1.printInfo();
		gk2.printInfo();
		gk3.printInfo();
		
		
		

	}

}
