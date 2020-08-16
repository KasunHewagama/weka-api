//IT18165180
package aprriori;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.associations.Apriori;
import weka.associations.FPGrowth;
import weka.core.Instances;

public class weka_With_Java {

	public static void main(String[] args) throws Exception {
		// Load Data
		Instances data = new Instances(new FileReader("dataset/supermarket.arff"));
		Apriori aprModel = new Apriori();
		aprModel.setDelta(0.05);
		aprModel.setNumRules(10);
		aprModel.setLowerBoundMinSupport(0.05);
		aprModel.setUpperBoundMinSupport(1.0);
		
		aprModel.buildAssociations(data);
		
		System.out.println(aprModel);

	}

}
