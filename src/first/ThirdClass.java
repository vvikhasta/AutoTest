package first;

import second.FOClass;

public class ThirdClass {
	// call method from SecondClass, void main can be only one in class
public static void main(String[] args) {
	SecondClass obj = new SecondClass();
	obj.first();
	obj.second();
// to call class from another package need to import it (looking line3)	
	FOClass ob = new FOClass();
	ob.third();
}

}
