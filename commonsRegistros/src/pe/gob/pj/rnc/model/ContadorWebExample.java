// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ContadorWebExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class ContadorWebExample
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
        public Criteria andCOD_TABLAIsNull()
        {
            criteriaWithoutValue.add("COD_TABLA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCOD_TABLAIsNotNull()
        {
            criteriaWithoutValue.add("COD_TABLA is not null");
            return this;
        }

        public Criteria andCOD_TABLAEqualTo(Integer value)
        {
            addCriterion("COD_TABLA =", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLANotEqualTo(Integer value)
        {
            addCriterion("COD_TABLA <>", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLAGreaterThan(Integer value)
        {
            addCriterion("COD_TABLA >", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLAGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("COD_TABLA >=", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLALessThan(Integer value)
        {
            addCriterion("COD_TABLA <", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLALessThanOrEqualTo(Integer value)
        {
            addCriterion("COD_TABLA <=", value, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLAIn(List values)
        {
            addCriterion("COD_TABLA in", values, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLANotIn(List values)
        {
            addCriterion("COD_TABLA not in", values, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLABetween(Integer value1, Integer value2)
        {
            addCriterion("COD_TABLA between", value1, value2, "COD_TABLA");
            return this;
        }

        public Criteria andCOD_TABLANotBetween(Integer value1, Integer value2)
        {
            addCriterion("COD_TABLA not between", value1, value2, "COD_TABLA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_ANHOIsNull()
        {
            criteriaWithoutValue.add("NUM_ANHO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_ANHOIsNotNull()
        {
            criteriaWithoutValue.add("NUM_ANHO is not null");
            return this;
        }

        public Criteria andNUM_ANHOEqualTo(String value)
        {
            addCriterion("NUM_ANHO =", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotEqualTo(String value)
        {
            addCriterion("NUM_ANHO <>", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOGreaterThan(String value)
        {
            addCriterion("NUM_ANHO >", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUM_ANHO >=", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLessThan(String value)
        {
            addCriterion("NUM_ANHO <", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLessThanOrEqualTo(String value)
        {
            addCriterion("NUM_ANHO <=", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLike(String value)
        {
            addCriterion("NUM_ANHO like", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotLike(String value)
        {
            addCriterion("NUM_ANHO not like", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOIn(List values)
        {
            addCriterion("NUM_ANHO in", values, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotIn(List values)
        {
            addCriterion("NUM_ANHO not in", values, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOBetween(String value1, String value2)
        {
            addCriterion("NUM_ANHO between", value1, value2, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotBetween(String value1, String value2)
        {
            addCriterion("NUM_ANHO not between", value1, value2, "NUM_ANHO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_CORRELATIVOIsNull()
        {
            criteriaWithoutValue.add("NUM_CORRELATIVO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_CORRELATIVOIsNotNull()
        {
            criteriaWithoutValue.add("NUM_CORRELATIVO is not null");
            return this;
        }

        public Criteria andNUM_CORRELATIVOEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO =", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVONotEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO <>", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOGreaterThan(Integer value)
        {
            addCriterion("NUM_CORRELATIVO >", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO >=", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOLessThan(Integer value)
        {
            addCriterion("NUM_CORRELATIVO <", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO <=", value, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOIn(List values)
        {
            addCriterion("NUM_CORRELATIVO in", values, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVONotIn(List values)
        {
            addCriterion("NUM_CORRELATIVO not in", values, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVOBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_CORRELATIVO between", value1, value2, "NUM_CORRELATIVO");
            return this;
        }

        public Criteria andNUM_CORRELATIVONotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_CORRELATIVO not between", value1, value2, "NUM_CORRELATIVO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDES_TABLAIsNull()
        {
            criteriaWithoutValue.add("DES_TABLA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDES_TABLAIsNotNull()
        {
            criteriaWithoutValue.add("DES_TABLA is not null");
            return this;
        }

        public Criteria andDES_TABLAEqualTo(String value)
        {
            addCriterion("DES_TABLA =", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLANotEqualTo(String value)
        {
            addCriterion("DES_TABLA <>", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLAGreaterThan(String value)
        {
            addCriterion("DES_TABLA >", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLAGreaterThanOrEqualTo(String value)
        {
            addCriterion("DES_TABLA >=", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLALessThan(String value)
        {
            addCriterion("DES_TABLA <", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLALessThanOrEqualTo(String value)
        {
            addCriterion("DES_TABLA <=", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLALike(String value)
        {
            addCriterion("DES_TABLA like", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLANotLike(String value)
        {
            addCriterion("DES_TABLA not like", value, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLAIn(List values)
        {
            addCriterion("DES_TABLA in", values, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLANotIn(List values)
        {
            addCriterion("DES_TABLA not in", values, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLABetween(String value1, String value2)
        {
            addCriterion("DES_TABLA between", value1, value2, "DES_TABLA");
            return this;
        }

        public Criteria andDES_TABLANotBetween(String value1, String value2)
        {
            addCriterion("DES_TABLA not between", value1, value2, "DES_TABLA");
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


    public ContadorWebExample()
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
