/**
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.d3ql.impl;

import java.util.Collection;

import nl.coenbijlsma.languages.d3ql.d3ql.D3qlPackage;
import nl.coenbijlsma.languages.d3ql.d3ql.Named;
import nl.coenbijlsma.languages.d3ql.d3ql.PathElement;
import nl.coenbijlsma.languages.d3ql.d3ql.PathExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.impl.PathExpressionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link nl.coenbijlsma.languages.d3ql.d3ql.impl.PathExpressionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathExpressionImpl extends MinimalEObjectImpl.Container implements PathExpression
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Named head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<PathElement> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExpressionImpl()
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
    return D3qlPackage.Literals.PATH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named getHead()
  {
    if (head != null && head.eIsProxy())
    {
      InternalEObject oldHead = (InternalEObject)head;
      head = (Named)eResolveProxy(oldHead);
      if (head != oldHead)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, D3qlPackage.PATH_EXPRESSION__HEAD, oldHead, head));
      }
    }
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named basicGetHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(Named newHead)
  {
    Named oldHead = head;
    head = newHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, D3qlPackage.PATH_EXPRESSION__HEAD, oldHead, head));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathElement> getTail()
  {
    if (tail == null)
    {
      tail = new EObjectContainmentEList<PathElement>(PathElement.class, this, D3qlPackage.PATH_EXPRESSION__TAIL);
    }
    return tail;
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
      case D3qlPackage.PATH_EXPRESSION__TAIL:
        return ((InternalEList<?>)getTail()).basicRemove(otherEnd, msgs);
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
      case D3qlPackage.PATH_EXPRESSION__HEAD:
        if (resolve) return getHead();
        return basicGetHead();
      case D3qlPackage.PATH_EXPRESSION__TAIL:
        return getTail();
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
      case D3qlPackage.PATH_EXPRESSION__HEAD:
        setHead((Named)newValue);
        return;
      case D3qlPackage.PATH_EXPRESSION__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends PathElement>)newValue);
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
      case D3qlPackage.PATH_EXPRESSION__HEAD:
        setHead((Named)null);
        return;
      case D3qlPackage.PATH_EXPRESSION__TAIL:
        getTail().clear();
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
      case D3qlPackage.PATH_EXPRESSION__HEAD:
        return head != null;
      case D3qlPackage.PATH_EXPRESSION__TAIL:
        return tail != null && !tail.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PathExpressionImpl