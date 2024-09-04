// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaAuditoriaExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class SolicitudExternaAuditoriaExample
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
		public Criteria andCODG_CORRELATIVOIsNull()
        {
            criteriaWithoutValue.add("CODG_CORRELATIVO is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_CORRELATIVOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CORRELATIVO is not null");
            return this;
        }

        public Criteria andCODG_CORRELATIVOEqualTo(Integer value)
        {
            addCriterion("CODG_CORRELATIVO =", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVONotEqualTo(Integer value)
        {
            addCriterion("CODG_CORRELATIVO <>", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOGreaterThan(Integer value)
        {
            addCriterion("CODG_CORRELATIVO >", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CORRELATIVO >=", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOLessThan(Integer value)
        {
            addCriterion("CODG_CORRELATIVO <", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOLessThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CORRELATIVO <=", value, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOIn(List values)
        {
            addCriterion("CODG_CORRELATIVO in", values, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVONotIn(List values)
        {
            addCriterion("CODG_CORRELATIVO not in", values, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVOBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CORRELATIVO between", value1, value2, "CODG_CORRELATIVO");
            return this;
        }

        public Criteria andCODG_CORRELATIVONotBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CORRELATIVO not between", value1, value2, "CODG_CORRELATIVO");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_USUARIsNull()
        {
            criteriaWithoutValue.add("CODG_USUAR is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_USUARIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USUAR is not null");
            return this;
        }

        public Criteria andCODG_USUAREqualTo(String value)
        {
            addCriterion("CODG_USUAR =", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotEqualTo(String value)
        {
            addCriterion("CODG_USUAR <>", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARGreaterThan(String value)
        {
            addCriterion("CODG_USUAR >", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR >=", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLessThan(String value)
        {
            addCriterion("CODG_USUAR <", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR <=", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLike(String value)
        {
            addCriterion("CODG_USUAR like", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotLike(String value)
        {
            addCriterion("CODG_USUAR not like", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARIn(List values)
        {
            addCriterion("CODG_USUAR in", values, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotIn(List values)
        {
            addCriterion("CODG_USUAR not in", values, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR between", value1, value2, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR not between", value1, value2, "CODG_USUAR");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andDESC_ACCIONIsNull()
        {
            criteriaWithoutValue.add("DESC_ACCION is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andDESC_ACCIONIsNotNull()
        {
            criteriaWithoutValue.add("DESC_ACCION is not null");
            return this;
        }

        public Criteria andDESC_ACCIONEqualTo(String value)
        {
            addCriterion("DESC_ACCION =", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONNotEqualTo(String value)
        {
            addCriterion("DESC_ACCION <>", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONGreaterThan(String value)
        {
            addCriterion("DESC_ACCION >", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_ACCION >=", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONLessThan(String value)
        {
            addCriterion("DESC_ACCION <", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_ACCION <=", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONLike(String value)
        {
            addCriterion("DESC_ACCION like", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONNotLike(String value)
        {
            addCriterion("DESC_ACCION not like", value, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONIn(List values)
        {
            addCriterion("DESC_ACCION in", values, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONNotIn(List values)
        {
            addCriterion("DESC_ACCION not in", values, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONBetween(String value1, String value2)
        {
            addCriterion("DESC_ACCION between", value1, value2, "DESC_ACCION");
            return this;
        }

        public Criteria andDESC_ACCIONNotBetween(String value1, String value2)
        {
            addCriterion("DESC_ACCION not between", value1, value2, "DESC_ACCION");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_ACCIONIsNull()
        {
            criteriaWithoutValue.add("FECH_ACCION is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_ACCIONIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ACCION is not null");
            return this;
        }

        public Criteria andFECH_ACCIONEqualTo(Date value)
        {
            addCriterion("FECH_ACCION =", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONNotEqualTo(Date value)
        {
            addCriterion("FECH_ACCION <>", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONGreaterThan(Date value)
        {
            addCriterion("FECH_ACCION >", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ACCION >=", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONLessThan(Date value)
        {
            addCriterion("FECH_ACCION <", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ACCION <=", value, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONIn(List values)
        {
            addCriterion("FECH_ACCION in", values, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONNotIn(List values)
        {
            addCriterion("FECH_ACCION not in", values, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ACCION between", value1, value2, "FECH_ACCION");
            return this;
        }

        public Criteria andFECH_ACCIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ACCION not between", value1, value2, "FECH_ACCION");
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


    public SolicitudExternaAuditoriaExample()
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
