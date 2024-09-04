// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JuzgadoExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class JuzgadoExample
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
        public Criteria andCODG_JUZGADIsNull()
        {
            criteriaWithoutValue.add("CODG_JUZGAD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_JUZGADIsNotNull()
        {
            criteriaWithoutValue.add("CODG_JUZGAD is not null");
            return this;
        }

        public Criteria andCODG_JUZGADEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD =", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD <>", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADGreaterThan(String value)
        {
            addCriterion("CODG_JUZGAD >", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD >=", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLessThan(String value)
        {
            addCriterion("CODG_JUZGAD <", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD <=", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLike(String value)
        {
            addCriterion("CODG_JUZGAD like", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotLike(String value)
        {
            addCriterion("CODG_JUZGAD not like", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADIn(List values)
        {
            addCriterion("CODG_JUZGAD in", values, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotIn(List values)
        {
            addCriterion("CODG_JUZGAD not in", values, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADBetween(String value1, String value2)
        {
            addCriterion("CODG_JUZGAD between", value1, value2, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotBetween(String value1, String value2)
        {
            addCriterion("CODG_JUZGAD not between", value1, value2, "CODG_JUZGAD");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_JUZGADIsNull()
        {
            criteriaWithoutValue.add("DESC_JUZGAD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_JUZGADIsNotNull()
        {
            criteriaWithoutValue.add("DESC_JUZGAD is not null");
            return this;
        }

        public Criteria andDESC_JUZGADEqualTo(String value)
        {
            addCriterion("DESC_JUZGAD =", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADNotEqualTo(String value)
        {
            addCriterion("DESC_JUZGAD <>", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADGreaterThan(String value)
        {
            addCriterion("DESC_JUZGAD >", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_JUZGAD >=", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADLessThan(String value)
        {
            addCriterion("DESC_JUZGAD <", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_JUZGAD <=", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADLike(String value)
        {
            addCriterion("DESC_JUZGAD like", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADNotLike(String value)
        {
            addCriterion("DESC_JUZGAD not like", value, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADIn(List values)
        {
            addCriterion("DESC_JUZGAD in", values, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADNotIn(List values)
        {
            addCriterion("DESC_JUZGAD not in", values, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADBetween(String value1, String value2)
        {
            addCriterion("DESC_JUZGAD between", value1, value2, "DESC_JUZGAD");
            return this;
        }

        public Criteria andDESC_JUZGADNotBetween(String value1, String value2)
        {
            addCriterion("DESC_JUZGAD not between", value1, value2, "DESC_JUZGAD");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_LARGA_JUZGADIsNull()
        {
            criteriaWithoutValue.add("DESC_LARGA_JUZGAD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_LARGA_JUZGADIsNotNull()
        {
            criteriaWithoutValue.add("DESC_LARGA_JUZGAD is not null");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADEqualTo(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD =", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADNotEqualTo(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD <>", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADGreaterThan(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD >", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD >=", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADLessThan(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD <", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD <=", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADLike(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD like", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADNotLike(String value)
        {
            addCriterion("DESC_LARGA_JUZGAD not like", value, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADIn(List values)
        {
            addCriterion("DESC_LARGA_JUZGAD in", values, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADNotIn(List values)
        {
            addCriterion("DESC_LARGA_JUZGAD not in", values, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADBetween(String value1, String value2)
        {
            addCriterion("DESC_LARGA_JUZGAD between", value1, value2, "DESC_LARGA_JUZGAD");
            return this;
        }

        public Criteria andDESC_LARGA_JUZGADNotBetween(String value1, String value2)
        {
            addCriterion("DESC_LARGA_JUZGAD not between", value1, value2, "DESC_LARGA_JUZGAD");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTD_JUZGAIsNull()
        {
            criteriaWithoutValue.add("ESTD_JUZGA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTD_JUZGAIsNotNull()
        {
            criteriaWithoutValue.add("ESTD_JUZGA is not null");
            return this;
        }

        public Criteria andESTD_JUZGAEqualTo(String value)
        {
            addCriterion("ESTD_JUZGA =", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGANotEqualTo(String value)
        {
            addCriterion("ESTD_JUZGA <>", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGAGreaterThan(String value)
        {
            addCriterion("ESTD_JUZGA >", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGAGreaterThanOrEqualTo(String value)
        {
            addCriterion("ESTD_JUZGA >=", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGALessThan(String value)
        {
            addCriterion("ESTD_JUZGA <", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGALessThanOrEqualTo(String value)
        {
            addCriterion("ESTD_JUZGA <=", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGALike(String value)
        {
            addCriterion("ESTD_JUZGA like", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGANotLike(String value)
        {
            addCriterion("ESTD_JUZGA not like", value, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGAIn(List values)
        {
            addCriterion("ESTD_JUZGA in", values, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGANotIn(List values)
        {
            addCriterion("ESTD_JUZGA not in", values, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGABetween(String value1, String value2)
        {
            addCriterion("ESTD_JUZGA between", value1, value2, "ESTD_JUZGA");
            return this;
        }

        public Criteria andESTD_JUZGANotBetween(String value1, String value2)
        {
            addCriterion("ESTD_JUZGA not between", value1, value2, "ESTD_JUZGA");
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


    public JuzgadoExample()
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
