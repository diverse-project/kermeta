package org.kermeta.kompren.texteditor.editors;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.swt.custom.StyleRange;
import org.kermeta.kompren.texteditor.Activator;


/**
 * Simple PresentationRepairer based on a Scanner
 */
public class ScannerBasedDamagerRepairer implements IPresentationDamager, IPresentationRepairer {
	/** The document this object works on. */
	protected IDocument fDocument;
	
	/** The default text attribute if non is returned as data by the current token. */
	protected KomprenTokenScanner fScanner;
	
	private Timer myTimer = new Timer();
	
	private List<TimerTask> theTasks = new ArrayList<TimerTask>();
	
	
	
	/** Constructor for NonRuleBasedDamagerRepairer. */
	public ScannerBasedDamagerRepairer(final KomprenTokenScanner scanner) {
		super();
		fScanner = scanner;
	}
	

	@Override
	public void setDocument(final IDocument document) {
		fDocument = document;
	}

	
	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next
	 * line.
	 * @param offset the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException if offset is invalid in the current document
	 */
	protected int endOfLineOf(final int offset) throws BadLocationException {
		IRegion info = fDocument.getLineInformationOfOffset(offset);
		
		if(offset <= info.getOffset() + info.getLength())
			return info.getOffset() + info.getLength();

		int line = fDocument.getLineOfOffset(offset);
		
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		}catch(final BadLocationException x) {
			return fDocument.getLength();
		}
	}


	@Override
	public IRegion getDamageRegion(final ITypedRegion partition, final DocumentEvent event, final boolean documentPartitioningChanged) {
		if(!documentPartitioningChanged)
			try {
				final IFile currentFile = fScanner.getCurrentFile();
				
				//If the IFile is in the list, it seams that the file is in modification
				if (Activator.getDefault().dirtyFilesContainment.containsKey(currentFile)) {
					//Here, I compare the containment of the document to call parser only when containment is modified
					//this test avoids infinite loop due to marking
					if(!fDocument.get().equals(Activator.getDefault().dirtyFilesContainment.get(currentFile))) {
						for (TimerTask aWaitingTask : theTasks)
							aWaitingTask.cancel();

						theTasks.clear();						
						TimerTask aNewTask = new TimerTask() {
							@Override
							public void run() {
								Activator.getDefault().dirtyFilesContainment.put(currentFile, fDocument.get());
//								KermetaBuilder.getDefault().parseSpecificFile(currentFile, fDocument.get());
							}							
						};
						
						theTasks.add(aNewTask);
						myTimer.schedule(aNewTask, 500);
						myTimer.purge();
					}
				}
				
				IRegion info = fDocument.getLineInformationOfOffset(event.getOffset());
				int start = Math.max(partition.getOffset(), info.getOffset());
				int end = event.getOffset() + (event.getText() == null ? event.getLength() : event.getText().length());

				if(info.getOffset() <= end && end <= info.getOffset() + info.getLength())
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				else
					end = endOfLineOf(end);

				end = Math.min(partition.getOffset() + partition.getLength(), end);
				return new Region(start, end - start);

			}catch(final BadLocationException x) {//TODO
			}

		return partition;
	}


	@Override
	public void createPresentation(final TextPresentation presentation, final ITypedRegion region) {
		IToken token;
		TextAttribute attribute;

		fScanner.setRange(fDocument, 0, fDocument.getLength());
		fScanner.setFileHasError(false);
		
		token = fScanner.nextToken();
		
		while(!token.isEOF()){
			attribute = getTokenTextAttribute(token);
			addRange(presentation, fScanner.getTokenOffset(),fScanner.getTokenLength(), attribute);
			token = fScanner.nextToken();
		}
		
		if(fScanner.isFileOnError())
			fScanner.notifyFileHasError();
		else
			fScanner.notifyFileClear();
	}

	
	/**
	 * Retrieves text presentation from the data in the token
	 * @param token
	 * @return
	 */
	protected TextAttribute getTokenTextAttribute(final IToken token) {
		final Object data = token.getData();
		if(data instanceof TextAttribute)
			return (TextAttribute)data;
		return null;
	}

	
	/**
	 * Adds style information to the given text presentation.
	 * @param presentation the text presentation to be extended
	 * @param offset  the offset of the range to be styled
	 * @param length the length of the range to be styled
	 * @param attr  the attribute describing the style of the range to be styled
	 */
	protected void addRange(final TextPresentation presentation, final int offset, final int length, final TextAttribute attr) {
		if(attr!=null)
			presentation.addStyleRange(new StyleRange(offset, length, attr.getForeground(), attr.getBackground(), attr.getStyle()));
	}
}
