package emf.spoon.reflect.reference.impl.ext;

import spoon.reflect.reference.CtReference;
import spoon.reflect.visitor.CtVisitor;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.reference.impl.CtPackageReferenceImpl;

public class EmfPackageReferenceImpl extends CtPackageReferenceImpl {


	public void accept(CtVisitor visitor) {
		visitor.visitCtPackageReference(this);
	}


	public int compareTo(CtReference o) {
		return 0;
	}
    public CtPackage getDeclaration() {
    	return (CtPackage) getFactory().Package().get(getSimpleName());
    }

	/*@Override
	public String getSimpleName() {
		if (this.getDeclaration()==null){
			//System.out.println(super.getSimpleName());
			return super.getSimpleName();
		}
		else
			return this.getDeclaration().getQualifiedName();
	}*/

}
