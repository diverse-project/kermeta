package org.kermeta.kompren.gwelet.actions;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.gwelet.view.AttributeView;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.kompren.gwelet.view.OperationView;
import org.kermeta.kompren.gwelet.view.RelationClassView;
import org.kermeta.kompren.gwelet.view.RoleView;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;


public class Flat extends SelectionBasedVisuAction {

	public Flat() {
		super();
	}


	@Override
	public String getUndoName() {
		return "Flattening";
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		ModelViewMapper mapper = ModelViewMapper.getMapper();
		ClassView cv = classes.get(0);
		ClassDefinition cd = mapper.getClassDefinition(cv);

		flat(cv, cd, cd);
		cd.getSuperType().clear();
		cv.update();
		canvas.update();
		done();
	}


	protected void flat(final ClassView cvRef, final ClassDefinition cdRef, final ClassDefinition cdCurrent) {
		ModelViewMapper mapper = ModelViewMapper.getMapper();
		ClassDefinition cdSup;
		ClassView cvSup;

		for(Type superType : cdCurrent.getSuperType())
			if(superType instanceof org.kermeta.language.structure.Class) {
				cdSup = (ClassDefinition)((org.kermeta.language.structure.Class) superType).getTypeDefinition();
				cvSup = mapper.getClassView(cdSup);
				if(cvSup!=null) {
					canvas.removeEntity(cvSup);
					cvSup.setVisibility(Visibility.NONE);

					for(AttributeView av : cvSup.getAttributes()) {
						cvRef.getAttributes().add(av);
						av.setEntity(cvRef);
					}

					while(!cdSup.getOwnedAttribute().isEmpty()) {
						Property prop = cdSup.getOwnedAttribute().get(0);
						if(cdRef.getOwnedAttribute().contains(prop))
							cdSup.getOwnedAttribute().remove(0);
						else {
							cdRef.getOwnedAttribute().add(prop);
							prop.setOwningClass(cdRef);
						}
					}

					for(OperationView ov : cvSup.getOperations()) {
						cvRef.getOperations().add(ov);
						ov.setEntity(cvRef);
					}

					while(!cdSup.getOwnedOperation().isEmpty()) {
						Operation op = cdSup.getOwnedOperation().get(0);
						if(cdRef.getOwnedOperation().contains(op))
							cdSup.getOwnedOperation().remove(0);
						else {
							cdRef.getOwnedOperation().add(op);
							op.setOwningClass(cdRef);
						}
					}

					for(RelationClassView rcv : cvSup.getRelations()) {
						RoleView roleSrc = rcv.getRoleSrc();
						RoleView roleTar = rcv.getRoleTar();
						RelationClassView rcv2;
						boolean notAdded = true;

						for(int i=0, size=cvRef.getRelations().size(); i<size && notAdded; i++) {
							rcv2 = cvRef.getRelations().get(i);
							notAdded = !rcv2.equalsValue(rcv);
						}

						if(notAdded)
							canvas.addRelation(new RelationClassView(cvRef, rcv.getEntityTar(), rcv.isComposition(), rcv.getSourceDecoration()!=null,
								roleSrc==null?null:roleSrc.getName(), roleTar==null?null:roleTar.getName(),
								roleSrc==null?null:roleSrc.getCardinality(), roleTar==null?null:roleTar.getCardinality()));
					}

					cvSup.getAttributes().clear();
					cvSup.getOperations().clear();

					flat(cvRef, cdRef, cdSup);
				}
			}
	}



	@Override
	public boolean canDo() {
		return super.canDo() && !canvas.getSelection().isEmpty();
	}
}
