/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql.impl;

import java.util.Collection;

import nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage;
import nl.coenbijlsma.languages.d3ql.d3ql.PathExpression;
import nl.coenbijlsma.languages.d3ql.d3ql.SelectStatement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.impl.SelectStatementImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectStatementImpl extends MinimalEObjectImpl.Container implements SelectStatement
{
  /**
   * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaths()
   * @generated
   * @ordered
   */
  protected EList<PathExpression> paths;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return D3qlPackage.Literals.SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathExpression> getPaths()
  {
    if (paths == null)
    {
      paths = new EObjectContainmentEList<PathExpression>(PathExpression.class, this, D3qlPackage.SELECT_STATEMENT__PATHS);
    }
    return paths;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case D3qlPackage.SELECT_STATEMENT__PATHS:
        return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case D3qlPackage.SELECT_STATEMENT__PATHS:
        return getPaths();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case D3qlPackage.SELECT_STATEMENT__PATHS:
        getPaths().clear();
        getPaths().addAll((Collection<? extends PathExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case D3qlPackage.SELECT_STATEMENT__PATHS:
        getPaths().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case D3qlPackage.SELECT_STATEMENT__PATHS:
        return paths != null && !paths.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
