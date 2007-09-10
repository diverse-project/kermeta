-----------------------------------------------------------
Date : 07-03-2005
Description : Tests for Kermeta interpreter, Iteration 1
-----------------------------------------------------------

The tests purpose is to check that for any block in the interpreter,
the context is correctly set up.

A typical example is the call of an operation coming from an extern class
(extern here means : from another kermeta package)

Description :

1, 2, 3, 4 : Basic tests for operation handling
5, 6 : Tests for extern calls to operations from a package in another 
7, 8 : Tests for use of extern types (from a package in another), especially :
Boolean, String, Enum, Collection, CustomClass
9, 10 : Tests for calls through the use of attributes (assignment, arithmetic
operation)
11, .. : Tests of basic commands (needs the implementation of the Command pattern)
: if, while, for

12, .. : Test of the MethodCall (impl. in the interpreter itself)

Files that contain the term "Inter" or "Extern" are files that are referenced by other ones.

-----------------------------------------------------------
Date : 07-03-2005
Description : Tests for Kermeta interpreter, Iteration 2
-----------------------------------------------------------

This test purpose is to check that the exceptions are correctly handled :
the specific context of exceptions, and the handling of exceptions coming
from other packages (require).


-----------------------------------------------------------
Date : 07-03-2005
Description : Tests for Kermeta interpreter, Iteration 3
-----------------------------------------------------------

This test purpose is to test the interpreter for its "real" use.
Steps :

We will design some models represented in kcore (as pairs of source model and
target model), and a model, which will be the transformation itself,
represented in kmt (kermeta text). 

The target model will be the result that we expect to have (call an assert
source model * transformation -> target model)

Assertions will be made on the loaded DOM of both source and target models.





Question for FF :
Shouldn't we allow to use locally "require", so that needed KermetaUnits are in
memory only when requested as contextual units (included in the local
context..)? 
