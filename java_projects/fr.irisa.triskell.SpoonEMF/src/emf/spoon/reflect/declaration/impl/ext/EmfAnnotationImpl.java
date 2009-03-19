package emf.spoon.reflect.declaration.impl.ext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtAnnotationType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.declaration.CtAnnotationElementValue;
import emf.spoon.reflect.declaration.DeclarationFactory;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtAnnotationElementValueImpl;
import emf.spoon.reflect.declaration.impl.CtAnnotationImpl;

public class EmfAnnotationImpl extends CtAnnotationImpl {

	class ElementValuesMap implements Map {

		public void clear() {
			getElementsVal().clear();
		}

		public boolean containsKey(Object arg0) {

			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (ev.getKey().equals(arg0))
					return true;
			}

			return false;
		}

		public boolean containsValue(Object arg0) {
			// TODO should be updated

			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (arg0.equals(ev.getValueString())
						|| arg0.equals(ev.getValueElement())
						|| arg0.equals(ev.getValueRef()))
					return true;
			}

			return false;
		}

		public Set entrySet() {
			HashMap s = new HashMap();

			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (ev.getMany()) {
					ArrayList l = new ArrayList();
					if (ev.getValueElement().size() > 0)
						l.addAll(ev.getValueElement());
					if (ev.getValueRef().size() > 0)
						l.addAll(ev.getValueRef());
					if (ev.getValueString().size() > 0)
						l.addAll(ev.getValueString());
					s.put(ev.getKey(), l);

				} else {
					if (ev.getValueElement().size() == 1)
						s.put(ev.getKey(), ev.getValueElement().get(0));
					else if (ev.getValueRef().size() == 1)
						s.put(ev.getKey(), ev.getValueRef().get(0));
					else if (ev.getValueString().size() == 1)
						s.put(ev.getKey(), ev.getValueString().get(0));
				}
			}
			return s.entrySet();

		}

		public Object get(Object arg0) {
			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (ev.getKey().equals(arg0)) {
					if (ev.getMany()) {
						ArrayList l = new ArrayList();
						if (ev.getValueElement().size() > 0)
							l.addAll(ev.getValueElement());
						if (ev.getValueRef().size() > 0)
							l.addAll(ev.getValueRef());
						if (ev.getValueString().size() > 0)
							l.addAll(ev.getValueString());
						return l;

					} else {
						if (ev.getValueElement().size() == 1)
							return ev.getValueElement().get(0);
						else if (ev.getValueRef().size() == 1)
							return ev.getValueRef().get(0);
						else if (ev.getValueString().size() == 1)
							return ev.getValueString().get(0);
					}
				}
			}

			return null;
		}

		public boolean isEmpty() {
			return getElementsVal().isEmpty();
		}

		public Set keySet() {
			HashSet s = new HashSet();
			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				s.add(ev.getKey());
			}
			return s;
		}

		public Object put(Object arg0, Object arg1) {
			//System.out.println("put");
			CtAnnotationElementValue ev = DeclarationFactory.eINSTANCE
					.createCtAnnotationElementValue();
			ev.setKey((String) arg0);

			if (arg1 instanceof String) {
				ev.getValueString().add(arg1);
				ev.setMany(false);
			} 
			else if (arg1 instanceof CtElement) {
				ev.getValueElement().add(arg1);
				ev.setMany(false);
			} 
			else if (arg1 instanceof CtReference) {
				ev.getValueRef().add(arg1);
				ev.setMany(false);
			} 
			
			else if (arg1 instanceof ArrayList) {
				ev.setMany(true);
				for (Object obj : (ArrayList) arg1) {
					if (obj instanceof String)
						ev.getValueString().add(obj);
					else if (obj instanceof CtElement) {
						ev.getValueElement().add(obj);
					} else if (obj instanceof CtReference) {
						ev.getValueRef().add(obj);
					} else {
						// TODO
						System.err.println("err in annotation1");
					}

				}
			}
			else{
				System.err.println("ni arrayList ni String" + arg1.getClass());
			}

			getElementsVal().add(ev);
			return null;
		}

		public void putAll(Map map) {
			System.out.println("putall");
			for (Object o : map.entrySet()) {
				Entry e = (Entry) o;
				Object arg0 = e.getKey();
				Object arg1 = e.getValue();
				CtAnnotationElementValue ev = DeclarationFactory.eINSTANCE
						.createCtAnnotationElementValue();
				ev.setKey((String) arg0);

				if (arg1 instanceof String) {
					ev.getValueString().add(arg1);
					ev.setMany(false);
					
				} 
				else if (arg1 instanceof CtElement) {
					ev.getValueElement().add(arg1);
					ev.setMany(false);
				} 
				else if (arg1 instanceof CtReference) {
					ev.getValueRef().add(arg1);
					ev.setMany(false);
				} 
				else if (arg1 instanceof ArrayList) {
					ev.setMany(true);
					for (Object obj : (ArrayList) arg1) {
						if (obj instanceof String)
							ev.getValueString().add(obj);
						else if (obj instanceof CtElement) {
							ev.getValueElement().add(obj);
						} else if (obj instanceof CtReference) {
							ev.getValueRef().add(obj);
						} else {
							// TODO
							System.err.println("err in annotation1");
						}

					}

				}

				getElementsVal().add(ev);
			}
		}

		public Object remove(Object arg0) {
			CtAnnotationElementValueImpl toremove = null;
			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (ev.getKey().equals(arg0)) {
					toremove = ev;
					break;
				}
			}
			if (toremove != null) {
				getElementsVal().remove(toremove);
				ArrayList l = new ArrayList();
				if (toremove.getValueElement().size() > 0)
					l.addAll(toremove.getValueElement());
				if (toremove.getValueRef().size() > 0)
					l.addAll(toremove.getValueRef());
				if (toremove.getValueString().size() > 0)
					l.addAll(toremove.getValueString());
				return l;
			}
			return null;

		}

		public int size() {
			return getElementsVal().size();
		}

		public Collection values() {
			HashSet s = new HashSet();
			for (Object o : getElementsVal()) {
				CtAnnotationElementValueImpl ev = (CtAnnotationElementValueImpl) o;
				if (ev.getMany()) {
					ArrayList l = new ArrayList();
					if (ev.getValueElement().size() > 0)
						l.addAll(ev.getValueElement());
					if (ev.getValueRef().size() > 0)
						l.addAll(ev.getValueRef());
					if (ev.getValueString().size() > 0)
						l.addAll(ev.getValueString());
					s.add(l);

				} else {
					if (ev.getValueElement().size() == 1)
						s.add(ev.getValueElement().get(0));
					else if (ev.getValueRef().size() == 1)
						s.add(ev.getValueRef().get(0));
					else if (ev.getValueString().size() == 1)
						s.add(ev.getValueString().get(0));
				}
			}
			return s;
		}

	}

	protected Map elementValues = new ElementValuesMap();

	//protected Map elementValues = new HashMap();
	public void accept(CtVisitor visitor) {
		visitor.visitCtAnnotation(this);

	}

	public Map getElementValues() {
		
		for (Object o : this.elementValues.entrySet())
		{
			Entry e = (Entry) o;
			System.out.println("key : " + e.getKey() + " value : " + e.getValue() + " " + e.getValue().getClass());
		}
		
		
		
		return this.elementValues;
	}

	public void setAnnotationType(CtTypeReference type) {
		this
				.setAnnotationType((emf.spoon.reflect.reference.CtTypeReference) type);
	}

	public void setElementValues(Map values) {
		this.elementValues.clear();
		this.elementValues.putAll(values);
	}

	protected void appendValues(String elementName, Object... values) {
		if (!elementValues.containsKey(elementName)) {
			elementValues.put(elementName, values);
		} else {
			Object o = elementValues.get(elementName);
			if (o.getClass().isArray()) {
				List<Object> tmp = new ArrayList<Object>();
				Object[] old = (Object[]) o;
				for (Object a : old) {
					tmp.add(a);
				}
				for (Object a : values) {
					tmp.add(a);
				}
				elementValues.put(elementName, tmp.toArray());
			} else {
				// o is not a array
				if (values.length > 1) {
					throw new RuntimeException(
							"Cannot add array to a non-array value");
				} else {
					elementValues.put(elementName, values[0]);
				}
			}
		}
	}

	private Object getReflectValue(String fieldname) {
		try {
			Class c = getAnnotationType().getActualClass();
			Method m = c.getMethod(fieldname);
			return m.getDefaultValue();
		} catch (Exception e) {
			return null;
		}
	}

	private Object getDefaultValue(String fieldName) {
		Object ret = null;
		CtAnnotationType<?> at = (CtAnnotationType<?>) getAnnotationType()
				.getDeclaration();
		if (at != null) {
			CtField<?> f = at.getField(fieldName);
			ret = f.getDefaultExpression();
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	private Object convertValue(Object value) {
		if (value instanceof CtFieldReference) {
			Class c = ((CtFieldReference) value).getDeclaringType()
					.getActualClass();
			if (((CtFieldReference) value).getSimpleName().equals("class")) {
				return c;
			}
			CtField field = ((CtFieldReference) value).getDeclaration();
			if (Enum.class.isAssignableFrom(c)) {
				// Value references a Enum field
				return Enum.valueOf(c, ((CtFieldReference) value)
						.getSimpleName());
			} else {
				// Value is a static final
				return convertValue(field.getDefaultExpression());
			}
		} else if (value instanceof CtFieldAccess) {
			// Get variable
			return convertValue(((CtFieldAccess) value).getVariable());
		} else if (value instanceof CtAnnotation) {
			// Get proxy
			return ((CtAnnotation) value).getActualAnnotation();
		} else if (value instanceof CtLiteral) {
			// Replace literal by his value
			return ((CtLiteral) value).getValue();
		} else if (value instanceof CtCodeElement) {
			// Evaluate code elements
			spoon.reflect.eval.PartialEvaluator eval = getFactory().Eval()
					.createPartialEvaluator();
			Object ret = eval.evaluate(((CtCodeElement) value).getParent(),
					(CtCodeElement) value);
			if (!(ret instanceof CtCodeElement))
				return convertValue(ret);
			else
				return ret;
		} else if (value instanceof CtTypeReference) {
			// Get RT class for References
			return ((CtTypeReference) value).getActualClass();
		}
		return value;
	}

	private Class getElementType(String name) {
		// Try by CT reflection
		CtSimpleType t = getAnnotationType().getDeclaration();
		if (t != null) {
			CtField f = t.getField(name);
			return f.getType().getActualClass();
		}
		// Try with RT reflection
		Class c = getAnnotationType().getActualClass();
		for (Method m : c.getMethods()) {
			if (m.getName().equals(name)) {
				return m.getReturnType();
			}
		}
		return null;
	}

	public Object getElementValue(String key) {
		Object ret = null;
		ret = elementValues.get(key);
		if (ret == null)
			ret = getDefaultValue(key);
		if (ret == null)
			ret = getReflectValue(key);

		Class type = getElementType(key);
		if (type.isArray()) {
			if (ret instanceof Collection) {
				Collection col = (Collection) ret;
				Object[] array = (Object[]) Array.newInstance(type
						.getComponentType(), col.size());
				int i = 0;
				for (Object obj : col) {
					array[i++] = convertValue(obj);
				}
				ret = array;
			}
		} else {
			ret = convertValue(ret);
		}

		if (type.isPrimitive()) {
			if (type == boolean.class && ret.getClass() != boolean.class) {
				ret = Boolean.parseBoolean(ret.toString());
			} else if (type == byte.class && ret.getClass() != byte.class) {
				ret = Byte.parseByte(ret.toString());
			} else if (type == char.class && ret.getClass() != char.class) {
				ret = ret.toString().charAt(0);
			} else if (type == double.class && ret.getClass() != double.class) {
				ret = Double.parseDouble(ret.toString());
			} else if (type == float.class && ret.getClass() != float.class) {
				ret = Float.parseFloat(ret.toString());
			} else if (type == int.class && ret.getClass() != int.class) {
				ret = Integer.parseInt(ret.toString());
			} else if (type == long.class && ret.getClass() != long.class) {
				ret = Long.parseLong(ret.toString());
			}
		}
		return ret;
	}

	public void replace(CtElement element) {
		// TODO Auto-generated method stub

	}

	public void replace(Filter<? extends CtElement> replacementPoints,
			CtElement element) {
		// TODO Auto-generated method stub

	}

	public int compareTo(CtElement o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}

	public Annotation getActualAnnotation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtAnnotation();
		
	}
	
	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}






	

}
