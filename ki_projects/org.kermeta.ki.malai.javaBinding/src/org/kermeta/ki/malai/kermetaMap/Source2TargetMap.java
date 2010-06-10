package org.kermeta.ki.malai.kermetaMap;

import java.util.IdentityHashMap;
import java.util.Map;

public final class Source2TargetMap {
	public static final Source2TargetMap MAP = new Source2TargetMap();
	
	protected Map<Object, Object> source2TargetMap;
	
	protected Map<Object, Object> target2SourceMap;
	
	
	private Source2TargetMap() {
		super();
		
		source2TargetMap = new IdentityHashMap<Object, Object>();
		target2SourceMap = new IdentityHashMap<Object, Object>();
	}

	
	
	public Object removeTargetObject(final Object targetObject) {
		final Object sourceObject = target2SourceMap.remove(targetObject);
		source2TargetMap.remove(sourceObject);
		
		return sourceObject;
	}
	
	
	
	public Object removeSourceObject(final Object sourceObject) {
		final Object targetObject = source2TargetMap.remove(sourceObject);
		target2SourceMap.remove(targetObject);
		
		return targetObject;
	}
	
	
	
	public void add(final Object sourceObject, final Object targetObject) {
		source2TargetMap.put(sourceObject, targetObject);
		target2SourceMap.put(targetObject, sourceObject);
	}
	
	
	public Object getTargetObject(final Object sourceObject) {
		return source2TargetMap.get(sourceObject);
	}
	
	
	public Object getSourceObject(final Object targetObject) {
		return target2SourceMap.get(targetObject);
	}
	
	
	
	public void cleanMap() {
		source2TargetMap.clear();
		target2SourceMap.clear();
	}
}
