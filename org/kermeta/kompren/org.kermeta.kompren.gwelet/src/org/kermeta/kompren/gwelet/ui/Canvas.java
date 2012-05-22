package org.kermeta.kompren.gwelet.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.gwelet.view.ClassView;
import org.malai.presentation.ConcretePresentation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.inria.zvtm.engine.Camera;
import fr.inria.zvtm.engine.View;
import fr.inria.zvtm.engine.VirtualSpace;
import fr.inria.zvtm.engine.VirtualSpaceManager;
import fr.inria.zvtm.engine.portals.OverviewPortal;

public class Canvas implements ConcretePresentation {
	protected VirtualSpace vs;

	protected View view;


	public Canvas() {
		super();
		vs = VirtualSpaceManager.INSTANCE.addVirtualSpace("Gwelet");
		List<Camera> cameras = new ArrayList<Camera>();
		Camera detailCam = vs.addCamera();
		Camera overviewCam = vs.addCamera();
		cameras.add(detailCam);
		view = VirtualSpaceManager.INSTANCE.addFrameView(cameras, "Gwelet", View.STD_VIEW, 800, 600, true);
		view.setBackgroundColor(Color.WHITE);

		overviewCam.setAltitude(800f, true);
		OverviewPortal p = new OverviewPortal(0, 0, 200, 150, overviewCam, detailCam);
		p.setBorder(Color.BLACK);
		VirtualSpaceManager.INSTANCE.addPortal(p, view);

		ClassView cv = new ClassView("foo");
		cv.addAttribute("attr1", "String");

		vs.addGlyph(cv.getGlyph());
	}


	@Override
	public void save(final boolean generalPreferences, final String nsURI, final Document document, final Element root) {
		// Nothing to do.
	}

	@Override
	public void load(final boolean generalPreferences, final String nsURI, final Element meta) {
		// Nothing to do.
	}

	@Override
	public void setModified(final boolean modified) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reinit() {
		// TODO Auto-generated method stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
}
