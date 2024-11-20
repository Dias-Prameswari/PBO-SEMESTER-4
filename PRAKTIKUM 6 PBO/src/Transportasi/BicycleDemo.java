package Transportasi;
public class BicycleDemo{
public void cetak(){
//membuat object
	Bicycle bike = new Bicycle();
	
	//memanggil atribut dan memberi nilai
	bike.speed=10;
	bike.gear=2;
	
	//memanggil method dan menunjuk nilai parameter
	bike.speedUp(10);
	bike.changeGear(2);
}
}
