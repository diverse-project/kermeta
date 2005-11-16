# $Id: readme.txt,v 1.1 2005-11-16 15:27:34 zdrey Exp $
# File : readme.txt
# Description : some notes about how to make a demonstration of the enclosed example.
# Creation : 16/11/2005

================================================================================

            Summary of the enclosed example "automata"
	
================================================================================

This example was the object of a demonstration at the Kermeta Workshop that took 
place on the 15/11/2005 with the Triskell staff. It presents a meta-model of a very
basic finite Automaton (or finite state machine), that can be, in a certain point
of view, executed (reading a word given an automaton model "self-definition" or in
an interactive mode), and transformed with two provided transformations that can
be found in the transfo directory.


This folder contains a plan of the demonstration and some images that can be used
to illustrate it.


================================================================================

                  Description of the demonstration plan

================================================================================

Warning before demo-ing:  the Run As > option on a kmt file works randomly in Eclipse
on Windows.


The demonstration will be done around a simple example of finite automaton (abbr. in
FSM). We have six main steps, described below :

1 - show omondo and the ecore reflective editor ("sample reflective ecore model editor")
2 - show the "transition" from ecore to kermeta (by generating kermeta metamodel)
3 - show a simple case of successful execution of a FSM model
4 - show a simple case of behavior modification of metamodel and failing execution of a FSM model
5 - show a transformation of the model
6 - execute the new created model and conclude with ecore-kermeta strong compatibility

--------------------------------------------------------------------------------


1/ First step: show Omondo, and the Ecore reflective editor for metamodel and model creation.

- To begin, we begin with the definition of a meta-model for our FSM. 
  For this definition, we chose the graphical editor Omondo, and saved our metamodel
  in the ecore (Eclipse metamodelling representation) format.
  
- We now need to create instances of the FSM meta-model. To do so, we will create 
  an instance using the Ecore default editor (right-click on the metamodel ecore file), 
  which represents the meta model as a tree of "contained" nodes.
  
  a/ The principle is to select the root container class (in our example, the class FiniteAutomaton)
  in the Ecore default editor and "Create a Dynamic Instance" by a right-click on it.
  
  b/ Result: EMF makes a reflective editor available for the newly 
  created instance of FSM metamodel.
  At this stage, we can add in it for example 2 states, 1 transition, and specify their 
  properties (like the name of the state) through the Properties tab shown in the 
  bottom view part of Eclipse. The properties are editable according to the definition of the metamodel 
  specifications (like the opposite properties).
  

2/ Second step: load and manipulate a model of FSM in Kermeta

- For the purpose of the demo, we will use a model a bit more larger than the 
  preceding one, (fsm.demo.xmi) -- with one final state and an initial state 
  (viewable in the properties tab)

- So, now, we want to manipulate our model with Kermeta. Manipulate can be "execute" (simulate?),
  transform, or serialize.
  
  a/ We first need to get a Kermeta compatible representation of our metamodel: the platform (Kermeta plugin)
  provides a tool that generates Kermeta source code from an Ecore metamodel
  (right-click on it > Kermeta > Generate Kermeta source)
  
  b/ The second step is to extend the generated Kermeta version of the metamodel
  in order to add a behaviour on it. Typically, the principle is to add some operations
  in the classes of the metamodel, as if it were a classic program. So, we added
  a "run" operation in FiniteAutomaton class (and some transient references useful for 
  the execution), a "step" operation in the State class, a "fire" operation in the Transition
  class.
  
3/ Third step: Showing a simple case of successful execution of the FSM

- The algo of our metamodel execution is voluntarily simple : the automaton auto-executes itself
  by reading a word determined by its own definition

- Here are the steps of the execution demo :

	a/ Select the Kermeta Console (since the generation of Kermeta source code focused on another one)
	b/ Clear it if necessary and enlarge it before any execution
	c/ Run the automata.kmt program (with RunAs, or definition of a configuration with the Run > Run... menu)
	d/ When a model of FSM is asked, give the one located in ../models/fsm.demo.xmi
	e/ The execution steps are printed in the console.
	
4/ Fourth step: Showing a simple case of failing execution of the FSM 

- Now, we will modify the behaviour of our metamodel, by changing an instruction 
  in the "step" operation (instead of "automated_step", we call "interactive_step").
  
- The steps will be the same as the third step, but, instead of an automatic execution 
  of the automaton, the user will be asked to choose a letter (ideally among the available ones).
  At some time, the set of choices "{a, a, s}" will be proposed, and we will voluntarily
  choose "a" letter, which lead to a NonDeterminism exception. What next? See next step.
  
5/ Fifth step: Transforming our model to be able to execute it successfully

- We therefore need to determinize our model: it consists on running the determinization 
  transfo, which is structured as a class with a main operation calling the 
  implementation of the determinization algo.

    a/ The user will be asked to choose the fsm.demo.xmi model (represented in the 
    ecore format) in order to *load* (thanks to the knowledge of its ecore metamodel ) 
    and to *transform* it, and then, to choose a path where to save the new resulting model.
    
    b/ So, the kermeta transformation will create a new model of FSM, thanks to 
    the existence of the Kermeta representation of the meta-model (which make the FSM
    metamodel classes availalbe), and will save it in a ecore representation, thanks
    to its compatibility with the ecore metamodel of which the model is an instance.
    
    c/ We can show to the listener the load operation in automata.kmt (operation loadEMFAutomaton),
       as well as the save instruction (operation loadEMFAutomaton), both using the persistence library
       for EMF models (EMFRepository, EMFResource).
    
6/ Sixth step: The proof : loading the new determinized model and executing it.

- Open the new model with the Ecore reflective editor. This proves the ability of Kermeta
  to create and save Ecore-compatible models.
  
- Simply do again the instructions of the 3rd step with the new model instead of the initial
  one, in interactive mode. This proves the compatibility of the created ecore model with the Kermeta
  definition of its metamodel.

- You can also re-generate an ecore representation of the modified automata.kmt and edit it to emphasize
  the strength of Kermeta...
  








