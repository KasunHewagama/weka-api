//IT18165180
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

		// Build the model

		// Delta value
		model.setDelta(0.05);

		// Set No. of Rules
		model.setNumRules(10);

		// Set Lower Bound Minimum Support
		model.setLowerBoundMinSupport(0.05);

		// Set Upper bound Minimum Support
		model.setUpperBoundMinSupport(1.0);

		model.buildAssociations(data);
		System.out.println(model);

	}
}