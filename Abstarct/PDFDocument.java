package Abstarct;

public class PDFDocument extends Document{

	PDFDocument(String name) {
		super(name);
		
	}

	@Override
	void save() {
		System.out.println(" PDF Saved succesfully");
		
	}

}
