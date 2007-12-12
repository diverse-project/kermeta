$Id: readme.txt,v 1.2 2007-12-12 10:07:35 cfaucher Exp $
- Project : org.kermeta.compiler.tests
- File : 	readme.txt
- License : EPL
- Copyright : IRISA / INRIA / Universite de Rennes 1
- ----------------------------------------------------------------------------
- Creation date : 11 dec. 07
- Authors : Cyril Faucher <cfaucher@irisa.fr>


--- Goal of the plugin ---
This plugin aims to providing a useful environment to manage the Use and Test cases related to
the issues in compiling Kermeta.
The final result is a generated document (*.html, *.pdf) that is summarized and described
the Use and Test cases. There is a status board too, this one indicates design and implementation
status for each use case.


--- Requirements ---
You must check out the project ant-docbook-styler from the Kermeta forge.


--- How to build the compiler documentation ---
The generation of the final document is done in four steps:
1. edit summary and progress text files for each use cases,
2. generate the Trek Use Kase Models,
3. generate the docbook file,
4. generate the html-single and pdf files.


1. Editing summary and progress text files for each use cases:

Folders organization:
Assumption: a test case verifies an unique use case, then a test case can be contained by a use case.
- The use cases are defined in the folder: <project_dir>/unit_test
- A use case is contained inside a folder named like this: ~/unit_test/comp_<use_case_name>
	Each use case folder contains a summary file: summary_<use_case_name>.txt
	and a progress file: progress_<use_case_name>.txt
- The test cases that verify a use case are contained in subfolders as: ~/comp_<use_case_name>/<test_case_name>
	The test case name is calculated like this: test<number_of_the_test_case>
	Each test case folder contains a summary file: summary_<test_case_name>.txt
	Each test case folder contains a folder "input" and "expected_output": "input" contains the resources that
	are required in order to launch the test case and the "expected_output" contains the resources that are
	expected after the execution of the test case.

The Summary and progress text files are used during the second step: generation of the Trek models,
thus to update information in the final document, the recommended way is to modify summary and
progress text files, then restart the second, third and fourth steps (these three steps are press-button operations).


2. Generation of the Trek Use Kase Models:
Right-click on the folder: <project_dir>/unit_test and choose the action:
	> Trek for Kermeta Compiler > Generate the Trek Use Kase Models (full process)
	Refresh the project (F5) for avoiding "out of synchronize" mistakes.
	Some *.trek files are generated.

3. Generation of the docbook file (*.xml):
Right-click on the Kermeta file: <project_dir>/doc/builder/trek2docbook.kmt and choose the action:
	> Run As > Kermeta App
	Refresh the project (F5) for avoiding "out of synchronize" mistakes.
	A docbook file is generated: <project_dir>/doc/docbook/unit_test.docb.xml

4. Generation of the html-single and pdf files:
Right-click on the xml file (ANT): <project_dir>/doc/builder/unit_test_build.xml and choose the action:
	> Run As > Ant Build
	Refresh the project (F5) for avoiding "out of synchronize" mistakes.
	A html-single file is generated: <project_dir>/doc/build/html.single/unit_test/index.html
	A pdf file is generated: <project_dir>/doc/build/pdf.fop/unit_test/unit_test.pdf
