// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DepartamentoExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class DepartamentoExample
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
        public Criteria andCODG_LUGARIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR is not null");
            return this;
        }

        public Criteria andCODG_LUGAREqualTo(String value)
        {
            addCriterion("CODG_LUGAR =", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR <>", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR >", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR >=", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLessThan(String value)
        {
            addCriterion("CODG_LUGAR <", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR <=", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLike(String value)
        {
            addCriterion("CODG_LUGAR like", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotLike(String value)
        {
            addCriterion("CODG_LUGAR not like", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARIn(List values)
        {
            addCriterion("CODG_LUGAR in", values, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotIn(List values)
        {
            addCriterion("CODG_LUGAR not in", values, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR between", value1, value2, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR not between", value1, value2, "CODG_LUGAR");
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
        public Criteria andINDC_VISUAIsNull()
        {
            criteriaWithoutValue.add("INDC_VISUA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_VISUAIsNotNull()
        {
            criteriaWithoutValue.add("INDC_VISUA is not null");
            return this;
        }

        public Criteria andINDC_VISUAEqualTo(String value)
        {
            addCriterion("INDC_VISUA =", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUANotEqualTo(String value)
        {
            addCriterion("INDC_VISUA <>", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUAGreaterThan(String value)
        {
            addCriterion("INDC_VISUA >", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUAGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_VISUA >=", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUALessThan(String value)
        {
            addCriterion("INDC_VISUA <", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUALessThanOrEqualTo(String value)
        {
            addCriterion("INDC_VISUA <=", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUALike(String value)
        {
            addCriterion("INDC_VISUA like", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUANotLike(String value)
        {
            addCriterion("INDC_VISUA not like", value, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUAIn(List values)
        {
            addCriterion("INDC_VISUA in", values, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUANotIn(List values)
        {
            addCriterion("INDC_VISUA not in", values, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUABetween(String value1, String value2)
        {
            addCriterion("INDC_VISUA between", value1, value2, "INDC_VISUA");
            return this;
        }

        public Criteria andINDC_VISUANotBetween(String value1, String value2)
        {
            addCriterion("INDC_VISUA not between", value1, value2, "INDC_VISUA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LOCALIsNull()
        {
            criteriaWithoutValue.add("INDC_LOCAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LOCALIsNotNull()
        {
            criteriaWithoutValue.add("INDC_LOCAL is not null");
            return this;
        }

        public Criteria andINDC_LOCALEqualTo(String value)
        {
            addCriterion("INDC_LOCAL =", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotEqualTo(String value)
        {
            addCriterion("INDC_LOCAL <>", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALGreaterThan(String value)
        {
            addCriterion("INDC_LOCAL >", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_LOCAL >=", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLessThan(String value)
        {
            addCriterion("INDC_LOCAL <", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_LOCAL <=", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLike(String value)
        {
            addCriterion("INDC_LOCAL like", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotLike(String value)
        {
            addCriterion("INDC_LOCAL not like", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALIn(List values)
        {
            addCriterion("INDC_LOCAL in", values, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotIn(List values)
        {
            addCriterion("INDC_LOCAL not in", values, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALBetween(String value1, String value2)
        {
            addCriterion("INDC_LOCAL between", value1, value2, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotBetween(String value1, String value2)
        {
            addCriterion("INDC_LOCAL not between", value1, value2, "INDC_LOCAL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DISTRITO_JUDICIALIsNull()
        {
            criteriaWithoutValue.add("CODG_DISTRITO_JUDICIAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DISTRITO_JUDICIALIsNotNull()
        {
            criteriaWithoutValue.add("CODG_DISTRITO_JUDICIAL is not null");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL =", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <>", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALGreaterThan(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL >", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL >=", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLessThan(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <=", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLike(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL like", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotLike(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not like", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALIn(List values)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL in", values, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotIn(List values)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not in", values, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALBetween(String value1, String value2)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL between", value1, value2, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotBetween(String value1, String value2)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not between", value1, value2, "CODG_DISTRITO_JUDICIAL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_ubigeoIsNull()
        {
            criteriaWithoutValue.add("c_ubigeo is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_ubigeoIsNotNull()
        {
            criteriaWithoutValue.add("c_ubigeo is not null");
            return this;
        }

        public Criteria andC_ubigeoEqualTo(String value)
        {
            addCriterion("c_ubigeo =", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoNotEqualTo(String value)
        {
            addCriterion("c_ubigeo <>", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoGreaterThan(String value)
        {
            addCriterion("c_ubigeo >", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_ubigeo >=", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoLessThan(String value)
        {
            addCriterion("c_ubigeo <", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoLessThanOrEqualTo(String value)
        {
            addCriterion("c_ubigeo <=", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoLike(String value)
        {
            addCriterion("c_ubigeo like", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoNotLike(String value)
        {
            addCriterion("c_ubigeo not like", value, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoIn(List values)
        {
            addCriterion("c_ubigeo in", values, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoNotIn(List values)
        {
            addCriterion("c_ubigeo not in", values, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoBetween(String value1, String value2)
        {
            addCriterion("c_ubigeo between", value1, value2, "c_ubigeo");
            return this;
        }

        public Criteria andC_ubigeoNotBetween(String value1, String value2)
        {
            addCriterion("c_ubigeo not between", value1, value2, "c_ubigeo");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ALLIsNull()
        {
            criteriaWithoutValue.add("INDC_ALL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ALLIsNotNull()
        {
            criteriaWithoutValue.add("INDC_ALL is not null");
            return this;
        }

        public Criteria andINDC_ALLEqualTo(String value)
        {
            addCriterion("INDC_ALL =", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLNotEqualTo(String value)
        {
            addCriterion("INDC_ALL <>", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLGreaterThan(String value)
        {
            addCriterion("INDC_ALL >", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_ALL >=", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLLessThan(String value)
        {
            addCriterion("INDC_ALL <", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_ALL <=", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLLike(String value)
        {
            addCriterion("INDC_ALL like", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLNotLike(String value)
        {
            addCriterion("INDC_ALL not like", value, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLIn(List values)
        {
            addCriterion("INDC_ALL in", values, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLNotIn(List values)
        {
            addCriterion("INDC_ALL not in", values, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLBetween(String value1, String value2)
        {
            addCriterion("INDC_ALL between", value1, value2, "INDC_ALL");
            return this;
        }

        public Criteria andINDC_ALLNotBetween(String value1, String value2)
        {
            addCriterion("INDC_ALL not between", value1, value2, "INDC_ALL");
            return this;
        }

        public Criteria andCod_entidad_externaAIgualA(Integer codigo) {
        	addCriterion("cod_entidad_externa = ", codigo, "cod_entidad_externa");
        	return this;
        }

        public Criteria andC_CONVENIOSNotEqualTo(String value)
        {
            addCriterion("C_CONVENIOS <>", value, "C_CONVENIOS");
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


    public DepartamentoExample()
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
