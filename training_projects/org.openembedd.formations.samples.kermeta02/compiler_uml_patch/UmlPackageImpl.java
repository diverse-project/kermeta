/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import fsm.FsmPackage;

import fsm.impl.FsmPackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uml.Abstraction;
import uml.AcceptCallAction;
import uml.AcceptEventAction;
import uml.Action;
import uml.ActionExecutionSpecification;
import uml.ActionInputPin;
import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityFinalNode;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityParameterNode;
import uml.ActivityPartition;
import uml.Actor;
import uml.AddStructuralFeatureValueAction;
import uml.AddVariableValueAction;
import uml.AggregationKind;
import uml.AnyReceiveEvent;
import uml.Artifact;
import uml.Association;
import uml.AssociationClass;
import uml.Behavior;
import uml.BehaviorExecutionSpecification;
import uml.BehavioralFeature;
import uml.BehavioredClassifier;
import uml.BroadcastSignalAction;
import uml.CallAction;
import uml.CallBehaviorAction;
import uml.CallConcurrencyKind;
import uml.CallEvent;
import uml.CallOperationAction;
import uml.CentralBufferNode;
import uml.ChangeEvent;
import uml.Classifier;
import uml.ClassifierTemplateParameter;
import uml.Clause;
import uml.ClearAssociationAction;
import uml.ClearStructuralFeatureAction;
import uml.ClearVariableAction;
import uml.Collaboration;
import uml.CollaborationUse;
import uml.CombinedFragment;
import uml.Comment;
import uml.CommunicationPath;
import uml.Component;
import uml.ComponentRealization;
import uml.ConditionalNode;
import uml.ConnectableElement;
import uml.ConnectableElementTemplateParameter;
import uml.ConnectionPointReference;
import uml.Connector;
import uml.ConnectorEnd;
import uml.ConnectorKind;
import uml.ConsiderIgnoreFragment;
import uml.Constraint;
import uml.Continuation;
import uml.ControlFlow;
import uml.ControlNode;
import uml.CreateLinkAction;
import uml.CreateLinkObjectAction;
import uml.CreateObjectAction;
import uml.CreationEvent;
import uml.DataStoreNode;
import uml.DataType;
import uml.DecisionNode;
import uml.Dependency;
import uml.DeployedArtifact;
import uml.Deployment;
import uml.DeploymentSpecification;
import uml.DeploymentTarget;
import uml.DestroyLinkAction;
import uml.DestroyObjectAction;
import uml.DestructionEvent;
import uml.Device;
import uml.DirectedRelationship;
import uml.Duration;
import uml.DurationConstraint;
import uml.DurationInterval;
import uml.DurationObservation;
import uml.Element;
import uml.ElementImport;
import uml.EncapsulatedClassifier;
import uml.Enumeration;
import uml.EnumerationLiteral;
import uml.Event;
import uml.ExceptionHandler;
import uml.ExecutableNode;
import uml.ExecutionEnvironment;
import uml.ExecutionEvent;
import uml.ExecutionOccurrenceSpecification;
import uml.ExecutionSpecification;
import uml.ExpansionKind;
import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.Expression;
import uml.Extend;
import uml.Extension;
import uml.ExtensionEnd;
import uml.ExtensionPoint;
import uml.Feature;
import uml.FinalNode;
import uml.FinalState;
import uml.FlowFinalNode;
import uml.ForkNode;
import uml.FunctionBehavior;
import uml.Gate;
import uml.GeneralOrdering;
import uml.Generalization;
import uml.GeneralizationSet;
import uml.Image;
import uml.Include;
import uml.InformationFlow;
import uml.InformationItem;
import uml.InitialNode;
import uml.InputPin;
import uml.InstanceSpecification;
import uml.InstanceValue;
import uml.Interaction;
import uml.InteractionConstraint;
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.InteractionOperatorKind;
import uml.InteractionUse;
import uml.Interface;
import uml.InterfaceRealization;
import uml.InterruptibleActivityRegion;
import uml.Interval;
import uml.IntervalConstraint;
import uml.InvocationAction;
import uml.JoinNode;
import uml.Launcher;
import uml.Lifeline;
import uml.LinkAction;
import uml.LinkEndCreationData;
import uml.LinkEndData;
import uml.LinkEndDestructionData;
import uml.LiteralBoolean;
import uml.LiteralInteger;
import uml.LiteralNull;
import uml.LiteralSpecification;
import uml.LiteralString;
import uml.LiteralUnlimitedNatural;
import uml.LoopNode;
import uml.Manifestation;
import uml.MergeNode;
import uml.Message;
import uml.MessageEnd;
import uml.MessageEvent;
import uml.MessageKind;
import uml.MessageOccurrenceSpecification;
import uml.MessageSort;
import uml.Model;
import uml.MultiplicityElement;
import uml.NamedElement;
import uml.Namespace;
import uml.Node;
import uml.ObjectFlow;
import uml.ObjectNode;
import uml.ObjectNodeOrderingKind;
import uml.Observation;
import uml.OccurrenceSpecification;
import uml.OpaqueAction;
import uml.OpaqueBehavior;
import uml.OpaqueExpression;
import uml.Operation;
import uml.OperationTemplateParameter;
import uml.OutputPin;
import uml.PackageImport;
import uml.PackageMerge;
import uml.PackageableElement;
import uml.Parameter;
import uml.ParameterDirectionKind;
import uml.ParameterEffectKind;
import uml.ParameterSet;
import uml.ParameterableElement;
import uml.PartDecomposition;
import uml.Pin;
import uml.Port;
import uml.PrimitiveType;
import uml.Profile;
import uml.ProfileApplication;
import uml.Property;
import uml.ProtocolConformance;
import uml.ProtocolStateMachine;
import uml.ProtocolTransition;
import uml.Pseudostate;
import uml.PseudostateKind;
import uml.QualifierValue;
import uml.RaiseExceptionAction;
import uml.ReadExtentAction;
import uml.ReadIsClassifiedObjectAction;
import uml.ReadLinkAction;
import uml.ReadLinkObjectEndAction;
import uml.ReadLinkObjectEndQualifierAction;
import uml.ReadSelfAction;
import uml.ReadStructuralFeatureAction;
import uml.ReadVariableAction;
import uml.Realization;
import uml.ReceiveOperationEvent;
import uml.ReceiveSignalEvent;
import uml.Reception;
import uml.ReclassifyObjectAction;
import uml.RedefinableElement;
import uml.RedefinableTemplateSignature;
import uml.ReduceAction;
import uml.Region;
import uml.Relationship;
import uml.RemoveStructuralFeatureValueAction;
import uml.RemoveVariableValueAction;
import uml.ReplyAction;
import uml.SendObjectAction;
import uml.SendOperationEvent;
import uml.SendSignalAction;
import uml.SendSignalEvent;
import uml.SequenceNode;
import uml.Signal;
import uml.SignalEvent;
import uml.Slot;
import uml.StartClassifierBehaviorAction;
import uml.StartObjectBehaviorAction;
import uml.State;
import uml.StateInvariant;
import uml.StateMachine;
import uml.Stereotype;
import uml.StringExpression;
import uml.StructuralFeature;
import uml.StructuralFeatureAction;
import uml.StructuredActivityNode;
import uml.StructuredClassifier;
import uml.Substitution;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.TestIdentityAction;
import uml.TimeConstraint;
import uml.TimeEvent;
import uml.TimeExpression;
import uml.TimeInterval;
import uml.TimeObservation;
import uml.Transition;
import uml.TransitionKind;
import uml.Trigger;
import uml.Type;
import uml.TypedElement;
import uml.UmlFactory;
import uml.UmlPackage;
import uml.UnmarshallAction;
import uml.Usage;
import uml.UseCase;
import uml.ValuePin;
import uml.ValueSpecification;
import uml.ValueSpecificationAction;
import uml.Variable;
import uml.VariableAction;
import uml.Vertex;
import uml.VisibilityKind;
import uml.WriteLinkAction;
import uml.WriteStructuralFeatureAction;
import uml.WriteVariableAction;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendOperationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveOperationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveSignalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterEffectKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudostateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml.UmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlPackageImpl() {
		super(eNS_URI, UmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmlPackage init() {
		if (isInited)
			return (UmlPackage) EPackage.Registry.INSTANCE
					.getEPackage(UmlPackage.eNS_URI);

		// Obtain or create and register package
		UmlPackageImpl theUmlPackage = (UmlPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new UmlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI)
				: LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_1 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);
		FsmPackageImpl theFsmPackage = (FsmPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FsmPackage.eNS_URI)
				: FsmPackage.eINSTANCE);

		// Create package meta-data objects
		theUmlPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theFsmPackage.createPackageContents();

		// Initialize created meta-data
		theUmlPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theFsmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theUmlPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return UmlValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theUmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
		return theUmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ProfileApplication() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
		return (EReference) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ExtendedStateMachine() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_SubmachineState() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Output() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ConnectionPoint() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
		return (EReference) regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_StateMachine() {
		return (EReference) regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_OutModel() {
		return (EReference) regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_State() {
		return (EReference) regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transition() {
		return (EReference) regionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ExtendedRegion() {
		return (EReference) regionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Container() {
		return (EReference) vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_OutModel() {
		return (EReference) vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Output() {
		return (EReference) vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Container() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RedefinedTransition() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Kind() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_FsmTransition() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AnnotatedElement() {
		return (EReference) commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
		return (EReference) namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ClientDependency() {
		return (EReference) namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Client() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Supplier() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
		return (EAttribute) elementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
		return (EAttribute) elementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
		return (EReference) elementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportingNamespace() {
		return (EReference) elementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
		return (EReference) packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
		return (EAttribute) packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingNamespace() {
		return (EReference) packageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableOwnedEnd() {
		return (EReference) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
		return (EReference) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_MemberEnd() {
		return (EReference) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_RedefinedClassifier() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_PowertypeExtent() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Substitution() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_UseCase() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Representation() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedUseCase() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_CollaborationUse() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute) redefinableElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElement() {
		return templateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedTemplateSignature() {
		return (EReference) templateableElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_TemplateBinding() {
		return (EReference) templateableElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_ParameterSubstitution() {
		return (EReference) templateBindingEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BoundElement() {
		return (EReference) templateBindingEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_Signature() {
		return (EReference) templateBindingEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Template() {
		return (EReference) templateSignatureEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Parameter() {
		return (EReference) templateSignatureEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_OwnedParameter() {
		return (EReference) templateSignatureEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedDefault() {
		return (EReference) templateParameterEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter__default() {
		return (EReference) templateParameterEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedParameteredElement() {
		return (EReference) templateParameterEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_ParameteredElement() {
		return (EReference) templateParameterEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Signature() {
		return (EReference) templateParameterEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElement() {
		return parameterableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_OwningTemplateParameter() {
		return (EReference) parameterableElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_TemplateParameter() {
		return (EReference) parameterableElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitution() {
		return templateParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Formal() {
		return (EReference) templateParameterSubstitutionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_OwnedActual() {
		return (EReference) templateParameterSubstitutionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Actual() {
		return (EReference) templateParameterSubstitutionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_TemplateBinding() {
		return (EReference) templateParameterSubstitutionEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference) generalizationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference) generalizationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference) generalizationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
		return (EAttribute) generalizationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute) generalizationSetEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference) generalizationSetEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute) generalizationSetEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Powertype() {
		return (EReference) generalizationSetEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitution() {
		return substitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_SubstitutingClassifier() {
		return (EReference) substitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_Contract() {
		return (EReference) substitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstraction_Mapping() {
		return (EReference) abstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute) opaqueExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Behavior() {
		return (EReference) opaqueExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute) opaqueExpressionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Effect() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsStream() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterSet() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsException() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
		return (EReference) multiplicityElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
		return (EReference) multiplicityElementEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEnd() {
		return connectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_PartWithPort() {
		return (EReference) connectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_Role() {
		return (EReference) connectorEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_RedefinedProperty() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsettedProperty() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty__class() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Qualifier() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningAssociation() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datatype() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_AssociationEnd() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_Deployment() {
		return (EReference) deploymentTargetEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Location() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_DeployedArtifact() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Configuration() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedArtifact() {
		return deployedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_DeploymentLocation() {
		return (EAttribute) deploymentSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_ExecutionLocation() {
		return (EAttribute) deploymentSpecificationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_Deployment() {
		return (EReference) deploymentSpecificationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedOperation() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_NestedArtifact() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_FileName() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedAttribute() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Manifestation() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestation() {
		return manifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestation_UtilizedElement() {
		return (EReference) manifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_BodyCondition() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation__class() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation__interface() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsQuery() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Postcondition() {
		return (EReference) operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Precondition() {
		return (EReference) operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RedefinedOperation() {
		return (EReference) operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Datatype() {
		return (EReference) operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_IsAbstract() {
		return (EAttribute) behavioralFeatureEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameter() {
		return (EReference) behavioralFeatureEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_RaisedException() {
		return (EReference) behavioralFeatureEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameterSet() {
		return (EReference) behavioralFeatureEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute) behavioralFeatureEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Method() {
		return (EReference) behavioralFeatureEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Postcondition() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Precondition() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
		return (EAttribute) behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameter() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_RedefinedBehavior() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameterSet() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Specification() {
		return (EReference) behaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
		return (EReference) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
		return (EReference) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_InterfaceRealization() {
		return (EReference) behavioredClassifierEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedTrigger() {
		return (EReference) behavioredClassifierEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference) behavioredClassifierEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference) behavioredClassifierEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealization() {
		return interfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_Contract() {
		return (EReference) interfaceRealizationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_ImplementingClassifier() {
		return (EReference) interfaceRealizationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Protocol() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RedefinedInterface() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReception_Signal() {
		return (EReference) receptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
		return (EReference) signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachine() {
		return protocolStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStateMachine_Conformance() {
		return (EReference) protocolStateMachineEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Port() {
		return (EReference) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Event() {
		return (EReference) triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Protocol() {
		return (EReference) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RedefinedPort() {
		return (EReference) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Region() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RedefinedState() {
		return (EReference) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Connection() {
		return (EReference) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Submachine() {
		return (EReference) stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference) stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoint() {
		return (EReference) stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DeferrableTrigger() {
		return (EReference) stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference) stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference) stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReference() {
		return connectionPointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Entry() {
		return (EReference) connectionPointReferenceEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_State() {
		return (EReference) connectionPointReferenceEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Exit() {
		return (EReference) connectionPointReferenceEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_StateMachine() {
		return (EReference) pseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_State() {
		return (EReference) pseudostateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_Kind() {
		return (EAttribute) pseudostateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformance() {
		return protocolConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_SpecificMachine() {
		return (EReference) protocolConformanceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_GeneralMachine() {
		return (EReference) protocolConformanceEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifier() {
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifier() {
		return structuredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedConnector() {
		return (EReference) structuredClassifierEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedAttribute() {
		return (EReference) structuredClassifierEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Contract() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_RedefinedConnector() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_End() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Kind() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEnd() {
		return extensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Icon() {
		return (EReference) stereotypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Content() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Location() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Format() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetamodelReference() {
		return (EReference) profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetaclassReference() {
		return (EReference) profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Parameter() {
		return (EReference) parameterSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Condition() {
		return (EReference) parameterSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedOperation() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameter() {
		return operationTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute) structuralFeatureEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameter() {
		return connectableElementTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_RoleBinding() {
		return (EReference) collaborationUseEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Type() {
		return (EReference) collaborationUseEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference) collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_ExtensionPoint() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Extend() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Subject() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Include() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_IncludingCase() {
		return (EReference) includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_Addition() {
		return (EReference) includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtend() {
		return extendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Extension() {
		return (EReference) extendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtendedCase() {
		return (EReference) extendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Condition() {
		return (EReference) extendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtensionLocation() {
		return (EReference) extendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPoint() {
		return extensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_UseCase() {
		return (EReference) extensionPointEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignature() {
		return redefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_ExtendedSignature() {
		return (EReference) redefinableTemplateSignatureEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_Classifier() {
		return (EReference) redefinableTemplateSignatureEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameter() {
		return classifierTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierTemplateParameter_ConstrainingClassifier() {
		return (EReference) classifierTemplateParameterEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
		return (EAttribute) classifierTemplateParameterEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
		return (EReference) stringExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_OwningExpression() {
		return (EReference) stringExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference) expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergedPackage() {
		return (EReference) packageMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_ReceivingPackage() {
		return (EReference) packageMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplication() {
		return profileApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_IsStrict() {
		return (EAttribute) profileApplicationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_AppliedProfile() {
		return (EReference) profileApplicationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_ApplyingPackage() {
		return (EReference) profileApplicationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference) enumerationLiteralEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
		return (EReference) instanceSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Classifier() {
		return (EReference) instanceSpecificationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
		return (EReference) instanceSpecificationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_DefiningFeature() {
		return (EReference) slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
		return (EReference) slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_OwningInstance() {
		return (EReference) slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute) literalIntegerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute) literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute) literalBooleanEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceValue_Instance() {
		return (EReference) instanceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute) literalUnlimitedNaturalEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Body() {
		return (EAttribute) opaqueBehaviorEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Language() {
		return (EAttribute) opaqueBehaviorEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehavior() {
		return functionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Body() {
		return (EAttribute) opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_OutputValue() {
		return (EReference) opaqueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_InputValue() {
		return (EReference) opaqueActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Language() {
		return (EAttribute) opaqueActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPostcondition() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPrecondition() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_Handler() {
		return (EReference) executableNodeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_RedefinedNode() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InPartition() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InStructuredNode() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredActivityNode_MustIsolate() {
		return (EAttribute) structuredActivityNodeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Node() {
		return (EReference) structuredActivityNodeEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Edge() {
		return (EReference) structuredActivityNodeEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Variable() {
		return (EReference) structuredActivityNodeEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_InActivity() {
		return (EReference) activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Node() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edge() {
		return (EReference) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Partition() {
		return (EReference) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsReadOnly() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Group() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsSingleExecution() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Variable() {
		return (EReference) activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_ActivityScope() {
		return (EReference) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Interrupts() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InPartition() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InStructuredNode() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_RedefinedEdge() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Activity() {
		return (EReference) activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
		return (EAttribute) activityPartitionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Node() {
		return (EReference) activityPartitionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Represents() {
		return (EReference) activityPartitionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Edge() {
		return (EReference) activityPartitionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Subpartition() {
		return (EReference) activityPartitionEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
		return (EAttribute) activityPartitionEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SuperPartition() {
		return (EReference) activityPartitionEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_InterruptingEdge() {
		return (EReference) interruptibleActivityRegionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_Node() {
		return (EReference) interruptibleActivityRegionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference) exceptionHandlerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionType() {
		return (EReference) exceptionHandlerEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference) exceptionHandlerEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference) exceptionHandlerEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_InState() {
		return (EReference) objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_IsControlType() {
		return (EAttribute) objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
		return (EAttribute) objectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_UpperBound() {
		return (EReference) objectNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_Selection() {
		return (EReference) objectNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAction_IsSynchronous() {
		return (EAttribute) callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction__result() {
		return (EReference) callActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Argument() {
		return (EReference) invocationActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_OnPort() {
		return (EReference) invocationActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
		return (EReference) sendSignalActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference) sendSignalActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Operation() {
		return (EReference) callOperationActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Target() {
		return (EReference) callOperationActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference) callBehaviorActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_ExecutableNode() {
		return (EReference) sequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNode() {
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityParameterNode_Parameter() {
		return (EReference) activityParameterNodeEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
		return (EReference) valuePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Argument() {
		return (EReference) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Connector() {
		return (EReference) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_Message() {
		return (EReference) messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Action() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference) interactionFragmentEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference) interactionFragmentEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference) interactionFragmentEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference) interactionFragmentEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
		return (EReference) lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference) lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference) lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Interaction() {
		return (EReference) lifelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_DecomposedAs() {
		return (EReference) lifelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUse() {
		return interactionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_Argument() {
		return (EReference) interactionUseEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_RefersTo() {
		return (EReference) interactionUseEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ActualGate() {
		return (EReference) interactionUseEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrdering() {
		return generalOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_After() {
		return (EReference) generalOrderingEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_Before() {
		return (EReference) generalOrderingEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecification() {
		return occurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToAfter() {
		return (EReference) occurrenceSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_Event() {
		return (EReference) occurrenceSpecificationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToBefore() {
		return (EReference) occurrenceSpecificationEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
		return (EReference) interactionOperandEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
		return (EReference) interactionOperandEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
		return (EReference) interactionConstraintEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
		return (EReference) interactionConstraintEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecification() {
		return executionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Finish() {
		return (EReference) executionSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Start() {
		return (EReference) executionSpecificationEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariant() {
		return stateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInvariant_Invariant() {
		return (EReference) stateInvariantEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecutionSpecification() {
		return actionExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecutionSpecification_Action() {
		return (EReference) actionExecutionSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecification() {
		return behaviorExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorExecutionSpecification_Behavior() {
		return (EReference) behaviorExecutionSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEvent() {
		return executionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationEvent() {
		return creationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionEvent() {
		return destructionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendOperationEvent() {
		return sendOperationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendOperationEvent_Operation() {
		return (EReference) sendOperationEventEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalEvent() {
		return sendSignalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalEvent_Signal() {
		return (EReference) sendSignalEventEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecification() {
		return messageOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrenceSpecification() {
		return executionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrenceSpecification_Execution() {
		return (EReference) executionOccurrenceSpecificationEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveOperationEvent() {
		return receiveOperationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveOperationEvent_Operation() {
		return (EReference) receiveOperationEventEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveSignalEvent() {
		return receiveSignalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveSignalEvent_Signal() {
		return (EReference) receiveSignalEventEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEvent() {
		return callEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallEvent_Operation() {
		return (EReference) callEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
		return (EReference) changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEvent_Signal() {
		return (EReference) signalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEvent() {
		return anyReceiveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNode() {
		return centralBufferNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInput() {
		return (EReference) decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInputFlow() {
		return (EReference) decisionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
		return (EAttribute) objectFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
		return (EAttribute) objectFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Selection() {
		return (EReference) objectFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Transformation() {
		return (EReference) objectFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRealization() {
		return componentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_Abstraction() {
		return (EReference) componentRealizationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_RealizingClassifier() {
		return (EReference) componentRealizationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_PackagedElement() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IsIndirectlyInstantiated() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Realization() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NestedNode() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPath() {
		return communicationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference) combinedFragmentEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute) combinedFragmentEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
		return (EReference) combinedFragmentEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
		return (EAttribute) continuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragment() {
		return considerIgnoreFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsiderIgnoreFragment_Message() {
		return (EReference) considerIgnoreFragmentEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction__result() {
		return (EReference) createObjectActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference) createObjectActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyOwnedObjects() {
		return (EAttribute) destroyObjectActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference) destroyObjectActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyLinks() {
		return (EAttribute) destroyObjectActionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction__result() {
		return (EReference) testIdentityActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference) testIdentityActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference) testIdentityActionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction__result() {
		return (EReference) readSelfActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference) structuralFeatureActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference) structuralFeatureActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction__result() {
		return (EReference) readStructuralFeatureActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction__result() {
		return (EReference) writeStructuralFeatureActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference) writeStructuralFeatureActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearStructuralFeatureAction__result() {
		return (EReference) clearStructuralFeatureActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference) removeStructuralFeatureValueActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveStructuralFeatureValueAction_IsRemoveDuplicates() {
		return (EAttribute) removeStructuralFeatureValueActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference) addStructuralFeatureValueActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_IsReplaceAll() {
		return (EAttribute) addStructuralFeatureValueActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference) linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
		return (EReference) linkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference) linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
		return (EReference) linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference) linkEndDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Value() {
		return (EReference) qualifierValueEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Qualifier() {
		return (EReference) qualifierValueEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction__result() {
		return (EReference) readLinkActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference) linkEndCreationDataEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
		return (EAttribute) linkEndCreationDataEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_IsDestroyDuplicates() {
		return (EAttribute) linkEndDestructionDataEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference) linkEndDestructionDataEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Association() {
		return (EReference) clearAssociationActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
		return (EReference) clearAssociationActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastSignalAction_Signal() {
		return (EReference) broadcastSignalActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
		return (EReference) sendObjectActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
		return (EReference) sendObjectActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction__result() {
		return (EReference) valueSpecificationActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
		return (EReference) valueSpecificationActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Observation() {
		return (EReference) timeExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Expr() {
		return (EReference) timeExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Observation() {
		return (EReference) durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Expr() {
		return (EReference) durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference) intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference) intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstraint_FirstEvent() {
		return (EAttribute) timeConstraintEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationConstraint_FirstEvent() {
		return (EAttribute) durationConstraintEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservation() {
		return timeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_FirstEvent() {
		return (EAttribute) timeObservationEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeObservation_Event() {
		return (EReference) timeObservationEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservation() {
		return durationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_FirstEvent() {
		return (EAttribute) durationObservationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationObservation_Event() {
		return (EReference) durationObservationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_IsRelative() {
		return (EAttribute) timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEvent_When() {
		return (EReference) timeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAction_Variable() {
		return (EReference) variableActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction__result() {
		return (EReference) readVariableActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
		return (EReference) writeVariableActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference) addVariableValueActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableValueAction_IsReplaceAll() {
		return (EAttribute) addVariableValueActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveVariableValueAction_RemoveAt() {
		return (EReference) removeVariableValueActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveVariableValueAction_IsRemoveDuplicates() {
		return (EAttribute) removeVariableValueActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference) raiseExceptionActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPin() {
		return actionInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInputPin_FromAction() {
		return (EReference) actionInputPinEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItem() {
		return informationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationItem_Represented() {
		return (EReference) informationItemEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingMessage() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Conveyed() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationSource() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Realization() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingConnector() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingActivityEdge() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationTarget() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction__result() {
		return (EReference) readExtentActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Classifier() {
		return (EReference) readExtentActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference) reclassifyObjectActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference) reclassifyObjectActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference) reclassifyObjectActionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
		return (EAttribute) reclassifyObjectActionEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction__result() {
		return (EReference) readIsClassifiedObjectActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_IsDirect() {
		return (EAttribute) readIsClassifiedObjectActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference) readIsClassifiedObjectActionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference) readIsClassifiedObjectActionEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference) startClassifierBehaviorActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction__result() {
		return (EReference) readLinkObjectEndActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference) readLinkObjectEndActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_End() {
		return (EReference) readLinkObjectEndActionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction__result() {
		return (EReference) readLinkObjectEndQualifierActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference) readLinkObjectEndQualifierActionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference) readLinkObjectEndQualifierActionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction__result() {
		return (EReference) createLinkObjectActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference) acceptEventActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction__result() {
		return (EReference) acceptEventActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
		return (EAttribute) acceptEventActionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference) acceptCallActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
		return (EReference) replyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
		return (EReference) replyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyToCall() {
		return (EReference) replyActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallAction() {
		return unmarshallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction__result() {
		return (EReference) unmarshallActionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_UnmarshallType() {
		return (EReference) unmarshallActionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Object() {
		return (EReference) unmarshallActionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference) reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_IsOrdered() {
		return (EAttribute) reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction__result() {
		return (EReference) reduceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
		return (EReference) reduceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference) startObjectBehaviorActionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinNode_JoinSpec() {
		return (EReference) joinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinNode_IsCombineDuplicate() {
		return (EAttribute) joinNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNode() {
		return dataStoreNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode__result() {
		return (EReference) conditionalNodeEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsAssured() {
		return (EAttribute) conditionalNodeEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsDeterminate() {
		return (EAttribute) conditionalNodeEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Clause() {
		return (EReference) conditionalNodeEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Body() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Test() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_SuccessorClause() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_BodyOutput() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_PredecessorClause() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Decider() {
		return (EReference) clauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode__result() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariable() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyPart() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Test() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_IsTestedFirst() {
		return (EAttribute) loopNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyOutput() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_SetupPart() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Decider() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariableInput() {
		return (EReference) loopNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsInput() {
		return (EReference) expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference) expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_InputElement() {
		return (EReference) expansionRegionEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_OutputElement() {
		return (EReference) expansionRegionEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute) expansionRegionEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransition() {
		return protocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PreCondition() {
		return (EReference) protocolTransitionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PostCondition() {
		return (EReference) protocolTransitionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLauncher() {
		return launcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterEffectKind() {
		return parameterEffectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyKind() {
		return callConcurrencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudostateKind() {
		return pseudostateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperatorKind() {
		return interactionOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactory getUmlFactory() {
		return (UmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PROFILE_APPLICATION);
		createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);
		createEReference(packageEClass, PACKAGE__PACKAGE_MERGE);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGION);
		createEReference(stateMachineEClass,
				STATE_MACHINE__EXTENDED_STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__SUBMACHINE_STATE);
		createEReference(stateMachineEClass, STATE_MACHINE__OUTPUT);
		createEReference(stateMachineEClass, STATE_MACHINE__CONNECTION_POINT);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__SUBVERTEX);
		createEReference(regionEClass, REGION__STATE_MACHINE);
		createEReference(regionEClass, REGION__OUT_MODEL);
		createEReference(regionEClass, REGION__STATE);
		createEReference(regionEClass, REGION__TRANSITION);
		createEReference(regionEClass, REGION__EXTENDED_REGION);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__CONTAINER);
		createEReference(vertexEClass, VERTEX__OUT_MODEL);
		createEReference(vertexEClass, VERTEX__OUTPUT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__EFFECT);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__CONTAINER);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__REDEFINED_TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__KIND);
		createEReference(transitionEClass, TRANSITION__FSM_TRANSITION);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);

		relationshipEClass = createEClass(RELATIONSHIP);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);

		elementImportEClass = createEClass(ELEMENT_IMPORT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEReference(elementImportEClass,
				ELEMENT_IMPORT__IMPORTING_NAMESPACE);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
		createEReference(packageImportEClass,
				PACKAGE_IMPORT__IMPORTING_NAMESPACE);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
		createEReference(constraintEClass, CONSTRAINT__CONTEXT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENT);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeEClass = createEClass(TYPE);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_OWNED_END);
		createEReference(associationEClass, ASSOCIATION__OWNED_END);
		createEReference(associationEClass, ASSOCIATION__MEMBER_END);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__POWERTYPE_EXTENT);
		createEReference(classifierEClass, CLASSIFIER__SUBSTITUTION);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEReference(classifierEClass, CLASSIFIER__USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__REPRESENTATION);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__OWNED_USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__COLLABORATION_USE);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);

		templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
		createEReference(templateableElementEClass,
				TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
		createEReference(templateableElementEClass,
				TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);

		templateBindingEClass = createEClass(TEMPLATE_BINDING);
		createEReference(templateBindingEClass,
				TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);

		templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PARAMETER);
		createEReference(templateSignatureEClass,
				TEMPLATE_SIGNATURE__OWNED_PARAMETER);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
		createEReference(templateParameterEClass,
				TEMPLATE_PARAMETER__OWNED_DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__DEFAULT);
		createEReference(templateParameterEClass,
				TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass,
				TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);

		parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
		createEReference(parameterableElementEClass,
				PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
		createEReference(parameterableElementEClass,
				PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);

		templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
		createEReference(templateParameterSubstitutionEClass,
				TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		createEReference(templateParameterSubstitutionEClass,
				TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		createEReference(templateParameterSubstitutionEClass,
				TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		createEReference(templateParameterSubstitutionEClass,
				TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass,
				GENERALIZATION__GENERALIZATION_SET);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass,
				GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass,
				GENERALIZATION_SET__GENERALIZATION);
		createEAttribute(generalizationSetEClass,
				GENERALIZATION_SET__IS_COVERING);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);

		substitutionEClass = createEClass(SUBSTITUTION);
		createEReference(substitutionEClass,
				SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		createEReference(substitutionEClass, SUBSTITUTION__CONTRACT);

		realizationEClass = createEClass(REALIZATION);

		abstractionEClass = createEClass(ABSTRACTION);
		createEReference(abstractionEClass, ABSTRACTION__MAPPING);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);
		createEAttribute(parameterEClass, PARAMETER__EFFECT);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__IS_STREAM);
		createEReference(parameterEClass, PARAMETER__PARAMETER_SET);
		createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEAttribute(parameterEClass, PARAMETER__IS_EXCEPTION);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEReference(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__LOWER_VALUE);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEReference(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__UPPER_VALUE);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_UNIQUE);

		connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);

		connectorEndEClass = createEClass(CONNECTOR_END);
		createEReference(connectorEndEClass, CONNECTOR_END__PART_WITH_PORT);
		createEReference(connectorEndEClass, CONNECTOR_END__ROLE);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__SUBSETTED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__CLASS);
		createEReference(propertyEClass, PROPERTY__QUALIFIER);
		createEReference(propertyEClass, PROPERTY__OWNING_ASSOCIATION);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION);
		createEReference(propertyEClass, PROPERTY__DATATYPE);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION_END);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED_UNION);

		deploymentTargetEClass = createEClass(DEPLOYMENT_TARGET);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYMENT);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__LOCATION);
		createEReference(deploymentEClass, DEPLOYMENT__DEPLOYED_ARTIFACT);
		createEReference(deploymentEClass, DEPLOYMENT__CONFIGURATION);

		deployedArtifactEClass = createEClass(DEPLOYED_ARTIFACT);

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEAttribute(deploymentSpecificationEClass,
				DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION);
		createEAttribute(deploymentSpecificationEClass,
				DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION);
		createEReference(deploymentSpecificationEClass,
				DEPLOYMENT_SPECIFICATION__DEPLOYMENT);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__OWNED_OPERATION);
		createEReference(artifactEClass, ARTIFACT__NESTED_ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__FILE_NAME);
		createEReference(artifactEClass, ARTIFACT__OWNED_ATTRIBUTE);
		createEReference(artifactEClass, ARTIFACT__MANIFESTATION);

		manifestationEClass = createEClass(MANIFESTATION);
		createEReference(manifestationEClass, MANIFESTATION__UTILIZED_ELEMENT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__BODY_CONDITION);
		createEReference(operationEClass, OPERATION__CLASS);
		createEReference(operationEClass, OPERATION__INTERFACE);
		createEAttribute(operationEClass, OPERATION__IS_QUERY);
		createEReference(operationEClass, OPERATION__POSTCONDITION);
		createEReference(operationEClass, OPERATION__PRECONDITION);
		createEReference(operationEClass, OPERATION__REDEFINED_OPERATION);
		createEReference(operationEClass, OPERATION__DATATYPE);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
		createEAttribute(behavioralFeatureEClass,
				BEHAVIORAL_FEATURE__IS_ABSTRACT);
		createEReference(behavioralFeatureEClass,
				BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		createEReference(behavioralFeatureEClass,
				BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		createEReference(behavioralFeatureEClass,
				BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		createEAttribute(behavioralFeatureEClass,
				BEHAVIORAL_FEATURE__CONCURRENCY);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__METHOD);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__POSTCONDITION);
		createEReference(behaviorEClass, BEHAVIOR__PRECONDITION);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_REENTRANT);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__REDEFINED_BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER_SET);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEAttribute(classEClass, CLASS__IS_ACTIVE);
		createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
		createEReference(classEClass, CLASS__OWNED_RECEPTION);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass,
				BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
		createEReference(behavioredClassifierEClass,
				BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		createEReference(behavioredClassifierEClass,
				BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR);
		createEReference(behavioredClassifierEClass,
				BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);

		interfaceRealizationEClass = createEClass(INTERFACE_REALIZATION);
		createEReference(interfaceRealizationEClass,
				INTERFACE_REALIZATION__CONTRACT);
		createEReference(interfaceRealizationEClass,
				INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_OPERATION);
		createEReference(interfaceEClass, INTERFACE__PROTOCOL);
		createEReference(interfaceEClass, INTERFACE__NESTED_CLASSIFIER);
		createEReference(interfaceEClass, INTERFACE__REDEFINED_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_RECEPTION);
		createEReference(interfaceEClass, INTERFACE__OWNED_ATTRIBUTE);

		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__SIGNAL);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__OWNED_ATTRIBUTE);

		protocolStateMachineEClass = createEClass(PROTOCOL_STATE_MACHINE);
		createEReference(protocolStateMachineEClass,
				PROTOCOL_STATE_MACHINE__CONFORMANCE);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__PORT);
		createEReference(triggerEClass, TRIGGER__EVENT);

		eventEClass = createEClass(EVENT);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__PROTOCOL);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEReference(portEClass, PORT__REDEFINED_PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__REGION);
		createEReference(stateEClass, STATE__STATE_INVARIANT);
		createEReference(stateEClass, STATE__REDEFINED_STATE);
		createEReference(stateEClass, STATE__CONNECTION);
		createEReference(stateEClass, STATE__SUBMACHINE);
		createEReference(stateEClass, STATE__EXIT);
		createEReference(stateEClass, STATE__CONNECTION_POINT);
		createEReference(stateEClass, STATE__DEFERRABLE_TRIGGER);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__DO_ACTIVITY);

		connectionPointReferenceEClass = createEClass(CONNECTION_POINT_REFERENCE);
		createEReference(connectionPointReferenceEClass,
				CONNECTION_POINT_REFERENCE__ENTRY);
		createEReference(connectionPointReferenceEClass,
				CONNECTION_POINT_REFERENCE__STATE);
		createEReference(connectionPointReferenceEClass,
				CONNECTION_POINT_REFERENCE__EXIT);

		pseudostateEClass = createEClass(PSEUDOSTATE);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE_MACHINE);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE);
		createEAttribute(pseudostateEClass, PSEUDOSTATE__KIND);

		protocolConformanceEClass = createEClass(PROTOCOL_CONFORMANCE);
		createEReference(protocolConformanceEClass,
				PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		createEReference(protocolConformanceEClass,
				PROTOCOL_CONFORMANCE__GENERAL_MACHINE);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);

		structuredClassifierEClass = createEClass(STRUCTURED_CLASSIFIER);
		createEReference(structuredClassifierEClass,
				STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		createEReference(structuredClassifierEClass,
				STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONTRACT);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__REDEFINED_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__END);
		createEAttribute(connectorEClass, CONNECTOR__KIND);

		extensionEClass = createEClass(EXTENSION);

		extensionEndEClass = createEClass(EXTENSION_END);

		stereotypeEClass = createEClass(STEREOTYPE);
		createEReference(stereotypeEClass, STEREOTYPE__ICON);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__CONTENT);
		createEAttribute(imageEClass, IMAGE__LOCATION);
		createEAttribute(imageEClass, IMAGE__FORMAT);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__METAMODEL_REFERENCE);
		createEReference(profileEClass, PROFILE__METACLASS_REFERENCE);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETER);
		createEReference(parameterSetEClass, PARAMETER_SET__CONDITION);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_OPERATION);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_ATTRIBUTE);

		operationTemplateParameterEClass = createEClass(OPERATION_TEMPLATE_PARAMETER);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass,
				STRUCTURAL_FEATURE__IS_READ_ONLY);

		connectableElementTemplateParameterEClass = createEClass(CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass,
				COLLABORATION_USE__ROLE_BINDING);
		createEReference(collaborationUseEClass, COLLABORATION_USE__TYPE);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__EXTENSION_POINT);
		createEReference(useCaseEClass, USE_CASE__EXTEND);
		createEReference(useCaseEClass, USE_CASE__SUBJECT);
		createEReference(useCaseEClass, USE_CASE__INCLUDE);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__INCLUDING_CASE);
		createEReference(includeEClass, INCLUDE__ADDITION);

		extendEClass = createEClass(EXTEND);
		createEReference(extendEClass, EXTEND__EXTENSION);
		createEReference(extendEClass, EXTEND__EXTENDED_CASE);
		createEReference(extendEClass, EXTEND__CONDITION);
		createEReference(extendEClass, EXTEND__EXTENSION_LOCATION);

		extensionPointEClass = createEClass(EXTENSION_POINT);
		createEReference(extensionPointEClass, EXTENSION_POINT__USE_CASE);

		redefinableTemplateSignatureEClass = createEClass(REDEFINABLE_TEMPLATE_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass,
				REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass,
				REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER);

		classifierTemplateParameterEClass = createEClass(CLASSIFIER_TEMPLATE_PARAMETER);
		createEReference(classifierTemplateParameterEClass,
				CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
		createEAttribute(classifierTemplateParameterEClass,
				CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass,
				STRING_EXPRESSION__SUB_EXPRESSION);
		createEReference(stringExpressionEClass,
				STRING_EXPRESSION__OWNING_EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);
		createEReference(expressionEClass, EXPRESSION__OPERAND);

		usageEClass = createEClass(USAGE);

		packageMergeEClass = createEClass(PACKAGE_MERGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGED_PACKAGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__RECEIVING_PACKAGE);

		profileApplicationEClass = createEClass(PROFILE_APPLICATION);
		createEAttribute(profileApplicationEClass,
				PROFILE_APPLICATION__IS_STRICT);
		createEReference(profileApplicationEClass,
				PROFILE_APPLICATION__APPLIED_PROFILE);
		createEReference(profileApplicationEClass,
				PROFILE_APPLICATION__APPLYING_PACKAGE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass,
				ENUMERATION_LITERAL__ENUMERATION);

		instanceSpecificationEClass = createEClass(INSTANCE_SPECIFICATION);
		createEReference(instanceSpecificationEClass,
				INSTANCE_SPECIFICATION__SPECIFICATION);
		createEReference(instanceSpecificationEClass,
				INSTANCE_SPECIFICATION__CLASSIFIER);
		createEReference(instanceSpecificationEClass,
				INSTANCE_SPECIFICATION__SLOT);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__DEFINING_FEATURE);
		createEReference(slotEClass, SLOT__VALUE);
		createEReference(slotEClass, SLOT__OWNING_INSTANCE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalNullEClass = createEClass(LITERAL_NULL);

		instanceValueEClass = createEClass(INSTANCE_VALUE);
		createEReference(instanceValueEClass, INSTANCE_VALUE__INSTANCE);

		literalUnlimitedNaturalEClass = createEClass(LITERAL_UNLIMITED_NATURAL);
		createEAttribute(literalUnlimitedNaturalEClass,
				LITERAL_UNLIMITED_NATURAL__VALUE);

		opaqueBehaviorEClass = createEClass(OPAQUE_BEHAVIOR);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__BODY);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__LANGUAGE);

		functionBehaviorEClass = createEClass(FUNCTION_BEHAVIOR);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__BODY);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__OUTPUT_VALUE);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__INPUT_VALUE);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__LANGUAGE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__LOCAL_POSTCONDITION);
		createEReference(actionEClass, ACTION__LOCAL_PRECONDITION);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);
		createEReference(executableNodeEClass, EXECUTABLE_NODE__HANDLER);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__REDEFINED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_PARTITION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_STRUCTURED_NODE);
		createEReference(activityNodeEClass,
				ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
		createEAttribute(structuredActivityNodeEClass,
				STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE);
		createEReference(structuredActivityNodeEClass,
				STRUCTURED_ACTIVITY_NODE__NODE);
		createEReference(structuredActivityNodeEClass,
				STRUCTURED_ACTIVITY_NODE__EDGE);
		createEReference(structuredActivityNodeEClass,
				STRUCTURED_ACTIVITY_NODE__VARIABLE);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__IN_ACTIVITY);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NODE);
		createEReference(activityEClass, ACTIVITY__EDGE);
		createEReference(activityEClass, ACTIVITY__PARTITION);
		createEAttribute(activityEClass, ACTIVITY__IS_READ_ONLY);
		createEReference(activityEClass, ACTIVITY__GROUP);
		createEAttribute(activityEClass, ACTIVITY__IS_SINGLE_EXECUTION);
		createEReference(activityEClass, ACTIVITY__VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__SCOPE);
		createEReference(variableEClass, VARIABLE__ACTIVITY_SCOPE);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__INTERRUPTS);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_PARTITION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__REDEFINED_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__ACTIVITY);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEAttribute(activityPartitionEClass,
				ACTIVITY_PARTITION__IS_DIMENSION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__NODE);
		createEReference(activityPartitionEClass,
				ACTIVITY_PARTITION__REPRESENTS);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__EDGE);
		createEReference(activityPartitionEClass,
				ACTIVITY_PARTITION__SUBPARTITION);
		createEAttribute(activityPartitionEClass,
				ACTIVITY_PARTITION__IS_EXTERNAL);
		createEReference(activityPartitionEClass,
				ACTIVITY_PARTITION__SUPER_PARTITION);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass,
				INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		createEReference(interruptibleActivityRegionEClass,
				INTERRUPTIBLE_ACTIVITY_REGION__NODE);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass,
				EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass,
				EXCEPTION_HANDLER__EXCEPTION_TYPE);
		createEReference(exceptionHandlerEClass,
				EXCEPTION_HANDLER__PROTECTED_NODE);
		createEReference(exceptionHandlerEClass,
				EXCEPTION_HANDLER__EXCEPTION_INPUT);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEReference(objectNodeEClass, OBJECT_NODE__IN_STATE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__IS_CONTROL_TYPE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDERING);
		createEReference(objectNodeEClass, OBJECT_NODE__UPPER_BOUND);
		createEReference(objectNodeEClass, OBJECT_NODE__SELECTION);

		outputPinEClass = createEClass(OUTPUT_PIN);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__IS_CONTROL);

		inputPinEClass = createEClass(INPUT_PIN);

		callActionEClass = createEClass(CALL_ACTION);
		createEAttribute(callActionEClass, CALL_ACTION__IS_SYNCHRONOUS);
		createEReference(callActionEClass, CALL_ACTION__RESULT);

		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ARGUMENT);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ON_PORT);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__TARGET);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
		createEReference(callOperationActionEClass,
				CALL_OPERATION_ACTION__OPERATION);
		createEReference(callOperationActionEClass,
				CALL_OPERATION_ACTION__TARGET);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass,
				CALL_BEHAVIOR_ACTION__BEHAVIOR);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);
		createEReference(sequenceNodeEClass, SEQUENCE_NODE__EXECUTABLE_NODE);

		controlNodeEClass = createEClass(CONTROL_NODE);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		initialNodeEClass = createEClass(INITIAL_NODE);

		activityParameterNodeEClass = createEClass(ACTIVITY_PARAMETER_NODE);
		createEReference(activityParameterNodeEClass,
				ACTIVITY_PARAMETER_NODE__PARAMETER);

		valuePinEClass = createEClass(VALUE_PIN);
		createEReference(valuePinEClass, VALUE_PIN__VALUE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__ARGUMENT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__CONNECTOR);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__MESSAGE);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__MESSAGE);
		createEReference(interactionEClass, INTERACTION__LIFELINE);
		createEReference(interactionEClass, INTERACTION__ACTION);
		createEReference(interactionEClass, INTERACTION__FRAGMENT);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATE);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass,
				INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		createEReference(interactionFragmentEClass,
				INTERACTION_FRAGMENT__GENERAL_ORDERING);
		createEReference(interactionFragmentEClass,
				INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		createEReference(interactionFragmentEClass,
				INTERACTION_FRAGMENT__COVERED);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__SELECTOR);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);
		createEReference(lifelineEClass, LIFELINE__INTERACTION);
		createEReference(lifelineEClass, LIFELINE__DECOMPOSED_AS);

		partDecompositionEClass = createEClass(PART_DECOMPOSITION);

		interactionUseEClass = createEClass(INTERACTION_USE);
		createEReference(interactionUseEClass, INTERACTION_USE__ARGUMENT);
		createEReference(interactionUseEClass, INTERACTION_USE__REFERS_TO);
		createEReference(interactionUseEClass, INTERACTION_USE__ACTUAL_GATE);

		gateEClass = createEClass(GATE);

		generalOrderingEClass = createEClass(GENERAL_ORDERING);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__AFTER);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__BEFORE);

		occurrenceSpecificationEClass = createEClass(OCCURRENCE_SPECIFICATION);
		createEReference(occurrenceSpecificationEClass,
				OCCURRENCE_SPECIFICATION__TO_AFTER);
		createEReference(occurrenceSpecificationEClass,
				OCCURRENCE_SPECIFICATION__EVENT);
		createEReference(occurrenceSpecificationEClass,
				OCCURRENCE_SPECIFICATION__TO_BEFORE);

		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__GUARD);
		createEReference(interactionOperandEClass,
				INTERACTION_OPERAND__FRAGMENT);

		interactionConstraintEClass = createEClass(INTERACTION_CONSTRAINT);
		createEReference(interactionConstraintEClass,
				INTERACTION_CONSTRAINT__MAXINT);
		createEReference(interactionConstraintEClass,
				INTERACTION_CONSTRAINT__MININT);

		executionSpecificationEClass = createEClass(EXECUTION_SPECIFICATION);
		createEReference(executionSpecificationEClass,
				EXECUTION_SPECIFICATION__FINISH);
		createEReference(executionSpecificationEClass,
				EXECUTION_SPECIFICATION__START);

		stateInvariantEClass = createEClass(STATE_INVARIANT);
		createEReference(stateInvariantEClass, STATE_INVARIANT__INVARIANT);

		actionExecutionSpecificationEClass = createEClass(ACTION_EXECUTION_SPECIFICATION);
		createEReference(actionExecutionSpecificationEClass,
				ACTION_EXECUTION_SPECIFICATION__ACTION);

		behaviorExecutionSpecificationEClass = createEClass(BEHAVIOR_EXECUTION_SPECIFICATION);
		createEReference(behaviorExecutionSpecificationEClass,
				BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR);

		executionEventEClass = createEClass(EXECUTION_EVENT);

		creationEventEClass = createEClass(CREATION_EVENT);

		destructionEventEClass = createEClass(DESTRUCTION_EVENT);

		sendOperationEventEClass = createEClass(SEND_OPERATION_EVENT);
		createEReference(sendOperationEventEClass,
				SEND_OPERATION_EVENT__OPERATION);

		messageEventEClass = createEClass(MESSAGE_EVENT);

		sendSignalEventEClass = createEClass(SEND_SIGNAL_EVENT);
		createEReference(sendSignalEventEClass, SEND_SIGNAL_EVENT__SIGNAL);

		messageOccurrenceSpecificationEClass = createEClass(MESSAGE_OCCURRENCE_SPECIFICATION);

		executionOccurrenceSpecificationEClass = createEClass(EXECUTION_OCCURRENCE_SPECIFICATION);
		createEReference(executionOccurrenceSpecificationEClass,
				EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION);

		receiveOperationEventEClass = createEClass(RECEIVE_OPERATION_EVENT);
		createEReference(receiveOperationEventEClass,
				RECEIVE_OPERATION_EVENT__OPERATION);

		receiveSignalEventEClass = createEClass(RECEIVE_SIGNAL_EVENT);
		createEReference(receiveSignalEventEClass, RECEIVE_SIGNAL_EVENT__SIGNAL);

		actorEClass = createEClass(ACTOR);

		callEventEClass = createEClass(CALL_EVENT);
		createEReference(callEventEClass, CALL_EVENT__OPERATION);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEReference(changeEventEClass, CHANGE_EVENT__CHANGE_EXPRESSION);

		signalEventEClass = createEClass(SIGNAL_EVENT);
		createEReference(signalEventEClass, SIGNAL_EVENT__SIGNAL);

		anyReceiveEventEClass = createEClass(ANY_RECEIVE_EVENT);

		forkNodeEClass = createEClass(FORK_NODE);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		centralBufferNodeEClass = createEClass(CENTRAL_BUFFER_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT_FLOW);

		objectFlowEClass = createEClass(OBJECT_FLOW);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTICAST);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTIRECEIVE);
		createEReference(objectFlowEClass, OBJECT_FLOW__SELECTION);
		createEReference(objectFlowEClass, OBJECT_FLOW__TRANSFORMATION);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		componentRealizationEClass = createEClass(COMPONENT_REALIZATION);
		createEReference(componentRealizationEClass,
				COMPONENT_REALIZATION__ABSTRACTION);
		createEReference(componentRealizationEClass,
				COMPONENT_REALIZATION__REALIZING_CLASSIFIER);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PACKAGED_ELEMENT);
		createEAttribute(componentEClass, COMPONENT__IS_INDIRECTLY_INSTANTIATED);
		createEReference(componentEClass, COMPONENT__REALIZATION);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NESTED_NODE);

		communicationPathEClass = createEClass(COMMUNICATION_PATH);

		deviceEClass = createEClass(DEVICE);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEReference(combinedFragmentEClass,
				COMBINED_FRAGMENT__CFRAGMENT_GATE);
		createEAttribute(combinedFragmentEClass,
				COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERAND);

		continuationEClass = createEClass(CONTINUATION);
		createEAttribute(continuationEClass, CONTINUATION__SETTING);

		considerIgnoreFragmentEClass = createEClass(CONSIDER_IGNORE_FRAGMENT);
		createEReference(considerIgnoreFragmentEClass,
				CONSIDER_IGNORE_FRAGMENT__MESSAGE);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);
		createEReference(createObjectActionEClass,
				CREATE_OBJECT_ACTION__CLASSIFIER);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEAttribute(destroyObjectActionEClass,
				DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS);
		createEReference(destroyObjectActionEClass,
				DESTROY_OBJECT_ACTION__TARGET);
		createEAttribute(destroyObjectActionEClass,
				DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);

		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass,
				STRUCTURAL_FEATURE_ACTION__OBJECT);
		createEReference(structuralFeatureActionEClass,
				STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass,
				READ_STRUCTURAL_FEATURE_ACTION__RESULT);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass,
				WRITE_STRUCTURAL_FEATURE_ACTION__RESULT);
		createEReference(writeStructuralFeatureActionEClass,
				WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);
		createEReference(clearStructuralFeatureActionEClass,
				CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(removeStructuralFeatureValueActionEClass,
				REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);
		createEAttribute(removeStructuralFeatureValueActionEClass,
				REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(addStructuralFeatureValueActionEClass,
				ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addStructuralFeatureValueActionEClass,
				ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);
		createEReference(linkActionEClass, LINK_ACTION__INPUT_VALUE);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEReference(linkEndDataEClass, LINK_END_DATA__QUALIFIER);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);

		qualifierValueEClass = createEClass(QUALIFIER_VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__QUALIFIER);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEReference(linkEndCreationDataEClass,
				LINK_END_CREATION_DATA__INSERT_AT);
		createEAttribute(linkEndCreationDataEClass,
				LINK_END_CREATION_DATA__IS_REPLACE_ALL);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		linkEndDestructionDataEClass = createEClass(LINK_END_DESTRUCTION_DATA);
		createEAttribute(linkEndDestructionDataEClass,
				LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES);
		createEReference(linkEndDestructionDataEClass,
				LINK_END_DESTRUCTION_DATA__DESTROY_AT);

		clearAssociationActionEClass = createEClass(CLEAR_ASSOCIATION_ACTION);
		createEReference(clearAssociationActionEClass,
				CLEAR_ASSOCIATION_ACTION__ASSOCIATION);
		createEReference(clearAssociationActionEClass,
				CLEAR_ASSOCIATION_ACTION__OBJECT);

		broadcastSignalActionEClass = createEClass(BROADCAST_SIGNAL_ACTION);
		createEReference(broadcastSignalActionEClass,
				BROADCAST_SIGNAL_ACTION__SIGNAL);

		sendObjectActionEClass = createEClass(SEND_OBJECT_ACTION);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__REQUEST);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__TARGET);

		valueSpecificationActionEClass = createEClass(VALUE_SPECIFICATION_ACTION);
		createEReference(valueSpecificationActionEClass,
				VALUE_SPECIFICATION_ACTION__RESULT);
		createEReference(valueSpecificationActionEClass,
				VALUE_SPECIFICATION_ACTION__VALUE);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__OBSERVATION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EXPR);

		observationEClass = createEClass(OBSERVATION);

		durationEClass = createEClass(DURATION);
		createEReference(durationEClass, DURATION__OBSERVATION);
		createEReference(durationEClass, DURATION__EXPR);

		durationIntervalEClass = createEClass(DURATION_INTERVAL);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MIN);
		createEReference(intervalEClass, INTERVAL__MAX);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);
		createEAttribute(timeConstraintEClass, TIME_CONSTRAINT__FIRST_EVENT);

		intervalConstraintEClass = createEClass(INTERVAL_CONSTRAINT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);

		durationConstraintEClass = createEClass(DURATION_CONSTRAINT);
		createEAttribute(durationConstraintEClass,
				DURATION_CONSTRAINT__FIRST_EVENT);

		timeObservationEClass = createEClass(TIME_OBSERVATION);
		createEAttribute(timeObservationEClass, TIME_OBSERVATION__FIRST_EVENT);
		createEReference(timeObservationEClass, TIME_OBSERVATION__EVENT);

		durationObservationEClass = createEClass(DURATION_OBSERVATION);
		createEAttribute(durationObservationEClass,
				DURATION_OBSERVATION__FIRST_EVENT);
		createEReference(durationObservationEClass, DURATION_OBSERVATION__EVENT);

		finalStateEClass = createEClass(FINAL_STATE);

		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__IS_RELATIVE);
		createEReference(timeEventEClass, TIME_EVENT__WHEN);

		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEReference(variableActionEClass, VARIABLE_ACTION__VARIABLE);

		readVariableActionEClass = createEClass(READ_VARIABLE_ACTION);
		createEReference(readVariableActionEClass, READ_VARIABLE_ACTION__RESULT);

		writeVariableActionEClass = createEClass(WRITE_VARIABLE_ACTION);
		createEReference(writeVariableActionEClass,
				WRITE_VARIABLE_ACTION__VALUE);

		clearVariableActionEClass = createEClass(CLEAR_VARIABLE_ACTION);

		addVariableValueActionEClass = createEClass(ADD_VARIABLE_VALUE_ACTION);
		createEReference(addVariableValueActionEClass,
				ADD_VARIABLE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addVariableValueActionEClass,
				ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL);

		removeVariableValueActionEClass = createEClass(REMOVE_VARIABLE_VALUE_ACTION);
		createEReference(removeVariableValueActionEClass,
				REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);
		createEAttribute(removeVariableValueActionEClass,
				REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass,
				RAISE_EXCEPTION_ACTION__EXCEPTION);

		actionInputPinEClass = createEClass(ACTION_INPUT_PIN);
		createEReference(actionInputPinEClass, ACTION_INPUT_PIN__FROM_ACTION);

		informationItemEClass = createEClass(INFORMATION_ITEM);
		createEReference(informationItemEClass, INFORMATION_ITEM__REPRESENTED);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass,
				INFORMATION_FLOW__REALIZING_MESSAGE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__CONVEYED);
		createEReference(informationFlowEClass,
				INFORMATION_FLOW__INFORMATION_SOURCE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZATION);
		createEReference(informationFlowEClass,
				INFORMATION_FLOW__REALIZING_CONNECTOR);
		createEReference(informationFlowEClass,
				INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		createEReference(informationFlowEClass,
				INFORMATION_FLOW__INFORMATION_TARGET);

		readExtentActionEClass = createEClass(READ_EXTENT_ACTION);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__RESULT);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__CLASSIFIER);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEReference(reclassifyObjectActionEClass,
				RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass,
				RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass,
				RECLASSIFY_OBJECT_ACTION__OBJECT);
		createEAttribute(reclassifyObjectActionEClass,
				RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL);

		readIsClassifiedObjectActionEClass = createEClass(READ_IS_CLASSIFIED_OBJECT_ACTION);
		createEReference(readIsClassifiedObjectActionEClass,
				READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);
		createEAttribute(readIsClassifiedObjectActionEClass,
				READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT);
		createEReference(readIsClassifiedObjectActionEClass,
				READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER);
		createEReference(readIsClassifiedObjectActionEClass,
				READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);

		startClassifierBehaviorActionEClass = createEClass(START_CLASSIFIER_BEHAVIOR_ACTION);
		createEReference(startClassifierBehaviorActionEClass,
				START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT);

		readLinkObjectEndActionEClass = createEClass(READ_LINK_OBJECT_END_ACTION);
		createEReference(readLinkObjectEndActionEClass,
				READ_LINK_OBJECT_END_ACTION__RESULT);
		createEReference(readLinkObjectEndActionEClass,
				READ_LINK_OBJECT_END_ACTION__OBJECT);
		createEReference(readLinkObjectEndActionEClass,
				READ_LINK_OBJECT_END_ACTION__END);

		readLinkObjectEndQualifierActionEClass = createEClass(READ_LINK_OBJECT_END_QUALIFIER_ACTION);
		createEReference(readLinkObjectEndQualifierActionEClass,
				READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
		createEReference(readLinkObjectEndQualifierActionEClass,
				READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);
		createEReference(readLinkObjectEndQualifierActionEClass,
				READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);

		createLinkObjectActionEClass = createEClass(CREATE_LINK_OBJECT_ACTION);
		createEReference(createLinkObjectActionEClass,
				CREATE_LINK_OBJECT_ACTION__RESULT);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);
		createEAttribute(acceptEventActionEClass,
				ACCEPT_EVENT_ACTION__IS_UNMARSHALL);

		acceptCallActionEClass = createEClass(ACCEPT_CALL_ACTION);
		createEReference(acceptCallActionEClass,
				ACCEPT_CALL_ACTION__RETURN_INFORMATION);

		replyActionEClass = createEClass(REPLY_ACTION);
		createEReference(replyActionEClass, REPLY_ACTION__RETURN_INFORMATION);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_VALUE);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_TO_CALL);

		unmarshallActionEClass = createEClass(UNMARSHALL_ACTION);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__RESULT);
		createEReference(unmarshallActionEClass,
				UNMARSHALL_ACTION__UNMARSHALL_TYPE);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__OBJECT);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
		createEAttribute(reduceActionEClass, REDUCE_ACTION__IS_ORDERED);
		createEReference(reduceActionEClass, REDUCE_ACTION__RESULT);
		createEReference(reduceActionEClass, REDUCE_ACTION__COLLECTION);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);
		createEReference(startObjectBehaviorActionEClass,
				START_OBJECT_BEHAVIOR_ACTION__OBJECT);

		joinNodeEClass = createEClass(JOIN_NODE);
		createEReference(joinNodeEClass, JOIN_NODE__JOIN_SPEC);
		createEAttribute(joinNodeEClass, JOIN_NODE__IS_COMBINE_DUPLICATE);

		dataStoreNodeEClass = createEClass(DATA_STORE_NODE);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__RESULT);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_ASSURED);
		createEAttribute(conditionalNodeEClass,
				CONDITIONAL_NODE__IS_DETERMINATE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__CLAUSE);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__BODY);
		createEReference(clauseEClass, CLAUSE__TEST);
		createEReference(clauseEClass, CLAUSE__SUCCESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__BODY_OUTPUT);
		createEReference(clauseEClass, CLAUSE__PREDECESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__DECIDER);

		loopNodeEClass = createEClass(LOOP_NODE);
		createEReference(loopNodeEClass, LOOP_NODE__RESULT);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_PART);
		createEReference(loopNodeEClass, LOOP_NODE__TEST);
		createEAttribute(loopNodeEClass, LOOP_NODE__IS_TESTED_FIRST);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_OUTPUT);
		createEReference(loopNodeEClass, LOOP_NODE__SETUP_PART);
		createEReference(loopNodeEClass, LOOP_NODE__DECIDER);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE_INPUT);

		expansionNodeEClass = createEClass(EXPANSION_NODE);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_INPUT);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_OUTPUT);

		expansionRegionEClass = createEClass(EXPANSION_REGION);
		createEReference(expansionRegionEClass, EXPANSION_REGION__INPUT_ELEMENT);
		createEReference(expansionRegionEClass,
				EXPANSION_REGION__OUTPUT_ELEMENT);
		createEAttribute(expansionRegionEClass, EXPANSION_REGION__MODE);

		protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
		createEReference(protocolTransitionEClass,
				PROTOCOL_TRANSITION__PRE_CONDITION);
		createEReference(protocolTransitionEClass,
				PROTOCOL_TRANSITION__POST_CONDITION);

		associationClassEClass = createEClass(ASSOCIATION_CLASS);

		launcherEClass = createEClass(LAUNCHER);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		parameterEffectKindEEnum = createEEnum(PARAMETER_EFFECT_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		callConcurrencyKindEEnum = createEEnum(CALL_CONCURRENCY_KIND);
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
		pseudostateKindEEnum = createEEnum(PSEUDOSTATE_KIND);
		connectorKindEEnum = createEEnum(CONNECTOR_KIND);
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		interactionOperatorKindEEnum = createEEnum(INTERACTION_OPERATOR_KIND);
		expansionKindEEnum = createEEnum(EXPANSION_KIND);

		// Create data types
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
		stringEDataType = createEDataType(STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ecore.EcorePackage theEcorePackage_1 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);
		FsmPackage theFsmPackage = (FsmPackage) EPackage.Registry.INSTANCE
				.getEPackage(FsmPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes()
				.add(theEcorePackage_1.getEModelElement());
		modelEClass.getESuperTypes().add(this.getPackage());
		packageEClass.getESuperTypes().add(this.getNamespace());
		packageEClass.getESuperTypes().add(this.getPackageableElement());
		packageEClass.getESuperTypes().add(this.getTemplateableElement());
		stateMachineEClass.getESuperTypes().add(this.getBehavior());
		regionEClass.getESuperTypes().add(this.getNamespace());
		regionEClass.getESuperTypes().add(this.getRedefinableElement());
		vertexEClass.getESuperTypes().add(this.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getNamespace());
		transitionEClass.getESuperTypes().add(this.getRedefinableElement());
		commentEClass.getESuperTypes().add(this.getElement());
		packageableElementEClass.getESuperTypes().add(this.getNamedElement());
		packageableElementEClass.getESuperTypes().add(
				this.getParameterableElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		dependencyEClass.getESuperTypes().add(this.getPackageableElement());
		dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		elementImportEClass.getESuperTypes()
				.add(this.getDirectedRelationship());
		packageImportEClass.getESuperTypes()
				.add(this.getDirectedRelationship());
		constraintEClass.getESuperTypes().add(this.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(
				this.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getPackageableElement());
		associationEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getRelationship());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		classifierEClass.getESuperTypes().add(this.getType());
		classifierEClass.getESuperTypes().add(this.getTemplateableElement());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		templateableElementEClass.getESuperTypes().add(this.getElement());
		templateBindingEClass.getESuperTypes().add(
				this.getDirectedRelationship());
		templateSignatureEClass.getESuperTypes().add(this.getElement());
		templateParameterEClass.getESuperTypes().add(this.getElement());
		parameterableElementEClass.getESuperTypes().add(this.getElement());
		templateParameterSubstitutionEClass.getESuperTypes().add(
				this.getElement());
		generalizationEClass.getESuperTypes().add(
				this.getDirectedRelationship());
		generalizationSetEClass.getESuperTypes().add(
				this.getPackageableElement());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		substitutionEClass.getESuperTypes().add(this.getRealization());
		realizationEClass.getESuperTypes().add(this.getAbstraction());
		abstractionEClass.getESuperTypes().add(this.getDependency());
		opaqueExpressionEClass.getESuperTypes().add(
				this.getValueSpecification());
		parameterEClass.getESuperTypes().add(this.getConnectableElement());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		connectableElementEClass.getESuperTypes().add(this.getTypedElement());
		connectableElementEClass.getESuperTypes().add(
				this.getParameterableElement());
		connectorEndEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		propertyEClass.getESuperTypes().add(this.getConnectableElement());
		propertyEClass.getESuperTypes().add(this.getDeploymentTarget());
		deploymentTargetEClass.getESuperTypes().add(this.getNamedElement());
		deploymentEClass.getESuperTypes().add(this.getDependency());
		deployedArtifactEClass.getESuperTypes().add(this.getNamedElement());
		deploymentSpecificationEClass.getESuperTypes().add(this.getArtifact());
		artifactEClass.getESuperTypes().add(this.getClassifier());
		artifactEClass.getESuperTypes().add(this.getDeployedArtifact());
		manifestationEClass.getESuperTypes().add(this.getAbstraction());
		operationEClass.getESuperTypes().add(this.getBehavioralFeature());
		operationEClass.getESuperTypes().add(this.getParameterableElement());
		operationEClass.getESuperTypes().add(this.getTemplateableElement());
		behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
		behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
		behaviorEClass.getESuperTypes().add(this.getClass_());
		classEClass.getESuperTypes().add(this.getEncapsulatedClassifier());
		classEClass.getESuperTypes().add(this.getBehavioredClassifier());
		behavioredClassifierEClass.getESuperTypes().add(this.getClassifier());
		interfaceRealizationEClass.getESuperTypes().add(this.getRealization());
		interfaceEClass.getESuperTypes().add(this.getClassifier());
		receptionEClass.getESuperTypes().add(this.getBehavioralFeature());
		signalEClass.getESuperTypes().add(this.getClassifier());
		protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getPackageableElement());
		portEClass.getESuperTypes().add(this.getProperty());
		stateEClass.getESuperTypes().add(this.getNamespace());
		stateEClass.getESuperTypes().add(this.getRedefinableElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		connectionPointReferenceEClass.getESuperTypes().add(this.getVertex());
		pseudostateEClass.getESuperTypes().add(this.getVertex());
		protocolConformanceEClass.getESuperTypes().add(
				this.getDirectedRelationship());
		encapsulatedClassifierEClass.getESuperTypes().add(
				this.getStructuredClassifier());
		structuredClassifierEClass.getESuperTypes().add(this.getClassifier());
		connectorEClass.getESuperTypes().add(this.getFeature());
		extensionEClass.getESuperTypes().add(this.getAssociation());
		extensionEndEClass.getESuperTypes().add(this.getProperty());
		stereotypeEClass.getESuperTypes().add(this.getClass_());
		imageEClass.getESuperTypes().add(this.getElement());
		profileEClass.getESuperTypes().add(this.getPackage());
		parameterSetEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		operationTemplateParameterEClass.getESuperTypes().add(
				this.getTemplateParameter());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(
				this.getMultiplicityElement());
		connectableElementTemplateParameterEClass.getESuperTypes().add(
				this.getTemplateParameter());
		collaborationUseEClass.getESuperTypes().add(this.getNamedElement());
		collaborationEClass.getESuperTypes()
				.add(this.getBehavioredClassifier());
		collaborationEClass.getESuperTypes()
				.add(this.getStructuredClassifier());
		useCaseEClass.getESuperTypes().add(this.getBehavioredClassifier());
		includeEClass.getESuperTypes().add(this.getNamedElement());
		includeEClass.getESuperTypes().add(this.getDirectedRelationship());
		extendEClass.getESuperTypes().add(this.getNamedElement());
		extendEClass.getESuperTypes().add(this.getDirectedRelationship());
		extensionPointEClass.getESuperTypes().add(this.getRedefinableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(
				this.getRedefinableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(
				this.getTemplateSignature());
		classifierTemplateParameterEClass.getESuperTypes().add(
				this.getTemplateParameter());
		stringExpressionEClass.getESuperTypes().add(this.getExpression());
		stringExpressionEClass.getESuperTypes().add(
				this.getTemplateableElement());
		expressionEClass.getESuperTypes().add(this.getValueSpecification());
		usageEClass.getESuperTypes().add(this.getDependency());
		packageMergeEClass.getESuperTypes().add(this.getDirectedRelationship());
		profileApplicationEClass.getESuperTypes().add(
				this.getDirectedRelationship());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(
				this.getInstanceSpecification());
		instanceSpecificationEClass.getESuperTypes().add(
				this.getDeploymentTarget());
		instanceSpecificationEClass.getESuperTypes().add(
				this.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(
				this.getDeployedArtifact());
		slotEClass.getESuperTypes().add(this.getElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		literalSpecificationEClass.getESuperTypes().add(
				this.getValueSpecification());
		literalIntegerEClass.getESuperTypes().add(
				this.getLiteralSpecification());
		literalStringEClass.getESuperTypes()
				.add(this.getLiteralSpecification());
		literalBooleanEClass.getESuperTypes().add(
				this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(
				this.getLiteralSpecification());
		opaqueBehaviorEClass.getESuperTypes().add(this.getBehavior());
		functionBehaviorEClass.getESuperTypes().add(this.getOpaqueBehavior());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityNodeEClass.getESuperTypes().add(this.getRedefinableElement());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
		structuredActivityNodeEClass.getESuperTypes().add(this.getNamespace());
		structuredActivityNodeEClass.getESuperTypes().add(
				this.getActivityGroup());
		activityGroupEClass.getESuperTypes().add(this.getElement());
		activityEClass.getESuperTypes().add(this.getBehavior());
		variableEClass.getESuperTypes().add(this.getConnectableElement());
		variableEClass.getESuperTypes().add(this.getMultiplicityElement());
		activityEdgeEClass.getESuperTypes().add(this.getRedefinableElement());
		activityPartitionEClass.getESuperTypes().add(this.getNamedElement());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		interruptibleActivityRegionEClass.getESuperTypes().add(
				this.getActivityGroup());
		exceptionHandlerEClass.getESuperTypes().add(this.getElement());
		objectNodeEClass.getESuperTypes().add(this.getActivityNode());
		objectNodeEClass.getESuperTypes().add(this.getTypedElement());
		outputPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getObjectNode());
		pinEClass.getESuperTypes().add(this.getMultiplicityElement());
		inputPinEClass.getESuperTypes().add(this.getPin());
		callActionEClass.getESuperTypes().add(this.getInvocationAction());
		invocationActionEClass.getESuperTypes().add(this.getAction());
		sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		callOperationActionEClass.getESuperTypes().add(this.getCallAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		sequenceNodeEClass.getESuperTypes().add(
				this.getStructuredActivityNode());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		activityParameterNodeEClass.getESuperTypes().add(this.getObjectNode());
		valuePinEClass.getESuperTypes().add(this.getInputPin());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		messageEndEClass.getESuperTypes().add(this.getNamedElement());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionFragmentEClass.getESuperTypes().add(this.getNamedElement());
		lifelineEClass.getESuperTypes().add(this.getNamedElement());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionUse());
		interactionUseEClass.getESuperTypes()
				.add(this.getInteractionFragment());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		generalOrderingEClass.getESuperTypes().add(this.getNamedElement());
		occurrenceSpecificationEClass.getESuperTypes().add(
				this.getInteractionFragment());
		interactionOperandEClass.getESuperTypes().add(this.getNamespace());
		interactionOperandEClass.getESuperTypes().add(
				this.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(this.getConstraint());
		executionSpecificationEClass.getESuperTypes().add(
				this.getInteractionFragment());
		stateInvariantEClass.getESuperTypes()
				.add(this.getInteractionFragment());
		actionExecutionSpecificationEClass.getESuperTypes().add(
				this.getExecutionSpecification());
		behaviorExecutionSpecificationEClass.getESuperTypes().add(
				this.getExecutionSpecification());
		executionEventEClass.getESuperTypes().add(this.getEvent());
		creationEventEClass.getESuperTypes().add(this.getEvent());
		destructionEventEClass.getESuperTypes().add(this.getEvent());
		sendOperationEventEClass.getESuperTypes().add(this.getMessageEvent());
		messageEventEClass.getESuperTypes().add(this.getEvent());
		sendSignalEventEClass.getESuperTypes().add(this.getMessageEvent());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(
				this.getOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(
				this.getMessageEnd());
		executionOccurrenceSpecificationEClass.getESuperTypes().add(
				this.getOccurrenceSpecification());
		receiveOperationEventEClass.getESuperTypes()
				.add(this.getMessageEvent());
		receiveSignalEventEClass.getESuperTypes().add(this.getMessageEvent());
		actorEClass.getESuperTypes().add(this.getBehavioredClassifier());
		callEventEClass.getESuperTypes().add(this.getMessageEvent());
		changeEventEClass.getESuperTypes().add(this.getEvent());
		signalEventEClass.getESuperTypes().add(this.getMessageEvent());
		anyReceiveEventEClass.getESuperTypes().add(this.getMessageEvent());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		centralBufferNodeEClass.getESuperTypes().add(this.getObjectNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		componentRealizationEClass.getESuperTypes().add(this.getRealization());
		componentEClass.getESuperTypes().add(this.getClass_());
		nodeEClass.getESuperTypes().add(this.getClass_());
		nodeEClass.getESuperTypes().add(this.getDeploymentTarget());
		communicationPathEClass.getESuperTypes().add(this.getAssociation());
		deviceEClass.getESuperTypes().add(this.getNode());
		executionEnvironmentEClass.getESuperTypes().add(this.getNode());
		combinedFragmentEClass.getESuperTypes().add(
				this.getInteractionFragment());
		continuationEClass.getESuperTypes().add(this.getInteractionFragment());
		considerIgnoreFragmentEClass.getESuperTypes().add(
				this.getCombinedFragment());
		createObjectActionEClass.getESuperTypes().add(this.getAction());
		destroyObjectActionEClass.getESuperTypes().add(this.getAction());
		testIdentityActionEClass.getESuperTypes().add(this.getAction());
		readSelfActionEClass.getESuperTypes().add(this.getAction());
		structuralFeatureActionEClass.getESuperTypes().add(this.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(
				this.getStructuralFeatureAction());
		writeStructuralFeatureActionEClass.getESuperTypes().add(
				this.getStructuralFeatureAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(
				this.getStructuralFeatureAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(
				this.getWriteStructuralFeatureAction());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(
				this.getWriteStructuralFeatureAction());
		linkActionEClass.getESuperTypes().add(this.getAction());
		linkEndDataEClass.getESuperTypes().add(this.getElement());
		qualifierValueEClass.getESuperTypes().add(this.getElement());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndDestructionDataEClass.getESuperTypes()
				.add(this.getLinkEndData());
		clearAssociationActionEClass.getESuperTypes().add(this.getAction());
		broadcastSignalActionEClass.getESuperTypes().add(
				this.getInvocationAction());
		sendObjectActionEClass.getESuperTypes().add(this.getInvocationAction());
		valueSpecificationActionEClass.getESuperTypes().add(this.getAction());
		timeExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		observationEClass.getESuperTypes().add(this.getPackageableElement());
		durationEClass.getESuperTypes().add(this.getValueSpecification());
		durationIntervalEClass.getESuperTypes().add(this.getInterval());
		intervalEClass.getESuperTypes().add(this.getValueSpecification());
		timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		intervalConstraintEClass.getESuperTypes().add(this.getConstraint());
		timeIntervalEClass.getESuperTypes().add(this.getInterval());
		durationConstraintEClass.getESuperTypes().add(
				this.getIntervalConstraint());
		timeObservationEClass.getESuperTypes().add(this.getObservation());
		durationObservationEClass.getESuperTypes().add(this.getObservation());
		finalStateEClass.getESuperTypes().add(this.getState());
		timeEventEClass.getESuperTypes().add(this.getEvent());
		variableActionEClass.getESuperTypes().add(this.getAction());
		readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		writeVariableActionEClass.getESuperTypes()
				.add(this.getVariableAction());
		clearVariableActionEClass.getESuperTypes()
				.add(this.getVariableAction());
		addVariableValueActionEClass.getESuperTypes().add(
				this.getWriteVariableAction());
		removeVariableValueActionEClass.getESuperTypes().add(
				this.getWriteVariableAction());
		raiseExceptionActionEClass.getESuperTypes().add(this.getAction());
		actionInputPinEClass.getESuperTypes().add(this.getInputPin());
		informationItemEClass.getESuperTypes().add(this.getClassifier());
		informationFlowEClass.getESuperTypes()
				.add(this.getPackageableElement());
		informationFlowEClass.getESuperTypes().add(
				this.getDirectedRelationship());
		readExtentActionEClass.getESuperTypes().add(this.getAction());
		reclassifyObjectActionEClass.getESuperTypes().add(this.getAction());
		readIsClassifiedObjectActionEClass.getESuperTypes().add(
				this.getAction());
		startClassifierBehaviorActionEClass.getESuperTypes().add(
				this.getAction());
		readLinkObjectEndActionEClass.getESuperTypes().add(this.getAction());
		readLinkObjectEndQualifierActionEClass.getESuperTypes().add(
				this.getAction());
		createLinkObjectActionEClass.getESuperTypes().add(
				this.getCreateLinkAction());
		acceptEventActionEClass.getESuperTypes().add(this.getAction());
		acceptCallActionEClass.getESuperTypes()
				.add(this.getAcceptEventAction());
		replyActionEClass.getESuperTypes().add(this.getAction());
		unmarshallActionEClass.getESuperTypes().add(this.getAction());
		reduceActionEClass.getESuperTypes().add(this.getAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(
				this.getCallAction());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
		conditionalNodeEClass.getESuperTypes().add(
				this.getStructuredActivityNode());
		clauseEClass.getESuperTypes().add(this.getElement());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		expansionNodeEClass.getESuperTypes().add(this.getObjectNode());
		expansionRegionEClass.getESuperTypes().add(
				this.getStructuredActivityNode());
		protocolTransitionEClass.getESuperTypes().add(this.getTransition());
		associationClassEClass.getESuperTypes().add(this.getClass_());
		associationClassEClass.getESuperTypes().add(this.getAssociation());
		launcherEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedComment(), this.getComment(), null,
				"ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(elementEClass, theEcorePackage_1
				.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "propertyName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getModel(), "getModel", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getStereotype(),
				"getAppliedStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getPackage(), "getNearestPackage", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getRelationship(),
				"getRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEClass(), "eClass", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getStereotype(),
				"getAppliedSubstereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, null, "destroy", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getString(), "getKeywords", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(),
				"isStereotypeRequired", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getStereotype(),
				"getRequiredStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getDirectedRelationship(),
				"op_getTargetDirectedRelationships", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getStereotype(),
				"getApplicableStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getRelationship(),
				"op_getRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, this.getStereotype(),
				"getApplicableStereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getDirectedRelationship(),
				"getSourceDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEClass(), "eClass", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(), "hasValue", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "propertyName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, theEcorePackage_1.getEObject(),
				"getStereotypeApplication", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, ecorePackage.getEBoolean(),
				"has_owner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "allOwnedElements", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, theEcorePackage_1.getEObject(),
				"unapplyStereotype", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, null, "setValue", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "propertyName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "newValue", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, this.getStereotype(),
				"getAppliedStereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(), "addKeyword", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getStereotype(),
				"getAppliedSubstereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, theEcorePackage_1.getEObject(),
				"getStereotypeApplications", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(),
				"isStereotypeApplicable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(),
				"isStereotypeApplied", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(), "removeKeyword",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getDirectedRelationship(),
				"getTargetDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEClass(), "eClass", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, theEcorePackage_1.getEObject(),
				"applyStereotype", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStereotype(), "stereotype", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getStereotype(),
				"getRequiredStereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, this.getDirectedRelationship(),
				"op_getSourceDirectedRelationships", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getBoolean(), "mustBeOwned", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(elementEClass, ecorePackage.getEBoolean(),
				"not_own_self", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(elementEClass, theEcorePackage_1.getEAnnotation(),
				"createEAnnotation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(elementEClass, this.getBoolean(), "hasKeyword", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "getterOwnedElement",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "getterOwner", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Viewpoint(), this.getString(), "viewpoint",
				null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(modelEClass, this.getBoolean(), "isMetamodel", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(modelEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(modelEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(packageEClass, uml.Package.class, "Package", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_ProfileApplication(), this
				.getProfileApplication(), this
				.getProfileApplication_ApplyingPackage(), "profileApplication",
				null, 0, -1, uml.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackagedElement(), this
				.getPackageableElement(), null, "packagedElement", null, 0, -1,
				uml.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this
				.getPackageMerge_ReceivingPackage(), "packageMerge", null, 0,
				-1, uml.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(packageEClass, this.getProfileApplication(),
				"getProfileApplicationEMF_renameAs", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getProfile(), "profile", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "recurse", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, ecorePackage.getEBoolean(),
				"elements_public_or_private", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(packageEClass, this.getProfile(),
				"op_getAppliedProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, this.getProfile(), "getAppliedProfiles",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(packageEClass, this.getInterface(),
				"createOwnedInterface", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, this.getProfile(),
				"getAllAppliedProfiles", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(packageEClass, this.getProfileApplication(),
				"getAllProfileApplications", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(packageEClass, this.getBoolean(),
				"isProfileApplied", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProfile(), "profile", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getBoolean(), "makesVisible", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "el", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getProfile(),
				"getAppliedProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "recurse", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, this.getBoolean(), "isModelLibrary", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(packageEClass, this.getPackageableElement(),
				"visibleMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(packageEClass, theEcorePackage_1.getEObject(),
				"applyProfile", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProfile(), "profile", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, theEcorePackage_1.getEObject(),
				"unapplyProfile", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProfile(), "profile", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getProfileApplication(),
				"op_getProfileApplication", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProfile(), "profile", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getPrimitiveType(),
				"createOwnedPrimitiveType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getClass_(), "createOwnedClass",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isAbstract", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(packageEClass, this.getEnumeration(),
				"createOwnedEnumeration", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(packageEClass, this.getPackage(), "getterNestingPackage",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(packageEClass, this.getType(), "getterOwnedType", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(packageEClass, this.getPackage(), "getterNestedPackage",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Region(), this.getRegion(), this
				.getRegion_StateMachine(), "region", null, 1, -1,
				StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_ExtendedStateMachine(), this
				.getStateMachine(), null, "extendedStateMachine", null, 0, -1,
				StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_SubmachineState(), this.getState(), this
				.getState_Submachine(), "submachineState", null, 0, -1,
				StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_Output(), theFsmPackage.getFSM(), null,
				"output", null, 0, 1, StateMachine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_ConnectionPoint(),
				this.getPseudostate(), this.getPseudostate_StateMachine(),
				"connectionPoint", null, 0, -1, StateMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(stateMachineEClass, ecorePackage.getEBoolean(),
				"classifier_context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateMachineEClass, ecorePackage.getEBoolean(),
				"connection_points", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateMachineEClass, null, "uml2fsmPass2", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateMachineEClass, null, "uml2fsmPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stateMachineEClass, ecorePackage.getEBoolean(),
				"context_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateMachineEClass, this.getNamespace(), "LCA", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stateMachineEClass, ecorePackage.getEBoolean(),
				"method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateMachineEClass, this.getBoolean(),
				"op_isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStateMachine(), "redefined", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(stateMachineEClass, this.getBoolean(), "ancestor",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Subvertex(), this.getVertex(), this
				.getVertex_Container(), "subvertex", null, 0, -1, Region.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getRegion_StateMachine(), this.getStateMachine(), this
				.getStateMachine_Region(), "stateMachine", null, 0, 1,
				Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_OutModel(), theFsmPackage.getFSM(), null,
				"outModel", null, 0, 1, Region.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_State(), this.getState(), this
				.getState_Region(), "state", null, 0, 1, Region.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getRegion_Transition(), this.getTransition(), this
				.getTransition_Container(), "transition", null, 0, -1,
				Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_ExtendedRegion(), this.getRegion(), null,
				"extendedRegion", null, 0, 1, Region.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(regionEClass, this.getStateMachine(),
				"containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(regionEClass, this.getClassifier(),
				"op_redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(regionEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(regionEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(regionEClass, this.getBoolean(), "belongsToPSM", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(regionEClass, ecorePackage.getEBoolean(),
				"shallow_history_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(regionEClass, this.getBoolean(),
				"op_isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRegion(), "redefined", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(regionEClass, ecorePackage.getEBoolean(),
				"initial_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(regionEClass, ecorePackage.getEBoolean(),
				"deep_history_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(regionEClass, ecorePackage.getEBoolean(), "owned",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_Container(), this.getRegion(), this
				.getRegion_Subvertex(), "container", null, 0, 1, Vertex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getVertex_OutModel(), theFsmPackage.getFSM(), null,
				"outModel", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Output(), theFsmPackage.getState(), null,
				"output", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(vertexEClass, this.getTransition(), "getIncomings", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(vertexEClass, this.getStateMachine(),
				"containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(vertexEClass, this.getTransition(), "getOutgoings", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(vertexEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(vertexEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(vertexEClass, this.getTransition(), "getterIncoming", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(vertexEClass, this.getTransition(), "getterOutgoing", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Trigger(), this.getTrigger(), null,
				"trigger", null, 0, -1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Effect(), this.getBehavior(), null,
				"effect", null, 0, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), null,
				"source", null, 1, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Guard(), this.getConstraint(), null,
				"guard", null, 0, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Container(), this.getRegion(), this
				.getRegion_Transition(), "container", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), null,
				"target", null, 1, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_RedefinedTransition(), this
				.getTransition(), null, "redefinedTransition", null, 0, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransition_Kind(), this.getTransitionKind(), "kind",
				"external", 1, 1, Transition.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTransition_FsmTransition(), theFsmPackage
				.getTransition(), null, "fsmTransition", null, 0, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"join_segment_state", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"fork_segment_guards", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"outgoing_pseudostates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(transitionEClass, this.getStateMachine(),
				"containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(transitionEClass, this.getClassifier(),
				"op_redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"join_segment_guards", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(transitionEClass, null, "uml2fsmPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(transitionEClass, null, "uml2fsmPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"initial_transition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"fork_segment_state", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transitionEClass, ecorePackage.getEBoolean(),
				"signatures_compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), this.getString(), "body", null, 0, 1,
				Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_AnnotatedElement(), this.getElement(), null,
				"annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageableElementEClass, PackageableElement.class,
				"PackageableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(),
				"visibility", null, 0, 1, NamedElement.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_NameExpression(), this
				.getStringExpression(), null, "nameExpression", null, 0, 1,
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null,
				0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getNamedElement_ClientDependency(),
				this.getDependency(), this.getDependency_Client(),
				"clientDependency", null, 0, -1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(namedElementEClass, this.getNamespace(), "allNamespaces",
				0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(namedElementEClass, ecorePackage.getEBoolean(),
				"has_no_qualified_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(namedElementEClass, this.getDependency(),
				"createDependency", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "supplier", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(namedElementEClass, ecorePackage.getEBoolean(),
				"visibility_needs_ownership", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(namedElementEClass, this.getBoolean(),
				"isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getNamespace(), "ns", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(namedElementEClass, this.getString(),
				"getQualifiedNameEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namedElementEClass, this.getUsage(), "createUsage",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "supplier", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(namedElementEClass, ecorePackage.getEBoolean(),
				"has_qualified_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namedElementEClass, this.getPackage(),
				"allOwningPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namedElementEClass, this.getString(), "op_getLabel", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namedElementEClass, this.getString(), "separator", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namedElementEClass, this.getString(), "getLabel", 0,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "localize", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(namedElementEClass, this.getString(),
				"getterQualifiedName", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namedElementEClass, this.getNamespace(),
				"getterNamespace", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Client(), this.getNamedElement(), this
				.getNamedElement_ClientDependency(), "client", null, 1, -1,
				Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDependency_Supplier(), this.getNamedElement(), null,
				"supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class,
				"DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(directedRelationshipEClass, this.getElement(),
				"getterSource", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(directedRelationshipEClass, this.getElement(),
				"getterTarget", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(relationshipEClass, this.getElement(),
				"getterRelatedElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_ElementImport(), this.getElementImport(),
				this.getElementImport_ImportingNamespace(), "elementImport",
				null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedRule(), this.getConstraint(), this
				.getConstraint_Context(), "ownedRule", null, 0, -1,
				Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_PackageImport(), this.getPackageImport(),
				this.getPackageImport_ImportingNamespace(), "packageImport",
				null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(namespaceEClass, this.getElementImport(),
				"createElementImport", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "element", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVisibilityKind(), "visibility", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(namespaceEClass, this.getPackage(),
				"getImportedPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namespaceEClass, this.getPackageableElement(),
				"importMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namespaceEClass, this.getPackageableElement(),
				"excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namespaceEClass, ecorePackage.getEBoolean(),
				"members_distinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namespaceEClass, this.getPackageableElement(),
				"getImportedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namespaceEClass, this.getString(),
				"getNamesOfMember", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "element", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(namespaceEClass, this.getBoolean(),
				"membersAreDistinguishable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(namespaceEClass, this.getPackageImport(),
				"createPackageImport", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackage(), "package_", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getVisibilityKind(), "visibility", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(namespaceEClass, this.getPackageableElement(),
				"getImportedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namespaceEClass, this.getNamedElement(), "getterMember",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namespaceEClass, this.getNamedElement(),
				"getterOwnedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namespaceEClass, this.getPackageableElement(),
				"getterImportedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementImportEClass, ElementImport.class, "ElementImport",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementImport_Alias(), this.getString(), "alias",
				null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(),
				"visibility", "public", 1, 1, ElementImport.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportedElement(), this
				.getPackageableElement(), null, "importedElement", null, 1, 1,
				ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportingNamespace(), this
				.getNamespace(), this.getNamespace_ElementImport(),
				"importingNamespace", null, 1, 1, ElementImport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(elementImportEClass, ecorePackage.getEBoolean(),
				"visibility_public_or_private", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(elementImportEClass, ecorePackage.getEBoolean(),
				"imported_element_is_public", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elementImportEClass, this.getString(), "getName", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageImport_ImportedPackage(), this.getPackage(),
				null, "importedPackage", null, 1, 1, PackageImport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(),
				"visibility", "public", 1, 1, PackageImport.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageImport_ImportingNamespace(), this
				.getNamespace(), this.getNamespace_PackageImport(),
				"importingNamespace", null, 1, 1, PackageImport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(packageImportEClass, ecorePackage.getEBoolean(),
				"public_or_private", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Specification(), this
				.getValueSpecification(), null, "specification", null, 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Context(), this.getNamespace(), this
				.getNamespace_OwnedRule(), "context", null, 0, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_ConstrainedElement(), this.getElement(),
				null, "constrainedElement", null, 0, -1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(),
				"not_applied_to_self", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(),
				"not_apply_to_self", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(),
				"value_specification_boolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(),
				"no_side_effects", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, ecorePackage.getEBoolean(),
				"boolean_value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class,
				"ValueSpecification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(valueSpecificationEClass, this.getBoolean(), "isNull", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(valueSpecificationEClass, this.getInteger(),
				"integerValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(valueSpecificationEClass, this.getString(),
				"stringValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(valueSpecificationEClass, this.getUnlimitedNatural(),
				"unlimitedValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(valueSpecificationEClass, this.getBoolean(),
				"isComputable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(valueSpecificationEClass, this.getBoolean(),
				"booleanValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type",
				null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(typeEClass, this.getBoolean(), "conformsTo", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(typeEClass, this.getAssociation(), "getAssociations", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(typeEClass, this.getAssociation(),
				"createAssociation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end1IsNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end1Aggregation", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end1Name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getInteger(), "end1Lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end1Upper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "end1Type", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end2IsNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end2Aggregation", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end2Name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getInteger(), "end2Lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end2Upper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(typeEClass, this.getPackage(), "getter_package", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_IsDerived(), this.getBoolean(),
				"isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_NavigableOwnedEnd(), this.getProperty(),
				null, "navigableOwnedEnd", null, 0, -1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getAssociation_OwnedEnd(), this.getProperty(), this
				.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_MemberEnd(), this.getProperty(), this
				.getProperty_Association(), "memberEnd", null, 2, -1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(associationEClass, this.getType(), "getEndTypes", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(associationEClass, this.getBoolean(), "isBinary", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(associationEClass, ecorePackage.getEBoolean(),
				"binary_associations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(associationEClass, ecorePackage.getEBoolean(),
				"specialized_end_types", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(associationEClass, ecorePackage.getEBoolean(),
				"specialized_end_number", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(associationEClass, ecorePackage.getEBoolean(),
				"association_ends", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(associationEClass, this.getType(), "getterEndType", 0,
				-1, IS_UNIQUE, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_RedefinedClassifier(), this
				.getClassifier(), null, "redefinedClassifier", null, 0, -1,
				Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_PowertypeExtent(), this
				.getGeneralizationSet(), this.getGeneralizationSet_Powertype(),
				"powertypeExtent", null, 0, -1, Classifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getClassifier_Substitution(), this.getSubstitution(),
				this.getSubstitution_SubstitutingClassifier(), "substitution",
				null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_IsAbstract(), this.getBoolean(),
				"isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_UseCase(), this.getUseCase(), this
				.getUseCase_Subject(), "useCase", null, 0, -1,
				Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Representation(), this
				.getCollaborationUse(), null, "representation", null, 0, 1,
				Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Generalization(),
				this.getGeneralization(), this.getGeneralization_Specific(),
				"generalization", null, 0, -1, Classifier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedUseCase(), this.getUseCase(), null,
				"ownedUseCase", null, 0, -1, Classifier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_CollaborationUse(), this
				.getCollaborationUse(), null, "collaborationUse", null, 0, -1,
				Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		addEOperation(classifierEClass, this.getOperation(), "getOperations",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getClassifier(), "parents", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(classifierEClass, ecorePackage.getEBoolean(),
				"maps_to_generalization_set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classifierEClass, this.getNamedElement(), "inherit",
				0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "inhs", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(classifierEClass, this.getOperation(),
				"getOperation", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "ignoreCase", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(classifierEClass, this.getBoolean(),
				"op_conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "other", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(classifierEClass, this.getOperation(),
				"getAllOperations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getNamedElement(),
				"getInheritedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getClassifier(), "allParents", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(classifierEClass, ecorePackage.getEBoolean(),
				"no_cycles_in_generalization", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classifierEClass, this.getOperation(),
				"op_getOperation", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(classifierEClass, ecorePackage.getEBoolean(),
				"specialize_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classifierEClass, this.getProperty(), "getAllAttributes",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getFeature(), "allFeatures", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getInterface(),
				"getUsedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(classifierEClass, ecorePackage.getEBoolean(),
				"generalization_hierarchies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classifierEClass, this.getBoolean(),
				"maySpecializeType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(classifierEClass, this.getClassifier(), "getGenerals", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getInterface(),
				"getAllUsedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(classifierEClass, this.getBoolean(),
				"hasVisibilityOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(classifierEClass, this.getNamedElement(),
				"inheritableMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(classifierEClass, this.getProperty(), "getterAttribute",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getNamedElement(),
				"getterInheritedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getClassifier(), "getterGeneral",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classifierEClass, this.getFeature(), "getterFeature", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		initEClass(redefinableElementEClass, RedefinableElement.class,
				"RedefinableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedefinableElement_IsLeaf(), this.getBoolean(),
				"isLeaf", "false", 1, 1, RedefinableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(redefinableElementEClass, this.getBoolean(),
				"isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefined", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(redefinableElementEClass,
				ecorePackage.getEBoolean(), "redefinition_consistent", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(redefinableElementEClass, this.getBoolean(),
				"isConsistentWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefinee", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(redefinableElementEClass,
				ecorePackage.getEBoolean(), "redefinition_context_valid", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(redefinableElementEClass, this.getRedefinableElement(),
				"getterRedefinedElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(redefinableElementEClass, this.getClassifier(),
				"getterRedefinitionContext", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateableElementEClass, TemplateableElement.class,
				"TemplateableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateableElement_OwnedTemplateSignature(), this
				.getTemplateSignature(), this.getTemplateSignature_Template(),
				"ownedTemplateSignature", null, 0, 1,
				TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateableElement_TemplateBinding(), this
				.getTemplateBinding(), this.getTemplateBinding_BoundElement(),
				"templateBinding", null, 0, -1, TemplateableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(templateableElementEClass, this.getBoolean(),
				"isTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(templateableElementEClass,
				this.getParameterableElement(), "parameterableElements", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(templateBindingEClass, TemplateBinding.class,
				"TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateBinding_ParameterSubstitution(), this
				.getTemplateParameterSubstitution(), this
				.getTemplateParameterSubstitution_TemplateBinding(),
				"parameterSubstitution", null, 0, -1, TemplateBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTemplateBinding_BoundElement(), this
				.getTemplateableElement(), this
				.getTemplateableElement_TemplateBinding(), "boundElement",
				null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_Signature(), this
				.getTemplateSignature(), null, "signature", null, 1, 1,
				TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(templateBindingEClass, ecorePackage.getEBoolean(),
				"one_parameter_substitution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(templateBindingEClass, ecorePackage.getEBoolean(),
				"parameter_substitution_formal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templateSignatureEClass, TemplateSignature.class,
				"TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSignature_Template(), this
				.getTemplateableElement(), this
				.getTemplateableElement_OwnedTemplateSignature(), "template",
				null, 1, 1, TemplateSignature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateSignature_Parameter(), this
				.getTemplateParameter(), null, "parameter", null, 1, -1,
				TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateSignature_OwnedParameter(), this
				.getTemplateParameter(), this.getTemplateParameter_Signature(),
				"ownedParameter", null, 0, -1, TemplateSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(templateSignatureEClass, ecorePackage.getEBoolean(),
				"own_elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templateParameterEClass, TemplateParameter.class,
				"TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameter_OwnedDefault(), this
				.getParameterableElement(), null, "ownedDefault", null, 0, 1,
				TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter__default(), this
				.getParameterableElement(), null, "_default", null, 0, 1,
				TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_OwnedParameteredElement(), this
				.getParameterableElement(), this
				.getParameterableElement_OwningTemplateParameter(),
				"ownedParameteredElement", null, 0, 1, TemplateParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTemplateParameter_ParameteredElement(), this
				.getParameterableElement(), this
				.getParameterableElement_TemplateParameter(),
				"parameteredElement", null, 1, 1, TemplateParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTemplateParameter_Signature(), this
				.getTemplateSignature(), this
				.getTemplateSignature_OwnedParameter(), "signature", null, 1,
				1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(templateParameterEClass, ecorePackage.getEBoolean(),
				"must_be_compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterableElementEClass, ParameterableElement.class,
				"ParameterableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterableElement_OwningTemplateParameter(), this
				.getTemplateParameter(), this
				.getTemplateParameter_OwnedParameteredElement(),
				"owningTemplateParameter", null, 0, 1,
				ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterableElement_TemplateParameter(), this
				.getTemplateParameter(), this
				.getTemplateParameter_ParameteredElement(),
				"templateParameter", null, 0, 1, ParameterableElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(parameterableElementEClass, this.getBoolean(),
				"isCompatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getParameterableElement(), "p", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(parameterableElementEClass, this.getBoolean(),
				"isTemplateParameter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateParameterSubstitutionEClass,
				TemplateParameterSubstitution.class,
				"TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameterSubstitution_Formal(), this
				.getTemplateParameter(), null, "formal", null, 1, 1,
				TemplateParameterSubstitution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_OwnedActual(), this
				.getParameterableElement(), null, "ownedActual", null, 0, 1,
				TemplateParameterSubstitution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_Actual(), this
				.getParameterableElement(), null, "actual", null, 1, 1,
				TemplateParameterSubstitution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_TemplateBinding(), this
				.getTemplateBinding(), this
				.getTemplateBinding_ParameterSubstitution(), "templateBinding",
				null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(templateParameterSubstitutionEClass, ecorePackage
				.getEBoolean(), "must_be_compatible", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class,
				"Generalization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this
				.getClassifier_Generalization(), "specific", null, 1, 1,
				Generalization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_GeneralizationSet(), this
				.getGeneralizationSet(), this
				.getGeneralizationSet_Generalization(), "generalizationSet",
				null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_General(), this.getClassifier(), null,
				"general", null, 1, 1, Generalization.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralization_IsSubstitutable(), this.getBoolean(),
				"isSubstitutable", "true", 0, 1, Generalization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(generalizationEClass, ecorePackage.getEBoolean(),
				"generalization_same_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class,
				"GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsDisjoint(), this.getBoolean(),
				"isDisjoint", "false", 1, 1, GeneralizationSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Generalization(), this
				.getGeneralization(), this
				.getGeneralization_GeneralizationSet(), "generalization", null,
				0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsCovering(), this.getBoolean(),
				"isCovering", "false", 1, 1, GeneralizationSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(),
				this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1,
				GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(generalizationSetEClass, ecorePackage.getEBoolean(),
				"maps_to_generalization_set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(generalizationSetEClass, ecorePackage.getEBoolean(),
				"generalization_same_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsStatic(), this.getBoolean(), "isStatic",
				"false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(featureEClass, this.getClassifier(),
				"getterFeaturingClassifier", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(substitutionEClass, Substitution.class, "Substitution",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstitution_SubstitutingClassifier(), this
				.getClassifier(), this.getClassifier_Substitution(),
				"substitutingClassifier", null, 1, 1, Substitution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getSubstitution_Contract(), this.getClassifier(), null,
				"contract", null, 1, 1, Substitution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realizationEClass, Realization.class, "Realization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractionEClass, Abstraction.class, "Abstraction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstraction_Mapping(), this.getOpaqueExpression(),
				null, "mapping", null, 0, 1, Abstraction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class,
				"OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueExpression_Body(), this.getString(), "body",
				null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueExpression_Behavior(), this.getBehavior(),
				null, "behavior", null, 0, 1, OpaqueExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), this.getString(),
				"language", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getBoolean(),
				"isNonNegative", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getBoolean(), "isPositive",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getBoolean(), "isIntegral",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getInteger(), "value", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(opaqueExpressionEClass, ecorePackage.getEBoolean(),
				"one_return_result_parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(opaqueExpressionEClass, ecorePackage.getEBoolean(),
				"language_body_size", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getParameter(),
				"getResultEMF_renameAs", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(opaqueExpressionEClass, ecorePackage.getEBoolean(),
				"only_return_result_parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(opaqueExpressionEClass, this.getParameter(),
				"getter_result", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), null,
				"operation", null, 0, 1, Parameter.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getParameter_Effect(), this.getParameterEffectKind(),
				"effect", null, 0, 1, Parameter.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Direction(), this
				.getParameterDirectionKind(), "direction", "in", 1, 1,
				Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsStream(), this.getBoolean(), "isStream",
				"false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getParameter_ParameterSet(), this.getParameterSet(),
				this.getParameterSet_Parameter(), "parameterSet", null, 0, -1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_DefaultValue(), this
				.getValueSpecification(), null, "defaultValue", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsException(), this.getBoolean(),
				"isException", "false", 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(parameterEClass, null, "setBooleanDefaultValue", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBoolean(),
				"stream_and_exception", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null,
				"setUnlimitedNaturalDefaultValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(parameterEClass, null, "setNullDefaultValue", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(parameterEClass, null, "setStringDefaultValue", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(parameterEClass, null, "setIntegerDefaultValue", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBoolean(),
				"connector_end", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBoolean(),
				"in_and_out", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "setDefaultEMF_renameAs", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "newDefault", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBoolean(),
				"reentrant_behaviors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, null, "unsetDefault", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(parameterEClass, this.getString(),
				"getDefaultEMF_renameAs", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(parameterEClass, ecorePackage.getEBoolean(),
				"not_exception", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, this.getBoolean(), "isSetDefault", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(parameterEClass, this.getString(), "getter_default", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class,
				"MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityElement_LowerValue(), this
				.getValueSpecification(), null, "lowerValue", null, 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(),
				"isOrdered", "false", 1, 1, MultiplicityElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_UpperValue(), this
				.getValueSpecification(), null, "upperValue", null, 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(),
				"isUnique", "true", 1, 1, MultiplicityElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, this.getBoolean(), "is",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lowerbound", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getInteger(), "upperbound", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getInteger(),
				"lowerBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage
				.getEBoolean(), "upper_ge_lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, this.getBoolean(),
				"includesCardinality", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "C", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage
				.getEBoolean(), "value_specification_no_side_effects", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage
				.getEBoolean(), "value_specification_constant", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getInteger(),
				"getLowerEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage
				.getEBoolean(), "lower_ge_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, this.getBoolean(),
				"includesMultiplicity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "M", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getBoolean(),
				"isMultivalued", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getUnlimitedNatural(),
				"getUpperEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, null,
				"setLowerEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "newLower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, null,
				"setUpperEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "newUpper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getUnlimitedNatural(),
				"upperBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, this.getBoolean(),
				"compatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "other", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getUnlimitedNatural(),
				"getterUpper", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(multiplicityElementEClass, this.getInteger(),
				"getterLower", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectableElementEClass, ConnectableElement.class,
				"ConnectableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(connectableElementEClass, this.getConnectorEnd(),
				"getEnds", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(connectableElementEClass, this.getConnectorEnd(),
				"getterEnd", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorEnd_PartWithPort(), this.getProperty(),
				null, "partWithPort", null, 0, 1, ConnectorEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getConnectorEnd_Role(), this.getConnectableElement(),
				null, "role", null, 1, 1, ConnectorEnd.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(connectorEndEClass, this.getProperty(),
				"getDefiningEndEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(connectorEndEClass, ecorePackage.getEBoolean(),
				"part_with_port_empty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEndEClass, ecorePackage.getEBoolean(),
				"multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEndEClass, ecorePackage.getEBoolean(),
				"role_and_part_with_port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEndEClass, ecorePackage.getEBoolean(),
				"self_part_with_port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectorEndEClass, this.getProperty(),
				"getterDefiningEnd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Association(), this.getAssociation(), this
				.getAssociation_MemberEnd(), "association", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived",
				"false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getProperty_RedefinedProperty(), this.getProperty(),
				null, "redefinedProperty", null, 0, -1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getProperty_SubsettedProperty(), this.getProperty(),
				null, "subsettedProperty", null, 0, -1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getProperty__class(), this.getClass_(), null, "_class",
				null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Qualifier(), this.getProperty(), this
				.getProperty_AssociationEnd(), "qualifier", null, 0, -1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwningAssociation(), this.getAssociation(),
				this.getAssociation_OwnedEnd(), "owningAssociation", null, 0,
				1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(),
				"aggregation", "none", 1, 1, Property.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Datatype(), this.getDataType(), this
				.getDataType_OwnedAttribute(), "datatype", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_DefaultValue(),
				this.getValueSpecification(), null, "defaultValue", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AssociationEnd(), this.getProperty(), this
				.getProperty_Qualifier(), "associationEnd", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerivedUnion(), this.getBoolean(),
				"isDerivedUnion", "false", 1, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"redefined_property_inherited", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, this.getProperty(),
				"getOppositeEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"subsetted_property_names", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setBooleanDefaultValue", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(propertyEClass, null,
				"setUnlimitedNaturalDefaultValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(propertyEClass, null, "setNullDefaultValue", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"deployment_target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"navigable_readonly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setIntegerDefaultValue", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setStringDefaultValue", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(propertyEClass, this.getBoolean(), "op_isComposite", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setOppositeEMF_renameAs", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProperty(), "newOpposite", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"binding_to_attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, null, "unsetDefault", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(propertyEClass, this.getString(),
				"getDefaultEMF_renameAs", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, this.getBoolean(), "isAttribute", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProperty(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"derived_union_is_read_only", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, this.getType(), "subsettingContext", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setIsCompositeEMF_renameAs",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "newIsComposite", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"subsetting_context_conforms", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"multiplicity_of_composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setIsNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isNavigable", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"subsetting_rules", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, ecorePackage.getEBoolean(),
				"derived_union_is_derived", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setDefaultEMF_renameAs", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "newDefault", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(propertyEClass, this.getBoolean(), "isNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(propertyEClass, this.getProperty(), "getOtherEnd", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(propertyEClass, this.getBoolean(), "isSetDefault", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(propertyEClass, this.getProperty(), "getterOpposite", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(propertyEClass, this.getBoolean(), "getterIsComposite",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(propertyEClass, this.getString(), "getter_default", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(deploymentTargetEClass, DeploymentTarget.class,
				"DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentTarget_Deployment(), this.getDeployment(),
				this.getDeployment_Location(), "deployment", null, 0, -1,
				DeploymentTarget.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(deploymentTargetEClass, this.getPackageableElement(),
				"getDeployedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(deploymentTargetEClass, this.getPackageableElement(),
				"getterDeployedElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Location(), this.getDeploymentTarget(),
				this.getDeploymentTarget_Deployment(), "location", null, 1, 1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployment_DeployedArtifact(), this
				.getDeployedArtifact(), null, "deployedArtifact", null, 0, -1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployment_Configuration(), this
				.getDeploymentSpecification(), this
				.getDeploymentSpecification_Deployment(), "configuration",
				null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deployedArtifactEClass, DeployedArtifact.class,
				"DeployedArtifact", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentSpecificationEClass,
				DeploymentSpecification.class, "DeploymentSpecification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentSpecification_DeploymentLocation(), this
				.getString(), "deploymentLocation", null, 0, 1,
				DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getDeploymentSpecification_ExecutionLocation(), this
				.getString(), "executionLocation", null, 0, 1,
				DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getDeploymentSpecification_Deployment(), this
				.getDeployment(), this.getDeployment_Configuration(),
				"deployment", null, 0, 1, DeploymentSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(deploymentSpecificationEClass, ecorePackage
				.getEBoolean(), "deployment_target", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deploymentSpecificationEClass, ecorePackage
				.getEBoolean(), "deployed_elements", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_OwnedOperation(), this.getOperation(), null,
				"ownedOperation", null, 0, -1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_NestedArtifact(), this.getArtifact(), null,
				"nestedArtifact", null, 0, -1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArtifact_FileName(), this.getString(), "fileName",
				null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getArtifact_OwnedAttribute(), this.getProperty(), null,
				"ownedAttribute", null, 0, -1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Manifestation(), this.getManifestation(),
				null, "manifestation", null, 0, -1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(artifactEClass, this.getOperation(),
				"createOwnedOperation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(artifactEClass, this.getProperty(),
				"createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(manifestationEClass, Manifestation.class, "Manifestation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManifestation_UtilizedElement(), this
				.getPackageableElement(), null, "utilizedElement", null, 1, 1,
				Manifestation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_BodyCondition(), this.getConstraint(),
				null, "bodyCondition", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOperation__class(), this.getClass_(), this
				.getClass_OwnedOperation(), "_class", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation__interface(), this.getInterface(), this
				.getInterface_OwnedOperation(), "_interface", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsQuery(), this.getBoolean(), "isQuery",
				"false", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOperation_Postcondition(), this.getConstraint(),
				null, "postcondition", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOperation_Precondition(), this.getConstraint(), null,
				"precondition", null, 0, -1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_RedefinedOperation(), this.getOperation(),
				null, "redefinedOperation", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOperation_Datatype(), this.getDataType(), this
				.getDataType_OwnedOperation(), "datatype", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		addEOperation(operationEClass, this.getParameter(), "getReturnResult",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getInteger(), "lowerBound", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(operationEClass, null, "setTypeEMF_renameAs", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "newType", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(operationEClass, null, "setIsOrderedEMF_renameAs",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "newIsOrdered", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(operationEClass, this.getBoolean(), "op_isUnique", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getInteger(),
				"getLowerEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getParameter(), "returnResult", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getType(), "getTypeEMF_renameAs",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getBoolean(), "op_isOrdered", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(operationEClass, ecorePackage.getEBoolean(),
				"only_body_for_query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, this.getUnlimitedNatural(),
				"getUpperEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(operationEClass, null, "setUpperEMF_renameAs", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "newUpper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(operationEClass, null, "setLowerEMF_renameAs", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "newLower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(operationEClass, null, "setIsUniqueEMF_renameAs", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "newIsUnique", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(operationEClass, this.getUnlimitedNatural(),
				"upperBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(operationEClass, ecorePackage.getEBoolean(),
				"at_most_one_return", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, this.getBoolean(), "getterIsOrdered", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getInteger(), "getterLower", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getType(), "getterType", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getUnlimitedNatural(),
				"getterUpper", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(operationEClass, this.getBoolean(), "getterIsUnique", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		initEClass(behavioralFeatureEClass, BehavioralFeature.class,
				"BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavioralFeature_IsAbstract(), this.getBoolean(),
				"isAbstract", "false", 1, 1, BehavioralFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameter(), this
				.getParameter(), null, "ownedParameter", null, 0, -1,
				BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavioralFeature_RaisedException(), this.getType(),
				null, "raisedException", null, 0, -1, BehavioralFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameterSet(), this
				.getParameterSet(), null, "ownedParameterSet", null, 0, -1,
				BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavioralFeature_Concurrency(), this
				.getCallConcurrencyKind(), "concurrency", "sequential", 1, 1,
				BehavioralFeature.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getBehavioralFeature_Method(), this.getBehavior(), this
				.getBehavior_Specification(), "method", null, 0, -1,
				BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(behavioralFeatureEClass, this.getParameter(),
				"createReturnResult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Postcondition(), this.getConstraint(), null,
				"postcondition", null, 0, -1, Behavior.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Precondition(), this.getConstraint(), null,
				"precondition", null, 0, -1, Behavior.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavior_IsReentrant(), this.getBoolean(),
				"isReentrant", "false", 1, 1, Behavior.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_OwnedParameter(), this.getParameter(), null,
				"ownedParameter", null, 0, -1, Behavior.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(),
				null, "redefinedBehavior", null, 0, -1, Behavior.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getBehavior_OwnedParameterSet(), this.getParameterSet(),
				null, "ownedParameterSet", null, 0, -1, Behavior.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getBehavior_Specification(),
				this.getBehavioralFeature(),
				this.getBehavioralFeature_Method(), "specification", null, 0,
				1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(behaviorEClass, ecorePackage.getEBoolean(),
				"must_realize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(behaviorEClass, ecorePackage.getEBoolean(),
				"most_one_behaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(behaviorEClass, ecorePackage.getEBoolean(),
				"feature_of_context_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(behaviorEClass, ecorePackage.getEBoolean(),
				"parameters_match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(behaviorEClass, this.getBehavioredClassifier(),
				"getContextEMF_renameAs", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(behaviorEClass, this.getBehavioredClassifier(),
				"getterContext", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(classEClass, uml.Class.class, "Class", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedOperation(), this.getOperation(), this
				.getOperation__class(), "ownedOperation", null, 0, -1,
				uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsActive(), this.getBoolean(), "isActive",
				"false", 1, 1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getClass_NestedClassifier(), this.getClassifier(), null,
				"nestedClassifier", null, 0, -1, uml.Class.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getClass_OwnedReception(), this.getReception(), null,
				"ownedReception", null, 0, -1, uml.Class.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(classEClass, this.getOperation(),
				"createOwnedOperation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(classEClass, this.getBoolean(), "isMetaclass", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(classEClass, ecorePackage.getEBoolean(),
				"passive_class", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getExtension(), "getExtensions", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(classEClass, this.getExtension(), "getterExtension", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classEClass, this.getClass_(), "getterSuperClass", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class,
				"BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredClassifier_InterfaceRealization(), this
				.getInterfaceRealization(), this
				.getInterfaceRealization_ImplementingClassifier(),
				"interfaceRealization", null, 0, -1,
				BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_OwnedTrigger(), this
				.getTrigger(), null, "ownedTrigger", null, 0, -1,
				BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_ClassifierBehavior(), this
				.getBehavior(), null, "classifierBehavior", null, 0, 1,
				BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_OwnedBehavior(), this
				.getBehavior(), null, "ownedBehavior", null, 0, -1,
				BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(behavioredClassifierEClass, ecorePackage
				.getEBoolean(), "class_behavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(behavioredClassifierEClass, this.getInterface(),
				"getAllImplementedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(behavioredClassifierEClass, this.getInterface(),
				"getImplementedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interfaceRealizationEClass, InterfaceRealization.class,
				"InterfaceRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRealization_Contract(), this.getInterface(),
				null, "contract", null, 1, 1, InterfaceRealization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInterfaceRealization_ImplementingClassifier(), this
				.getBehavioredClassifier(), this
				.getBehavioredClassifier_InterfaceRealization(),
				"implementingClassifier", null, 1, 1,
				InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_OwnedOperation(), this.getOperation(), this
				.getOperation__interface(), "ownedOperation", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Protocol(), this.getProtocolStateMachine(),
				null, "protocol", null, 0, 1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_NestedClassifier(), this.getClassifier(),
				null, "nestedClassifier", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getInterface_RedefinedInterface(), this.getInterface(),
				null, "redefinedInterface", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInterface_OwnedReception(), this.getReception(),
				null, "ownedReception", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInterface_OwnedAttribute(), this.getProperty(), null,
				"ownedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(interfaceEClass, this.getOperation(),
				"createOwnedOperation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(interfaceEClass, this.getProperty(),
				"createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(interfaceEClass, ecorePackage.getEBoolean(),
				"op_visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReception_Signal(), this.getSignal(), null, "signal",
				null, 0, 1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(receptionEClass, ecorePackage.getEBoolean(),
				"not_query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_OwnedAttribute(), this.getProperty(), null,
				"ownedAttribute", null, 0, -1, Signal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(signalEClass, this.getProperty(),
				"createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(protocolStateMachineEClass, ProtocolStateMachine.class,
				"ProtocolStateMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolStateMachine_Conformance(), this
				.getProtocolConformance(), this
				.getProtocolConformance_SpecificMachine(), "conformance", null,
				0, -1, ProtocolStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(protocolStateMachineEClass, ecorePackage
				.getEBoolean(), "ports_connected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(protocolStateMachineEClass, ecorePackage
				.getEBoolean(), "deep_or_shallow_history", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(protocolStateMachineEClass, ecorePackage
				.getEBoolean(), "protocol_transitions", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(protocolStateMachineEClass, ecorePackage
				.getEBoolean(), "entry_exit_do", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Port(), this.getPort(), null, "port", null,
				0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrigger_Event(), this.getEvent(), null, "event",
				null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Protocol(), this.getProtocolStateMachine(),
				null, "protocol", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsService(), this.getBoolean(), "isService",
				"true", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getPort_RedefinedPort(), this.getPort(), null,
				"redefinedPort", null, 0, -1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsBehavior(), this.getBoolean(), "isBehavior",
				"false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(portEClass, this.getInterface(), "getProvideds", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(portEClass, ecorePackage.getEBoolean(),
				"required_interfaces", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, this.getInterface(), "getRequireds", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(portEClass, ecorePackage.getEBoolean(),
				"port_destroyed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(portEClass, ecorePackage.getEBoolean(),
				"default_value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(portEClass, ecorePackage.getEBoolean(),
				"port_aggregation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, this.getInterface(), "getterProvided", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(portEClass, this.getInterface(), "getterRequired", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Region(), this.getRegion(), this
				.getRegion_State(), "region", null, 0, -1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getState_StateInvariant(), this.getConstraint(), null,
				"stateInvariant", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_RedefinedState(), this.getState(), null,
				"redefinedState", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Connection(), this
				.getConnectionPointReference(), this
				.getConnectionPointReference_State(), "connection", null, 0,
				-1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Submachine(), this.getStateMachine(), this
				.getStateMachine_SubmachineState(), "submachine", null, 0, 1,
				State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Exit(), this.getBehavior(), null, "exit", null,
				0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ConnectionPoint(), this.getPseudostate(), this
				.getPseudostate_State(), "connectionPoint", null, 0, -1,
				State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DeferrableTrigger(), this.getTrigger(), null,
				"deferrableTrigger", null, 0, -1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Entry(), this.getBehavior(), null, "entry",
				null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DoActivity(), this.getBehavior(), null,
				"doActivity", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(),
				"entry_or_exit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateEClass, this.getClassifier(),
				"op_redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(),
				"destinations_or_sources_of_transitions", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "op_isSubmachineState",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "op_isOrthogonal", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(),
				"submachine_states", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(),
				"submachine_or_regions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "op_isSimple", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stateEClass, this.getBoolean(),
				"op_isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "redefined", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(stateEClass, ecorePackage.getEBoolean(),
				"composite_states", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "op_isComposite", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "getterIsComposite", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(),
				"getterIsSubmachineState", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "getterIsSimple", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(stateEClass, this.getBoolean(), "getterIsOrthogonal", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectionPointReferenceEClass,
				ConnectionPointReference.class, "ConnectionPointReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPointReference_Entry(), this
				.getPseudostate(), null, "entry", null, 0, -1,
				ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_State(), this.getState(),
				this.getState_Connection(), "state", null, 0, 1,
				ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_Exit(), this
				.getPseudostate(), null, "exit", null, 0, -1,
				ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(connectionPointReferenceEClass, ecorePackage
				.getEBoolean(), "exit_pseudostates", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionPointReferenceEClass, ecorePackage
				.getEBoolean(), "entry_pseudostates", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPseudostate_StateMachine(), this.getStateMachine(),
				this.getStateMachine_ConnectionPoint(), "stateMachine", null,
				0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPseudostate_State(), this.getState(), this
				.getState_ConnectionPoint(), "state", null, 0, 1,
				Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPseudostate_Kind(), this.getPseudostateKind(),
				"kind", "initial", 1, 1, Pseudostate.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"fork_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"junction_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"choice_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"outgoing_from_initial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"transitions_outgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"transitions_incoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"join_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"initial_vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pseudostateEClass, ecorePackage.getEBoolean(),
				"history_vertices", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(protocolConformanceEClass, ProtocolConformance.class,
				"ProtocolConformance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolConformance_SpecificMachine(), this
				.getProtocolStateMachine(), this
				.getProtocolStateMachine_Conformance(), "specificMachine",
				null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolConformance_GeneralMachine(), this
				.getProtocolStateMachine(), null, "generalMachine", null, 1, 1,
				ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class,
				"EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(encapsulatedClassifierEClass, this.getPort(),
				"getterOwnedPort", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(structuredClassifierEClass, StructuredClassifier.class,
				"StructuredClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredClassifier_OwnedConnector(), this
				.getConnector(), null, "ownedConnector", null, 0, -1,
				StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClassifier_OwnedAttribute(), this
				.getProperty(), null, "ownedAttribute", null, 0, -1,
				StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(structuredClassifierEClass, this.getProperty(),
				"createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(structuredClassifierEClass, ecorePackage
				.getEBoolean(), "multiplicities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(structuredClassifierEClass, this.getConnectableElement(),
				"getterRole", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(structuredClassifierEClass, this.getProperty(),
				"getterPart", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Contract(), this.getBehavior(), null,
				"contract", null, 0, -1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Type(), this.getAssociation(), null,
				"type", null, 0, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_RedefinedConnector(), this.getConnector(),
				null, "redefinedConnector", null, 0, -1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getConnector_End(), this.getConnectorEnd(), null, "end",
				null, 2, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Kind(), this.getConnectorKind(), "kind",
				null, 0, 1, Connector.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"between_interface_port_signature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"between_interfaces_ports", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"assembly_connector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"roles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"between_interface_port_implements", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"types", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectorEClass, ecorePackage.getEBoolean(),
				"union_signature_compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(extensionEClass, this.getProperty(), "getStereotypeEnd",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(extensionEClass, this.getBoolean(), "op_isRequired", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(extensionEClass, ecorePackage.getEBoolean(),
				"non_owned_end", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(extensionEClass, this.getProperty(), "metaclassEnd", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(extensionEClass, this.getStereotype(), "getStereotype",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(extensionEClass, ecorePackage.getEBoolean(),
				"is_binary", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(extensionEClass, this.getClass_(),
				"getMetaclassEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(extensionEClass, this.getBoolean(), "getterIsRequired",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(extensionEClass, this.getClass_(), "getterMetaclass", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extensionEndEClass, ExtensionEnd.class, "ExtensionEnd",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(extensionEndEClass, ecorePackage.getEBoolean(),
				"multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(extensionEndEClass, ecorePackage.getEBoolean(),
				"op_aggregation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStereotype_Icon(), this.getImage(), null, "icon",
				null, 0, -1, Stereotype.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(stereotypeEClass, this.getExtension(),
				"createExtension", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClass_(), "metaclass", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isRequired", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(stereotypeEClass, this.getImage(), "op_createIcon",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "location", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(stereotypeEClass, theEcorePackage_1.getEClass(),
				"getDefinition", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stereotypeEClass, ecorePackage.getEBoolean(),
				"generalize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stereotypeEClass, this.getString(), "op_getKeyword", 1,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stereotypeEClass, this.getProfile(), "getProfile", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(stereotypeEClass, this.getImage(), "createIcon", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "format", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "content", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(stereotypeEClass, ecorePackage.getEBoolean(),
				"name_not_clash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stereotypeEClass, this.getString(), "getKeyword", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "localize", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(stereotypeEClass, this.getClass_(),
				"getExtendedMetaclasses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stereotypeEClass, this.getClass_(),
				"getAllExtendedMetaclasses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Content(), this.getString(), "content", null,
				0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Location(), this.getString(), "location", null,
				0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Format(), this.getString(), "format", null, 0,
				1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_MetamodelReference(),
				this.getPackageImport(), null, "metamodelReference", null, 0,
				-1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getProfile_MetaclassReference(),
				this.getElementImport(), null, "metaclassReference", null, 0,
				-1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(profileEClass, theEcorePackage_1.getEPackage(),
				"define", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 1,
				1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileEClass, theEcorePackage_1.getENamedElement(),
				"getDefinition", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "namedElement", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(profileEClass, theEcorePackage_1.getEPackage(),
				"op_define", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileEClass, ecorePackage.getEBoolean(),
				"metaclass_reference_not_specialized", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileEClass, this.getStereotype(),
				"createOwnedStereotype", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isAbstract", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(profileEClass, this.getClass_(),
				"getReferencedMetaclasses", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileEClass, ecorePackage.getEBoolean(),
				"references_same_metamodel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(profileEClass, this.getBoolean(), "isDefined", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		addEOperation(profileEClass, theEcorePackage_1.getEPackage(),
				"op_getDefinition", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileEClass, theEcorePackage_1.getEObject(),
				"create", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "classifier", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(profileEClass, this.getModel(),
				"getReferencedMetamodels", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileEClass, this.getExtension(),
				"getOwnedExtensions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "requiredOnly", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(profileEClass, this.getStereotype(),
				"getterOwnedStereotype", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSet_Parameter(), this.getParameter(), this
				.getParameter_ParameterSet(), "parameter", null, 1, -1,
				ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterSet_Condition(), this.getConstraint(), null,
				"condition", null, 0, -1, ParameterSet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(parameterSetEClass, ecorePackage.getEBoolean(),
				"input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterSetEClass, ecorePackage.getEBoolean(),
				"same_parameterized_entity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterSetEClass, ecorePackage.getEBoolean(),
				"two_parameter_sets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_OwnedOperation(), this.getOperation(), this
				.getOperation_Datatype(), "ownedOperation", null, 0, -1,
				DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_OwnedAttribute(), this.getProperty(), this
				.getProperty_Datatype(), "ownedAttribute", null, 0, -1,
				DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataTypeEClass, this.getOperation(),
				"createOwnedOperation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(dataTypeEClass, this.getProperty(),
				"createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(operationTemplateParameterEClass,
				OperationTemplateParameter.class, "OperationTemplateParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralFeatureEClass, StructuralFeature.class,
				"StructuralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_IsReadOnly(), this.getBoolean(),
				"isReadOnly", "false", 1, 1, StructuralFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectableElementTemplateParameterEClass,
				ConnectableElementTemplateParameter.class,
				"ConnectableElementTemplateParameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborationUseEClass, CollaborationUse.class,
				"CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_RoleBinding(), this.getDependency(),
				null, "roleBinding", null, 0, -1, CollaborationUse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getCollaborationUse_Type(), this.getCollaboration(),
				null, "type", null, 1, 1, CollaborationUse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(collaborationUseEClass, ecorePackage.getEBoolean(),
				"connectors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collaborationUseEClass, ecorePackage.getEBoolean(),
				"client_elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collaborationUseEClass, ecorePackage.getEBoolean(),
				"every_role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_CollaborationRole(), this
				.getConnectableElement(), null, "collaborationRole", null, 0,
				-1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_ExtensionPoint(), this.getExtensionPoint(),
				this.getExtensionPoint_UseCase(), "extensionPoint", null, 0,
				-1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Extend(), this.getExtend(), this
				.getExtend_Extension(), "extend", null, 0, -1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getUseCase_Subject(), this.getClassifier(), this
				.getClassifier_UseCase(), "subject", null, 0, -1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Include(), this.getInclude(), this
				.getInclude_IncludingCase(), "include", null, 0, -1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		addEOperation(useCaseEClass, this.getUseCase(), "allIncludedUseCases",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(useCaseEClass, ecorePackage.getEBoolean(),
				"cannot_include_self", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(useCaseEClass, ecorePackage.getEBoolean(),
				"binary_associations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(useCaseEClass, ecorePackage.getEBoolean(),
				"no_association_to_use_case", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(useCaseEClass, ecorePackage.getEBoolean(),
				"must_have_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclude_IncludingCase(), this.getUseCase(), this
				.getUseCase_Include(), "includingCase", null, 1, 1,
				Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getInclude_Addition(), this.getUseCase(), null,
				"addition", null, 1, 1, Include.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtend_Extension(), this.getUseCase(), this
				.getUseCase_Extend(), "extension", null, 1, 1, Extend.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExtend_ExtendedCase(), this.getUseCase(), null,
				"extendedCase", null, 1, 1, Extend.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtend_Condition(), this.getConstraint(), null,
				"condition", null, 0, 1, Extend.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtend_ExtensionLocation(), this.getExtensionPoint(),
				null, "extensionLocation", null, 1, -1, Extend.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(extendEClass, ecorePackage.getEBoolean(),
				"extension_points", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionPointEClass, ExtensionPoint.class,
				"ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionPoint_UseCase(), this.getUseCase(), this
				.getUseCase_ExtensionPoint(), "useCase", null, 1, 1,
				ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(extensionPointEClass, ecorePackage.getEBoolean(),
				"must_have_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		initEClass(redefinableTemplateSignatureEClass,
				RedefinableTemplateSignature.class,
				"RedefinableTemplateSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinableTemplateSignature_ExtendedSignature(),
				this.getRedefinableTemplateSignature(), null,
				"extendedSignature", null, 0, -1,
				RedefinableTemplateSignature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableTemplateSignature_Classifier(), this
				.getClassifier(), null, "classifier", null, 1, 1,
				RedefinableTemplateSignature.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(redefinableTemplateSignatureEClass, this
				.getTemplateParameter(), "getInheritedParameters", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(redefinableTemplateSignatureEClass, ecorePackage
				.getEBoolean(), "inherited_parameters", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(redefinableTemplateSignatureEClass, this
				.getTemplateParameter(), "getterInheritedParameter", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initializePackageContents2();
	}
	public void initializePackageContents2() {
		
		// Obtain other dependent packages
		ecore.EcorePackage theEcorePackage_1 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);
		FsmPackage theFsmPackage = (FsmPackage) EPackage.Registry.INSTANCE
				.getEPackage(FsmPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		
		initEClass(classifierTemplateParameterEClass,
				ClassifierTemplateParameter.class,
				"ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierTemplateParameter_ConstrainingClassifier(),
				this.getClassifier(), null, "constrainingClassifier", null, 0,
				-1, ClassifierTemplateParameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifierTemplateParameter_AllowSubstitutable(),
				this.getBoolean(), "allowSubstitutable", "true", 1, 1,
				ClassifierTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		EOperation op = addEOperation(classifierTemplateParameterEClass, ecorePackage
				.getEBoolean(), "has_constraining_classifier", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class,
				"StringExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringExpression_SubExpression(), this
				.getStringExpression(), this
				.getStringExpression_OwningExpression(), "subExpression", null,
				0, -1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringExpression_OwningExpression(), this
				.getStringExpression(), this
				.getStringExpression_SubExpression(), "owningExpression", null,
				0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(stringExpressionEClass, theEcorePackage_1
				.getEBoolean(), "operands", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_1.getEDiagnosticChain(),
				"diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage_1.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringExpressionEClass, ecorePackage.getEBoolean(),
				"subexpressions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Symbol(), this.getString(), "symbol",
				null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExpression_Operand(), this.getValueSpecification(),
				null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(),
				null, "mergedPackage", null, 1, 1, PackageMerge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getPackageMerge_ReceivingPackage(), this.getPackage(),
				this.getPackage_PackageMerge(), "receivingPackage", null, 1, 1,
				PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(profileApplicationEClass, ProfileApplication.class,
				"ProfileApplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfileApplication_IsStrict(), this.getBoolean(),
				"isStrict", "false", 1, 1, ProfileApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfileApplication_AppliedProfile(), this
				.getProfile(), null, "appliedProfile", null, 1, 1,
				ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfileApplication_ApplyingPackage(), this
				.getPackage(), this.getPackage_ProfileApplication(),
				"applyingPackage", null, 1, 1, ProfileApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(profileApplicationEClass,
				theEcorePackage_1.getEPackage(), "op_getAppliedDefinition", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(profileApplicationEClass, theEcorePackage_1
				.getENamedElement(), "getAppliedDefinition", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "namedElement", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this
				.getEnumerationLiteral(), this
				.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0,
				-1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class,
				"EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this
				.getEnumeration(), this.getEnumeration_OwnedLiteral(),
				"enumeration", null, 0, 1, EnumerationLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(instanceSpecificationEClass, InstanceSpecification.class,
				"InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecification_Specification(), this
				.getValueSpecification(), null, "specification", null, 0, 1,
				InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Classifier(), this
				.getClassifier(), null, "classifier", null, 0, -1,
				InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this
				.getSlot_OwningInstance(), "slot", null, 0, -1,
				InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(instanceSpecificationEClass, ecorePackage
				.getEBoolean(), "structural_feature", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(instanceSpecificationEClass, ecorePackage
				.getEBoolean(), "deployment_artifact", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(instanceSpecificationEClass, ecorePackage
				.getEBoolean(), "defining_feature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(instanceSpecificationEClass, ecorePackage
				.getEBoolean(), "deployment_target", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(),
				null, "definingFeature", null, 1, 1, Slot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlot_Value(), this.getValueSpecification(), null,
				"value", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_OwningInstance(), this
				.getInstanceSpecification(), this
				.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1,
				Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalSpecificationEClass, LiteralSpecification.class,
				"LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class,
				"LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), this.getInteger(), "value",
				"0", 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), this.getString(), "value",
				null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class,
				"LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), this.getBoolean(), "value",
				"false", 1, 1, LiteralBoolean.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceValue_Instance(), this
				.getInstanceSpecification(), null, "instance", null, 1, 1,
				InstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalUnlimitedNaturalEClass,
				LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralUnlimitedNatural_Value(), this
				.getUnlimitedNatural(), "value", "0", 1, 1,
				LiteralUnlimitedNatural.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(opaqueBehaviorEClass, OpaqueBehavior.class,
				"OpaqueBehavior", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueBehavior_Body(), this.getString(), "body",
				null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOpaqueBehavior_Language(), this.getString(),
				"language", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionBehaviorEClass, FunctionBehavior.class,
				"FunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(functionBehaviorEClass, ecorePackage.getEBoolean(),
				"one_output_parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(functionBehaviorEClass, ecorePackage.getEBoolean(),
				"types_of_parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueAction_Body(), this.getString(), "body", null,
				0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOpaqueAction_OutputValue(), this.getOutputPin(),
				null, "outputValue", null, 0, -1, OpaqueAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOpaqueAction_InputValue(), this.getInputPin(), null,
				"inputValue", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueAction_Language(), this.getString(),
				"language", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_LocalPostcondition(), this.getConstraint(),
				null, "localPostcondition", null, 0, -1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getAction_LocalPrecondition(), this.getConstraint(),
				null, "localPrecondition", null, 0, -1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(actionEClass, this.getInputPin(), "getterInput", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(actionEClass, this.getClassifier(), "getterContext", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actionEClass, this.getOutputPin(), "getterOutput", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(executableNodeEClass, ExecutableNode.class,
				"ExecutableNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableNode_Handler(), this.getExceptionHandler(),
				this.getExceptionHandler_ProtectedNode(), "handler", null, 0,
				-1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this
				.getActivityEdge_Target(), "incoming", null, 0, -1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_RedefinedNode(), this.getActivityNode(),
				null, "redefinedNode", null, 0, -1, ActivityNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getActivityNode_InPartition(), this
				.getActivityPartition(), this.getActivityPartition_Node(),
				"inPartition", null, 0, -1, ActivityNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InStructuredNode(), this
				.getStructuredActivityNode(), this
				.getStructuredActivityNode_Node(), "inStructuredNode", null, 0,
				1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InInterruptibleRegion(), this
				.getInterruptibleActivityRegion(), this
				.getInterruptibleActivityRegion_Node(),
				"inInterruptibleRegion", null, 0, -1, ActivityNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getActivityNode_Activity(), this.getActivity(), this
				.getActivity_Node(), "activity", null, 0, 1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this
				.getActivityEdge_Source(), "outgoing", null, 0, -1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityNodeEClass, ecorePackage.getEBoolean(),
				"owned_structured_node", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityNodeEClass, ecorePackage.getEBoolean(),
				"owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityNodeEClass, this.getActivityGroup(),
				"getterInGroup", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class,
				"StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredActivityNode_MustIsolate(), this
				.getBoolean(), "mustIsolate", "false", 1, 1,
				StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getStructuredActivityNode_Node(),
				this.getActivityNode(),
				this.getActivityNode_InStructuredNode(), "node", null, 0, -1,
				StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Edge(),
				this.getActivityEdge(),
				this.getActivityEdge_InStructuredNode(), "edge", null, 0, -1,
				StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Variable(),
				this.getVariable(), this.getVariable_Scope(), "variable", null,
				0, -1, StructuredActivityNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(structuredActivityNodeEClass, ecorePackage
				.getEBoolean(), "edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGroup_InActivity(), this.getActivity(), this
				.getActivity_Group(), "inActivity", null, 0, 1,
				ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityGroupEClass, ecorePackage.getEBoolean(),
				"group_owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityGroupEClass, ecorePackage.getEBoolean(),
				"nodes_and_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityGroupEClass, ecorePackage.getEBoolean(),
				"not_contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityGroupEClass, this.getActivityNode(),
				"getterContainedNode", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(activityGroupEClass, this.getActivityGroup(),
				"getterSuperGroup", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(activityGroupEClass, this.getActivityEdge(),
				"getterContainedEdge", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(activityGroupEClass, this.getActivityGroup(),
				"getterSubgroup", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Node(), this.getActivityNode(), this
				.getActivityNode_Activity(), "node", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Edge(), this.getActivityEdge(), this
				.getActivityEdge_Activity(), "edge", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Partition(), this.getActivityPartition(),
				null, "partition", null, 0, -1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsReadOnly(), this.getBoolean(),
				"isReadOnly", "false", 1, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Group(), this.getActivityGroup(), this
				.getActivityGroup_InActivity(), "group", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsSingleExecution(), this.getBoolean(),
				"isSingleExecution", "false", 1, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Variable(), this.getVariable(), this
				.getVariable_ActivityScope(), "variable", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEBoolean(),
				"activity_parameter_node", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEBoolean(),
				"autonomous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEClass, ecorePackage.getEBoolean(),
				"no_supergroups", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEClass, this.getStructuredActivityNode(),
				"getterStructuredNode", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Scope(), this.getStructuredActivityNode(),
				this.getStructuredActivityNode_Variable(), "scope", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_ActivityScope(), this.getActivity(), this
				.getActivity_Variable(), "activityScope", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(variableEClass, this.getBoolean(), "isAccessibleBy",
				1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAction(), "a", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(variableEClass, ecorePackage.getEBoolean(), "owned",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Weight(), this.getValueSpecification(),
				null, "weight", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this
				.getActivityNode_Outgoing(), "source", null, 1, 1,
				ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Interrupts(), this
				.getInterruptibleActivityRegion(), this
				.getInterruptibleActivityRegion_InterruptingEdge(),
				"interrupts", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InPartition(), this
				.getActivityPartition(), this.getActivityPartition_Edge(),
				"inPartition", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Guard(), this.getValueSpecification(),
				null, "guard", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this
				.getActivityNode_Incoming(), "target", null, 1, 1,
				ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InStructuredNode(), this
				.getStructuredActivityNode(), this
				.getStructuredActivityNode_Edge(), "inStructuredNode", null, 0,
				1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_RedefinedEdge(), this.getActivityEdge(),
				null, "redefinedEdge", null, 0, -1, ActivityEdge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getActivityEdge_Activity(), this.getActivity(), this
				.getActivity_Edge(), "activity", null, 0, 1,
				ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityEdgeEClass, ecorePackage.getEBoolean(),
				"structured_node", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEdgeEClass, ecorePackage.getEBoolean(),
				"source_and_target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityEdgeEClass, ecorePackage.getEBoolean(),
				"owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(activityEdgeEClass, this.getActivityGroup(),
				"getterInGroup", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(activityPartitionEClass, ActivityPartition.class,
				"ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityPartition_IsDimension(), this.getBoolean(),
				"isDimension", "false", 1, 1, ActivityPartition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Node(), this.getActivityNode(),
				this.getActivityNode_InPartition(), "node", null, 0, -1,
				ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Represents(), this.getElement(),
				null, "represents", null, 0, 1, ActivityPartition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getActivityPartition_Edge(), this.getActivityEdge(),
				this.getActivityEdge_InPartition(), "edge", null, 0, -1,
				ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Subpartition(), this
				.getActivityPartition(), this
				.getActivityPartition_SuperPartition(), "subpartition", null,
				0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityPartition_IsExternal(), this.getBoolean(),
				"isExternal", "false", 1, 1, ActivityPartition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_SuperPartition(), this
				.getActivityPartition(), this
				.getActivityPartition_Subpartition(), "superPartition", null,
				0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityPartitionEClass, ecorePackage.getEBoolean(),
				"represents_part_and_is_contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityPartitionEClass, ecorePackage.getEBoolean(),
				"represents_part", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityPartitionEClass, ecorePackage.getEBoolean(),
				"dimension_not_contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityPartitionEClass, ecorePackage.getEBoolean(),
				"represents_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interruptibleActivityRegionEClass,
				InterruptibleActivityRegion.class,
				"InterruptibleActivityRegion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptibleActivityRegion_InterruptingEdge(), this
				.getActivityEdge(), this.getActivityEdge_Interrupts(),
				"interruptingEdge", null, 0, -1,
				InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterruptibleActivityRegion_Node(), this
				.getActivityNode(), this
				.getActivityNode_InInterruptibleRegion(), "node", null, 0, -1,
				InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(interruptibleActivityRegionEClass, ecorePackage
				.getEBoolean(), "interrupting_edges", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class,
				"ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_HandlerBody(), this
				.getExecutableNode(), null, "handlerBody", null, 1, 1,
				ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionType(), this
				.getClassifier(), null, "exceptionType", null, 1, -1,
				ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_ProtectedNode(), this
				.getExecutableNode(), this.getExecutableNode_Handler(),
				"protectedNode", null, 1, 1, ExceptionHandler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionInput(), this
				.getObjectNode(), null, "exceptionInput", null, 1, 1,
				ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(exceptionHandlerEClass, ecorePackage.getEBoolean(),
				"one_input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionHandlerEClass, ecorePackage.getEBoolean(),
				"exception_body", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionHandlerEClass, ecorePackage.getEBoolean(),
				"edge_source_target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionHandlerEClass, ecorePackage.getEBoolean(),
				"result_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectNode_InState(), this.getState(), null,
				"inState", null, 0, -1, ObjectNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectNode_IsControlType(), this.getBoolean(),
				"isControlType", "false", 1, 1, ObjectNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectNode_Ordering(), this
				.getObjectNodeOrderingKind(), "ordering", "FIFO", 1, 1,
				ObjectNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectNode_UpperBound(),
				this.getValueSpecification(), null, "upperBound", null, 1, 1,
				ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectNode_Selection(), this.getBehavior(), null,
				"selection", null, 0, 1, ObjectNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(objectNodeEClass, ecorePackage.getEBoolean(),
				"input_output_parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectNodeEClass, ecorePackage.getEBoolean(),
				"not_unique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectNodeEClass, ecorePackage.getEBoolean(),
				"selection_behavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectNodeEClass, ecorePackage.getEBoolean(),
				"object_flow_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outputPinEClass, ecorePackage.getEBoolean(),
				"incoming_edges_structured_only", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_IsControl(), this.getBoolean(), "isControl",
				"false", 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(pinEClass, ecorePackage.getEBoolean(),
				"control_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(inputPinEClass, ecorePackage.getEBoolean(),
				"outgoing_edges_structured_only", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallAction_IsSynchronous(), this.getBoolean(),
				"isSynchronous", "true", 1, 1, CallAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getCallAction__result(), this.getOutputPin(), null,
				"_result", null, 0, -1, CallAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(callActionEClass, ecorePackage.getEBoolean(),
				"type_ordering_multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callActionEClass, ecorePackage.getEBoolean(),
				"number_and_order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callActionEClass, ecorePackage.getEBoolean(),
				"synchronous_call", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(invocationActionEClass, InvocationAction.class,
				"InvocationAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationAction_Argument(), this.getInputPin(),
				null, "argument", null, 0, -1, InvocationAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getInvocationAction_OnPort(), this.getPort(), null,
				"onPort", null, 0, 1, InvocationAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(invocationActionEClass, ecorePackage.getEBoolean(),
				"on_port_receiver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class,
				"SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null,
				"target", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendSignalAction_Signal(), this.getSignal(), null,
				"signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(sendSignalActionEClass, ecorePackage.getEBoolean(),
				"type_ordering_multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sendSignalActionEClass, ecorePackage.getEBoolean(),
				"number_order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callOperationActionEClass, CallOperationAction.class,
				"CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallOperationAction_Operation(), this.getOperation(),
				null, "operation", null, 1, 1, CallOperationAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getCallOperationAction_Target(), this.getInputPin(),
				null, "target", null, 1, 1, CallOperationAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(callOperationActionEClass, ecorePackage
				.getEBoolean(), "result_pin_equal_parameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callOperationActionEClass, ecorePackage
				.getEBoolean(), "type_target_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callOperationActionEClass, ecorePackage
				.getEBoolean(), "argument_pin_equal_parameter", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class,
				"CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallBehaviorAction_Behavior(), this.getBehavior(),
				null, "behavior", null, 1, 1, CallBehaviorAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(callBehaviorActionEClass,
				ecorePackage.getEBoolean(), "result_pin_equal_parameter", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(callBehaviorActionEClass,
				ecorePackage.getEBoolean(), "argument_pin_equal_parameter", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceNode_ExecutableNode(), this
				.getExecutableNode(), null, "executableNode", null, 0, -1,
				SequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(controlFlowEClass, ecorePackage.getEBoolean(),
				"object_nodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(initialNodeEClass, ecorePackage.getEBoolean(),
				"no_incoming_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(initialNodeEClass, ecorePackage.getEBoolean(),
				"control_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class,
				"ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityParameterNode_Parameter(), this
				.getParameter(), null, "parameter", null, 1, 1,
				ActivityParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "maximum_one_parameter_node", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "no_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "has_parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "no_incoming_edges", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "maximum_two_parameter_nodes", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "no_outgoing_edges", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(activityParameterNodeEClass, ecorePackage
				.getEBoolean(), "same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePin_Value(), this.getValueSpecification(), null,
				"value", null, 1, 1, ValuePin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(valuePinEClass, ecorePackage.getEBoolean(),
				"no_incoming_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(valuePinEClass, ecorePackage.getEBoolean(),
				"compatible_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Argument(), this.getValueSpecification(),
				null, "argument", null, 0, -1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null,
				"receiveEvent", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Connector(), this.getConnector(), null,
				"connector", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Interaction(), this.getInteraction(), this
				.getInteraction_Message(), "interaction", null, 1, 1,
				Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(),
				"messageSort", "synchCall", 1, 1, Message.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), null,
				"sendEvent", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"signature_is_operation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"occurrence_specifications", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"cannot_cross_boundaries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"arguments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(messageEClass, this.getMessageKind(),
				"getMessageKindEMF_renameAs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"sending_receiving_message_event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"signature_refer_to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(messageEClass, ecorePackage.getEBoolean(),
				"signature_is_signal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(messageEClass, this.getNamedElement(),
				"getSignatureEMF_renameAs", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(messageEClass, this.getMessageKind(),
				"getterMessageKind", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(messageEClass, this.getNamedElement(), "getterSignature",
				0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEnd_Message(), this.getMessage(), null,
				"message", null, 0, 1, MessageEnd.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Message(), this.getMessage(), this
				.getMessage_Interaction(), "message", null, 0, -1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Lifeline(), this.getLifeline(), this
				.getLifeline_Interaction(), "lifeline", null, 0, -1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Action(), this.getAction(), null,
				"action", null, 0, -1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Fragment(),
				this.getInteractionFragment(), this
						.getInteractionFragment_EnclosingInteraction(),
				"fragment", null, 0, -1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_FormalGate(), this.getGate(), null,
				"formalGate", null, 0, -1, Interaction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionFragmentEClass, InteractionFragment.class,
				"InteractionFragment", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFragment_EnclosingOperand(), this
				.getInteractionOperand(),
				this.getInteractionOperand_Fragment(), "enclosingOperand",
				null, 0, 1, InteractionFragment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_GeneralOrdering(), this
				.getGeneralOrdering(), null, "generalOrdering", null, 0, -1,
				InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingInteraction(), this
				.getInteraction(), this.getInteraction_Fragment(),
				"enclosingInteraction", null, 0, 1, InteractionFragment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInteractionFragment_Covered(), this.getLifeline(),
				this.getLifeline_CoveredBy(), "covered", null, 0, -1,
				InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeline_Selector(), this.getValueSpecification(),
				null, "selector", null, 0, 1, Lifeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Represents(), this.getConnectableElement(),
				null, "represents", null, 0, 1, Lifeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(),
				this.getInteractionFragment_Covered(), "coveredBy", null, 0,
				-1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Interaction(), this.getInteraction(), this
				.getInteraction_Lifeline(), "interaction", null, 1, 1,
				Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_DecomposedAs(), this.getPartDecomposition(),
				null, "decomposedAs", null, 0, 1, Lifeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(lifelineEClass, ecorePackage.getEBoolean(),
				"selector_specified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lifelineEClass, ecorePackage.getEBoolean(),
				"same_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lifelineEClass, ecorePackage.getEBoolean(),
				"interaction_uses_share_lifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partDecompositionEClass, PartDecomposition.class,
				"PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(partDecompositionEClass, ecorePackage.getEBoolean(),
				"parts_of_internal_structures", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(partDecompositionEClass, ecorePackage.getEBoolean(),
				"commutativity_of_decomposition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(partDecompositionEClass, ecorePackage.getEBoolean(),
				"assume", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionUseEClass, InteractionUse.class,
				"InteractionUse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionUse_Argument(), this.getAction(), null,
				"argument", null, 0, -1, InteractionUse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_RefersTo(), this.getInteraction(),
				null, "refersTo", null, 1, 1, InteractionUse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInteractionUse_ActualGate(), this.getGate(), null,
				"actualGate", null, 0, -1, InteractionUse.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(interactionUseEClass, ecorePackage.getEBoolean(),
				"arguments_correspond_to_parameters", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionUseEClass, ecorePackage.getEBoolean(),
				"arguments_are_constants", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionUseEClass, ecorePackage.getEBoolean(),
				"gates_match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionUseEClass, ecorePackage.getEBoolean(),
				"all_lifelines", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(gateEClass, ecorePackage.getEBoolean(),
				"messages_combined_fragment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(gateEClass, ecorePackage.getEBoolean(),
				"messages_actual_gate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalOrderingEClass, GeneralOrdering.class,
				"GeneralOrdering", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralOrdering_After(), this
				.getOccurrenceSpecification(), this
				.getOccurrenceSpecification_ToBefore(), "after", null, 1, 1,
				GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralOrdering_Before(), this
				.getOccurrenceSpecification(), this
				.getOccurrenceSpecification_ToAfter(), "before", null, 1, 1,
				GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(occurrenceSpecificationEClass,
				OccurrenceSpecification.class, "OccurrenceSpecification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrenceSpecification_ToAfter(), this
				.getGeneralOrdering(), this.getGeneralOrdering_Before(),
				"toAfter", null, 0, -1, OccurrenceSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOccurrenceSpecification_Event(), this.getEvent(),
				null, "event", null, 1, 1, OccurrenceSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getOccurrenceSpecification_ToBefore(), this
				.getGeneralOrdering(), this.getGeneralOrdering_After(),
				"toBefore", null, 0, -1, OccurrenceSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(interactionOperandEClass, InteractionOperand.class,
				"InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionOperand_Guard(), this
				.getInteractionConstraint(), null, "guard", null, 0, 1,
				InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionOperand_Fragment(), this
				.getInteractionFragment(), this
				.getInteractionFragment_EnclosingOperand(), "fragment", null,
				0, -1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(interactionOperandEClass,
				ecorePackage.getEBoolean(), "guard_contain_references", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionOperandEClass,
				ecorePackage.getEBoolean(), "guard_directly_prior", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionConstraintEClass, InteractionConstraint.class,
				"InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionConstraint_Maxint(), this
				.getValueSpecification(), null, "maxint", null, 0, 1,
				InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionConstraint_Minint(), this
				.getValueSpecification(), null, "minint", null, 0, 1,
				InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "minint_maxint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "dynamic_variables", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "global_data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "maxint_greater_equal_minint", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "minint_non_negative", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(interactionConstraintEClass, ecorePackage
				.getEBoolean(), "maxint_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionSpecificationEClass, ExecutionSpecification.class,
				"ExecutionSpecification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionSpecification_Finish(), this
				.getOccurrenceSpecification(), null, "finish", null, 1, 1,
				ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionSpecification_Start(), this
				.getOccurrenceSpecification(), null, "start", null, 1, 1,
				ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(executionSpecificationEClass, ecorePackage
				.getEBoolean(), "same_lifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateInvariantEClass, StateInvariant.class,
				"StateInvariant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateInvariant_Invariant(), this.getConstraint(),
				null, "invariant", null, 1, 1, StateInvariant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(actionExecutionSpecificationEClass,
				ActionExecutionSpecification.class,
				"ActionExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExecutionSpecification_Action(), this
				.getAction(), null, "action", null, 1, 1,
				ActionExecutionSpecification.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(actionExecutionSpecificationEClass, ecorePackage
				.getEBoolean(), "action_referenced", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(behaviorExecutionSpecificationEClass,
				BehaviorExecutionSpecification.class,
				"BehaviorExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorExecutionSpecification_Behavior(), this
				.getBehavior(), null, "behavior", null, 0, 1,
				BehaviorExecutionSpecification.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executionEventEClass, ExecutionEvent.class,
				"ExecutionEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(creationEventEClass, CreationEvent.class, "CreationEvent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(creationEventEClass, ecorePackage.getEBoolean(),
				"no_occurrence_above", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destructionEventEClass, DestructionEvent.class,
				"DestructionEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(destructionEventEClass, ecorePackage.getEBoolean(),
				"no_occurrence_specifications_below", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sendOperationEventEClass, SendOperationEvent.class,
				"SendOperationEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendOperationEvent_Operation(), this.getOperation(),
				null, "operation", null, 1, 1, SendOperationEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendSignalEventEClass, SendSignalEvent.class,
				"SendSignalEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalEvent_Signal(), this.getSignal(), null,
				"signal", null, 1, 1, SendSignalEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageOccurrenceSpecificationEClass,
				MessageOccurrenceSpecification.class,
				"MessageOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionOccurrenceSpecificationEClass,
				ExecutionOccurrenceSpecification.class,
				"ExecutionOccurrenceSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionOccurrenceSpecification_Execution(), this
				.getExecutionSpecification(), null, "execution", null, 1, 1,
				ExecutionOccurrenceSpecification.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiveOperationEventEClass, ReceiveOperationEvent.class,
				"ReceiveOperationEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveOperationEvent_Operation(), this
				.getOperation(), null, "operation", null, 1, 1,
				ReceiveOperationEvent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiveSignalEventEClass, ReceiveSignalEvent.class,
				"ReceiveSignalEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveSignalEvent_Signal(), this.getSignal(), null,
				"signal", null, 1, 1, ReceiveSignalEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(actorEClass, ecorePackage.getEBoolean(),
				"associations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(actorEClass, ecorePackage.getEBoolean(),
				"must_have_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callEventEClass, CallEvent.class, "CallEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallEvent_Operation(), this.getOperation(), null,
				"operation", null, 1, 1, CallEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEvent_ChangeExpression(), this
				.getValueSpecification(), null, "changeExpression", null, 1, 1,
				ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(signalEventEClass, SignalEvent.class, "SignalEvent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalEvent_Signal(), this.getSignal(), null,
				"signal", null, 1, 1, SignalEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(anyReceiveEventEClass, AnyReceiveEvent.class,
				"AnyReceiveEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(forkNodeEClass, ecorePackage.getEBoolean(),
				"one_incoming_edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(forkNodeEClass, ecorePackage.getEBoolean(), "edges",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(finalNodeEClass, ecorePackage.getEBoolean(),
				"no_outgoing_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(centralBufferNodeEClass, CentralBufferNode.class,
				"CentralBufferNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mergeNodeEClass, ecorePackage.getEBoolean(),
				"one_outgoing_edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mergeNodeEClass, ecorePackage.getEBoolean(),
				"edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionNode_DecisionInput(), this.getBehavior(),
				null, "decisionInput", null, 0, 1, DecisionNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getDecisionNode_DecisionInputFlow(), this
				.getObjectFlow(), null, "decisionInputFlow", null, 0, 1,
				DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"incoming_outgoing_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"incoming_control_one_input_parameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"two_input_parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"incoming_object_one_input_parameter", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"decision_input_flow_incoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(decisionNodeEClass, ecorePackage.getEBoolean(),
				"zero_input_parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectFlow_IsMulticast(), this.getBoolean(),
				"isMulticast", "false", 1, 1, ObjectFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectFlow_IsMultireceive(), this.getBoolean(),
				"isMultireceive", "false", 1, 1, ObjectFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Selection(), this.getBehavior(), null,
				"selection", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Transformation(), this.getBehavior(),
				null, "transformation", null, 0, 1, ObjectFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"no_actions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"same_upper_bounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"compatible_types", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"transformation_behaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"op_target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"selection_behaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"is_multicast_or_is_multireceive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectFlowEClass, ecorePackage.getEBoolean(),
				"input_and_output_parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class,
				"ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentRealizationEClass, ComponentRealization.class,
				"ComponentRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRealization_Abstraction(), this
				.getComponent(), this.getComponent_Realization(),
				"abstraction", null, 0, 1, ComponentRealization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getComponentRealization_RealizingClassifier(), this
				.getClassifier(), null, "realizingClassifier", null, 1, -1,
				ComponentRealization.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_PackagedElement(), this
				.getPackageableElement(), null, "packagedElement", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponent_IsIndirectlyInstantiated(), this
				.getBoolean(), "isIndirectlyInstantiated", "true", 1, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Realization(), this
				.getComponentRealization(), this
				.getComponentRealization_Abstraction(), "realization", null, 0,
				-1, Component.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(componentEClass, this.getInterface(),
				"realizedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "classifier", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(componentEClass, this.getInterface(), "getProvideds", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(componentEClass, this.getInterface(), "getRequireds", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(componentEClass, this.getInterface(),
				"createOwnedInterface", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(componentEClass, this.getPrimitiveType(),
				"createOwnedPrimitiveType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(componentEClass, this.getClass_(),
				"createOwnedClass", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isAbstract", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(componentEClass, this.getInterface(),
				"usedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "classifier", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(componentEClass, this.getEnumeration(),
				"createOwnedEnumeration", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);

		addEOperation(componentEClass, this.getInterface(), "getterProvided",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(componentEClass, this.getInterface(), "getterRequired",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_NestedNode(), this.getNode(), null,
				"nestedNode", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(nodeEClass, this.getCommunicationPath(),
				"getCommunicationPaths", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nodeEClass, ecorePackage.getEBoolean(),
				"internal_structure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(nodeEClass, this.getCommunicationPath(),
				"createCommunicationPath", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end1IsNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end1Aggregation", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end1Name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getInteger(), "end1Lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end1Upper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNode(), "end1Node", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end2IsNavigable", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end2Aggregation", 1, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end2Name", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getInteger(), "end2Lower", 1, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end2Upper", 1, 1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(communicationPathEClass, CommunicationPath.class,
				"CommunicationPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class,
				"ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinedFragmentEClass, CombinedFragment.class,
				"CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(),
				null, "cfragmentGate", null, 0, -1, CombinedFragment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getCombinedFragment_InteractionOperator(), this
				.getInteractionOperatorKind(), "interactionOperator", "seq", 1,
				1, CombinedFragment.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getCombinedFragment_Operand(), this
				.getInteractionOperand(), null, "operand", null, 1, -1,
				CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(combinedFragmentEClass, ecorePackage.getEBoolean(),
				"_break", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(combinedFragmentEClass, ecorePackage.getEBoolean(),
				"consider_and_ignore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(combinedFragmentEClass, ecorePackage.getEBoolean(),
				"opt_loop_break_neg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(combinedFragmentEClass, ecorePackage.getEBoolean(),
				"minint_and_maxint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(continuationEClass, Continuation.class, "Continuation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuation_Setting(), this.getBoolean(), "setting",
				"true", 1, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(continuationEClass, ecorePackage.getEBoolean(),
				"same_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuationEClass, ecorePackage.getEBoolean(),
				"first_or_last_interaction_fragment", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(continuationEClass, ecorePackage.getEBoolean(),
				"global", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(considerIgnoreFragmentEClass, ConsiderIgnoreFragment.class,
				"ConsiderIgnoreFragment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsiderIgnoreFragment_Message(), this
				.getNamedElement(), null, "message", null, 0, -1,
				ConsiderIgnoreFragment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(considerIgnoreFragmentEClass, ecorePackage
				.getEBoolean(), "consider_or_ignore", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(considerIgnoreFragmentEClass, ecorePackage
				.getEBoolean(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class,
				"CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction__result(), this.getOutputPin(),
				null, "_result", null, 1, 1, CreateObjectAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getCreateObjectAction_Classifier(),
				this.getClassifier(), null, "classifier", null, 1, 1,
				CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(createObjectActionEClass,
				ecorePackage.getEBoolean(), "classifier_not_association_class",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(createObjectActionEClass,
				ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(createObjectActionEClass,
				ecorePackage.getEBoolean(), "classifier_not_abstract", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(createObjectActionEClass,
				ecorePackage.getEBoolean(), "same_type", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class,
				"DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestroyObjectAction_IsDestroyOwnedObjects(), this
				.getBoolean(), "isDestroyOwnedObjects", "false", 1, 1,
				DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getDestroyObjectAction_Target(), this.getInputPin(),
				null, "target", null, 1, 1, DestroyObjectAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getDestroyObjectAction_IsDestroyLinks(), this
				.getBoolean(), "isDestroyLinks", "false", 1, 1,
				DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(destroyObjectActionEClass, ecorePackage
				.getEBoolean(), "no_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(destroyObjectActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testIdentityActionEClass, TestIdentityAction.class,
				"TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIdentityAction__result(), this.getOutputPin(),
				null, "_result", null, 1, 1, TestIdentityAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTestIdentityAction_Second(), this.getInputPin(),
				null, "second", null, 1, 1, TestIdentityAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTestIdentityAction_First(), this.getInputPin(), null,
				"first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(testIdentityActionEClass,
				ecorePackage.getEBoolean(), "result_is_boolean", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testIdentityActionEClass,
				ecorePackage.getEBoolean(), "no_type", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testIdentityActionEClass,
				ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class,
				"ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSelfAction__result(), this.getOutputPin(), null,
				"_result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(readSelfActionEClass, ecorePackage.getEBoolean(),
				"not_static", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readSelfActionEClass, ecorePackage.getEBoolean(),
				"contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readSelfActionEClass, ecorePackage.getEBoolean(),
				"multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readSelfActionEClass, ecorePackage.getEBoolean(),
				"type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structuralFeatureActionEClass,
				StructuralFeatureAction.class, "StructuralFeatureAction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureAction_Object(), this.getInputPin(),
				null, "object", null, 1, 1, StructuralFeatureAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getStructuralFeatureAction_StructuralFeature(), this
				.getStructuralFeature(), null, "structuralFeature", null, 1, 1,
				StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(structuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "one_featuring_classifier", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(structuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "not_static", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(structuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "op_visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(structuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(structuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readStructuralFeatureActionEClass,
				ReadStructuralFeatureAction.class,
				"ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadStructuralFeatureAction__result(), this
				.getOutputPin(), null, "_result", null, 1, 1,
				ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(readStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "type_and_ordering", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeStructuralFeatureActionEClass,
				WriteStructuralFeatureAction.class,
				"WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteStructuralFeatureAction__result(), this
				.getOutputPin(), null, "_result", null, 0, 1,
				WriteStructuralFeatureAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWriteStructuralFeatureAction_Value(), this
				.getInputPin(), null, "value", null, 1, 1,
				WriteStructuralFeatureAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(writeStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(writeStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "type_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(writeStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_result", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearStructuralFeatureActionEClass,
				ClearStructuralFeatureAction.class,
				"ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearStructuralFeatureAction__result(), this
				.getOutputPin(), null, "_result", null, 0, 1,
				ClearStructuralFeatureAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(clearStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "type_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clearStructuralFeatureActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_result", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeStructuralFeatureValueActionEClass,
				RemoveStructuralFeatureValueAction.class,
				"RemoveStructuralFeatureValueAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveStructuralFeatureValueAction_RemoveAt(), this
				.getInputPin(), null, "removeAt", null, 0, 1,
				RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
				getRemoveStructuralFeatureValueAction_IsRemoveDuplicates(),
				this.getBoolean(), "isRemoveDuplicates", "false", 1, 1,
				RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(removeStructuralFeatureValueActionEClass,
				ecorePackage.getEBoolean(), "non_unique_removal", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(addStructuralFeatureValueActionEClass,
				AddStructuralFeatureValueAction.class,
				"AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), this
				.getInputPin(), null, "insertAt", null, 0, 1,
				AddStructuralFeatureValueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddStructuralFeatureValueAction_IsReplaceAll(), this
				.getBoolean(), "isReplaceAll", "false", 1, 1,
				AddStructuralFeatureValueAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(addStructuralFeatureValueActionEClass, ecorePackage
				.getEBoolean(), "unlimited_natural_and_multiplicity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkActionEClass, LinkAction.class, "LinkAction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null,
				"endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkAction_InputValue(), this.getInputPin(), null,
				"inputValue", null, 1, -1, LinkAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(linkActionEClass, ecorePackage.getEBoolean(),
				"same_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkActionEClass, ecorePackage.getEBoolean(),
				"same_association", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(linkActionEClass, this.getAssociation(), "association",
				1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(linkActionEClass, ecorePackage.getEBoolean(),
				"not_static", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndData_Value(), this.getInputPin(), null,
				"value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_Qualifier(), this.getQualifierValue(),
				null, "qualifier", null, 0, -1, LinkEndData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getLinkEndData_End(), this.getProperty(), null, "end",
				null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(linkEndDataEClass, ecorePackage.getEBoolean(),
				"property_is_association_end", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndDataEClass, ecorePackage.getEBoolean(),
				"qualifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndDataEClass, ecorePackage.getEBoolean(),
				"end_object_input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndDataEClass, ecorePackage.getEBoolean(),
				"multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndDataEClass, ecorePackage.getEBoolean(),
				"same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qualifierValueEClass, QualifierValue.class,
				"QualifierValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifierValue_Value(), this.getInputPin(), null,
				"value", null, 1, 1, QualifierValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualifierValue_Qualifier(), this.getProperty(), null,
				"qualifier", null, 1, 1, QualifierValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(qualifierValueEClass, ecorePackage.getEBoolean(),
				"multiplicity_of_qualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(qualifierValueEClass, ecorePackage.getEBoolean(),
				"type_of_qualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(qualifierValueEClass, ecorePackage.getEBoolean(),
				"qualifier_attribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkActionEClass, ReadLinkAction.class,
				"ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkAction__result(), this.getOutputPin(), null,
				"_result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(readLinkActionEClass, ecorePackage.getEBoolean(),
				"one_open_end", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkActionEClass, ecorePackage.getEBoolean(),
				"type_and_ordering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkActionEClass, ecorePackage.getEBoolean(),
				"op_visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkActionEClass, ecorePackage.getEBoolean(),
				"navigable_open_end", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkActionEClass, ecorePackage.getEBoolean(),
				"compatible_multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class,
				"LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndCreationData_InsertAt(), this.getInputPin(),
				null, "insertAt", null, 0, 1, LinkEndCreationData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getLinkEndCreationData_IsReplaceAll(),
				this.getBoolean(), "isReplaceAll", "false", 1, 1,
				LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(linkEndCreationDataEClass, ecorePackage
				.getEBoolean(), "single_input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndCreationDataEClass, ecorePackage
				.getEBoolean(), "create_link_action", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createLinkActionEClass, CreateLinkAction.class,
				"CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(createLinkActionEClass, ecorePackage.getEBoolean(),
				"association_not_abstract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeLinkActionEClass, WriteLinkAction.class,
				"WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(writeLinkActionEClass, ecorePackage.getEBoolean(),
				"allow_access", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class,
				"DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndDestructionDataEClass, LinkEndDestructionData.class,
				"LinkEndDestructionData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEndDestructionData_IsDestroyDuplicates(), this
				.getBoolean(), "isDestroyDuplicates", "false", 1, 1,
				LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getLinkEndDestructionData_DestroyAt(), this
				.getInputPin(), null, "destroyAt", null, 0, 1,
				LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(linkEndDestructionDataEClass, ecorePackage
				.getEBoolean(), "destroy_link_action", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkEndDestructionDataEClass, ecorePackage
				.getEBoolean(), "unlimited_natural_and_multiplicity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class,
				"ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearAssociationAction_Association(), this
				.getAssociation(), null, "association", null, 1, 1,
				ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClearAssociationAction_Object(), this.getInputPin(),
				null, "object", null, 1, 1, ClearAssociationAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(clearAssociationActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clearAssociationActionEClass, ecorePackage
				.getEBoolean(), "same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class,
				"BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastSignalAction_Signal(), this.getSignal(),
				null, "signal", null, 1, 1, BroadcastSignalAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(broadcastSignalActionEClass, ecorePackage
				.getEBoolean(), "type_ordering_multiplicity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(broadcastSignalActionEClass, ecorePackage
				.getEBoolean(), "number_and_order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sendObjectActionEClass, SendObjectAction.class,
				"SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendObjectAction_Request(), this.getInputPin(), null,
				"request", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendObjectAction_Target(), this.getInputPin(), null,
				"target", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationActionEClass,
				ValueSpecificationAction.class, "ValueSpecificationAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecificationAction__result(), this
				.getOutputPin(), null, "_result", null, 1, 1,
				ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSpecificationAction_Value(), this
				.getValueSpecification(), null, "value", null, 1, 1,
				ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(valueSpecificationActionEClass, ecorePackage
				.getEBoolean(), "compatible_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(valueSpecificationActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class,
				"TimeExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Observation(), this.getObservation(),
				null, "observation", null, 0, -1, TimeExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTimeExpression_Expr(), this.getValueSpecification(),
				null, "expr", null, 0, 1, TimeExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuration_Observation(), this.getObservation(), null,
				"observation", null, 0, -1, Duration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDuration_Expr(), this.getValueSpecification(), null,
				"expr", null, 0, 1, Duration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(durationIntervalEClass, DurationInterval.class,
				"DurationInterval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_Min(), this.getValueSpecification(), null,
				"min", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Max(), this.getValueSpecification(), null,
				"max", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeConstraintEClass, TimeConstraint.class,
				"TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConstraint_FirstEvent(), this.getBoolean(),
				"firstEvent", "true", 0, 1, TimeConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intervalConstraintEClass, IntervalConstraint.class,
				"IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationConstraintEClass, DurationConstraint.class,
				"DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationConstraint_FirstEvent(), this.getBoolean(),
				"firstEvent", "true", 0, 2, DurationConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(durationConstraintEClass,
				ecorePackage.getEBoolean(), "first_event_multiplicity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeObservationEClass, TimeObservation.class,
				"TimeObservation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeObservation_FirstEvent(), this.getBoolean(),
				"firstEvent", "true", 1, 1, TimeObservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeObservation_Event(), this.getNamedElement(),
				null, "event", null, 1, 1, TimeObservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(durationObservationEClass, DurationObservation.class,
				"DurationObservation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationObservation_FirstEvent(), this.getBoolean(),
				"firstEvent", "true", 0, 2, DurationObservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDurationObservation_Event(), this.getNamedElement(),
				null, "event", null, 1, 2, DurationObservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(durationObservationEClass, ecorePackage
				.getEBoolean(), "first_event_multiplicity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"no_outgoing_transitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"no_state_behavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"cannot_reference_submachine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"no_exit_behavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"no_entry_behavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(finalStateEClass, ecorePackage.getEBoolean(),
				"no_regions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_IsRelative(), this.getBoolean(),
				"isRelative", "false", 1, 1, TimeEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeEvent_When(), this.getTimeExpression(), null,
				"when", null, 1, 1, TimeEvent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(timeEventEClass, ecorePackage.getEBoolean(),
				"when_non_negative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(timeEventEClass, ecorePackage.getEBoolean(),
				"starting_time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableActionEClass, VariableAction.class,
				"VariableAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAction_Variable(), this.getVariable(), null,
				"variable", null, 1, 1, VariableAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(variableActionEClass, ecorePackage.getEBoolean(),
				"scope_of_variable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readVariableActionEClass, ReadVariableAction.class,
				"ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadVariableAction__result(), this.getOutputPin(),
				null, "_result", null, 1, 1, ReadVariableAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(readVariableActionEClass,
				ecorePackage.getEBoolean(), "type_and_ordering", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readVariableActionEClass,
				ecorePackage.getEBoolean(), "compatible_multiplicity", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeVariableActionEClass, WriteVariableAction.class,
				"WriteVariableAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteVariableAction_Value(), this.getInputPin(),
				null, "value", null, 1, 1, WriteVariableAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(writeVariableActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(writeVariableActionEClass, ecorePackage
				.getEBoolean(), "same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearVariableActionEClass, ClearVariableAction.class,
				"ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class,
				"AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddVariableValueAction_InsertAt(),
				this.getInputPin(), null, "insertAt", null, 0, 1,
				AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddVariableValueAction_IsReplaceAll(), this
				.getBoolean(), "isReplaceAll", "false", 1, 1,
				AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(addVariableValueActionEClass, ecorePackage
				.getEBoolean(), "single_input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeVariableValueActionEClass,
				RemoveVariableValueAction.class, "RemoveVariableValueAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveVariableValueAction_RemoveAt(), this
				.getInputPin(), null, "removeAt", null, 0, 1,
				RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRemoveVariableValueAction_IsRemoveDuplicates(), this
				.getBoolean(), "isRemoveDuplicates", "false", 1, 1,
				RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(removeVariableValueActionEClass, ecorePackage
				.getEBoolean(), "unlimited_natural", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class,
				"RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExceptionAction_Exception(), this.getInputPin(),
				null, "exception", null, 1, 1, RaiseExceptionAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(actionInputPinEClass, ActionInputPin.class,
				"ActionInputPin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInputPin_FromAction(), this.getAction(), null,
				"fromAction", null, 1, 1, ActionInputPin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(actionInputPinEClass, ecorePackage.getEBoolean(),
				"no_control_or_data_flow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(actionInputPinEClass, ecorePackage.getEBoolean(),
				"input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(actionInputPinEClass, ecorePackage.getEBoolean(),
				"one_output_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(informationItemEClass, InformationItem.class,
				"InformationItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationItem_Represented(), this.getClassifier(),
				null, "represented", null, 0, -1, InformationItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(informationItemEClass, ecorePackage.getEBoolean(),
				"has_no", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationItemEClass, ecorePackage.getEBoolean(),
				"sources_and_targets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationItemEClass, ecorePackage.getEBoolean(),
				"not_instantiable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(informationFlowEClass, InformationFlow.class,
				"InformationFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlow_RealizingMessage(),
				this.getMessage(), null, "realizingMessage", null, 0, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_Conveyed(), this.getClassifier(),
				null, "conveyed", null, 1, -1, InformationFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getInformationFlow_InformationSource(), this
				.getNamedElement(), null, "informationSource", null, 1, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_Realization(),
				this.getRelationship(), null, "realization", null, 0, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingConnector(), this
				.getConnector(), null, "realizingConnector", null, 0, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingActivityEdge(), this
				.getActivityEdge(), null, "realizingActivityEdge", null, 0, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_InformationTarget(), this
				.getNamedElement(), null, "informationTarget", null, 1, -1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(informationFlowEClass, ecorePackage.getEBoolean(),
				"must_conform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationFlowEClass, ecorePackage.getEBoolean(),
				"convey_classifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationFlowEClass, ecorePackage.getEBoolean(),
				"sources_and_targets_kind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readExtentActionEClass, ReadExtentAction.class,
				"ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadExtentAction__result(), this.getOutputPin(),
				null, "_result", null, 1, 1, ReadExtentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getReadExtentAction_Classifier(), this.getClassifier(),
				null, "classifier", null, 1, 1, ReadExtentAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(readExtentActionEClass, ecorePackage.getEBoolean(),
				"multiplicity_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readExtentActionEClass, ecorePackage.getEBoolean(),
				"type_is_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class,
				"ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReclassifyObjectAction_OldClassifier(), this
				.getClassifier(), null, "oldClassifier", null, 0, -1,
				ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_NewClassifier(), this
				.getClassifier(), null, "newClassifier", null, 0, -1,
				ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_Object(), this.getInputPin(),
				null, "object", null, 1, 1, ReclassifyObjectAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), this
				.getBoolean(), "isReplaceAll", "false", 1, 1,
				ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(reclassifyObjectActionEClass, ecorePackage
				.getEBoolean(), "input_pin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reclassifyObjectActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reclassifyObjectActionEClass, ecorePackage
				.getEBoolean(), "classifier_not_abstract", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readIsClassifiedObjectActionEClass,
				ReadIsClassifiedObjectAction.class,
				"ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadIsClassifiedObjectAction__result(), this
				.getOutputPin(), null, "_result", null, 1, 1,
				ReadIsClassifiedObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReadIsClassifiedObjectAction_IsDirect(), this
				.getBoolean(), "isDirect", "false", 1, 1,
				ReadIsClassifiedObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Classifier(), this
				.getClassifier(), null, "classifier", null, 1, 1,
				ReadIsClassifiedObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Object(), this
				.getInputPin(), null, "object", null, 1, 1,
				ReadIsClassifiedObjectAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(readIsClassifiedObjectActionEClass, ecorePackage
				.getEBoolean(), "boolean_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readIsClassifiedObjectActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_input", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readIsClassifiedObjectActionEClass, ecorePackage
				.getEBoolean(), "no_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readIsClassifiedObjectActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_output", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(startClassifierBehaviorActionEClass,
				StartClassifierBehaviorAction.class,
				"StartClassifierBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartClassifierBehaviorAction_Object(), this
				.getInputPin(), null, "object", null, 1, 1,
				StartClassifierBehaviorAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(startClassifierBehaviorActionEClass, ecorePackage
				.getEBoolean(), "type_has_classifier", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(startClassifierBehaviorActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkObjectEndActionEClass,
				ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndAction__result(), this
				.getOutputPin(), null, "_result", null, 1, 1,
				ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Object(), this.getInputPin(),
				null, "object", null, 1, 1, ReadLinkObjectEndAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_End(), this.getProperty(),
				null, "end", null, 1, 1, ReadLinkObjectEndAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_object", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "type_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "type_of_object", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "association_of_association", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "ends_of_association", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_result", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkObjectEndQualifierActionEClass,
				ReadLinkObjectEndQualifierAction.class,
				"ReadLinkObjectEndQualifierAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndQualifierAction__result(), this
				.getOutputPin(), null, "_result", null, 1, 1,
				ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), this
				.getProperty(), null, "qualifier", null, 1, 1,
				ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Object(), this
				.getInputPin(), null, "object", null, 1, 1,
				ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_qualifier", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_object", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "association_of_association", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "type_of_object", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "ends_of_association", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "qualifier_attribute", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_result", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(readLinkObjectEndQualifierActionEClass, ecorePackage
				.getEBoolean(), "same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class,
				"CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateLinkObjectAction__result(),
				this.getOutputPin(), null, "_result", null, 1, 1,
				CreateLinkObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(createLinkObjectActionEClass, ecorePackage
				.getEBoolean(), "type_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(createLinkObjectActionEClass, ecorePackage
				.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(createLinkObjectActionEClass, ecorePackage
				.getEBoolean(), "association_class", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class,
				"AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptEventAction_Trigger(), this.getTrigger(), null,
				"trigger", null, 1, -1, AcceptEventAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction__result(), this.getOutputPin(),
				null, "_result", null, 0, -1, AcceptEventAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getAcceptEventAction_IsUnmarshall(), this.getBoolean(),
				"isUnmarshall", "false", 1, 1, AcceptEventAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(acceptEventActionEClass, ecorePackage.getEBoolean(),
				"unmarshall_signal_events", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(acceptEventActionEClass, ecorePackage.getEBoolean(),
				"no_output_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(acceptEventActionEClass, ecorePackage.getEBoolean(),
				"no_input_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(acceptEventActionEClass, ecorePackage.getEBoolean(),
				"trigger_events", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptCallActionEClass, AcceptCallAction.class,
				"AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptCallAction_ReturnInformation(), this
				.getOutputPin(), null, "returnInformation", null, 1, 1,
				AcceptCallAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(acceptCallActionEClass, ecorePackage.getEBoolean(),
				"unmarshall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(acceptCallActionEClass, ecorePackage.getEBoolean(),
				"trigger_call_event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(acceptCallActionEClass, ecorePackage.getEBoolean(),
				"result_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyAction_ReturnInformation(), this.getInputPin(),
				null, "returnInformation", null, 1, 1, ReplyAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getReplyAction_ReplyValue(), this.getInputPin(), null,
				"replyValue", null, 0, -1, ReplyAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReplyAction_ReplyToCall(), this.getTrigger(), null,
				"replyToCall", null, 1, 1, ReplyAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(replyActionEClass, ecorePackage.getEBoolean(),
				"pins_match_parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(replyActionEClass, ecorePackage.getEBoolean(),
				"event_on_reply_to_call_trigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unmarshallActionEClass, UnmarshallAction.class,
				"UnmarshallAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnmarshallAction__result(), this.getOutputPin(),
				null, "_result", null, 1, -1, UnmarshallAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getUnmarshallAction_UnmarshallType(), this
				.getClassifier(), null, "unmarshallType", null, 1, 1,
				UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnmarshallAction_Object(), this.getInputPin(), null,
				"object", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"structural_feature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"unmarshallType_is_classifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"multiplicity_of_object", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"type_and_ordering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"number_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"multiplicity_of_result", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unmarshallActionEClass, ecorePackage.getEBoolean(),
				"same_type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReduceAction_Reducer(), this.getBehavior(), null,
				"reducer", null, 1, 1, ReduceAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReduceAction_IsOrdered(), this.getBoolean(),
				"isOrdered", "false", 1, 1, ReduceAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction__result(), this.getOutputPin(), null,
				"_result", null, 1, 1, ReduceAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Collection(), this.getInputPin(), null,
				"collection", null, 1, 1, ReduceAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(reduceActionEClass, ecorePackage.getEBoolean(),
				"output_types_are_compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reduceActionEClass, ecorePackage.getEBoolean(),
				"reducer_inputs_output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reduceActionEClass, ecorePackage.getEBoolean(),
				"input_type_is_collection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass,
				StartObjectBehaviorAction.class, "StartObjectBehaviorAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartObjectBehaviorAction_Object(), this
				.getInputPin(), null, "object", null, 1, 1,
				StartObjectBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(startObjectBehaviorActionEClass, ecorePackage
				.getEBoolean(), "multiplicity_of_object", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(startObjectBehaviorActionEClass, ecorePackage
				.getEBoolean(), "type_ordering_multiplicity_match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(startObjectBehaviorActionEClass, ecorePackage
				.getEBoolean(), "number_order_results", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(startObjectBehaviorActionEClass, ecorePackage
				.getEBoolean(), "type_of_object", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(startObjectBehaviorActionEClass, ecorePackage
				.getEBoolean(), "number_order_arguments", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinNode_JoinSpec(), this.getValueSpecification(),
				null, "joinSpec", null, 1, 1, JoinNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinNode_IsCombineDuplicate(), this.getBoolean(),
				"isCombineDuplicate", "true", 1, 1, JoinNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(joinNodeEClass, ecorePackage.getEBoolean(),
				"one_outgoing_edge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(joinNodeEClass, ecorePackage.getEBoolean(),
				"incoming_object_flow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalNodeEClass, ConditionalNode.class,
				"ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalNode__result(), this.getOutputPin(), null,
				"_result", null, 0, -1, ConditionalNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalNode_IsAssured(), this.getBoolean(),
				"isAssured", "false", 1, 1, ConditionalNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionalNode_IsDeterminate(), this.getBoolean(),
				"isDeterminate", "false", 1, 1, ConditionalNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalNode_Clause(), this.getClause(), null,
				"clause", null, 1, -1, ConditionalNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(conditionalNodeEClass, ecorePackage.getEBoolean(),
				"result_no_incoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Body(), this.getExecutableNode(), null,
				"body", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_Test(), this.getExecutableNode(), null,
				"test", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_SuccessorClause(), this.getClause(), this
				.getClause_PredecessorClause(), "successorClause", null, 0, -1,
				Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_BodyOutput(), this.getOutputPin(), null,
				"bodyOutput", null, 0, -1, Clause.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_PredecessorClause(), this.getClause(), this
				.getClause_SuccessorClause(), "predecessorClause", null, 0, -1,
				Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_Decider(), this.getOutputPin(), null,
				"decider", null, 1, 1, Clause.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(clauseEClass, ecorePackage.getEBoolean(),
				"decider_output", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(clauseEClass, ecorePackage.getEBoolean(),
				"body_output_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopNode__result(), this.getOutputPin(), null,
				"_result", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_LoopVariable(), this.getOutputPin(), null,
				"loopVariable", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_BodyPart(), this.getExecutableNode(), null,
				"bodyPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Test(), this.getExecutableNode(), null,
				"test", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLoopNode_IsTestedFirst(), this.getBoolean(),
				"isTestedFirst", "false", 1, 1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_BodyOutput(), this.getOutputPin(), null,
				"bodyOutput", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_SetupPart(), this.getExecutableNode(), null,
				"setupPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Decider(), this.getOutputPin(), null,
				"decider", null, 1, 1, LoopNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_LoopVariableInput(), this.getInputPin(),
				null, "loopVariableInput", null, 0, -1, LoopNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(loopNodeEClass, ecorePackage.getEBoolean(),
				"input_edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loopNodeEClass, ecorePackage.getEBoolean(),
				"body_output_pins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loopNodeEClass, ecorePackage.getEBoolean(),
				"result_no_incoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionNode_RegionAsInput(), this
				.getExpansionRegion(), this.getExpansionRegion_InputElement(),
				"regionAsInput", null, 0, 1, ExpansionNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExpansionNode_RegionAsOutput(), this
				.getExpansionRegion(), this.getExpansionRegion_OutputElement(),
				"regionAsOutput", null, 0, 1, ExpansionNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(expansionRegionEClass, ExpansionRegion.class,
				"ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionRegion_InputElement(), this
				.getExpansionNode(), this.getExpansionNode_RegionAsInput(),
				"inputElement", null, 1, -1, ExpansionRegion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getExpansionRegion_OutputElement(), this
				.getExpansionNode(), this.getExpansionNode_RegionAsOutput(),
				"outputElement", null, 0, -1, ExpansionRegion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(),
				"mode", "iterative", 1, 1, ExpansionRegion.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(expansionRegionEClass, ecorePackage.getEBoolean(),
				"expansion_nodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(protocolTransitionEClass, ProtocolTransition.class,
				"ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolTransition_PreCondition(), this
				.getConstraint(), null, "preCondition", null, 0, 1,
				ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolTransition_PostCondition(), this
				.getConstraint(), null, "postCondition", null, 0, 1,
				ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(protocolTransitionEClass,
				ecorePackage.getEBoolean(), "refers_to_operation", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(protocolTransitionEClass,
				ecorePackage.getEBoolean(), "belongs_to_psm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(protocolTransitionEClass,
				ecorePackage.getEBoolean(), "associated_actions", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(protocolTransitionEClass, this.getOperation(),
				"getterReferred", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(associationClassEClass, AssociationClass.class,
				"AssociationClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(associationClassEClass, this.getProperty(),
				"allConnections", 2, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(associationClassEClass, ecorePackage.getEBoolean(),
				"cannot_be_defined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(launcherEClass, Launcher.class, "Launcher", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(launcherEClass, null, "launch", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getString(), "modelFile", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class,
				"ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum,
				ParameterDirectionKind.INOUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT);
		addEEnumLiteral(parameterDirectionKindEEnum,
				ParameterDirectionKind.RETURN);

		initEEnum(parameterEffectKindEEnum, ParameterEffectKind.class,
				"ParameterEffectKind");
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.CREATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.READ);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.UPDATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.DELETE);

		initEEnum(aggregationKindEEnum, AggregationKind.class,
				"AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);

		initEEnum(callConcurrencyKindEEnum, CallConcurrencyKind.class,
				"CallConcurrencyKind");
		addEEnumLiteral(callConcurrencyKindEEnum,
				CallConcurrencyKind.SEQUENTIAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.GUARDED);
		addEEnumLiteral(callConcurrencyKindEEnum,
				CallConcurrencyKind.CONCURRENT);

		initEEnum(transitionKindEEnum, TransitionKind.class, "TransitionKind");
		addEEnumLiteral(transitionKindEEnum, TransitionKind.INTERNAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.LOCAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.EXTERNAL);

		initEEnum(pseudostateKindEEnum, PseudostateKind.class,
				"PseudostateKind");
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.INITIAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.DEEP_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.SHALLOW_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JOIN);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.FORK);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JUNCTION);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.CHOICE);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.ENTRY_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.EXIT_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.TERMINATE);

		initEEnum(connectorKindEEnum, ConnectorKind.class, "ConnectorKind");
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.ASSEMBLY);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.DELEGATION);

		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class,
				"ObjectNodeOrderingKind");
		addEEnumLiteral(objectNodeOrderingKindEEnum,
				ObjectNodeOrderingKind.UNORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum,
				ObjectNodeOrderingKind.ORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum,
				ObjectNodeOrderingKind.LIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum,
				ObjectNodeOrderingKind.FIFO);

		initEEnum(messageKindEEnum, MessageKind.class, "MessageKind");
		addEEnumLiteral(messageKindEEnum, MessageKind.COMPLETE);
		addEEnumLiteral(messageKindEEnum, MessageKind.LOST);
		addEEnumLiteral(messageKindEEnum, MessageKind.FOUND);
		addEEnumLiteral(messageKindEEnum, MessageKind.UNKNOWN);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_SIGNAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

		initEEnum(interactionOperatorKindEEnum, InteractionOperatorKind.class,
				"InteractionOperatorKind");
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.SEQ);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.ALT);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.OPT);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.BREAK);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.PAR);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.STRICT);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.LOOP);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.CRITICAL);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.NEG);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.ASSERT);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.IGNORE);
		addEEnumLiteral(interactionOperatorKindEEnum,
				InteractionOperatorKind.CONSIDER);

		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind");
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";
		addAnnotation(this, source, new String[] { "ecoreUri",
				"http://www.eclipse.org/uml2/3.0.0/UML" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(elementEClass, source, new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(14), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(14), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(15), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(15), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(16), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(16), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(17), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(17), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(18), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(18), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(19), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(19), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(20), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(20), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(21), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(21), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(22), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(22), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(23), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(23), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(24), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(24), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(25), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(25), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(26), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(26), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(27), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(27), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(28), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(28), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(29), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(29), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(30), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(30), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(31), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(31), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(32), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(32), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(33), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(33), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(34), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(34), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(35), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(35), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(36), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(36), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementEClass.getEOperations().get(37), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementEClass.getEOperations().get(37), source,
				new String[] { "ecore", "true" });
		addAnnotation(getElement_OwnedComment(), source, new String[] {
				"ecore", "true" });
		addAnnotation(modelEClass, source, new String[] { "ecore", "true" });
		addAnnotation(modelEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(modelEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(modelEClass.getEOperations().get(1), source,
				new String[] { "superOperation", "uml::Package" });
		addAnnotation(modelEClass.getEOperations().get(2), source,
				new String[] { "superOperation", "uml::Package" });
		addAnnotation(getModel_Viewpoint(), source, new String[] { "ecore",
				"true" });
		addAnnotation(packageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(0), source,
				new String[] { "EMF_renameAs",
						"getProfileApplicationEMF_renameAs" });
		addAnnotation(packageEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(14), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(14), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(15), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(15), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(16), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(packageEClass.getEOperations().get(17), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(packageEClass.getEOperations().get(18), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(18), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageEClass.getEOperations().get(19), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageEClass.getEOperations().get(19), source,
				new String[] { "ecore", "true" });
		addAnnotation(getPackage_ProfileApplication(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_PackagedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_PackageMerge(), source, new String[] {
				"ecore", "true" });
		addAnnotation(stateMachineEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(stateMachineEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(2), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(stateMachineEClass.getEOperations().get(3), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(stateMachineEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateMachineEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStateMachine_Region(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getStateMachine_ExtendedStateMachine(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStateMachine_SubmachineState(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getStateMachine_ConnectionPoint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(regionEClass, source, new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(2), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(regionEClass.getEOperations().get(3), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(regionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(regionEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(regionEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRegion_Subvertex(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getRegion_StateMachine(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getRegion_State(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRegion_Transition(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getRegion_ExtendedRegion(), source, new String[] {
				"ecore", "true" });
		addAnnotation(vertexEClass, source, new String[] { "ecore", "true" });
		addAnnotation(vertexEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(vertexEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(vertexEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(vertexEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(vertexEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(vertexEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(vertexEClass.getEOperations().get(3), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(vertexEClass.getEOperations().get(4), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(getVertex_Container(), source, new String[] { "ecore",
				"true" });
		addAnnotation(transitionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(6), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(transitionEClass.getEOperations().get(7), source,
				new String[] { "superOperation", "uml::Element" });
		addAnnotation(transitionEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(transitionEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTransition_Trigger(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTransition_Effect(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTransition_Source(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTransition_Guard(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTransition_Container(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTransition_Target(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTransition_RedefinedTransition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTransition_Kind(), source, new String[] { "ecore",
				"true" });
		addAnnotation(integerEDataType, source, new String[] { "alias",
				"kermeta::standard::Integer" });
		addAnnotation(integerEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(integerEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "int" });
		addAnnotation(integerEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(booleanEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(booleanEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(booleanEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "boolean" });
		addAnnotation(booleanEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(stringEDataType, source, new String[] { "alias",
				"kermeta::standard::String" });
		addAnnotation(stringEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(stringEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.String" });
		addAnnotation(stringEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"alias", "kermeta::standard::Integer" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"ecore", "true" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "int" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(commentEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getComment_Body(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getComment_AnnotatedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(packageableElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(namedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(namedElementEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(5), source,
				new String[] { "EMF_renameAs", "getQualifiedNameEMF_renameAs" });
		addAnnotation(namedElementEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namedElementEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(getNamedElement_Visibility(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getNamedElement_NameExpression(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getNamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getNamedElement_ClientDependency(), source, new String[] {
				"ecore", "true" });
		addAnnotation(visibilityKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(dependencyEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getDependency_Client(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getDependency_Supplier(), source, new String[] { "ecore",
				"true" });
		addAnnotation(directedRelationshipEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(relationshipEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(namespaceEClass, source, new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(namespaceEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(getNamespace_ElementImport(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getNamespace_OwnedRule(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getNamespace_PackageImport(), source, new String[] {
				"ecore", "true" });
		addAnnotation(elementImportEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(elementImportEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementImportEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementImportEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementImportEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(elementImportEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(elementImportEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getElementImport_Alias(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getElementImport_Visibility(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getElementImport_ImportedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getElementImport_ImportingNamespace(), source,
				new String[] { "ecore", "true" });
		addAnnotation(packageImportEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(packageImportEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(packageImportEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getPackageImport_ImportedPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackageImport_Visibility(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackageImport_ImportingNamespace(), source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(constraintEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(constraintEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(constraintEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(constraintEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(constraintEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(constraintEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConstraint_Specification(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConstraint_Context(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConstraint_ConstrainedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(valueSpecificationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(typedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getTypedElement_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(typeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(typeEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(typeEClass.getEOperations().get(0), source, new String[] {
				"ecore", "true" });
		addAnnotation(typeEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(typeEClass.getEOperations().get(1), source, new String[] {
				"ecore", "true" });
		addAnnotation(typeEClass.getEOperations().get(2), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(typeEClass.getEOperations().get(2), source, new String[] {
				"ecore", "true" });
		addAnnotation(associationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(getAssociation_IsDerived(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAssociation_NavigableOwnedEnd(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAssociation_OwnedEnd(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAssociation_MemberEnd(), source, new String[] {
				"ecore", "true" });
		addAnnotation(classifierEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(14), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(14), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(15), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(15), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(16), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(16), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(17), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(17), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(18), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(18), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(19), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(19), source,
				new String[] { "ecore", "true" });
		addAnnotation(classifierEClass.getEOperations().get(20), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classifierEClass.getEOperations().get(20), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClassifier_RedefinedClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClassifier_PowertypeExtent(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_Substitution(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_IsAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_UseCase(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getClassifier_Representation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_Generalization(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_OwnedUseCase(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassifier_CollaborationUse(), source, new String[] {
				"ecore", "true" });
		addAnnotation(redefinableElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(redefinableElementEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRedefinableElement_IsLeaf(), source, new String[] {
				"ecore", "true" });
		addAnnotation(templateableElementEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(templateableElementEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(templateableElementEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(templateableElementEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(templateableElementEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getTemplateableElement_OwnedTemplateSignature(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateableElement_TemplateBinding(), source,
				new String[] { "ecore", "true" });
		addAnnotation(templateBindingEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(templateBindingEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(templateBindingEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(templateBindingEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(templateBindingEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateBinding_ParameterSubstitution(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateBinding_BoundElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTemplateBinding_Signature(), source, new String[] {
				"ecore", "true" });
		addAnnotation(templateSignatureEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(templateSignatureEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(templateSignatureEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateSignature_Template(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTemplateSignature_Parameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTemplateSignature_OwnedParameter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(templateParameterEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(templateParameterEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(templateParameterEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameter_OwnedDefault(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameter__default(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTemplateParameter_OwnedParameteredElement(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameter_ParameteredElement(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameter_Signature(), source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterableElementEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterableElementEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(parameterableElementEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(parameterableElementEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(parameterableElementEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getParameterableElement_OwningTemplateParameter(),
				source, new String[] { "ecore", "true" });
		addAnnotation(getParameterableElement_TemplateParameter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(templateParameterSubstitutionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(templateParameterSubstitutionEClass.getEOperations().get(
				0), source, new String[] { "isAbstract", "true" });
		addAnnotation(templateParameterSubstitutionEClass.getEOperations().get(
				0), source, new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameterSubstitution_Formal(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameterSubstitution_OwnedActual(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameterSubstitution_Actual(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTemplateParameterSubstitution_TemplateBinding(),
				source, new String[] { "ecore", "true" });
		addAnnotation(generalizationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(generalizationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(generalizationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getGeneralization_Specific(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getGeneralization_GeneralizationSet(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getGeneralization_General(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getGeneralization_IsSubstitutable(), source,
				new String[] { "ecore", "true" });
		addAnnotation(generalizationSetEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(generalizationSetEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(generalizationSetEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(generalizationSetEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(generalizationSetEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getGeneralizationSet_IsDisjoint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getGeneralizationSet_Generalization(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getGeneralizationSet_IsCovering(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getGeneralizationSet_Powertype(), source, new String[] {
				"ecore", "true" });
		addAnnotation(featureEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getFeature_IsStatic(), source, new String[] { "ecore",
				"true" });
		addAnnotation(substitutionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSubstitution_SubstitutingClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSubstitution_Contract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(realizationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(abstractionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getAbstraction_Mapping(), source, new String[] { "ecore",
				"true" });
		addAnnotation(opaqueExpressionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(6), source,
				new String[] { "EMF_renameAs", "getResultEMF_renameAs" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(opaqueExpressionEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(getOpaqueExpression_Body(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOpaqueExpression_Behavior(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOpaqueExpression_Language(), source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterEClass, source, new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(8), source,
				new String[] { "EMF_renameAs", "setDefaultEMF_renameAs" });
		addAnnotation(parameterEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(11), source,
				new String[] { "EMF_renameAs", "getDefaultEMF_renameAs" });
		addAnnotation(parameterEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(getParameter_Operation(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_Operation(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getParameter_Effect(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_Direction(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_IsStream(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_ParameterSet(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getParameter_DefaultValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getParameter_IsException(), source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterDirectionKindEEnum, source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterEffectKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(multiplicityElementEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(5),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(5),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(6),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(6),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(6),
				source, new String[] { "EMF_renameAs", "getLowerEMF_renameAs" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(7),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(7),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(8),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(8),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(9),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(9),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(10),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(10),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(10),
				source, new String[] { "EMF_renameAs", "getUpperEMF_renameAs" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(11),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(11),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(11),
				source, new String[] { "EMF_renameAs", "setLowerEMF_renameAs" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(12),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(12),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(12),
				source, new String[] { "EMF_renameAs", "setUpperEMF_renameAs" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(13),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(13),
				source, new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(14),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(multiplicityElementEClass.getEOperations().get(14),
				source, new String[] { "ecore", "true" });
		addAnnotation(getMultiplicityElement_LowerValue(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getMultiplicityElement_IsOrdered(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMultiplicityElement_UpperValue(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getMultiplicityElement_IsUnique(), source, new String[] {
				"ecore", "true" });
		addAnnotation(connectableElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(connectableElementEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectableElementEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEndEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(connectorEndEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(0), source,
				new String[] { "EMF_renameAs", "getDefiningEndEMF_renameAs" });
		addAnnotation(connectorEndEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEndEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConnectorEnd_PartWithPort(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConnectorEnd_Role(), source, new String[] { "ecore",
				"true" });
		addAnnotation(propertyEClass, source, new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(1), source,
				new String[] { "EMF_renameAs", "getOppositeEMF_renameAs" });
		addAnnotation(propertyEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(11), source,
				new String[] { "EMF_renameAs", "setOppositeEMF_renameAs" });
		addAnnotation(propertyEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(14), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(14), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(14), source,
				new String[] { "EMF_renameAs", "getDefaultEMF_renameAs" });
		addAnnotation(propertyEClass.getEOperations().get(15), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(15), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(16), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(16), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(17), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(17), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(18), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(18), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(18), source,
				new String[] { "EMF_renameAs", "setIsCompositeEMF_renameAs" });
		addAnnotation(propertyEClass.getEOperations().get(19), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(19), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(20), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(20), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(21), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(21), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(22), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(22), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(23), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(23), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(24), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(24), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(24), source,
				new String[] { "EMF_renameAs", "setDefaultEMF_renameAs" });
		addAnnotation(propertyEClass.getEOperations().get(25), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(25), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(26), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(26), source,
				new String[] { "ecore", "true" });
		addAnnotation(propertyEClass.getEOperations().get(27), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(propertyEClass.getEOperations().get(27), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProperty_Association(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsDerived(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_RedefinedProperty(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_SubsettedProperty(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty__class(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty__class(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getProperty_Qualifier(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_OwningAssociation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_Aggregation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_Datatype(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_DefaultValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_AssociationEnd(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsDerivedUnion(), source, new String[] {
				"ecore", "true" });
		addAnnotation(aggregationKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(deploymentTargetEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(deploymentTargetEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(deploymentTargetEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDeploymentTarget_Deployment(), source, new String[] {
				"ecore", "true" });
		addAnnotation(deploymentEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getDeployment_Location(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getDeployment_DeployedArtifact(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDeployment_Configuration(), source, new String[] {
				"ecore", "true" });
		addAnnotation(deployedArtifactEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(deploymentSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(deploymentSpecificationEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(deploymentSpecificationEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(deploymentSpecificationEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(deploymentSpecificationEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getDeploymentSpecification_DeploymentLocation(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDeploymentSpecification_ExecutionLocation(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDeploymentSpecification_Deployment(), source,
				new String[] { "ecore", "true" });
		addAnnotation(artifactEClass, source, new String[] { "ecore", "true" });
		addAnnotation(artifactEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(artifactEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(artifactEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(artifactEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getArtifact_OwnedOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getArtifact_NestedArtifact(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getArtifact_FileName(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getArtifact_OwnedAttribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getArtifact_Manifestation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(manifestationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getManifestation_UtilizedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(operationEClass, source, new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(2), source,
				new String[] { "EMF_renameAs", "setTypeEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(3), source,
				new String[] { "EMF_renameAs", "setIsOrderedEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(5), source,
				new String[] { "EMF_renameAs", "getLowerEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(7), source,
				new String[] { "EMF_renameAs", "getTypeEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(10), source,
				new String[] { "EMF_renameAs", "getUpperEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(11), source,
				new String[] { "EMF_renameAs", "setUpperEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(12), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(12), source,
				new String[] { "EMF_renameAs", "setLowerEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(13), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(13), source,
				new String[] { "EMF_renameAs", "setIsUniqueEMF_renameAs" });
		addAnnotation(operationEClass.getEOperations().get(14), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(14), source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass.getEOperations().get(15), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(operationEClass.getEOperations().get(15), source,
				new String[] { "ecore", "true" });
		addAnnotation(getOperation_BodyCondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation__class(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation__interface(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_IsQuery(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Postcondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_Precondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_RedefinedOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_Datatype(), source, new String[] { "ecore",
				"true" });
		addAnnotation(behavioralFeatureEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(behavioralFeatureEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behavioralFeatureEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioralFeature_IsAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavioralFeature_OwnedParameter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioralFeature_RaisedException(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioralFeature_OwnedParameterSet(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioralFeature_Concurrency(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavioralFeature_Method(), source, new String[] {
				"ecore", "true" });
		addAnnotation(callConcurrencyKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(behaviorEClass, source, new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorEClass.getEOperations().get(4), source,
				new String[] { "EMF_renameAs", "getContextEMF_renameAs" });
		addAnnotation(getBehavior_Postcondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_Precondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_IsReentrant(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_OwnedParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_RedefinedBehavior(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_OwnedParameterSet(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBehavior_Specification(), source, new String[] {
				"ecore", "true" });
		addAnnotation(classEClass, source, new String[] { "ecore", "true" });
		addAnnotation(classEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(classEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(classEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(classEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(classEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClass_OwnedOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClass_IsActive(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getClass_NestedClassifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClass_OwnedReception(), source, new String[] {
				"ecore", "true" });
		addAnnotation(behavioredClassifierEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(behavioredClassifierEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(getBehavioredClassifier_InterfaceRealization(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioredClassifier_OwnedTrigger(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioredClassifier_ClassifierBehavior(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehavioredClassifier_OwnedBehavior(), source,
				new String[] { "ecore", "true" });
		addAnnotation(interfaceRealizationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterfaceRealization_Contract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterfaceRealization_ImplementingClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(interfaceEClass, source, new String[] { "ecore", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interfaceEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInterface_OwnedOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterface_Protocol(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getInterface_NestedClassifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterface_RedefinedInterface(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterface_OwnedReception(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInterface_OwnedAttribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(receptionEClass, source, new String[] { "ecore", "true" });
		addAnnotation(receptionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(receptionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReception_Signal(), source, new String[] { "ecore",
				"true" });
		addAnnotation(signalEClass, source, new String[] { "ecore", "true" });
		addAnnotation(signalEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(signalEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSignal_OwnedAttribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(protocolStateMachineEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(protocolStateMachineEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(getProtocolStateMachine_Conformance(), source,
				new String[] { "ecore", "true" });
		addAnnotation(transitionKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(triggerEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getTrigger_Port(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTrigger_Event(), source, new String[] { "ecore",
				"true" });
		addAnnotation(eventEClass, source, new String[] { "ecore", "true" });
		addAnnotation(portEClass, source, new String[] { "ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(0), source, new String[] {
				"ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(1), source, new String[] {
				"ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(2), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(2), source, new String[] {
				"ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(3), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(3), source, new String[] {
				"ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(4), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(4), source, new String[] {
				"ecore", "true" });
		addAnnotation(portEClass.getEOperations().get(5), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(portEClass.getEOperations().get(5), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPort_Protocol(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getPort_IsService(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getPort_RedefinedPort(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getPort_IsBehavior(), source, new String[] { "ecore",
				"true" });
		addAnnotation(stateEClass, source, new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(stateEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stateEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(getState_Region(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getState_StateInvariant(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getState_RedefinedState(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getState_Connection(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getState_Submachine(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getState_Exit(), source, new String[] { "ecore", "true" });
		addAnnotation(getState_ConnectionPoint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getState_DeferrableTrigger(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getState_Entry(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getState_DoActivity(), source, new String[] { "ecore",
				"true" });
		addAnnotation(connectionPointReferenceEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(connectionPointReferenceEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(connectionPointReferenceEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(connectionPointReferenceEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(connectionPointReferenceEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getConnectionPointReference_Entry(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConnectionPointReference_State(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConnectionPointReference_Exit(), source, new String[] {
				"ecore", "true" });
		addAnnotation(pseudostateEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(pseudostateEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(getPseudostate_StateMachine(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPseudostate_State(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getPseudostate_Kind(), source, new String[] { "ecore",
				"true" });
		addAnnotation(pseudostateKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(protocolConformanceEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getProtocolConformance_SpecificMachine(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProtocolConformance_GeneralMachine(), source,
				new String[] { "ecore", "true" });
		addAnnotation(encapsulatedClassifierEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(structuredClassifierEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(structuredClassifierEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuredClassifierEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(structuredClassifierEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuredClassifierEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getStructuredClassifier_OwnedConnector(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStructuredClassifier_OwnedAttribute(), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass, source, new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(connectorEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(connectorEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConnector_Contract(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConnector_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConnector_RedefinedConnector(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConnector_End(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConnector_Kind(), source, new String[] { "ecore",
				"true" });
		addAnnotation(connectorKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(extensionEClass, source, new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEClass.getEOperations().get(6), source,
				new String[] { "EMF_renameAs", "getMetaclassEMF_renameAs" });
		addAnnotation(extensionEndEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(extensionEndEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEndEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(extensionEndEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionEndEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stereotypeEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStereotype_Icon(), source, new String[] { "ecore",
				"true" });
		addAnnotation(imageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getImage_Content(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getImage_Location(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getImage_Format(), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass, source, new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(9), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(10), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileEClass.getEOperations().get(11), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileEClass.getEOperations().get(11), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProfile_MetamodelReference(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProfile_MetaclassReference(), source, new String[] {
				"ecore", "true" });
		addAnnotation(parameterSetEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(parameterSetEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterSetEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterSetEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterSetEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(parameterSetEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(parameterSetEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getParameterSet_Parameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getParameterSet_Condition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(dataTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(dataTypeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(dataTypeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(dataTypeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(dataTypeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDataType_OwnedOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDataType_OwnedAttribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(operationTemplateParameterEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(structuralFeatureEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getStructuralFeature_IsReadOnly(), source, new String[] {
				"ecore", "true" });
		addAnnotation(connectableElementTemplateParameterEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(collaborationUseEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(collaborationUseEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCollaborationUse_RoleBinding(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getCollaborationUse_Type(), source, new String[] {
				"ecore", "true" });
		addAnnotation(collaborationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getCollaboration_CollaborationRole(), source,
				new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass, source, new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(useCaseEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getUseCase_ExtensionPoint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getUseCase_Extend(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getUseCase_Subject(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getUseCase_Include(), source, new String[] { "ecore",
				"true" });
		addAnnotation(includeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getInclude_IncludingCase(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInclude_Addition(), source, new String[] { "ecore",
				"true" });
		addAnnotation(extendEClass, source, new String[] { "ecore", "true" });
		addAnnotation(extendEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extendEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExtend_Extension(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getExtend_ExtendedCase(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getExtend_Condition(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getExtend_ExtensionLocation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(extensionPointEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(extensionPointEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(extensionPointEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExtensionPoint_UseCase(), source, new String[] {
				"ecore", "true" });
		addAnnotation(redefinableTemplateSignatureEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(redefinableTemplateSignatureEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(redefinableTemplateSignatureEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(redefinableTemplateSignatureEClass.getEOperations()
				.get(1), source, new String[] { "isAbstract", "true" });
		addAnnotation(redefinableTemplateSignatureEClass.getEOperations()
				.get(1), source, new String[] { "ecore", "true" });
		addAnnotation(getRedefinableTemplateSignature_ExtendedSignature(),
				source, new String[] { "ecore", "true" });
		addAnnotation(getRedefinableTemplateSignature_Classifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRedefinableTemplateSignature_Classifier(), source,
				new String[] { "ecore.isTransient", "true" });
		addAnnotation(classifierTemplateParameterEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				classifierTemplateParameterEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(
				classifierTemplateParameterEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getClassifierTemplateParameter_ConstrainingClassifier(),
				source, new String[] { "ecore", "true" });
		addAnnotation(getClassifierTemplateParameter_AllowSubstitutable(),
				source, new String[] { "ecore", "true" });
		addAnnotation(stringExpressionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(stringExpressionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stringExpressionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(stringExpressionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(stringExpressionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStringExpression_SubExpression(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStringExpression_OwningExpression(), source,
				new String[] { "ecore", "true" });
		addAnnotation(expressionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getExpression_Symbol(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getExpression_Operand(), source, new String[] { "ecore",
				"true" });
		addAnnotation(usageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(packageMergeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getPackageMerge_MergedPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackageMerge_ReceivingPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(profileApplicationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(profileApplicationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileApplicationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(profileApplicationEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(profileApplicationEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProfileApplication_IsStrict(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProfileApplication_AppliedProfile(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProfileApplication_ApplyingPackage(), source,
				new String[] { "ecore", "true" });
		addAnnotation(enumerationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEnumeration_OwnedLiteral(), source, new String[] {
				"ecore", "true" });
		addAnnotation(enumerationLiteralEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "ecore", "true" });
		addAnnotation(instanceSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(instanceSpecificationEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(getInstanceSpecification_Specification(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInstanceSpecification_Classifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInstanceSpecification_Slot(), source, new String[] {
				"ecore", "true" });
		addAnnotation(slotEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getSlot_DefiningFeature(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSlot_Value(), source, new String[] { "ecore", "true" });
		addAnnotation(getSlot_OwningInstance(), source, new String[] { "ecore",
				"true" });
		addAnnotation(primitiveTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(literalSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(literalIntegerEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getLiteralInteger_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(literalStringEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getLiteralString_Value(), source, new String[] { "ecore",
				"true" });
		addAnnotation(literalBooleanEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getLiteralBoolean_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(literalNullEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(instanceValueEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getInstanceValue_Instance(), source, new String[] {
				"ecore", "true" });
		addAnnotation(literalUnlimitedNaturalEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getLiteralUnlimitedNatural_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(opaqueBehaviorEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getOpaqueBehavior_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOpaqueBehavior_Language(), source, new String[] {
				"ecore", "true" });
		addAnnotation(functionBehaviorEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(functionBehaviorEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(functionBehaviorEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(functionBehaviorEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(functionBehaviorEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(opaqueActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getOpaqueAction_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOpaqueAction_OutputValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOpaqueAction_InputValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOpaqueAction_Language(), source, new String[] {
				"ecore", "true" });
		addAnnotation(actionEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getAction_LocalPostcondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAction_LocalPrecondition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(executableNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getExecutableNode_Handler(), source, new String[] {
				"ecore", "true" });
		addAnnotation(activityNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(activityNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityNode_Incoming(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityNode_RedefinedNode(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityNode_InPartition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityNode_InStructuredNode(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityNode_InInterruptibleRegion(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityNode_Activity(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityNode_Outgoing(), source, new String[] {
				"ecore", "true" });
		addAnnotation(structuredActivityNodeEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(structuredActivityNodeEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuredActivityNodeEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getStructuredActivityNode_MustIsolate(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStructuredActivityNode_Node(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getStructuredActivityNode_Edge(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getStructuredActivityNode_Variable(), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityGroupEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(activityGroupEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityGroupEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityGroupEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityGroupEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityGroupEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityGroupEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityGroup_InActivity(), source, new String[] {
				"ecore", "true" });
		addAnnotation(activityEClass, source, new String[] { "ecore", "true" });
		addAnnotation(activityEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivity_Node(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivity_Edge(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivity_Partition(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivity_IsReadOnly(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivity_Group(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivity_IsSingleExecution(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivity_Variable(), source, new String[] { "ecore",
				"true" });
		addAnnotation(variableEClass, source, new String[] { "ecore", "true" });
		addAnnotation(variableEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(variableEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(variableEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(variableEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getVariable_Scope(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getVariable_ActivityScope(), source, new String[] {
				"ecore", "true" });
		addAnnotation(activityEdgeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityEdgeEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityEdge_Weight(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivityEdge_Source(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivityEdge_Interrupts(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityEdge_InPartition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityEdge_Guard(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivityEdge_Target(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getActivityEdge_InStructuredNode(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityEdge_RedefinedEdge(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityEdge_Activity(), source, new String[] {
				"ecore", "true" });
		addAnnotation(activityPartitionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(activityPartitionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityPartition_IsDimension(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityPartition_Node(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityPartition_Represents(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityPartition_Edge(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityPartition_Subpartition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActivityPartition_IsExternal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getActivityPartition_SuperPartition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(interruptibleActivityRegionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				interruptibleActivityRegionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(
				interruptibleActivityRegionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getInterruptibleActivityRegion_InterruptingEdge(),
				source, new String[] { "ecore", "true" });
		addAnnotation(getInterruptibleActivityRegion_Node(), source,
				new String[] { "ecore", "true" });
		addAnnotation(exceptionHandlerEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(exceptionHandlerEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExceptionHandler_HandlerBody(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getExceptionHandler_ExceptionType(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExceptionHandler_ProtectedNode(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExceptionHandler_ExceptionInput(), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectNodeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectNodeEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getObjectNode_InState(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getObjectNode_IsControlType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getObjectNode_Ordering(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getObjectNode_UpperBound(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getObjectNode_Selection(), source, new String[] {
				"ecore", "true" });
		addAnnotation(objectNodeOrderingKindEEnum, source, new String[] {
				"ecore", "true" });
		addAnnotation(outputPinEClass, source, new String[] { "ecore", "true" });
		addAnnotation(outputPinEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(outputPinEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(pinEClass, source, new String[] { "ecore", "true" });
		addAnnotation(pinEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(pinEClass.getEOperations().get(0), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPin_IsControl(), source, new String[] { "ecore",
				"true" });
		addAnnotation(inputPinEClass, source, new String[] { "ecore", "true" });
		addAnnotation(inputPinEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(inputPinEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(callActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(callActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(callActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(callActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(callActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(callActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(callActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCallAction_IsSynchronous(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getCallAction__result(), source, new String[] { "ecore",
				"true" });
		addAnnotation(invocationActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(invocationActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(invocationActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInvocationAction_Argument(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInvocationAction_OnPort(), source, new String[] {
				"ecore", "true" });
		addAnnotation(sendSignalActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(sendSignalActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(sendSignalActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(sendSignalActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(sendSignalActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSendSignalAction_Target(), source, new String[] {
				"ecore", "true" });
		createKermetaAnnotations2();
	}
	protected void createKermetaAnnotations2() {
		String source = "kermeta";
		addAnnotation(getSendSignalAction_Signal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(callOperationActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(callOperationActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(getCallOperationAction_Operation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getCallOperationAction_Target(), source, new String[] {
				"ecore", "true" });
		addAnnotation(callBehaviorActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(callBehaviorActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(callBehaviorActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(callBehaviorActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(callBehaviorActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCallBehaviorAction_Behavior(), source, new String[] {
				"ecore", "true" });
		addAnnotation(sequenceNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSequenceNode_ExecutableNode(), source, new String[] {
				"ecore", "true" });
		addAnnotation(controlNodeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(controlFlowEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(controlFlowEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(controlFlowEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(initialNodeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(initialNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(initialNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(initialNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(initialNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(5),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(5),
				source, new String[] { "ecore", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(6),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(activityParameterNodeEClass.getEOperations().get(6),
				source, new String[] { "ecore", "true" });
		addAnnotation(getActivityParameterNode_Parameter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(valuePinEClass, source, new String[] { "ecore", "true" });
		addAnnotation(valuePinEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valuePinEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(valuePinEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(valuePinEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getValuePin_Value(), source, new String[] { "ecore",
				"true" });
		addAnnotation(messageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(4), source,
				new String[] { "EMF_renameAs", "getMessageKindEMF_renameAs" });
		addAnnotation(messageEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(messageEClass.getEOperations().get(8), source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEClass.getEOperations().get(8), source,
				new String[] { "EMF_renameAs", "getSignatureEMF_renameAs" });
		addAnnotation(getMessage_Argument(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getMessage_ReceiveEvent(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMessage_Connector(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getMessage_Interaction(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getMessage_MessageSort(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getMessage_SendEvent(), source, new String[] { "ecore",
				"true" });
		addAnnotation(messageKindEEnum, source,
				new String[] { "ecore", "true" });
		addAnnotation(messageSortEEnum, source,
				new String[] { "ecore", "true" });
		addAnnotation(messageEndEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getMessageEnd_Message(), source, new String[] { "ecore",
				"true" });
		addAnnotation(interactionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteraction_Message(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getInteraction_Lifeline(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteraction_Action(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getInteraction_Fragment(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteraction_FormalGate(), source, new String[] {
				"ecore", "true" });
		addAnnotation(interactionFragmentEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteractionFragment_EnclosingOperand(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteractionFragment_GeneralOrdering(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteractionFragment_EnclosingInteraction(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteractionFragment_Covered(), source, new String[] {
				"ecore", "true" });
		addAnnotation(lifelineEClass, source, new String[] { "ecore", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(lifelineEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getLifeline_Selector(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLifeline_Represents(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLifeline_CoveredBy(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLifeline_Interaction(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getLifeline_DecomposedAs(), source, new String[] {
				"ecore", "true" });
		addAnnotation(partDecompositionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(partDecompositionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionUseEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(interactionUseEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionUseEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteractionUse_Argument(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteractionUse_RefersTo(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteractionUse_ActualGate(), source, new String[] {
				"ecore", "true" });
		addAnnotation(gateEClass, source, new String[] { "ecore", "true" });
		addAnnotation(gateEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(gateEClass.getEOperations().get(0), source, new String[] {
				"ecore", "true" });
		addAnnotation(gateEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(gateEClass.getEOperations().get(1), source, new String[] {
				"ecore", "true" });
		addAnnotation(generalOrderingEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getGeneralOrdering_After(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getGeneralOrdering_Before(), source, new String[] {
				"ecore", "true" });
		addAnnotation(occurrenceSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getOccurrenceSpecification_ToAfter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getOccurrenceSpecification_Event(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOccurrenceSpecification_ToBefore(), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionOperandEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(interactionOperandEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionOperandEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(interactionOperandEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(interactionOperandEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInteractionOperand_Guard(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteractionOperand_Fragment(), source, new String[] {
				"ecore", "true" });
		addAnnotation(interactionConstraintEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(5),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(interactionConstraintEClass.getEOperations().get(5),
				source, new String[] { "ecore", "true" });
		addAnnotation(getInteractionConstraint_Maxint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInteractionConstraint_Minint(), source, new String[] {
				"ecore", "true" });
		addAnnotation(executionSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(executionSpecificationEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(executionSpecificationEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getExecutionSpecification_Finish(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getExecutionSpecification_Start(), source, new String[] {
				"ecore", "true" });
		addAnnotation(stateInvariantEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getStateInvariant_Invariant(), source, new String[] {
				"ecore", "true" });
		addAnnotation(actionExecutionSpecificationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(actionExecutionSpecificationEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(actionExecutionSpecificationEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(getActionExecutionSpecification_Action(), source,
				new String[] { "ecore", "true" });
		addAnnotation(behaviorExecutionSpecificationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getBehaviorExecutionSpecification_Behavior(), source,
				new String[] { "ecore", "true" });
		addAnnotation(executionEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(creationEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(creationEventEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(creationEventEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(destructionEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(destructionEventEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(destructionEventEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(sendOperationEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSendOperationEvent_Operation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(messageEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(sendSignalEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSendSignalEvent_Signal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(messageOccurrenceSpecificationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(executionOccurrenceSpecificationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getExecutionOccurrenceSpecification_Execution(), source,
				new String[] { "ecore", "true" });
		addAnnotation(receiveOperationEventEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getReceiveOperationEvent_Operation(), source,
				new String[] { "ecore", "true" });
		addAnnotation(receiveSignalEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getReceiveSignalEvent_Signal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(actorEClass, source, new String[] { "ecore", "true" });
		addAnnotation(actorEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(actorEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(actorEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(actorEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(callEventEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getCallEvent_Operation(), source, new String[] { "ecore",
				"true" });
		addAnnotation(changeEventEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getChangeEvent_ChangeExpression(), source, new String[] {
				"ecore", "true" });
		addAnnotation(signalEventEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getSignalEvent_Signal(), source, new String[] { "ecore",
				"true" });
		addAnnotation(anyReceiveEventEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(forkNodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(forkNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(forkNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(forkNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(forkNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(flowFinalNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(finalNodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(finalNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(centralBufferNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(mergeNodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(mergeNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(mergeNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(mergeNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(mergeNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(decisionNodeEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDecisionNode_DecisionInput(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDecisionNode_DecisionInputFlow(), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(objectFlowEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(getObjectFlow_IsMulticast(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getObjectFlow_IsMultireceive(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getObjectFlow_Selection(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getObjectFlow_Transformation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(activityFinalNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(componentRealizationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponentRealization_Abstraction(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getComponentRealization_RealizingClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass, source, new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(componentEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentEClass.getEOperations().get(7), source,
				new String[] { "ecore", "true" });
		addAnnotation(getComponent_PackagedElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponent_IsIndirectlyInstantiated(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getComponent_Realization(), source, new String[] {
				"ecore", "true" });
		addAnnotation(nodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(nodeEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(nodeEClass.getEOperations().get(0), source, new String[] {
				"ecore", "true" });
		addAnnotation(nodeEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(nodeEClass.getEOperations().get(1), source, new String[] {
				"ecore", "true" });
		addAnnotation(nodeEClass.getEOperations().get(2), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(nodeEClass.getEOperations().get(2), source, new String[] {
				"ecore", "true" });
		addAnnotation(getNode_NestedNode(), source, new String[] { "ecore",
				"true" });
		addAnnotation(communicationPathEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(deviceEClass, source, new String[] { "ecore", "true" });
		addAnnotation(executionEnvironmentEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(combinedFragmentEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(combinedFragmentEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCombinedFragment_CfragmentGate(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCombinedFragment_InteractionOperator(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCombinedFragment_Operand(), source, new String[] {
				"ecore", "true" });
		addAnnotation(interactionOperatorKindEEnum, source, new String[] {
				"ecore", "true" });
		addAnnotation(continuationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(continuationEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(continuationEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(continuationEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(continuationEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(continuationEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(continuationEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getContinuation_Setting(), source, new String[] {
				"ecore", "true" });
		addAnnotation(considerIgnoreFragmentEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(considerIgnoreFragmentEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(considerIgnoreFragmentEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(considerIgnoreFragmentEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(considerIgnoreFragmentEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getConsiderIgnoreFragment_Message(), source,
				new String[] { "ecore", "true" });
		addAnnotation(createObjectActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(createObjectActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCreateObjectAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getCreateObjectAction_Classifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(destroyObjectActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(destroyObjectActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(destroyObjectActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(destroyObjectActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(destroyObjectActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getDestroyObjectAction_IsDestroyOwnedObjects(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDestroyObjectAction_Target(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDestroyObjectAction_IsDestroyLinks(), source,
				new String[] { "ecore", "true" });
		addAnnotation(testIdentityActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(testIdentityActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTestIdentityAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTestIdentityAction_Second(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTestIdentityAction_First(), source, new String[] {
				"ecore", "true" });
		addAnnotation(readSelfActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readSelfActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadSelfAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(structuralFeatureActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(structuralFeatureActionEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(getStructuralFeatureAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getStructuralFeatureAction_StructuralFeature(), source,
				new String[] { "ecore", "true" });
		addAnnotation(readStructuralFeatureActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				readStructuralFeatureActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(
				readStructuralFeatureActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getReadStructuralFeatureAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(writeStructuralFeatureActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(1), source, new String[] { "isAbstract", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(1), source, new String[] { "ecore", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(2), source, new String[] { "isAbstract", "true" });
		addAnnotation(writeStructuralFeatureActionEClass.getEOperations()
				.get(2), source, new String[] { "ecore", "true" });
		addAnnotation(getWriteStructuralFeatureAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getWriteStructuralFeatureAction_Value(), source,
				new String[] { "ecore", "true" });
		addAnnotation(clearStructuralFeatureActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(clearStructuralFeatureActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(clearStructuralFeatureActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(clearStructuralFeatureActionEClass.getEOperations()
				.get(1), source, new String[] { "isAbstract", "true" });
		addAnnotation(clearStructuralFeatureActionEClass.getEOperations()
				.get(1), source, new String[] { "ecore", "true" });
		addAnnotation(getClearStructuralFeatureAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(removeStructuralFeatureValueActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(removeStructuralFeatureValueActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(removeStructuralFeatureValueActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(getRemoveStructuralFeatureValueAction_RemoveAt(), source,
				new String[] { "ecore", "true" });
		addAnnotation(
				getRemoveStructuralFeatureValueAction_IsRemoveDuplicates(),
				source, new String[] { "ecore", "true" });
		addAnnotation(addStructuralFeatureValueActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(addStructuralFeatureValueActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(addStructuralFeatureValueActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(getAddStructuralFeatureValueAction_InsertAt(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getAddStructuralFeatureValueAction_IsReplaceAll(),
				source, new String[] { "ecore", "true" });
		addAnnotation(linkActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getLinkAction_EndData(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLinkAction_InputValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(linkEndDataEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDataEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getLinkEndData_Value(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLinkEndData_Qualifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getLinkEndData_End(), source, new String[] { "ecore",
				"true" });
		addAnnotation(qualifierValueEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(qualifierValueEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getQualifierValue_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getQualifierValue_Qualifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(readLinkActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readLinkActionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadLinkAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(linkEndCreationDataEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(linkEndCreationDataEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(linkEndCreationDataEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(linkEndCreationDataEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(linkEndCreationDataEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getLinkEndCreationData_InsertAt(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getLinkEndCreationData_IsReplaceAll(), source,
				new String[] { "ecore", "true" });
		addAnnotation(createLinkActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(createLinkActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(createLinkActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(writeLinkActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(writeLinkActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(writeLinkActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(destroyLinkActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(linkEndDestructionDataEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(linkEndDestructionDataEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDestructionDataEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(linkEndDestructionDataEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(linkEndDestructionDataEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getLinkEndDestructionData_IsDestroyDuplicates(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getLinkEndDestructionData_DestroyAt(), source,
				new String[] { "ecore", "true" });
		addAnnotation(clearAssociationActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(clearAssociationActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(clearAssociationActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(clearAssociationActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(clearAssociationActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getClearAssociationAction_Association(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClearAssociationAction_Object(), source, new String[] {
				"ecore", "true" });
		addAnnotation(broadcastSignalActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(broadcastSignalActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(broadcastSignalActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(broadcastSignalActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(broadcastSignalActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getBroadcastSignalAction_Signal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(sendObjectActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSendObjectAction_Request(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSendObjectAction_Target(), source, new String[] {
				"ecore", "true" });
		addAnnotation(valueSpecificationActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(valueSpecificationActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(valueSpecificationActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(valueSpecificationActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getValueSpecificationAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getValueSpecificationAction_Value(), source,
				new String[] { "ecore", "true" });
		addAnnotation(timeExpressionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getTimeExpression_Observation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTimeExpression_Expr(), source, new String[] { "ecore",
				"true" });
		addAnnotation(observationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(durationEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getDuration_Observation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDuration_Expr(), source, new String[] { "ecore",
				"true" });
		addAnnotation(durationIntervalEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(intervalEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getInterval_Min(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInterval_Max(), source,
				new String[] { "ecore", "true" });
		addAnnotation(timeConstraintEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getTimeConstraint_FirstEvent(), source, new String[] {
				"ecore", "true" });
		addAnnotation(intervalConstraintEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(timeIntervalEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(durationConstraintEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(durationConstraintEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(durationConstraintEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDurationConstraint_FirstEvent(), source, new String[] {
				"ecore", "true" });
		addAnnotation(timeObservationEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getTimeObservation_FirstEvent(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTimeObservation_Event(), source, new String[] {
				"ecore", "true" });
		addAnnotation(durationObservationEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(durationObservationEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(durationObservationEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getDurationObservation_FirstEvent(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getDurationObservation_Event(), source, new String[] {
				"ecore", "true" });
		addAnnotation(finalStateEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(finalStateEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(timeEventEClass, source, new String[] { "ecore", "true" });
		addAnnotation(timeEventEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(timeEventEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(timeEventEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(timeEventEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTimeEvent_IsRelative(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTimeEvent_When(), source, new String[] { "ecore",
				"true" });
		addAnnotation(variableActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(variableActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(variableActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getVariableAction_Variable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(readVariableActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(readVariableActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readVariableActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(readVariableActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readVariableActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadVariableAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(writeVariableActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(writeVariableActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(writeVariableActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(writeVariableActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(writeVariableActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(getWriteVariableAction_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(clearVariableActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(addVariableValueActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(addVariableValueActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(addVariableValueActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getAddVariableValueAction_InsertAt(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getAddVariableValueAction_IsReplaceAll(), source,
				new String[] { "ecore", "true" });
		addAnnotation(removeVariableValueActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(removeVariableValueActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(removeVariableValueActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(getRemoveVariableValueAction_RemoveAt(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRemoveVariableValueAction_IsRemoveDuplicates(),
				source, new String[] { "ecore", "true" });
		addAnnotation(raiseExceptionActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getRaiseExceptionAction_Exception(), source,
				new String[] { "ecore", "true" });
		addAnnotation(actionInputPinEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(actionInputPinEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getActionInputPin_FromAction(), source, new String[] {
				"ecore", "true" });
		addAnnotation(informationItemEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(informationItemEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationItemEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(informationItemEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationItemEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(informationItemEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationItemEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationItem_Represented(), source, new String[] {
				"ecore", "true" });
		addAnnotation(informationFlowEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(informationFlowEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationFlowEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(informationFlowEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationFlowEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(informationFlowEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(informationFlowEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationFlow_RealizingMessage(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationFlow_Conveyed(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInformationFlow_InformationSource(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationFlow_Realization(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getInformationFlow_RealizingConnector(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationFlow_RealizingActivityEdge(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getInformationFlow_InformationTarget(), source,
				new String[] { "ecore", "true" });
		addAnnotation(readExtentActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(readExtentActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readExtentActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(readExtentActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(readExtentActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadExtentAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReadExtentAction_Classifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(reclassifyObjectActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(reclassifyObjectActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(getReclassifyObjectAction_OldClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReclassifyObjectAction_NewClassifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReclassifyObjectAction_Object(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReclassifyObjectAction_IsReplaceAll(), source,
				new String[] { "ecore", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(1), source, new String[] { "isAbstract", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(1), source, new String[] { "ecore", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(2), source, new String[] { "isAbstract", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(2), source, new String[] { "ecore", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(3), source, new String[] { "isAbstract", "true" });
		addAnnotation(readIsClassifiedObjectActionEClass.getEOperations()
				.get(3), source, new String[] { "ecore", "true" });
		addAnnotation(getReadIsClassifiedObjectAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadIsClassifiedObjectAction_IsDirect(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadIsClassifiedObjectAction_Classifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadIsClassifiedObjectAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(startClassifierBehaviorActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(startClassifierBehaviorActionEClass.getEOperations().get(
				0), source, new String[] { "isAbstract", "true" });
		addAnnotation(startClassifierBehaviorActionEClass.getEOperations().get(
				0), source, new String[] { "ecore", "true" });
		addAnnotation(startClassifierBehaviorActionEClass.getEOperations().get(
				1), source, new String[] { "isAbstract", "true" });
		addAnnotation(startClassifierBehaviorActionEClass.getEOperations().get(
				1), source, new String[] { "ecore", "true" });
		addAnnotation(getStartClassifierBehaviorAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(5),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(5),
				source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(6),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndActionEClass.getEOperations().get(6),
				source, new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndAction_End(), source, new String[] {
				"ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(0), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(0), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(1), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(1), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(2), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(2), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(3), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(3), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(4), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(4), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(5), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(5), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(6), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(6), source, new String[] { "ecore", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(7), source, new String[] { "isAbstract", "true" });
		addAnnotation(readLinkObjectEndQualifierActionEClass.getEOperations()
				.get(7), source, new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndQualifierAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndQualifierAction_Qualifier(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReadLinkObjectEndQualifierAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(createLinkObjectActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(createLinkObjectActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(getCreateLinkObjectAction__result(), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptEventActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptEventActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(getAcceptEventAction_Trigger(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAcceptEventAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getAcceptEventAction_IsUnmarshall(), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptCallActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(acceptCallActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getAcceptCallAction_ReturnInformation(), source,
				new String[] { "ecore", "true" });
		addAnnotation(replyActionEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(replyActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(replyActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(replyActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(replyActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReplyAction_ReturnInformation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReplyAction_ReplyValue(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReplyAction_ReplyToCall(), source, new String[] {
				"ecore", "true" });
		addAnnotation(unmarshallActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(5), source,
				new String[] { "ecore", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(unmarshallActionEClass.getEOperations().get(6), source,
				new String[] { "ecore", "true" });
		addAnnotation(getUnmarshallAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getUnmarshallAction_UnmarshallType(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getUnmarshallAction_Object(), source, new String[] {
				"ecore", "true" });
		addAnnotation(reduceActionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(reduceActionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(reduceActionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(reduceActionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(reduceActionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(reduceActionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(reduceActionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getReduceAction_Reducer(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReduceAction_IsOrdered(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReduceAction__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getReduceAction_Collection(), source, new String[] {
				"ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(0),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(0),
				source, new String[] { "ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(1),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(1),
				source, new String[] { "ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(2),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(2),
				source, new String[] { "ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(3),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(3),
				source, new String[] { "ecore", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(4),
				source, new String[] { "isAbstract", "true" });
		addAnnotation(startObjectBehaviorActionEClass.getEOperations().get(4),
				source, new String[] { "ecore", "true" });
		addAnnotation(getStartObjectBehaviorAction_Object(), source,
				new String[] { "ecore", "true" });
		addAnnotation(joinNodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(joinNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(joinNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(joinNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(joinNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getJoinNode_JoinSpec(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getJoinNode_IsCombineDuplicate(), source, new String[] {
				"ecore", "true" });
		addAnnotation(dataStoreNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(conditionalNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(conditionalNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(conditionalNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getConditionalNode__result(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConditionalNode_IsAssured(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConditionalNode_IsDeterminate(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConditionalNode_Clause(), source, new String[] {
				"ecore", "true" });
		addAnnotation(clauseEClass, source, new String[] { "ecore", "true" });
		addAnnotation(clauseEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(clauseEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(clauseEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(clauseEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClause_Body(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClause_Test(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClause_SuccessorClause(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClause_BodyOutput(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getClause_PredecessorClause(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClause_Decider(), source, new String[] { "ecore",
				"true" });
		addAnnotation(loopNodeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(loopNodeEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getLoopNode__result(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_LoopVariable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getLoopNode_BodyPart(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_Test(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_IsTestedFirst(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getLoopNode_BodyOutput(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_SetupPart(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_Decider(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getLoopNode_LoopVariableInput(), source, new String[] {
				"ecore", "true" });
		addAnnotation(expansionNodeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getExpansionNode_RegionAsInput(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getExpansionNode_RegionAsOutput(), source, new String[] {
				"ecore", "true" });
		addAnnotation(expansionRegionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(expansionRegionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(expansionRegionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getExpansionRegion_InputElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getExpansionRegion_OutputElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getExpansionRegion_Mode(), source, new String[] {
				"ecore", "true" });
		addAnnotation(expansionKindEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(protocolTransitionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(protocolTransitionEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProtocolTransition_PreCondition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getProtocolTransition_PostCondition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationClassEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(associationClassEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationClassEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(associationClassEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(associationClassEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
	}

} //UmlPackageImpl
