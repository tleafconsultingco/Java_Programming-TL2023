package day30_inheritance;

public class Class05_TestPhoneObjects {

    public static void main(String[] args) {

        Class02_IPhone iphone = new Class02_IPhone("IPhone 12", "Large", "Black", 1000.5);

        Class03_Samsung samsung = new Class03_Samsung("Galaxy S22", "Medium", "White", 1100);

        Class04_Nokia nokia = new Class04_Nokia("Brick", "Small", "Pink", 50);


        iphone.call(911); //IPhone 12 is calling 911
        samsung.call(911); //Galaxy S22 is calling 911
        nokia.call(911); //Nokia Brick is calling 911

        iphone.text(123456789); //IPhone 12 is texting 123456789
        samsung.text(123456789); //Galaxy S22 is texting 123456789
        nokia.text(123456789); //Nokia Brick is texting 123456789

        System.out.println("-- Subclass specific methods --");

        iphone.faceTime(123456789); //IPhone 12 is facetiming with 123456789
        // samsung.faceTime(123456789);
        // nokia.faceTime(123456789);

        samsung.freeze(); //Galaxy S22 freezes a lot
        // iphone.freeze();
        //  nokia.freeze();

        nokia.selfDefense(); //Nokia Brick can be used for self defense
        //   iphone.selfDefense();
        //   samsung.selfDefense();

        System.out.println("-- Printing the object --");

        System.out.println(iphone);
            //Class02_IPhone{brand='Apple', model=' IPhone 12', size='Large', color='Black', price=1000.5}
        System.out.println(samsung);
            //Class03_Samsung{brand='Samsung', model='Galaxy S22', size='Medium', color='White', price=1100.0}
        System.out.println(nokia);
            //Class04_Nokia{brand='Nokia', model='Brick', size='Small', color='Pink', price=50.0}

    }//main
}//class
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()

 */