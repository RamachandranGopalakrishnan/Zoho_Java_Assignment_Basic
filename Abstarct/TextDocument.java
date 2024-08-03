package Abstarct;

public class TextDocument extends Document{

	TextDocument(String name) {
		super(name);
	}

	@Override
	void save() {
		System.out.println("TextDocument is saved");
	}

}
