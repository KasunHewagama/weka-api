//IT18165180
package fp;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instances;
import weka.associations.FPGrowth;

public class FP_Growth {

	public static void main(String[] args) throws Exception {
		// Load Data
		Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff")));
		FPGrowth fpgModel = new FPGrowth();
		fpgModel.setNumRulesToFind(10);
		fpgModel.buildAssociations(data);
		System.out.println(fpgModel);

	}

}
