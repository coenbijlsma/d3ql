/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql.impl;

import nl.coenbijlsma.languages.d3ql.d3ql.AggregateRoot;
import nl.coenbijlsma.languages.d3ql.d3ql.Alias;
import nl.coenbijlsma.languages.d3ql.d3ql.D3qlFactory;
import nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage;
import nl.coenbijlsma.languages.d3ql.d3ql.FromStatement;
import nl.coenbijlsma.languages.d3ql.d3ql.Named;
import nl.coenbijlsma.languages.d3ql.d3ql.PathElement;
import nl.coenbijlsma.languages.d3ql.d3ql.PathExpression;
import nl.coenbijlsma.languages.d3ql.d3ql.Query;
import nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class D3qlPackageImpl extends EPackageImpl implements D3qlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathElementEClass = null;

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
   * @see nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private D3qlPackageImpl()
  {
    super(eNS_URI, D3qlFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link D3qlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static D3qlPackage init()
  {
    if (isInited) return (D3qlPackage)EPackage.Registry.INSTANCE.getEPackage(D3qlPackage.eNS_URI);

    // Obtain or create and register package
    D3qlPackageImpl theD3qlPackage = (D3qlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof D3qlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new D3qlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theD3qlPackage.createPackageContents();

    // Initialize created meta-data
    theD3qlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theD3qlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(D3qlPackage.eNS_URI, theD3qlPackage);
    return theD3qlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_FromStatement()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_SelectStatement()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromStatement()
  {
    return fromStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromStatement_Aggregates()
  {
    return (EReference)fromStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamed()
  {
    return namedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamed_Name()
  {
    return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregateRoot()
  {
    return aggregateRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAggregateRoot_Alias()
  {
    return (EReference)aggregateRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlias()
  {
    return aliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatement()
  {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_Paths()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathExpression()
  {
    return pathExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathExpression_Head()
  {
    return (EReference)pathExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathExpression_Tail()
  {
    return (EReference)pathExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathElement()
  {
    return pathElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathElement_Name()
  {
    return (EAttribute)pathElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D3qlFactory getD3qlFactory()
  {
    return (D3qlFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    queryEClass = createEClass(QUERY);
    createEReference(queryEClass, QUERY__FROM_STATEMENT);
    createEReference(queryEClass, QUERY__SELECT_STATEMENT);

    fromStatementEClass = createEClass(FROM_STATEMENT);
    createEReference(fromStatementEClass, FROM_STATEMENT__AGGREGATES);

    namedEClass = createEClass(NAMED);
    createEAttribute(namedEClass, NAMED__NAME);

    aggregateRootEClass = createEClass(AGGREGATE_ROOT);
    createEReference(aggregateRootEClass, AGGREGATE_ROOT__ALIAS);

    aliasEClass = createEClass(ALIAS);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__PATHS);

    pathExpressionEClass = createEClass(PATH_EXPRESSION);
    createEReference(pathExpressionEClass, PATH_EXPRESSION__HEAD);
    createEReference(pathExpressionEClass, PATH_EXPRESSION__TAIL);

    pathElementEClass = createEClass(PATH_ELEMENT);
    createEAttribute(pathElementEClass, PATH_ELEMENT__NAME);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    aggregateRootEClass.getESuperTypes().add(this.getNamed());
    aliasEClass.getESuperTypes().add(this.getNamed());

    // Initialize classes and features; add operations and parameters
    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuery_FromStatement(), this.getFromStatement(), null, "fromStatement", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuery_SelectStatement(), this.getSelectStatement(), null, "selectStatement", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromStatementEClass, FromStatement.class, "FromStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFromStatement_Aggregates(), this.getAggregateRoot(), null, "aggregates", null, 0, -1, FromStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregateRootEClass, AggregateRoot.class, "AggregateRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAggregateRoot_Alias(), this.getAlias(), null, "alias", null, 0, 1, AggregateRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectStatement_Paths(), this.getPathExpression(), null, "paths", null, 0, -1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathExpressionEClass, PathExpression.class, "PathExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathExpression_Head(), this.getNamed(), null, "head", null, 0, 1, PathExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathExpression_Tail(), this.getPathElement(), null, "tail", null, 0, -1, PathExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathElementEClass, PathElement.class, "PathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //D3qlPackageImpl
