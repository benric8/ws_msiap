// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecuenciaSolicitudExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class SecuenciaSolicitudExample
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
        public Criteria andCODG_PREFIIsNull()
        {
            criteriaWithoutValue.add("CODG_PREFI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_PREFIIsNotNull()
        {
            criteriaWithoutValue.add("CODG_PREFI is not null");
            return this;
        }

        public Criteria andCODG_PREFIEqualTo(String value)
        {
            addCriterion("CODG_PREFI =", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFINotEqualTo(String value)
        {
            addCriterion("CODG_PREFI <>", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFIGreaterThan(String value)
        {
            addCriterion("CODG_PREFI >", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFIGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_PREFI >=", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFILessThan(String value)
        {
            addCriterion("CODG_PREFI <", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFILessThanOrEqualTo(String value)
        {
            addCriterion("CODG_PREFI <=", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFILike(String value)
        {
            addCriterion("CODG_PREFI like", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFINotLike(String value)
        {
            addCriterion("CODG_PREFI not like", value, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFIIn(List values)
        {
            addCriterion("CODG_PREFI in", values, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFINotIn(List values)
        {
            addCriterion("CODG_PREFI not in", values, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFIBetween(String value1, String value2)
        {
            addCriterion("CODG_PREFI between", value1, value2, "CODG_PREFI");
            return this;
        }

        public Criteria andCODG_PREFINotBetween(String value1, String value2)
        {
            addCriterion("CODG_PREFI not between", value1, value2, "CODG_PREFI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CORREIsNull()
        {
            criteriaWithoutValue.add("CODG_CORRE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CORREIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CORRE is not null");
            return this;
        }

        public Criteria andCODG_CORREEqualTo(String value)
        {
            addCriterion("CODG_CORRE =", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRENotEqualTo(String value)
        {
            addCriterion("CODG_CORRE <>", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORREGreaterThan(String value)
        {
            addCriterion("CODG_CORRE >", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORREGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_CORRE >=", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRELessThan(String value)
        {
            addCriterion("CODG_CORRE <", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRELessThanOrEqualTo(String value)
        {
            addCriterion("CODG_CORRE <=", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRELike(String value)
        {
            addCriterion("CODG_CORRE like", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRENotLike(String value)
        {
            addCriterion("CODG_CORRE not like", value, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORREIn(List values)
        {
            addCriterion("CODG_CORRE in", values, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRENotIn(List values)
        {
            addCriterion("CODG_CORRE not in", values, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORREBetween(String value1, String value2)
        {
            addCriterion("CODG_CORRE between", value1, value2, "CODG_CORRE");
            return this;
        }

        public Criteria andCODG_CORRENotBetween(String value1, String value2)
        {
            addCriterion("CODG_CORRE not between", value1, value2, "CODG_CORRE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PREFIIsNull()
        {
            criteriaWithoutValue.add("TIPO_PREFI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PREFIIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_PREFI is not null");
            return this;
        }

        public Criteria andTIPO_PREFIEqualTo(String value)
        {
            addCriterion("TIPO_PREFI =", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFINotEqualTo(String value)
        {
            addCriterion("TIPO_PREFI <>", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFIGreaterThan(String value)
        {
            addCriterion("TIPO_PREFI >", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFIGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PREFI >=", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFILessThan(String value)
        {
            addCriterion("TIPO_PREFI <", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFILessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PREFI <=", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFILike(String value)
        {
            addCriterion("TIPO_PREFI like", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFINotLike(String value)
        {
            addCriterion("TIPO_PREFI not like", value, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFIIn(List values)
        {
            addCriterion("TIPO_PREFI in", values, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFINotIn(List values)
        {
            addCriterion("TIPO_PREFI not in", values, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFIBetween(String value1, String value2)
        {
            addCriterion("TIPO_PREFI between", value1, value2, "TIPO_PREFI");
            return this;
        }

        public Criteria andTIPO_PREFINotBetween(String value1, String value2)
        {
            addCriterion("TIPO_PREFI not between", value1, value2, "TIPO_PREFI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_PREFIIsNull()
        {
            criteriaWithoutValue.add("DESC_PREFI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_PREFIIsNotNull()
        {
            criteriaWithoutValue.add("DESC_PREFI is not null");
            return this;
        }

        public Criteria andDESC_PREFIEqualTo(String value)
        {
            addCriterion("DESC_PREFI =", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFINotEqualTo(String value)
        {
            addCriterion("DESC_PREFI <>", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFIGreaterThan(String value)
        {
            addCriterion("DESC_PREFI >", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFIGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_PREFI >=", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFILessThan(String value)
        {
            addCriterion("DESC_PREFI <", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFILessThanOrEqualTo(String value)
        {
            addCriterion("DESC_PREFI <=", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFILike(String value)
        {
            addCriterion("DESC_PREFI like", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFINotLike(String value)
        {
            addCriterion("DESC_PREFI not like", value, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFIIn(List values)
        {
            addCriterion("DESC_PREFI in", values, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFINotIn(List values)
        {
            addCriterion("DESC_PREFI not in", values, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFIBetween(String value1, String value2)
        {
            addCriterion("DESC_PREFI between", value1, value2, "DESC_PREFI");
            return this;
        }

        public Criteria andDESC_PREFINotBetween(String value1, String value2)
        {
            addCriterion("DESC_PREFI not between", value1, value2, "DESC_PREFI");
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


    public SecuenciaSolicitudExample()
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
