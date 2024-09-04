// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EstadoSolicitudCertificadoExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class EstadoSolicitudCertificadoExample
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
        public Criteria andCODG_ESTADOIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO is not null");
            return this;
        }

        public Criteria andCODG_ESTADOEqualTo(String value)
        {
            addCriterion("CODG_ESTADO =", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO <>", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO >", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO >=", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLessThan(String value)
        {
            addCriterion("CODG_ESTADO <", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO <=", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLike(String value)
        {
            addCriterion("CODG_ESTADO like", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotLike(String value)
        {
            addCriterion("CODG_ESTADO not like", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOIn(List values)
        {
            addCriterion("CODG_ESTADO in", values, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotIn(List values)
        {
            addCriterion("CODG_ESTADO not in", values, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO between", value1, value2, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO not between", value1, value2, "CODG_ESTADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ESTADOIsNull()
        {
            criteriaWithoutValue.add("DESC_ESTADO is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andDESC_ESTADOIsNotNull()
        {
            criteriaWithoutValue.add("DESC_ESTADO is not null");
            return this;
        }

        public Criteria andDESC_ESTADOEqualTo(String value)
        {
            addCriterion("DESC_ESTADO =", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADONotEqualTo(String value)
        {
            addCriterion("DESC_ESTADO <>", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOGreaterThan(String value)
        {
            addCriterion("DESC_ESTADO >", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_ESTADO >=", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOLessThan(String value)
        {
            addCriterion("DESC_ESTADO <", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_ESTADO <=", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOLike(String value)
        {
            addCriterion("DESC_ESTADO like", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADONotLike(String value)
        {
            addCriterion("DESC_ESTADO not like", value, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOIn(List values)
        {
            addCriterion("DESC_ESTADO in", values, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADONotIn(List values)
        {
            addCriterion("DESC_ESTADO not in", values, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADOBetween(String value1, String value2)
        {
            addCriterion("DESC_ESTADO between", value1, value2, "DESC_ESTADO");
            return this;
        }

        public Criteria andDESC_ESTADONotBetween(String value1, String value2)
        {
            addCriterion("DESC_ESTADO not between", value1, value2, "DESC_ESTADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_ANTERIORIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_ANTERIOR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_ANTERIORIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_ANTERIOR is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIOREqualTo(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR =", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORNotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR <>", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR >", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR >=", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORLessThan(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR <", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR <=", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORLike(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR like", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORNotLike(String value)
        {
            addCriterion("CODG_ESTADO_ANTERIOR not like", value, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORIn(List values)
        {
            addCriterion("CODG_ESTADO_ANTERIOR in", values, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORNotIn(List values)
        {
            addCriterion("CODG_ESTADO_ANTERIOR not in", values, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_ANTERIOR between", value1, value2, "CODG_ESTADO_ANTERIOR");
            return this;
        }

        public Criteria andCODG_ESTADO_ANTERIORNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_ANTERIOR not between", value1, value2, "CODG_ESTADO_ANTERIOR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_SIGUIENTEIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_SIGUIENTE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_SIGUIENTEIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_SIGUIENTE is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTEEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE =", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTENotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE <>", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTEGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE >", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTEGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE >=", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTELessThan(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE <", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTELessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE <=", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTELike(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE like", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTENotLike(String value)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE not like", value, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTEIn(List values)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE in", values, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTENotIn(List values)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE not in", values, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTEBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE between", value1, value2, "CODG_ESTADO_SIGUIENTE");
            return this;
        }

        public Criteria andCODG_ESTADO_SIGUIENTENotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_SIGUIENTE not between", value1, value2, "CODG_ESTADO_SIGUIENTE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_SECUENCIAIsNull()
        {
            criteriaWithoutValue.add("NUMR_SECUENCIA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_SECUENCIAIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_SECUENCIA is not null");
            return this;
        }

        public Criteria andNUMR_SECUENCIAEqualTo(Short value)
        {
            addCriterion("NUMR_SECUENCIA =", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIANotEqualTo(Short value)
        {
            addCriterion("NUMR_SECUENCIA <>", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIAGreaterThan(Short value)
        {
            addCriterion("NUMR_SECUENCIA >", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIAGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_SECUENCIA >=", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIALessThan(Short value)
        {
            addCriterion("NUMR_SECUENCIA <", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIALessThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_SECUENCIA <=", value, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIAIn(List values)
        {
            addCriterion("NUMR_SECUENCIA in", values, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIANotIn(List values)
        {
            addCriterion("NUMR_SECUENCIA not in", values, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIABetween(Short value1, Short value2)
        {
            addCriterion("NUMR_SECUENCIA between", value1, value2, "NUMR_SECUENCIA");
            return this;
        }

        public Criteria andNUMR_SECUENCIANotBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_SECUENCIA not between", value1, value2, "NUMR_SECUENCIA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_VENTANAS_ASOCIADASIsNull()
        {
            criteriaWithoutValue.add("DESC_VENTANAS_ASOCIADAS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_VENTANAS_ASOCIADASIsNotNull()
        {
            criteriaWithoutValue.add("DESC_VENTANAS_ASOCIADAS is not null");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASEqualTo(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS =", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASNotEqualTo(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS <>", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASGreaterThan(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS >", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS >=", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASLessThan(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS <", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS <=", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASLike(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS like", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASNotLike(String value)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS not like", value, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASIn(List values)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS in", values, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASNotIn(List values)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS not in", values, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASBetween(String value1, String value2)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS between", value1, value2, "DESC_VENTANAS_ASOCIADAS");
            return this;
        }

        public Criteria andDESC_VENTANAS_ASOCIADASNotBetween(String value1, String value2)
        {
            addCriterion("DESC_VENTANAS_ASOCIADAS not between", value1, value2, "DESC_VENTANAS_ASOCIADAS");
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


    public EstadoSolicitudCertificadoExample()
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
