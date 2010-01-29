package org.kermeta.ki.task.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.kermeta.ki.task.Task;
import org.kermeta.ki.task.TaskModel;
import org.kermeta.ki.task.TaskPackage;
import org.kermeta.ki.task.diagram.edit.helpers.TaskBaseEditHelper;
import org.kermeta.ki.task.diagram.expressions.TaskAbstractExpression;
import org.kermeta.ki.task.diagram.expressions.TaskOCLFactory;
import org.kermeta.ki.task.diagram.part.TaskDiagramEditorPlugin;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;
import org.kermeta.ki.task.diagram.providers.TaskElementTypes;

/**
 * @generated
 */
public class TaskBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected TaskBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(TaskVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(TaskBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(TaskBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(TaskBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(TaskBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = TaskElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private static TaskAbstractExpression Enabling_4001_SourceExpression;
		/**
		 * @generated
		 */
		private static TaskAbstractExpression EnablingWithInformation_4002_SourceExpression;
		/**
		 * @generated
		 */
		private static TaskAbstractExpression Interleaving_4003_SourceExpression;
		/**
		 * @generated
		 */
		private static TaskAbstractExpression Synchronization_4004_SourceExpression;
		/**
		 * @generated
		 */
		private static TaskAbstractExpression Desactivation_4005_SourceExpression;
		/**
		 * @generated
		 */
		private static TaskAbstractExpression TaskSubtasks_4006_SourceExpression;

		/**
		 * @generated
		 */
		public static boolean canCreateEnabling_4001(TaskModel container,
				Task source, Task target) {
			return canExistEnabling_4001(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateEnablingWithInformation_4002(
				TaskModel container, Task source, Task target) {
			return canExistEnablingWithInformation_4002(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateInterleaving_4003(TaskModel container,
				Task source, Task target) {
			return canExistInterleaving_4003(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSynchronization_4004(
				TaskModel container, Task source, Task target) {
			return canExistSynchronization_4004(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDesactivation_4005(TaskModel container,
				Task source, Task target) {
			return canExistDesactivation_4005(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateTaskSubtasks_4006(Task source,
				Task target) {
			if (source != null) {
				if (source.getSubtasks().contains(target)) {
					return false;
				}
			}

			return canExistTaskSubtasks_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistEnabling_4001(TaskModel container,
				Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (Enabling_4001_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					Enabling_4001_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = Enabling_4001_SourceExpression.evaluate(
						source, Collections.singletonMap(OPPOSITE_END_VAR,
								target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistEnablingWithInformation_4002(
				TaskModel container, Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (EnablingWithInformation_4002_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					EnablingWithInformation_4002_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = EnablingWithInformation_4002_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistInterleaving_4003(TaskModel container,
				Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (Interleaving_4003_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					Interleaving_4003_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = Interleaving_4003_SourceExpression.evaluate(
						source, Collections.singletonMap(OPPOSITE_END_VAR,
								target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistSynchronization_4004(TaskModel container,
				Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (Synchronization_4004_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					Synchronization_4004_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = Synchronization_4004_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistDesactivation_4005(TaskModel container,
				Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (Desactivation_4005_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					Desactivation_4005_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = Desactivation_4005_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistTaskSubtasks_4006(Task source, Task target) {
			try {
				if (source == null) {
					return true;
				}
				if (TaskSubtasks_4006_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaskPackage.eINSTANCE.getTask());
					TaskSubtasks_4006_SourceExpression = TaskOCLFactory
							.getExpression(
									"self <> oppositeEnd", TaskPackage.eINSTANCE.getTask(), env); //$NON-NLS-1$
				}
				Object sourceVal = TaskSubtasks_4006_SourceExpression.evaluate(
						source, Collections.singletonMap(OPPOSITE_END_VAR,
								target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaskDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
