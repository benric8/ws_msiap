// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoUsuarioExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class TipoUsuarioExample
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
        public Criteria andCODG_TIPOIsNull()
        {
            criteriaWithoutValue.add("CODG_TIPO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_TIPOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_TIPO is not null");
            return this;
        }

        public Criteria andCODG_TIPOEqualTo(String value)
        {
            addCriterion("CODG_TIPO =", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotEqualTo(String value)
        {
            addCriterion("CODG_TIPO <>", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOGreaterThan(String value)
        {
            addCriterion("CODG_TIPO >", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO >=", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLessThan(String value)
        {
            addCriterion("CODG_TIPO <", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO <=", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLike(String value)
        {
            addCriterion("CODG_TIPO like", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotLike(String value)
        {
            addCriterion("CODG_TIPO not like", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOIn(List values)
        {
            addCriterion("CODG_TIPO in", values, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotIn(List values)
        {
            addCriterion("CODG_TIPO not in", values, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO between", value1, value2, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO not between", value1, value2, "CODG_TIPO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TIPOIsNull()
        {
            criteriaWithoutValue.add("DESC_TIPO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TIPOIsNotNull()
        {
            criteriaWithoutValue.add("DESC_TIPO is not null");
            return this;
        }

        public Criteria andDESC_TIPOEqualTo(String value)
        {
            addCriterion("DESC_TIPO =", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPONotEqualTo(String value)
        {
            addCriterion("DESC_TIPO <>", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOGreaterThan(String value)
        {
            addCriterion("DESC_TIPO >", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_TIPO >=", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOLessThan(String value)
        {
            addCriterion("DESC_TIPO <", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_TIPO <=", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOLike(String value)
        {
            addCriterion("DESC_TIPO like", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPONotLike(String value)
        {
            addCriterion("DESC_TIPO not like", value, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOIn(List values)
        {
            addCriterion("DESC_TIPO in", values, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPONotIn(List values)
        {
            addCriterion("DESC_TIPO not in", values, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPOBetween(String value1, String value2)
        {
            addCriterion("DESC_TIPO between", value1, value2, "DESC_TIPO");
            return this;
        }

        public Criteria andDESC_TIPONotBetween(String value1, String value2)
        {
            addCriterion("DESC_TIPO not between", value1, value2, "DESC_TIPO");
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


    public TipoUsuarioExample()
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
