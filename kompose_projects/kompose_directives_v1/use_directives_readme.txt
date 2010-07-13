DESTROY
	The DESTROY directive work very well with attributes. If you plan to destroy a Class, 
	be sure to first remove any references to this Class otherwise, an exception will be thrown when saving
	the resulting model.
MERGE
	MERGE directives works on Class/Package or their equivalents (containers). Merging two Classes means that, 
	regarding their signatures, their content are merged (i.e Attribute). Merging Packages is recursive and try
	to merge the contents of the Packages. Regarding Packages, if you try to merge a subPackage with its parent
	package, keep in mind that the subPackage relation is removed before merging to avoid infinite recursive graphs.
	