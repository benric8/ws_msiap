// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LugarDireccionExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class LugarDireccionExample
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
        public Criteria andCODG_LUGAR_DIRECCIONIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_DIRECCION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_DIRECCIONIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_DIRECCION is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION =", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION <>", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION >", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION >=", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONLessThan(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION <", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION <=", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONLike(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION like", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONNotLike(String value)
        {
            addCriterion("CODG_LUGAR_DIRECCION not like", value, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONIn(List values)
        {
            addCriterion("CODG_LUGAR_DIRECCION in", values, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONNotIn(List values)
        {
            addCriterion("CODG_LUGAR_DIRECCION not in", values, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_DIRECCION between", value1, value2, "CODG_LUGAR_DIRECCION");
            return this;
        }

        public Criteria andCODG_LUGAR_DIRECCIONNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_DIRECCION not between", value1, value2, "CODG_LUGAR_DIRECCION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_LUGARIsNull()
        {
            criteriaWithoutValue.add("DESC_LUGAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("DESC_LUGAR is not null");
            return this;
        }

        public Criteria andDESC_LUGAREqualTo(String value)
        {
            addCriterion("DESC_LUGAR =", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARNotEqualTo(String value)
        {
            addCriterion("DESC_LUGAR <>", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARGreaterThan(String value)
        {
            addCriterion("DESC_LUGAR >", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_LUGAR >=", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARLessThan(String value)
        {
            addCriterion("DESC_LUGAR <", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_LUGAR <=", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARLike(String value)
        {
            addCriterion("DESC_LUGAR like", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARNotLike(String value)
        {
            addCriterion("DESC_LUGAR not like", value, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARIn(List values)
        {
            addCriterion("DESC_LUGAR in", values, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARNotIn(List values)
        {
            addCriterion("DESC_LUGAR not in", values, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARBetween(String value1, String value2)
        {
            addCriterion("DESC_LUGAR between", value1, value2, "DESC_LUGAR");
            return this;
        }

        public Criteria andDESC_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("DESC_LUGAR not between", value1, value2, "DESC_LUGAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDIRE_LUGARIsNull()
        {
            criteriaWithoutValue.add("DIRE_LUGAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDIRE_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("DIRE_LUGAR is not null");
            return this;
        }

        public Criteria andDIRE_LUGAREqualTo(String value)
        {
            addCriterion("DIRE_LUGAR =", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARNotEqualTo(String value)
        {
            addCriterion("DIRE_LUGAR <>", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARGreaterThan(String value)
        {
            addCriterion("DIRE_LUGAR >", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("DIRE_LUGAR >=", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARLessThan(String value)
        {
            addCriterion("DIRE_LUGAR <", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("DIRE_LUGAR <=", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARLike(String value)
        {
            addCriterion("DIRE_LUGAR like", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARNotLike(String value)
        {
            addCriterion("DIRE_LUGAR not like", value, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARIn(List values)
        {
            addCriterion("DIRE_LUGAR in", values, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARNotIn(List values)
        {
            addCriterion("DIRE_LUGAR not in", values, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARBetween(String value1, String value2)
        {
            addCriterion("DIRE_LUGAR between", value1, value2, "DIRE_LUGAR");
            return this;
        }

        public Criteria andDIRE_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("DIRE_LUGAR not between", value1, value2, "DIRE_LUGAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_LUGARIsNull()
        {
            criteriaWithoutValue.add("OBSE_LUGAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("OBSE_LUGAR is not null");
            return this;
        }

        public Criteria andOBSE_LUGAREqualTo(String value)
        {
            addCriterion("OBSE_LUGAR =", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARNotEqualTo(String value)
        {
            addCriterion("OBSE_LUGAR <>", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARGreaterThan(String value)
        {
            addCriterion("OBSE_LUGAR >", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSE_LUGAR >=", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARLessThan(String value)
        {
            addCriterion("OBSE_LUGAR <", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("OBSE_LUGAR <=", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARLike(String value)
        {
            addCriterion("OBSE_LUGAR like", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARNotLike(String value)
        {
            addCriterion("OBSE_LUGAR not like", value, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARIn(List values)
        {
            addCriterion("OBSE_LUGAR in", values, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARNotIn(List values)
        {
            addCriterion("OBSE_LUGAR not in", values, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARBetween(String value1, String value2)
        {
            addCriterion("OBSE_LUGAR between", value1, value2, "OBSE_LUGAR");
            return this;
        }

        public Criteria andOBSE_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("OBSE_LUGAR not between", value1, value2, "OBSE_LUGAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LUGARIsNull()
        {
            criteriaWithoutValue.add("INDC_LUGAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("INDC_LUGAR is not null");
            return this;
        }

        public Criteria andINDC_LUGAREqualTo(String value)
        {
            addCriterion("INDC_LUGAR =", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARNotEqualTo(String value)
        {
            addCriterion("INDC_LUGAR <>", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARGreaterThan(String value)
        {
            addCriterion("INDC_LUGAR >", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_LUGAR >=", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARLessThan(String value)
        {
            addCriterion("INDC_LUGAR <", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_LUGAR <=", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARLike(String value)
        {
            addCriterion("INDC_LUGAR like", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARNotLike(String value)
        {
            addCriterion("INDC_LUGAR not like", value, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARIn(List values)
        {
            addCriterion("INDC_LUGAR in", values, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARNotIn(List values)
        {
            addCriterion("INDC_LUGAR not in", values, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARBetween(String value1, String value2)
        {
            addCriterion("INDC_LUGAR between", value1, value2, "INDC_LUGAR");
            return this;
        }

        public Criteria andINDC_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("INDC_LUGAR not between", value1, value2, "INDC_LUGAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_DIRECIsNull()
        {
            criteriaWithoutValue.add("INDC_DIREC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_DIRECIsNotNull()
        {
            criteriaWithoutValue.add("INDC_DIREC is not null");
            return this;
        }

        public Criteria andINDC_DIRECEqualTo(String value)
        {
            addCriterion("INDC_DIREC =", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECNotEqualTo(String value)
        {
            addCriterion("INDC_DIREC <>", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECGreaterThan(String value)
        {
            addCriterion("INDC_DIREC >", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_DIREC >=", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECLessThan(String value)
        {
            addCriterion("INDC_DIREC <", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_DIREC <=", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECLike(String value)
        {
            addCriterion("INDC_DIREC like", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECNotLike(String value)
        {
            addCriterion("INDC_DIREC not like", value, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECIn(List values)
        {
            addCriterion("INDC_DIREC in", values, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECNotIn(List values)
        {
            addCriterion("INDC_DIREC not in", values, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECBetween(String value1, String value2)
        {
            addCriterion("INDC_DIREC between", value1, value2, "INDC_DIREC");
            return this;
        }

        public Criteria andINDC_DIRECNotBetween(String value1, String value2)
        {
            addCriterion("INDC_DIREC not between", value1, value2, "INDC_DIREC");
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


    public LugarDireccionExample()
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
