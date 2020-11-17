package zad2;

class ChoryNaDyspepsje extends Pacjent{
	public ChoryNaDyspepsje(String name) {
		p=name;
	}
	public String choroba() {
		return "dyspepsja";
	}
	public String leczenie() {
		return "węgiel";
	}
}
