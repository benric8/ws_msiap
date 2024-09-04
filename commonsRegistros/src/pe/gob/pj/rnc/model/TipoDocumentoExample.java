// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoDocumentoExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class TipoDocumentoExample
{
    public static class Criteria
    {

        public List getCriteriaWithoutValue()
        {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue()
        {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue()
        {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue()
        {
            return criteriaWithBetweenValue;
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, Object value, String property)
        {
            if(value == null)
            {
                throw new RuntimeException((new StringBuilder()).append("Value for ").append(property).append(" cannot be null").toString());
            } else
            {
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("value", value);
                criteriaWithSingleValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, List values, String property)
        {
            if(values == null || values.size() == 0)
            {
                throw new RuntimeException((new StringBuilder()).append("Value list for ").append(property).append(" cannot be null or empty").toString());
            } else
            {
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("values", values);
                criteriaWithListValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if(value1 == null || value2 == null)
            {
                throw new RuntimeException((new StringBuilder()).append("Between values for ").append(property).append(" cannot be null").toString());
            } else
            {
                List list = new ArrayList();
                list.add(value1);
                list.add(value2);
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("values", list);
                criteriaWithBetweenValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_TIPDOCIsNull()
        {
            criteriaWithoutValue.add("C_CODG_TIPDOC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_TIPDOCIsNotNull()
        {
            criteriaWithoutValue.add("C_CODG_TIPDOC is not null");
            return this;
        }

        public Criteria andC_CODG_TIPDOCEqualTo(String value)
        {
            addCriterion("C_CODG_TIPDOC =", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCNotEqualTo(String value)
        {
            addCriterion("C_CODG_TIPDOC <>", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCGreaterThan(String value)
        {
            addCriterion("C_CODG_TIPDOC >", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_TIPDOC >=", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCLessThan(String value)
        {
            addCriterion("C_CODG_TIPDOC <", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCLessThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_TIPDOC <=", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCLike(String value)
        {
            addCriterion("C_CODG_TIPDOC like", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCNotLike(String value)
        {
            addCriterion("C_CODG_TIPDOC not like", value, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCIn(List values)
        {
            addCriterion("C_CODG_TIPDOC in", values, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCNotIn(List values)
        {
            addCriterion("C_CODG_TIPDOC not in", values, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCBetween(String value1, String value2)
        {
            addCriterion("C_CODG_TIPDOC between", value1, value2, "C_CODG_TIPDOC");
            return this;
        }

        public Criteria andC_CODG_TIPDOCNotBetween(String value1, String value2)
        {
            addCriterion("C_CODG_TIPDOC not between", value1, value2, "C_CODG_TIPDOC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_DESC_TIPDOCIsNull()
        {
            criteriaWithoutValue.add("C_DESC_TIPDOC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_DESC_TIPDOCIsNotNull()
        {
            criteriaWithoutValue.add("C_DESC_TIPDOC is not null");
            return this;
        }

        public Criteria andC_DESC_TIPDOCEqualTo(String value)
        {
            addCriterion("C_DESC_TIPDOC =", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCNotEqualTo(String value)
        {
            addCriterion("C_DESC_TIPDOC <>", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCGreaterThan(String value)
        {
            addCriterion("C_DESC_TIPDOC >", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_DESC_TIPDOC >=", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCLessThan(String value)
        {
            addCriterion("C_DESC_TIPDOC <", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCLessThanOrEqualTo(String value)
        {
            addCriterion("C_DESC_TIPDOC <=", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCLike(String value)
        {
            addCriterion("C_DESC_TIPDOC like", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCNotLike(String value)
        {
            addCriterion("C_DESC_TIPDOC not like", value, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCIn(List values)
        {
            addCriterion("C_DESC_TIPDOC in", values, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCNotIn(List values)
        {
            addCriterion("C_DESC_TIPDOC not in", values, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCBetween(String value1, String value2)
        {
            addCriterion("C_DESC_TIPDOC between", value1, value2, "C_DESC_TIPDOC");
            return this;
        }

        public Criteria andC_DESC_TIPDOCNotBetween(String value1, String value2)
        {
            addCriterion("C_DESC_TIPDOC not between", value1, value2, "C_DESC_TIPDOC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_ESTADOIsNull()
        {
            criteriaWithoutValue.add("L_ESTADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_ESTADOIsNotNull()
        {
            criteriaWithoutValue.add("L_ESTADO is not null");
            return this;
        }

        public Criteria andL_ESTADOEqualTo(String value)
        {
            addCriterion("L_ESTADO =", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADONotEqualTo(String value)
        {
            addCriterion("L_ESTADO <>", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOGreaterThan(String value)
        {
            addCriterion("L_ESTADO >", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_ESTADO >=", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOLessThan(String value)
        {
            addCriterion("L_ESTADO <", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOLessThanOrEqualTo(String value)
        {
            addCriterion("L_ESTADO <=", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOLike(String value)
        {
            addCriterion("L_ESTADO like", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADONotLike(String value)
        {
            addCriterion("L_ESTADO not like", value, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOIn(List values)
        {
            addCriterion("L_ESTADO in", values, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADONotIn(List values)
        {
            addCriterion("L_ESTADO not in", values, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADOBetween(String value1, String value2)
        {
            addCriterion("L_ESTADO between", value1, value2, "L_ESTADO");
            return this;
        }

        public Criteria andL_ESTADONotBetween(String value1, String value2)
        {
            addCriterion("L_ESTADO not between", value1, value2, "L_ESTADO");
            return this;
        }

        private List criteriaWithoutValue;
        private List criteriaWithSingleValue;
        private List criteriaWithListValue;
        private List criteriaWithBetweenValue;

        private Criteria()
        {
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

    }


    public TipoDocumentoExample()
    {
        oredCriteria = new ArrayList();
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public List getOredCriteria()
    {
        return oredCriteria;
    }
    @SuppressWarnings("unchecked")
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }
    @SuppressWarnings("unchecked")
    public Criteria createCriteria()
    {
        Criteria criteria = new Criteria();
        if(oredCriteria.size() == 0)
            oredCriteria.add(criteria);
        return criteria;
    }

    private String orderByClause;
    private List oredCriteria;
}
