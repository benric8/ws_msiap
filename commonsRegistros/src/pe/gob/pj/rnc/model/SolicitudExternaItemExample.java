// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaItemExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class SolicitudExternaItemExample
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
        public Criteria andCODG_CERTIIsNull()
        {
            criteriaWithoutValue.add("CODG_CERTI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CERTIIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CERTI is not null");
            return this;
        }

        public Criteria andCODG_CERTIEqualTo(String value)
        {
            addCriterion("CODG_CERTI =", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotEqualTo(String value)
        {
            addCriterion("CODG_CERTI <>", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIGreaterThan(String value)
        {
            addCriterion("CODG_CERTI >", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_CERTI >=", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILessThan(String value)
        {
            addCriterion("CODG_CERTI <", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILessThanOrEqualTo(String value)
        {
            addCriterion("CODG_CERTI <=", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILike(String value)
        {
            addCriterion("CODG_CERTI like", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotLike(String value)
        {
            addCriterion("CODG_CERTI not like", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIIn(List values)
        {
            addCriterion("CODG_CERTI in", values, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotIn(List values)
        {
            addCriterion("CODG_CERTI not in", values, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIBetween(String value1, String value2)
        {
            addCriterion("CODG_CERTI between", value1, value2, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotBetween(String value1, String value2)
        {
            addCriterion("CODG_CERTI not between", value1, value2, "CODG_CERTI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CERTI_EXTERNOIsNull()
        {
            criteriaWithoutValue.add("CODG_CERTI_EXTERNO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CERTI_EXTERNOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CERTI_EXTERNO is not null");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO =", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <>", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOGreaterThan(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO >", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO >=", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOLessThan(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOLessThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <=", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOIn(List values)
        {
            addCriterion("CODG_CERTI_EXTERNO in", values, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotIn(List values)
        {
            addCriterion("CODG_CERTI_EXTERNO not in", values, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CERTI_EXTERNO between", value1, value2, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CERTI_EXTERNO not between", value1, value2, "CODG_CERTI_EXTERNO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REGISTRAIsNull()
        {
            criteriaWithoutValue.add("INDC_REGISTRA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REGISTRAIsNotNull()
        {
            criteriaWithoutValue.add("INDC_REGISTRA is not null");
            return this;
        }

        public Criteria andINDC_REGISTRAEqualTo(String value)
        {
            addCriterion("INDC_REGISTRA =", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRANotEqualTo(String value)
        {
            addCriterion("INDC_REGISTRA <>", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRAGreaterThan(String value)
        {
            addCriterion("INDC_REGISTRA >", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRAGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_REGISTRA >=", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRALessThan(String value)
        {
            addCriterion("INDC_REGISTRA <", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRALessThanOrEqualTo(String value)
        {
            addCriterion("INDC_REGISTRA <=", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRALike(String value)
        {
            addCriterion("INDC_REGISTRA like", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRANotLike(String value)
        {
            addCriterion("INDC_REGISTRA not like", value, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRAIn(List values)
        {
            addCriterion("INDC_REGISTRA in", values, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRANotIn(List values)
        {
            addCriterion("INDC_REGISTRA not in", values, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRABetween(String value1, String value2)
        {
            addCriterion("INDC_REGISTRA between", value1, value2, "INDC_REGISTRA");
            return this;
        }

        public Criteria andINDC_REGISTRANotBetween(String value1, String value2)
        {
            addCriterion("INDC_REGISTRA not between", value1, value2, "INDC_REGISTRA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_DESCARTEIsNull()
        {
            criteriaWithoutValue.add("INDC_DESCARTE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_DESCARTEIsNotNull()
        {
            criteriaWithoutValue.add("INDC_DESCARTE is not null");
            return this;
        }

        public Criteria andINDC_DESCARTEEqualTo(String value)
        {
            addCriterion("INDC_DESCARTE =", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTENotEqualTo(String value)
        {
            addCriterion("INDC_DESCARTE <>", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTEGreaterThan(String value)
        {
            addCriterion("INDC_DESCARTE >", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTEGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_DESCARTE >=", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTELessThan(String value)
        {
            addCriterion("INDC_DESCARTE <", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTELessThanOrEqualTo(String value)
        {
            addCriterion("INDC_DESCARTE <=", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTELike(String value)
        {
            addCriterion("INDC_DESCARTE like", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTENotLike(String value)
        {
            addCriterion("INDC_DESCARTE not like", value, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTEIn(List values)
        {
            addCriterion("INDC_DESCARTE in", values, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTENotIn(List values)
        {
            addCriterion("INDC_DESCARTE not in", values, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTEBetween(String value1, String value2)
        {
            addCriterion("INDC_DESCARTE between", value1, value2, "INDC_DESCARTE");
            return this;
        }

        public Criteria andINDC_DESCARTENotBetween(String value1, String value2)
        {
            addCriterion("INDC_DESCARTE not between", value1, value2, "INDC_DESCARTE");
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


    public SolicitudExternaItemExample()
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
