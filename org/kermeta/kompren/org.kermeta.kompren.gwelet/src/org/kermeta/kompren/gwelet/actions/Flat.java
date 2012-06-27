package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
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

	private final Map<ClassView, List<AttributeView>> attrs;
	private final Map<ClassView, List<OperationView>> ops;
	private final Map<ClassDefinition, List<Property>> attrsKm;
	private final Map<ClassDefinition, List<Operation>> opsKm;
	private final List<IRelationView> relationsAdded;
	private final List<Type> superTypes;
	private ClassDefinition cdRef;

	public Flat() {
		super();
		attrs = new IdentityHashMap<ClassView, List<AttributeView>>();
		ops = new java.util.IdentityHashMap<ClassView, List<OperationView>>();
		attrsKm = new java.util.IdentityHashMap<ClassDefinition, List<Property>>();
		opsKm = new java.util.IdentityHashMap<ClassDefinition, List<Operation>>();
		superTypes = new ArrayList<Type>();
		relationsAdded = new ArrayList<IRelationView>();
	}


	@Override
	public String getUndoName() {
		return "Flattening";
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		relationsAdded.clear();
		attrs.clear();
		ops.clear();
		attrsKm.clear();
		opsKm.clear();
		superTypes.clear();

		ModelViewMapper mapper = ModelViewMapper.getMapper();
		cdRef = mapper.getClassDefinition(classes.get(0));

		for(Type type : cdRef.getSuperType())
			superTypes.add(type);

		flat(cdRef);
		cdRef.getSuperType().clear();
		classes.get(0).update();
		canvas.update();
		done();
	}


	@Override
	public void undo() {
		ClassView cvRef = ModelViewMapper.getMapper().getClassView(cdRef);

		for(Map.Entry<ClassView, List<AttributeView>> entry : attrs.entrySet()) {
			ClassView cvCurr = entry.getKey();
			for(AttributeView attV : entry.getValue())
				if(cvRef.getAttributes().contains(attV)) {
					cvRef.getAttributes().remove(attV);
					cvCurr.getAttributes().add(attV);
					attV.setEntity(cvCurr);
					cvCurr.update();
				}
		}

		for(Map.Entry<ClassView, List<OperationView>> entry : ops.entrySet()) {
			ClassView cvCurr = entry.getKey();
			for(OperationView opV : entry.getValue()) {
				if(cvRef.getOperations().contains(opV)) {
					cvRef.getOperations().remove(opV);
					cvCurr.getOperations().add(opV);
					opV.setEntity(cvCurr);
					cvCurr.update();
				}
			}
		}

		for(Map.Entry<ClassDefinition, List<Property>> entry : attrsKm.entrySet()) {
			ClassDefinition cvCurr = entry.getKey();
			for(Property attrV : entry.getValue()) {
				cvCurr.getOwnedAttribute().add(attrV);
				attrV.setOwningClass(cvCurr);
			}
		}

		for(Map.Entry<ClassDefinition, List<Operation>> entry : opsKm.entrySet()) {
			ClassDefinition cvCurr = entry.getKey();
			for(Operation opV : entry.getValue()) {
				cvCurr.getOwnedOperation().add(opV);
				opV.setOwningClass(cvCurr);
			}
		}

		for(IRelationView irv : relationsAdded)
			canvas.removeRelation(irv);

		cdRef.getSuperType().addAll(superTypes);
		cvRef.update();
		canvas.update();

		super.undo();
	}


	protected void flat(final ClassDefinition cdCurrent) {
		ModelViewMapper mapper = ModelViewMapper.getMapper();
		final ClassView cvRef = mapper.getClassView(cdRef);
		ClassDefinition cdSup;
		ClassView cvSup;

		for(Type superType : cdCurrent.getSuperType())
			if(superType instanceof org.kermeta.language.structure.Class) {
				cdSup = (ClassDefinition)((org.kermeta.language.structure.Class) superType).getTypeDefinition();
				cvSup = mapper.getClassView(cdSup);
				if(cvSup!=null) {
					cvSup.setVisibility(Visibility.NONE);
//FIXME to refactor
					List<AttributeView> avs = new ArrayList<AttributeView>();
					List<Property> props = new ArrayList<Property>();

					for(AttributeView av : cvSup.getAttributes()) {
						if(!cvRef.getAttributes().contains(av)) {
							cvRef.getAttributes().add(av);
							avs.add(av);
							av.setEntity(cvRef);
						}
					}

					if(!attrs.containsKey(cvSup))
						attrs.put(cvSup, avs);
					if(!attrsKm.containsKey(cdSup))
						attrsKm.put(cdSup, props);

					while(!cdSup.getOwnedAttribute().isEmpty()) {
						Property prop = cdSup.getOwnedAttribute().get(0);
						props.add(prop);
						if(cdRef.getOwnedAttribute().contains(prop))
							cdSup.getOwnedAttribute().remove(0);
						else {
							cdRef.getOwnedAttribute().add(prop);
							prop.setOwningClass(cdRef);
						}
					}

					List<OperationView> ovs = new ArrayList<OperationView>();
					List<Operation> opkms = new ArrayList<Operation>();

					for(OperationView ov : cvSup.getOperations()) {
						if(!cvRef.getOperations().contains(ov)) {
							cvRef.getOperations().add(ov);
							ovs.add(ov);
							ov.setEntity(cvRef);
						}
					}

					if(!ops.containsKey(cvSup))
						ops.put(cvSup, ovs);

					if(!opsKm.containsKey(cdSup))
						opsKm.put(cdSup, opkms);

					while(!cdSup.getOwnedOperation().isEmpty()) {
						Operation op = cdSup.getOwnedOperation().get(0);
						opkms.add(op);
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

						if(notAdded) {
							IRelationView irv = new RelationClassView(cvRef, rcv.getEntityTar(), rcv.isComposition(), rcv.getSourceDecoration()!=null,
												roleSrc==null?null:roleSrc.getName(), roleTar==null?null:roleTar.getName(),
												roleSrc==null?null:roleSrc.getCardinality(), roleTar==null?null:roleTar.getCardinality());
							canvas.addRelation(irv);
							relationsAdded.add(irv);
						}
					}

					cvSup.getAttributes().clear();
					cvSup.getOperations().clear();

					flat(cdSup);
				}
			}
	}



	@Override
	public boolean canDo() {
		return super.canDo() && !canvas.getSelection().isEmpty();
	}
}
