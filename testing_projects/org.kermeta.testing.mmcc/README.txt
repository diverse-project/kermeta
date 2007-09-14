
To try the metamodel coverage checker you must several steps

First you must set a path
	- Open the MMCC/BuildModelFragments.kmt file. The first operation in this class is called buildFragments.
This method has variable tmpPath that sets the absolute path for the tmp directory that is in the project.
You must update this path according to the place where you have put this project.
This path needs to be set only once for all

Then, you must process two steps:
1	execute the ModelFragmentsGenerator kermeta program
2	THEN execute the CoverageChecker kermeta program
It is very important to stick to this sequence when executing the programs because ModelFragmentsGenerator generates
a kermeta program that is used by ModelFragmentsGenerator.

In the following, we give details on how to set the executions of those two files

1 Execute ModelFragmentsGenerator.kmt
This program generate a set of model fragments for a particular metamodel, acoording to a coverage criterion.

To set the execution of this program, you must call buildFragments in the main method. When calling buildFragments, 
you need to pass
- the name of the ecore metamodel for which you want to generate model fragments. This is the metamodel that you want to 
cover with a set of instances.
- the name of the coverage criterion you want to satisfy.

The main method already defines a number of configurations that serve as test cases for the coverage checker.
If you write a new call to buildFragments in the main operation, you must comment all the others.

Now you can run ModelFragmentsGenerator.kmt. 
This should generate two things in the tmp directory
- A model that contains all the partitions and model fragments that have been geenrated form your metamodel. This model 
is called criterionNameFragements.xmi where criterionName is the name of the criterion you have chosen for the generation 
of fragments.
- A program called ModelsCoverageChecker.kmt that is used to launch the coverage check with a set of models instance of 
the metamodel you have just passed for fragments generation.


2 Execute CoverageChecker.kmt
This program uses the ModelsCoverageChecker generated previously to check the coverage of a set of models. To execute 
this program you must passe it a set of strings that correspond to a set of model names.

To set the execution of this program, you must write an operation that builds a set of strings from a list of file names.
Then you can pass this set of strings as a parameter to checkCoverageOfModels.
There are already several calls to checkCoverageOfModels in the main operation. There are also several methods in this class
that builds sets of strings. These serve as test cases and also as examples for setting this program with your own data.

WARNING: It is important that the set of strings you build corresponds to a set of model names that are instances
of the metamodel you have used previously to generate the model fragments.

Once you have made a new call to checkCoverageOfModels with your own set of models, you must comment all the other calls.
Now you can run CoverageChecker.kmt.
This execution will check if the models you have provided satisfy the model fragments.
It will display the number of covered fragments, the number of not-covered fragments, and it will also detail the fragments
that should be covered.

