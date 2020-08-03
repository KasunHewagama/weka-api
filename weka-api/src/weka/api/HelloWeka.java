package weka.api;

//import weka.*;
import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instances;
import weka.associations.Apriori;

public class HelloWeka {
	public static void main(String[] args) throws Exception {
//		System.out.println("Hello Weka");

		Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff")));
		Apriori model = new Apriori();

		model.buildAssociations(data);
		System.out.println(model);

	}
}